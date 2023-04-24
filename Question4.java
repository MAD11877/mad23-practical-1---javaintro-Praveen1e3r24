import java.util.Scanner;

public class Question4
{
  public static void main(String[] args) {
  
    Scanner myobj = new Scanner(System.in);
    // System.out.println("Enter integer");
       
    int integer = myobj.nextInt();
    
   
   while(integer>0){
     int x=integer;
    while(x >0){
      System.out.print("*");
        x--;
    }    
     System.out.println();
     integer--;
  }
  }
}
