import java.util.*;

public class Main {
    public static void main(String[] args) {
      // create a matrix  n*m size 
      // then print it column wise 
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m= sc.nextInt();

      int [][]mat =new int[n][m];

      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
         mat[i][j]=sc.nextInt();
        }
      }

      // row wise traversal
      // for(int row=0;row<n;row++){
      //   for(int col=0;col<m;col++){
      //     System.out.print(mat[row][col]+" ");
      //   }
      //   System.out.println();
      // }

      // for(int col=0;col<m;col++){
      //  for(int row=0;row<n;row++){
      //     System.out.print(mat[row][col]+" ");
      //   }
      //   System.out.println();
      // }
      // t.c-> o(n*m)


      // for(int col=0;col<m;col++){
      //  for(int row=n-1;row>=0;row--){
      //     System.out.print(mat[row][col]+" ");
      //   }
      //   System.out.println();
      // }

      // 


      // for(int row=0;row<n;row++){
      //   if(row%2==0){
      //      for(int col=0;col<m;col++)
      //        System.out.println(mat[row][col]);
      //   }
      //   else{
      //     for(int col=m-1;col>=0;col--)
      //        System.out.println(mat[row][col]);
      //   }
      // }


      // Transpose of a square matrix 

      for(int row=0;row<n;row++){
        for(int col=0;col<m;col++){
          if(row<col){
            int temp=mat[row][col];
            mat[row][col]=mat[col][row];
            mat[col][row]=temp;
           }
          }  
      }


      for(int row=0;row<n;row++){
        for(int col=0;col<m;col++){
          System.out.print(mat[row][col]+" ");
        }
        System.out.println();
      }

      // transpose matrix -> what if matrix is rectangular



      // find the sum of lower traingle items of a square matrix 

      // boundry traversal of matrix 
      

      

       


 
      sc.close();
    }
}