
/**
 * Write a description of class PayMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayMethod
{
    // instance variables - replace the example below with your own
    private int x;
   

    /**
     * Constructor for objects of class PayMethod
     */
    public PayMethod(){
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String sampleMethod(String name, double hourlyRate, double hoursWorked, double deductionRate)
    {
        // put your code here
        double grossPay = hourlyRate * hoursWorked;
        double deduction = grossPay * deductionRate;
        double netPay = grossPay - deduction;
        String result = String.format("%s %.2f %.2f %.2f",name,grossPay,deduction,netPay);
        System.out.println(result);
        return result;
    }
}
