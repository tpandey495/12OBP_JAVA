import java.util.*;

public class Main {
    public static void main(String[] args) {
     

      // reverse an array 
      // int [] arr = {1,4,3,2,7,8};
      // // {7,2,3,4,1}

      // for(int i=0;i<arr.length/2;i++){
      //   int temp=arr[i];
      //   arr[i]=arr[arr.length-i-1];
      //   arr[arr.length-i-1]=temp;
      // }

      // for(int i=0;i<arr.length;i++){
      //   System.out.print(arr[i]+" ");
      // }


       // find maxium element in an array 
        // int [] arr = {1,4,3,2,7,8};

        // int greatest= arr[0];

        // for(int i=0;i<arr.length;i++){
        //   if(arr[i]>greatest){
        //     greatest=arr[i];
        //   }
        // }
        // System.out.println(greatest);


        // 2nd larest elment in an array 

        // int [] arr = {2,2,8,8};
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){
        //   if(largest<=arr[i]){
        //     secondLargest=largest;
        //     largest=arr[i]; 
        //   }
        //   else if(arr[i]>secondLargest){
        //     secondLargest=arr[i];
        //   }
        // }
        // System.out.println(secondLargest);


        // subarray -> 
        // part of the array and should 
        // be continoue and order 
        // should be preserved 

        // given an array nums print all the subarray of length 2
        
      //  int [] nums={1,2,3,4};
      //   // 1,2
      //   // 2,3 
      //   // 3,4

      //   for(int i=0;i<nums.length-1;i++){
      //     System.out.println(nums[i]+" "+nums[i+1]);
      //   }


        // print subarray lenth  k 

       
      //  int [] nums={1,8,3,4};
      //  //find the prouduct of all the items 
      //  int pro=1;
      //  for(int i=0;i<nums.length;i++){
      //   pro*=nums[i];
      //  }

      //  System.out.println(pro);



      // take n size array as user input and 
      //  print the array in reverse direction and don't print first two times 

     int [] nums={5,4,8,2,1};
     for(int i=nums.length-1;i>=2;i--){
          System.out.println(nums[i]);
     }

        
    }
}