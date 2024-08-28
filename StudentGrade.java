
package student.grade;
import java.util.Scanner;


public class StudentGrade {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Alao oyedunmola leah");
        String name = scanner.nextLine();
        System.out.println("ND/230329");
        
        System.out.println("Enter student score");
        
        int score =scanner.nextInt();
        
        if (score>=75 && score<=100){
            
        System.out.println("The grade is A");
            
        } else if (score>=70 && score<=74){
        System.out.println("The grade is AB");
          
        } else if (score>=65 && score<=69){
        System.out.println("The grade is B");
            
        } else if (score>=60 && score<=64){
        System.out.println("The grade is BC");
            
        } else if (score>=55 && score<=59){
        System.out.println("The grade is C");
            
        } else if (score>=50 && score<=54){
        System.out.println("The grade is CD");
            
        } else if (score>45 && score<=49){
        System.out.println("The grade is D");
        
         } else if (score>=40 && score<=44){
         System.out.println("The grade is E");
            
        } else {
        System.out.println("The grede is F");
        
        }
        
        
        
    }
    
}
