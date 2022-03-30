import java.util.*;
public class CheckingPrimeNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean Isprime = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                Isprime=false;
                break;
            }
        }
        if(Isprime){
            if(num==1){
                System.out.println("This is neither Prime nor Composite");
            }else{
                System.out.println("This is a Prime Number");
            }
            }else {
            System.out.println("This is a Composite Number");
        }
    }
}
