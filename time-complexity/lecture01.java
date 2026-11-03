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
        for(int i=0;i<n;i++){

        }
      }


    
    }
}