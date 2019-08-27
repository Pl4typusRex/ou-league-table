import java.util.*;

/**
 * class LeagueAdmin for TMA03Q2.
 * 
 * @author (Sophie Wallace) 
 * @version (1.0)
 */
public class LeagueAdmin
{
   // instance variables
   private Map<String,List<Team>> teams;
   
   
   /**
    * Constructor for objects of class LeagueAdmin
    */
   public LeagueAdmin()
   {
      teams = new HashMap<>();
   }

   /**
    * prints out a table showing wins, losses, draws and points for each team in the given division
    */
   public void printOutTable(String division)
   {
      System.out.println(division);
      System.out.println(String.format("%-20s %2s %2s %2s %2s","Name", "W", "L", "D", "Pts"));
      List<Team> teamsInDivision = teams.get(division);
      for(Team team : teamsInDivision)
      {
         System.out.println(String.format("%-20s %2d %2d %2d %2d", team.getName(), team.getWon(), team.getLost(), team.getDrew(), team.getPoints()));
      }
   }
   
   /**
    * increments wins, losses and draws for the given teams based on their scores
    */
   public void recordResult(String division, String teamA, String teamB, int teamAScore, int teamBScore)
   {
      List<Team> teamsInDivision = teams.get(division);

      int teamAIndex;
      int teamBIndex;
      Team a;
      Team b;
          
      if(teamAScore > teamBScore)
      {
         for(int index = 0; index < teamsInDivision.size(); index++)
         {
            if(teamsInDivision.get(index).getName().equals(teamA))
            {
               teamAIndex = index;
               a = teamsInDivision.get(teamAIndex);
               a.incWon();
            }
            else if(teamsInDivision.get(index).getName().equals(teamB))
            {
               teamBIndex = index;
               b = teamsInDivision.get(teamBIndex);
               b.incLost();
            }
         }
      }
      else if(teamBScore > teamAScore)
      {
         for(int index = 0; index < teamsInDivision.size(); index++)
         {
            if(teamsInDivision.get(index).getName().equals(teamA))
            {
               teamAIndex = index;
               a = teamsInDivision.get(teamAIndex);
               a.incLost();
            }
            else if(teamsInDivision.get(index).getName().equals(teamB))
            {
               teamBIndex = index;
               b = teamsInDivision.get(teamBIndex);
               b.incWon();
            }
         }
      }
      else if(teamAScore == teamBScore)
      {
         for(int index = 0; index < teamsInDivision.size(); index++)
         {
            if(teamsInDivision.get(index).getName().equals(teamA))
            {
               teamAIndex = index;
               a = teamsInDivision.get(teamAIndex);
               a.incDrew();
            }
            else if(teamsInDivision.get(index).getName().equals(teamB))
            {
               teamBIndex = index;
               b = teamsInDivision.get(teamBIndex);
               b.incDrew();
            }
         }
      }
   }
   
   /**
    * checks if a list for the division already exists
    */
   public void addTeam(String division, Team team)
   {
      //if(teams.containsKey(division))
      if(teams.get(division) != null)
      {
         List<Team> divisionList = teams.get(division);
         divisionList.add(team);
      }
      else
      {
         List<Team> teamList = new ArrayList<>();
         teamList.add(team);
         teams.put(division, teamList);
      }
   }
   
}
