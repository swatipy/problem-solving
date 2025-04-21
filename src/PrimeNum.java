import javax.swing.*;
import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       boolean res= checkPrime(num);
       System.out.println(res);

    }
    public static boolean checkPrime(int num){
        for (int i=2;i<Math.sqrt(num);i++){
            if(num % i==0){
               return false;
            }

        }
        return true;
    }

}
