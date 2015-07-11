//*****************************************************************************
//Name: Brent Miller
//Date: 070615
//Project Name: Project 5a: Counted Loop
//Description: This project will iteratively read into memory the first five
//employee's data and display it to the screen. This project will read in from
//a pre-existing file.
//*****************************************************************************
package project5a;

//libraries
import java.io.FileReader; 
import java.io.PrintWriter; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import javax.swing.JOptionPane;

//begin class Project5a
public class Project5a 
{
    //begin main
    public static void main(String[] args) throws FileNotFoundException
    {
        //declaration and initialization
        int employeeNumber = 0, exemptions = 0;
        double hours = 0.0, payRate = 0.0, salary = 0.0;
        String filingStatus = " ", classification = " ";
       
        Scanner inFile = new Scanner(new FileReader("EmployeeData.dat"));

        //For loop iterates through the first five employee data
        //within the readable file
        for (int i=0; i<5; i++)
        {
            //Data types defined in the read file
            employeeNumber = inFile.nextInt();
            filingStatus = inFile.next();
            exemptions = inFile.nextInt();
            classification = inFile.next();
            hours = inFile.nextDouble();
            payRate = inFile.nextDouble();
            salary = inFile.nextDouble();
            
            //Individual print out statements for each employee
            JOptionPane.showMessageDialog(null, "Employee number: " + employeeNumber + "\n"
                    + "Filing status: " + filingStatus + "\nExemptions: " + exemptions + "\n"
                    + "Classification: " + classification + "\nHours: " + hours + "\n"
                    + "Pay rate: " + payRate + "\nSalary: " + salary);   
        }//end for
    }//end main    
}//end class Project5a