import java.util.*;
public class Students_marks
{
    public static void main(String args[])
    {
        int Marks[] = new int[5];
        float total_marks= 0, Average;
        Scanner Input_marks = new Scanner(System.in); 

        for(int i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject "+(i+1)+": ");
           Marks[i] = Input_marks.nextInt();
           total_marks = total_marks + Marks[i];
        }

        Average = total_marks/5;
        System.out.print("The student Grade is: ");
        if(Average>=80)
        {
            System.out.print("Grade A");
        }
        else if(Average>=60 && Average<80)
        {
           System.out.print("Grade B");
        } 
        else if(Average>=40 && Average<60)
        {
            System.out.print("Grade C");
        }
        else
        {
            System.out.print("Grade D");
        }
    }
}