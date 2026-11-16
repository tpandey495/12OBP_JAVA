import java.util.*;

public class Main {
    public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // int n=sc.nextInt();
      // int m=sc.nextInt();

      // int [][] mat = new int[n][m];

      // for(int i=0;i<n;i++){
      //    for(int j=0;j<m;j++){
      //       mat[i][j]=sc.nextInt();
      //    }
      // }

      // for(int i=0;i<n;i++){
      //   for(int j=0;j<m;j++){
      //     if(i==0 || i==n-1 || j==1|| j==m-1){
      //       System.out.print(mat[i][j]+" ");
      //     }
      //   }
      // }

      // correct approach 

      // int top=0,left=0,right=m-1,bottom=n-1;
      
      // // left to right for top row 
      // for(int k=left;k<=right;k++){
      //   System.out.println(mat[top][k]);
      // }

      // top++;

      // // top to bottom for last column 
      // for(int k=top;k<=bottom;k++){
      //     System.out.println(mat[k][right]);
      // }

      // right--;

      // // right to left for bottom row  
      // for(int k=right;k>=left;k--){
      //   System.out.println(mat[bottom][k]);
      // }

      //  bottom--;

      // // bottom to top for first column 
      // for(int k=bottom;k>=top;k--){
      //    System.out.println(mat[k][left]);
      // }

    // T.c -> o(n+m)
    // S.c -> o(1)


    // spiral matrix 
    // int top=0,left=0,right=m-1,bottom=n-1;
    // while(top<=bottom && left<=right){
    //     // left to right for top row 
    //   for(int k=left;k<=right;k++){
    //     System.out.println(mat[top][k]);
    //   }

    //   top++;

    //   // top to bottom for last column 
    //   for(int k=top;k<=bottom;k++){
    //       System.out.println(mat[k][right]);
    //   }

    //   right--;

    //   // right to left for bottom row  
    //   for(int k=right;k>=left && top<=bottom ;k--){
    //     System.out.println(mat[bottom][k]);
    //   }

    //    bottom--;

    //   // bottom to top for first column 
    //   for(int k=bottom;k>=top && left<=right;k--){
    //      System.out.println(mat[k][left]);
    //   }
    //   left++;
    // }
      
    // T.C -> o(n*m)
    // S.C-> o(1)


    // given a matrix m*n find it's transpose.



    // given two matrix of size n*m find sum of it 


    int [][] mat1 ={{1,2,3},
                    {4,5,6},
                    {7,8,9}
                    };

    int [][] mat2={
      {4,5,6},
      {7,8,9},
      {10,11,12}
    };


    int [][] sum= new int[3][3];


    for(int i=0;i<mat1.length;i++){
      for(int j=0;j<mat1[0].length;j++){
          sum[i][j]=mat1[i][j]+mat2[i][j];
      } 
    }

    


      
    


       
      
      sc.close();      
    }
}