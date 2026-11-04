import java.util.*;

public class Main {

    public static void main(String[] args) {
      // Time Complexity-> 
      // how no of operation of algorithm changes 
      // when input size changes.

      for(int i=0;i<n;i++){
        SOP(i);
      }

      // no of operation/iteration:- n operation 
      // Time Complexity-> O(n)

      for(int i=0;i<1000;i++){
        SOP(i);
      }

      // no of operation -> o(1000)
      // time complexity -> o(1)


      for(int i=0;i<=n;i++){
        SOP(i);
      }
  
      // no of operation-> n+1
      //  T.c -> o(n)

      for(int i=1;i*i<=n;i++){
        SOP(i);
      }

      // no of operation -> sqrt(n)
      // Time Complexity -> O(sqrt(n))

      for(int i=0;i*i*i<=n;i++){
          SOP(i);
      }


      // 
      while(n!=1){
           n=n/2;
      }
      
      // no of operation-log2(n)
      // Time Complexity->log2(n)

      while(n!=1){
        n=n/10;
      }
      // no of ops-> log10(n)
      // Time Complexity-> log10(n)

      for(int i=0;i<n+1000;i++){
        SOP(i);
      }

      // no of operation -> n+1000
      // time complexity-> o(n)


      // 
      SOP("Hello")
      SOP("Hello");



      // 10000 times
      // Time complexity-> o(1)


      // Time Complexity->
      for(int i=0;i<n;i++){
        SOP(i)
      }

      for(int j=0;j<m;j++){
        SOP(J);
      }

      // total operation -> o(n+m)
      // time complexity-> o(n+m)


      // 
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
             SOP("Hello");
        }
      }

      // no of operation:-n^2
      // Time Complexity:- o(n^2)


       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
             SOP("Hello");
        }
      }

      // no of operation:- n*(n+1)/2
      // Time Complexity:- o(n^2)

      for(int i=0;i*i<n;i++){
        for(int j=0;j<n;j++){
             SOP("Hello");
        }
      }

      
      // Time Complexity:- o(n*sqrt(n))

      // H.w 
      for(int i=0;i*i<n;i++){
        for(int j=i;j<n;j++){
             SOP("Hello");
        }
      }



     for(int i=0;i*i<n;i++){
        for(int j=0;j<n;j++){
           for(int k=0;k<n;k++){
                 SOP("Hello");
           }
        }
      }

      // Time Complexity:- o(n^2*sqrt(n))


      for(int i=0;i<n;i++){
        for(int j=0;j<n;j*=2){
              SOP("Hello");
        }
      }

      //  Time Complexity:- o(n*log(n))
 

      for(int i=1;i<n;i*=2){
        for(int j=0;j<n;j++){
              SOP("Hello");
        }
      }

      //  Time Complexity:- o(n*log(n))
      
      // An ecommerce company have inventory of 10^16 items now the company 
      // aksed two of it's engineer Vinay and Abhishek two design a search 
      // alogrithm. So Vinay come up with an alogrithm that takes o(n)
      // time complexity and Abhishek comes with an algorithm that will 
      // take o(log2(n)) time complexity.
      // Find out maximum time both algorithm can take.

      // 1 sec -> 10^8 ops 

      //  Big oh -> o() -> worst case
      // Big omega ->      best cas
      //  Big theta ->   eaverage case













    
    }
}