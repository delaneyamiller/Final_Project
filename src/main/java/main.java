import java.util.Scanner;


/**
 *
 * @author 13del
 */
public class main {
    public static void main(String[] args) {
        double taxRate = .15;
        double delivery = 5;
        double price;
        double tax = 0;
        double total = 0;
        double netTotal = 0;
        
        System.out.print("Enter Total "); 
        Scanner cost = new Scanner(System.in);
        price = cost.nextDouble(); 
        
        double NetTax = calculateNetTax(price, taxRate, tax);
        double PreDeliveryTotal = CalculateTotal(tax,price,total);
        double TotalCost = calculateNetTotal(total, delivery, netTotal);
        System.out.println(TotalCost);
        
    }
    public static double calculateNetTax (double price, double taxRate, double tax) {
        tax = price*taxRate;
        return tax;
    }
    public static double CalculateTotal (double price, double tax, double total) {
        total = price + tax;
        return total;        
    }
    public static double calculateNetTotal (double total, double delivery, double netTotal){
        netTotal = total + delivery;
        return netTotal;
    }
    

    
}
