import java.util.*;

public class Main {
    public static void main(String[] args) {
    //  check a number if it is prime.
    //  if prime then print no is prime 
    //  if not then print no is not prime 
    //   int count=0,n=6;
    //  for(int i=1;i<=n;i++){
    //     if(n%i==0){
    //       count++;
    //     }
    //  }

    //  if(count==2){
    //     System.out.println("No is prime");
    //  }
    //  else{
    //   System.out.println("No is not prime");
    //  }

    //n iteration
    // int count=0,n=6;
    // for(int i=2;i<=n-1;i++){
    //     if(n%i==0){
    //        System.out.println("no is not prime");
    //        return;
    //     }
    // }
    // System.out.println("No is  prime");
      

    // more optimize 
    // int count=0,n=7;
    // for(int i=2;i*i<=n;i++){
    //     if(n%i==0){
    //        System.out.println("no is not prime");
    //        return;
    //     }
    // }
    // System.out.println("No is  prime");

    // break and continue 
    // for(int i=0;i<10;i++){
    //   System.out.println(i);
    //     if(i==5)
    //      break;
    // }


    // for(int i=0;i<10;i++){
    //     if(i==5)
    //      continue;
    //     System.out.println(i);
    // }

    // for(int i=0;i<10;i++){
    //     if(i==5){
    //      break;
    //     }  
    //     System.out.println(i);
    // }


    // for(int i=0;i<10;i++){
    //     if(i==5){
    //      System.out.println(i);
    //      break;
    //     }  
    // }



    // for(int i=0;i<10;i++){
    //     if(i==5){
    //      break;
    //      System.out.println(i);
    //     }  
    // }


    // for(int i=0;i<10;i++){
    //     System.out.println(i);
    //     if(i==5){
    //      continue;
    //     }  
    // }


    // for(int i=0;i<10;i++){
    //     continue;
    //     System.out.println(i);  
    // }   

    //  n=5;
    //  ***** 

    // String str= "";
    // int n=5;

    // for(int i=0;i<n;i++){
    //   str+="*";
    // }

    // System.out.println(str);


    //     
    // String str = "A";
    // str+="B";
    // System.out.println(str);

    // do while loop this is very rarely used.
    // int i=1;
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i<=5);

    // print 1 to 5 using do while loop


    // nested loop
    //  n=5 
    // *****
    // *****
    // *****
    // *****
    // *****


     int n=3;

    for(int row=1;row<=n;row++){
      String str="";
      for(int col=1;col<=n;col++){
        str+="*";
      }
      System.out.println(str);
     }


    // n and m 
    // n -> no of row 
    // print m stars in each row 
    // n=3,m=2 
    // **
    // **
    // **
   
    
 

    }
}