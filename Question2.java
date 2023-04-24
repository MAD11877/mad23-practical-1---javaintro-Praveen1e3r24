import java.util.Scanner;

public class Question2
{
 
  public static void main(String[] args) {
  
    Scanner myobj = new Scanner(System.in);
   double weight=myobj.nextDouble();
   double height=myobj.nextDouble();

    double bmi=weight/(height*height);
  System.out.println(bmi);
    
  

}
}
