import java.util.Scanner;
import java.lang.Math;
public class DateLe{
  private int day;
  private int month;
  private int year;
  private int count;
  
  //creates a new default DateLe object
  public DateLe()
  {
    day = 31;
    month = 12;
    year = 2022;
    count = 0;
  }
  
  //create a new DateLe object
  public DateLe(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year; 
  }
  //Converts dateLe objecty to a string
  public String toString()
  {
    return month + "/" + day + "/" + year;
  }
  public int getDay()
  {
    return day;
  }
  public int getMonth()
  {
    return month;
  }
  public int getYear()
  {
    return year ;
  }
  
  public static String dayCompare(DateLe target, DateLe answer){
    String product = "";
   if(target.getDay() == (answer.getDay()))
   {
     product = "Correct!";
    
   }
    else if(target.getDay() > answer.getDay())
    {
      product = "Higher";
    }
    else if(target.getDay() < answer.getDay())
    {
      product = "Lower";
    }
    return product;
  }  
  public static String monthCompare(DateLe target, DateLe answer){
    String product = "";
   if(target.getMonth() == (answer.getMonth()))
   {
     product = "Correct!";
     
   }
    else if(target.getMonth() > answer.getMonth())
    {
      product = "Higher";
    }
    else if(target.getMonth() < answer.getMonth())
    {
      product = "Lower";
    }
    return product;
  }  
  public static String yearCompare(DateLe target, DateLe answer){
    String product = "";
   if(target.getYear() == (answer.getYear()))
   {
     product = "Correct!";
  
   }
    else if(target.getYear() > answer.getYear())
    {
      product = "Higher";
    }
    else if(target.getYear() < answer.getYear())
    {
      product = "Lower";
    }
    return product;
  } 
 
 public static boolean win(DateLe target, DateLe answer) 
  {
    if(dayCompare(target, answer).equals("Correct!") )
    {
      if(monthCompare(target, answer).equals("Correct!"))
      {
        if(yearCompare(target, answer).equals("Correct!"))
        {
          return true;
        }
      }
    }
    return false;
  }




  
  
}





