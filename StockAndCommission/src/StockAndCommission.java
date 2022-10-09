/*
Mosammad Kabir
CUS 1115
March 28, 2021
Professor DeBello
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class StockAndCommission {
    public static void main(String[] args) {

        DecimalFormat df=new DecimalFormat("$0,000.00");
        Scanner kb=new Scanner (System.in);
        int year=2002; //birthday year is 2002 so 2002 number of shares
        double price=11.58; //birthday month is 11 so price is $11.58 per share
        double stock=year*price;

        double commission;// commission in percentage.
        System.out.println("Enter the commission that will be paid to the broker: ");
        commission=kb.nextDouble();

        double stock_commission=stock*commission;//the amount of the stock commission paid to the broker in dollars/

        double total=stock+(stock*commission);//total stock price calculated with commission.

        System.out.println("The amount paid for the stock alone without commission is :"+df.format(stock));
        System.out.println("The amount of the commission on the stock paid to the broker is "+commission+"% or "+df.format(stock_commission));
        System.out.println("The total amount paid for the stock with the commission is : "+df.format(total));



    }
}

/*

Enter the commission that will be paid to the broker:
.03
The amount paid for the stock alone without commission is :$23,183.16
The amount of the commission on the stock paid to the broker is 0.03% or $0,695.49
The total amount paid for the stock with the commission is : $23,878.65

The amount paid for the stock alone without commission is :$23,183.16
The amount of the commission on the stock paid to the broker is 3.0% or $69,549.48
The total amount paid for the stock with the commission is : $92,732.64
 */

/*
The amount paid for the stock alone without commission.         //(2002*11.58)= (23,183.16) or year*price=stock
The amount of the commission on the stock paid to the broker.   //(2002*11.58)*.03= 695.4948 or year*price
The total amount paid for the stock with the commission.        //(2002*11.58)+((2002*11.58)*.03)= 23,878.6548
 */