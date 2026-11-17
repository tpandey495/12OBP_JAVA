import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();

      int[] arr=new int[n];

      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }

      // for(int i=0;i<n-1;i++){
      //   int minIndex=i;
      //   for(int j=i+1;j<n;j++){
      //       if(arr[j]<arr[minIndex]){
      //         minIndex=j;
      //       }
      //   }
      //   int temp=arr[minIndex];
      //   arr[minIndex]=arr[i];
      //   arr[i]=temp;
      // }
 
      // System.out.println(Arrays.toString(arr));

    // Time Complexity->
      // B.C -> O(n^2)
      // A.C -> o(n^2)
      // W.C-> o(n^2)
    // Space Complexity-> o(1)


    // Bubble Sort 
    // for(int i=0;i<n-1;i++){
    //   boolean isSwapped=false;
    //   for(int j=0;j<n-i-1;j++){
    //     if(arr[j+1]<arr[j]){
    //       isSwapped=true
    //       int temp=arr[j+1];
    //       arr[j+1]=arr[j];
    //       arr[j]=temp;
    //     }
    //   } 
    //   if(isSwapped==false){
    //     break;
    //   }  
    // }

    //  System.out.println(Arrays.toString(arr));


    //  T.C-> B.c-> o(n)
    // A.C-> o(n^2)
    // W.C-> o(n^2)


    // S.C -> 
    // o(1)


    // Reverse Sort the array using selection array 
       for(int i=0;i<n-1;i++){
        int maxIndex=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]>arr[maxIndex]){
              maxIndex=j;
            }
        }
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[i];
        arr[i]=temp;
      }
 
      System.out.println(Arrays.toString(arr));


    // Reverse sort the array using bubble sort 




    }
}



