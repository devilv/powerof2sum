/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powersum;

import java.util.Scanner;

/**
 *
 * @author varun
 */
public class Powersum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the power");
        Scanner scanner= new Scanner(System.in);
        int pow=scanner.nextInt();
        int sum=0;
        int temp=0;
        String reverse="";
        sum=sum+(int)Math.pow(2,pow);
        System.out.println("the sum is"+sum);
        String re=String.valueOf(sum);
        int len= re.length();
        for(int i=0; i<=len; i++){
          int sum1 =sum%10;
          temp=temp+sum1;
          sum=sum/10;
        }
        System.out.println("sum after addition of 2 to the pwoer: "+pow+" = "+temp);
          }
    
}
