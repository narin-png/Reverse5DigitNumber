package oddevenchecker;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your 5 digit number:");
        int n=a.nextInt();
        int b=(n/10000);
        int c=(n/1000)%10;
        int d=(n/100)%10;
        int e=(n/10)%10;
        int f=(n/1)%10;
        int reversed=f*10000+e*1000+d*100+c*10+b*1;
        System.out.println("reversed version of number:"+reversed);
    }
}
