package com.example.CurrencyConverter;
import java.util.*;
import java.text.DecimalFormat;
public class Currency_Converter {
    public static void main(String[] args){
        double rupee,dollar,pound, code, euro, kwd;
        DecimalFormat f= new DecimalFormat("##.###");
        Scanner sc=new Scanner(System.in);
        System.out.println("*** Welcome to My Currency Convert!! *** \nEnter the currency code \n1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Kuwaiti Dinar");
        code=sc.nextInt();
        if(code== 1){
            System.out.println("Enter amount in Rupees:");
            rupee=sc.nextDouble();
            dollar=rupee/77.34;
            System.out.println("Dollar :" +f.format(dollar));
            pound=rupee/94.46;
            System.out.println("Pound :" +f.format(pound));
            euro=rupee/80.36;
            System.out.println("Euro :" +f.format(euro));
            kwd= rupee/251.92;
            System.out.println("Kuwaiti Dinar:" +f.format(kwd));
        }

        else if(code== 2){
            System.out.println("Enter amount in Dollar:");
            dollar=sc.nextDouble();
            rupee=dollar * 77.34;
            System.out.println("Rupees:" +f.format(rupee));
            pound=dollar * 0.82;
            System.out.println("Pound :" +f.format(pound));
            euro=dollar * 0.96;
            System.out.println("Euro :" +f.format(euro));
            kwd= dollar * 0.31;
            System.out.println("Kuwaiti Dinar:" +f.format(kwd));
        }

        else if(code== 3){
            System.out.println("Enter amount in Pound:");
            pound=sc.nextDouble();
            rupee=pound * 94.43;
            System.out.println("Rupees:" +f.format(rupee));
            dollar=pound * 1.22;
            System.out.println("Dollar :" +f.format(dollar));
            euro=pound * 1.17;
            System.out.println("Euro :" +f.format(euro));
            kwd= pound * 0.3748;
            System.out.println("Kuwaiti Dinar:" +f.format(kwd));
        }

        else if(code== 4){
            System.out.println("Enter amount in Euro:");
            euro = sc.nextDouble();
            rupee=euro * 80.43;
            System.out.println("Rupees:" +f.format(rupee));
            dollar=euro * 1.04;
            System.out.println("Dollar :" +f.format(dollar));
            pound=euro * 0.85;
            System.out.println("Pound :" +f.format(pound));
            kwd= euro * 0.318949;
            System.out.println("Kuwaiti Dinar:" +f.format(kwd));
        }

        else if(code== 5){
            System.out.println("Enter amount in Kuwaiti Dinar:");
            kwd = sc.nextDouble();
            rupee=kwd * 251.96;
            System.out.println("Rupees:" +f.format(rupee));
            dollar=kwd * 3.26;
            System.out.println("Dollar :" +f.format(dollar));
            pound=kwd * 2.67;
            System.out.println("Pound :" +f.format(pound));
            euro= kwd * 3.13;
            System.out.println("Euro:" +f.format(euro));
        }

        else System.out.println("Invalid Code!");
    }
}
