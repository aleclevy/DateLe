import java.util.Scanner;
import java.lang.Math;
public class Main extends DateLe{
   public static void main(String[] args){
    //creates the scanner object neccesary for user input
    Scanner scan = new Scanner(System.in);
    //sets the date and stores it in ****date****
    int month = (int)(1+Math.random()*12);
    int day = 0;
    int year = (int)(1+ Math.random() * 2022);
    if(month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12)
    {
     day = (int)(1+Math.random() * 30);
    }
    else if(month == 4||month == 6 ||month == 9 ||month == 11)
    {
     day = (int)(1+Math.random()*29);
    }
    else if(month == 2)
    {
      if(year % 4 == 0)
      {
      day = (int)(1+Math.random()*28);
        }
      day = (int)(1+Math.random()*27);
      }
    //adds 0 before single digit months, days or years
    String uDay = "";
    String uMonth = "";
    String uYear = "";
    //sets up day
    if(day < 10)
    {
      uDay = "0"+day;
    }
    else
    {
      uDay = ""+day;
    } 
    //sets up month
    if(month < 10)
    {
      uMonth = "0"+month;
    }
    else
    {
      uMonth = ""+month;
    }  
    
    //sets up year
    if(year<10)
    {
      uYear = "000"+year;
    }
    else if(year < 100)
    {
      uYear = "00"+year;
    }
    else if(year < 1000)
    {
      uYear = "0"+year;
    }
    else
    {
      uYear = ""+year;
    }
     String correct = uDay + uMonth + uYear;

  DateLe compAns = new DateLe(Integer.parseInt(uDay),   Integer.parseInt(uMonth), Integer.parseInt(uYear));

  //GAMEBOARD
    //sets the board to the correct empty state
    String[][] gameBoard = new String[11][8];
    for(int i = 0; i < gameBoard.length; i++)
      {
        for(int j = 0; j < gameBoard[0].length; j++)
          {
            gameBoard[i][j] = "- ";
          }
      }
    //prints the board out
    for(int k = 0; k < gameBoard.length; k++)
      {
        for(int e = 0; e< gameBoard[0].length; e++)
          {
            System.out.print(gameBoard[k][e]);
          }
        System.out.println("");
      }
     System.out.println("");
    System.out.println("Hello! Welcome to Datele!");
    System.out.println("");

    //prompts user input and sets the user input to variables
    System.out.println("Please input a date in Month, Day, Year order and make sure all year values have 4 numbers such as 0032 or 0762. You have 11 guesses. Godspeed!");
    
     
    //guesses
    
    int guesses = 0;
    boolean c = false;
    while(guesses < 11 && !c)
      {
        System.out.println("Month: ");
        int monthUser = scan.nextInt();
        System.out.println("Day: ");
        int dayUser = scan.nextInt();
        System.out.println("Year: ");
        int yearUser = scan.nextInt();

        DateLe userAns = new DateLe(dayUser, monthUser, yearUser);
        
        System.out.println("Month is: " + monthCompare(compAns, userAns));
        System.out.println("Day is: " + dayCompare(compAns, userAns));
        System.out.println("Year is: " + yearCompare(compAns, userAns));

        gameBoard[guesses][0] = userAns.getMonth()/10 + " ";
        gameBoard[guesses][1] = userAns.getMonth()%10 + " ";
        gameBoard[guesses][2] = userAns.getDay()/10 + " ";
        gameBoard[guesses][3] = userAns.getDay()%10 + " ";
        gameBoard[guesses][4] = userAns.getYear()/1000 + " ";
        gameBoard[guesses][5] = (userAns.getYear()%1000) /100 + " ";
        gameBoard[guesses][6] = (userAns.getYear()%100) /10 + " ";  
        gameBoard[guesses][7] = (userAns.getYear()%10) + " ";

        for(int k = 0; k < gameBoard.length; k++)
        {
        for(int e = 0; e< gameBoard[0].length; e++)
          {
            System.out.print(gameBoard[k][e]);
          }
        System.out.println("");
        }
        System.out.println("");
        if(win(compAns, userAns))
        {
            System.out.print("Correct! You Won!");
            break;
        }
        else if(guesses == 10)
        {
          System.out.println("You Lost! Better luck next time :/");
          System.out.print("Correct answer was: " + compAns.toString());
        }
        guesses++;
        }
  }
}