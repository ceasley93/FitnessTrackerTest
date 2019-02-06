/*
 * 
 */
package fitnesstrackertest;


public class FitnessTracker 
{
  String activity;
  int minutes;
  int year;
  int month;
  int day;
  
public FitnessTracker(String activity, int minutes, int year, int month, int day)
{
setActivity(activity);
setMinutes(minutes);
setYear(year);
setMonth(month);
setDay(day);
}
  public void setActivity(String activity)
  {
      this.activity = activity;
  }
  public void setMinutes(int minutes)
  {
      this.minutes = minutes;
  }
  public void setYear(int year)
  {
      this.year = year;
  }
  public void setMonth(int month)
  {
      this.month = month;
  }
  public void setDay(int day)
  {
      this.day = day;
  }

  public String getActivity()
  {
      return activity;
  }
    public int getMinutes()
  {
      return minutes;
  }
  public int getYear()
  {
      return year;
  }
  public int getMonth()
  {
      return month;
  }
  public int getDay()
  {
      return day;
  }

  public String toString()
  {
      return(activity + " " + minutes + " minutes on " + year + "-" + month +
              "-" +day);
      
  }
}
