import java.util.*;

public class Main {
    public static void main(String[] args) {
      // array -> collection of item 
      // of same data type.
      // int [] arr = {1,2,3,4,5};
       
      // index-> 0-> 1st item 
      // 1 -> end item 
      
      // access 
      // arr[index]
      // first item 
      // System.out.println(arr[0]);

      // System.out.println(arr[3]);


      // // update 
      // arr[1]=6;
      // System.out.println(arr[1]);

      // 
      // System.out.println(arr.length);

      // // traverse 
      // for(int i=0;i<arr.length;i++){
      //   System.out.println(arr[i]);
      // }

      //  user input
      // int [] arr = new int[5];

      // Scanner sc = new Scanner(System.in);

      // for(int i=0;i<5;i++){
      //   arr[i]= sc.nextInt();
      // }
     
      // for(int i=0;i<5;i++){
      //   System.out.println(arr[i]);
      // }


      // take input of n numbers from the user and store in an array 
      // and find the sum of it.
       
      // Scanner sc= new Scanner(System.in);
      
      // int n=sc.nextInt();

      // int [] arr= new int[n];

      // for(int i=0;i<n;i++){
      //   arr[i]=sc.nextInt();
      // }

      // int sum=0;
      // for(int i=0;i<n;i++){
      //    sum+=arr[i];
      // }

      // System.out.println(sum);


      // max & min in an array 

      // take n input from the user and then store it in the array 
      // and print it in the reverse order 

      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();

      int [] arr =new int[n];

      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }

      for(int i =arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
      }


      sc.close();
    }
}