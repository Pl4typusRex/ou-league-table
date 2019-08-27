
/**
 * class Team for TMA03Q2.
 *
 * @author Pl4typusRex
 * @version (1.0)
 */
public class Team
{
   private String name;
   private String division;
   private int won;
   private int drew;
   private int lost;
// no need to record points as = 3*won + drew


   /**
    * Constructor for objects of class Team
    */
   public Team(String aName, String aDivision)
   {
      name = aName;
      division = aDivision;
      // no need to set won, drew and lost to 0
   }


   /**
    * getter for attribute points
    */
   public int getPoints()
   {
      return 3 * won + drew;
   }

   /**
    * getter for name
    */
   public String getName()
   {
      return name;
   }

   /**
    * getter for division
    */
   public String getDivision()
   {
      return division;
   }
   /**
    * getter for won
    */
   public int getWon()
   {
      return won;
   }

   /**
    * getter for drew
    */
   public int getDrew()
   {
      return drew;
   }

   /**
    * getter for lost
    */
   public int getLost()
   {
      return lost;
   }

   /**
    * increments the number of games won
    */
   public void incWon()
   {
      won = won + 1;
   }

   /**
    * increments the number of games drawn
    */
   public void incDrew()
   {
      drew = drew + 1;
   }

   /**
    * increments the number of games lost
    */
   public void incLost()
   {
      lost = lost + 1;
   }

   /**
    * setter for division
    */
   public void setDivision(String aDivision)
   {
      division = aDivision;
   }

   public String toString()
   {
      return ("Team " + name + ", division: " + division + " stats: Won: " + won
       + ", drew: " + drew + ", lost: " + lost + ", points: " + getPoints());
   }


}
