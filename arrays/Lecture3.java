import java.util.*;

public class Lecture3 {
    public static void main(String[] args) {

        // Arrays:- Array is an collection item  of same data types.
        // Array is contngous in memory.
        // default value of an array

        //    boolean[] arr =new boolean[5];

        //   // index
        //   //In arrays index start from zero
        //   // first item index -> 0
        //   // second item -> 1

        //   // length
        //   System.out.println(arr.length);

        //   // insert a value in the array
        //   arr[0]=true;
        //   arr[1]=true;


        //  // update
        //  arr[0]=false;

        //  System.out.println(arr[1]);

        // enhanced loop
        // When ever you don't need index this loop can be used.
        // for(boolean elem:arr){
        //   System.out.println(elem);
        // }


        // i want to delete an item from the array



        // Array utility class -> it provides static methods for general operation


        // arr.sort();
        // arr.fill();


        // arr sort

        // int [] arr = {50,20,40,10,30};

        // Arrays.sort(arr);

        // // for(int item:arr){
        // //   System.out.print(item+" ");
        // // }

        // // given an array find second largest in an array using sort method.

        // System.out.println(arr[arr.length-2]);

        // //  find the second smallest item.
        //  System.out.println(arr[1]);


        // fill

        // int [] nums = new int[10];

        // Arrays.fill(nums,100);


        // Array.fill(arr,fromIndex,toIndex,value)

        // Arrays.fill(nums,0,2,3);





        //  fill first 4 item 100 and rest should default.
        //   Arrays.fill(nums,0,4,3);

        // for(int num:nums){
        //   System.out.println(num);
        // }


        // toString()-> converts an array in to a redable string.

        // int [] nums = new int[5];
        // nums[0]=2;
        // nums[1]=3;
        // System.out.println(Arrays.toString(nums));



        // == check reference the arrays instead of content.
        // int[] nums = {1,2,3,4};
        // int [] arr= {1,2,3,4};

        // if(nums==arr){
        //   System.out.println("Array is equal");
        // }
        // else{
        //   System.out.println("Array is not equal");
        // }

        // same reference
        // int [] nums ={1,2,3,4};
        // int [] arr =nums;

        // // System.out.println(nums==arr); true

        // arr[1]=6;
        // System.out.println(arr==nums); //true

        // for(int num:nums){
        //   System.out.println(num);
        // }

        // for(int elem:arr){
        //   System.out.println(elem);
        // }



        // Arrays.equals() -> compare two arrays content.
        // if same item in same order then return true
        // else false.
        // System.out.println(Arrays.equals(nums,arr));

        //copyOf -> create a new array by copying element from an existing array.

        // int[] nums = {1,2,3,4};

        //
        // int [] newArr = Arrays.copyOf(nums,3);

        // System.out.println(Arrays.toString(newArr));


        // create an array of size 5 and then copy first 4 time to a new array


        // Arrays.copyOfRange(array,fromIndex,toIndex);
        // fromIndex -> inclusive
        // toIndex -> exclusive

        // create a new array and copy all the item except first and last.

        // int [] newArr=Arrays.copyOfRange(nums,1,nums.length-1);
        // System.out.println(Arrays.toString(newArr));

        // subarrays:-
        // should be continous
        // same order

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }


        //Subarray

        for(int i=0;i<nums.length-k+1;i++){
            for(int j=i;j<i+k;j++){
                System.out.print(nums[j]);
            }
            System.out.println();
        }

    }
}


// call stack is a memory used by jvm to main method excution.
// call stack follow last in first out.