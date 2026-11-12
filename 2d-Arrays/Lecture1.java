import java.util.*;

public class Lecture1{
    public static void main(String[] args) {

      // 2D arrays -> array of arrays 

      // declare 2d array 
      // int [][] arr = new int[3][3];


      // decleareation + intialization 
      // int [][] arr={
      //   {1,2,3},
      //   {3,4,5},
      //   {5,6,7},
      //   {5,6,7}
      // };


      // // System.out.println(arr[1][1]);
      // // System.out.println(arr[2][2]);


      // // find no of rows 
      // System.out.println(arr.length);

      // // find no of cols
      // System.out.println(arr[0].length);


      // decleare 
      // Scanner sc = new Scanner(System.in);
      // int n=sc.nextInt();

      // int m=sc.nextInt();

      // int [][] arr = new int[n][m];

      // for(int row=0;row<n;row++){
      //   for(int col=0;col<m;col++){
      //     arr[row][col]=sc.nextInt();
      //   }
      // }


      // for(int row=0;row<n;row++){
      //   for(int col=0;col<m;col++){
      //     System.out.print(arr[row][col]+" ");
      //   }
      //   System.out.println();
      // }


      // find left diagonal of a 2d array of size n*n;
      // Scanner sc = new Scanner(System.in);
      // int n=sc.nextInt();

      // int [][] arr = new int[n][n];

      // for(int row=0;row<n;row++){
      //   for(int col=0;col<n;col++){
      //     arr[row][col]=sc.nextInt();
      //   }
      // }
 

    //  for(int row=0;row<n;row++){
    //   for(int col=0;col<n;col++){
    //     if(row==col)
    //      System.out.println(arr[row][col]);
    //   }
    //  }

    // T.c -> o(n^2)

    //  optimize 

    // for(int row=0;row<n;row++){
    //   System.out.println(arr[row][row]);
    // }

    // T.c-> o(n)


    // follow up question what will happen in case n*m size 2D array

    // find the right diagonal 

    // for(int row=0;row<n;row++){
    //   for(int col=0;col<n;col++){
    //     if(row+col==n-1)
    //        System.out.print(arr[row][col]+" ");
    //   }
    // }
    // Time Complexity-> o(n^2)

    // optimize ->o(n)
    // Follow up question what will happen incase of n*m size 2d array.

    // Jagged Arrays:- 
    // create jagged arrays 
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();

    int [][] arr= new int[n][];


    for(int row=0;row<n;row++){
      System.out.println("No of items in the"+row+"th row");
      int m=sc.nextInt();
      int[] temp = new int[m];
      System.out.println("enter the items of"+row);
      for(int col=0;col<m;col++){
        temp[col]=sc.nextInt();
      }
      arr[row]=temp;
    }


    for(int row=0;row<n;row++){
      for(int col=0;col<arr[row].length;col++){
        System.out.print(arr[row][col]+" ");
      }
      System.out.println();
    }




      sc.close();
      
    }
}