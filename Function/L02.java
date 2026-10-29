import java.util.*;


// function 


public class Main {
    // static boolean isPrime(int n){
    //   for(int i=2;i<n;i++){
    //     if(n%i==0)
    //       return false;
    //   }
    //   return true;
    // }


    // static long Power(int n,int x){
    //   long ans=1;
    //   for(int i=0;i<x;i++){
    //     ans*=n;
    //   }
    //   return ans;
    // }

    static int factorial(int n){
      int fact=1;
      for(int i=1;i<=n;i++){
        fact*=i;
      }
      return fact;
    }

    static int nCr(int n, int r){
      // n!/r!*n-r!
     int res=factorial(n)/(factorial(r)*factorial(n-r));
     return res;

    }

    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x = sc.nextInt();

        // design function that return true if no is prime other false.
        // System.out.println(isPrime(n));

        // print prime number bw 1 to n 
        // for(int i=2;i<n;i++){
        //   if(isPrime(i)){
        //     System.out.println(i);
        //   }
        // }

        // design power function pow(n,x) -> n^x
        // System.out.println(Power(n,x));

        // ncr= n!/r!*n-r!
        System.out.println(nCr(n,x));



        sc.close();
    }


    

}