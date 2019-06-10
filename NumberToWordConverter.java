import java.util.*;

public class NumberToWordConverter {

 public static String numToWord(Integer i) {
   
 final  String[] units_place = { "Zero", "One", "Two", "Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen" };
        
 final  String[] tens_place = { "", "", "Twenty", "Thirty", "Forty","Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
 
    if (i==0)
        return "zero";
    if (i < 20)
        return units_place[i];
    if (i < 100)
        return tens_place[i / 10] + ((i % 10 > 0) ? " " + numToWord(i % 10) : "");
    if (i < 1000)
        return units_place[i / 100] + " Hundred"
                + ((i % 100 > 0) ? " and " + numToWord(i % 100) : "");
    if (i < 1000000)
        return numToWord(i / 1000) + " Thousand "
                + ((i % 1000 > 0) ? " and  " + numToWord(i % 1000) : "");
  }

  public static boolean isNumber(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args)

    {
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        n = s.nextInt();
        if(isNumber(n)){        
        NumberToWordConverter.numToWord(n);
        }
        else{
        System.out.print("Enter a valid Number");
        }
    }
}
