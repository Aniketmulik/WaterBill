import java.util.Scanner;
public class WaterBill {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of units: ");
       int a=sc.nextInt();
       int meter_charge=75;
       int charge=0;

       if(a<=100)
       {
        charge =a*5;
       }
       else
        {
          if(a<=250)
          {
             charge =a*10;
          }
          else
          {
           charge =a*20;
          }
        }
        
        int total_water_bill =charge+meter_charge;
        System.out.println("print_total_water_bill ="+total_water_bill);

    }
    
}