import java.util.*;

public class Main {
    public static void main(String[] args) {
    //  int [][] mat={
    //   {9,7,8,11,21},
    //   {1,4,3,7,2},
    //   {3,3,14,9,12}
    // };

    // int n=mat.length;
    // int m=mat[0].length;

    //  for(int col=0;col<m;col++){
    //    for(int row=1;row<n;row++){
    //     int key=mat[row][col];
    //     int j=row-1;
    //     while(j>=0 && mat[j][col]>key){
    //       mat[j+1][col]=mat[j][col];
    //       j--;
    //     }
    //     mat[j+1][col]=key;
    //    }
    // }

    // for(int row=0;row<n;row++){
    //   for(int col=0;col<m;col++){
    //     System.out.print(mat[row][col]+" ");
    //   }
    //   System.out.println();
    // }

    // normal switch case 
    // int day =1;
    // switch(day){
    //   case 1: 
    //      System.out.println("Sunday");
    //      break;
    //   case 2:
    //      System.out.println("Monday");
    //      break;
    //   case 3:
    //      System.out.println("Tuesday");
    //      break;
    //   case 4:
    //      System.out.println("Wednesday");
    //      break;
    //   case 5:
    //      System.out.println("Thursday");
    //      break;
    //   case 6:
    //      System.out.println("Friday");
    //      break;
    //     case 7:
    //      System.out.println("Saturday");
    //      break; 
    //   default: 
    //      System.out.println("Invalid Input");
    // }

    // switch statement cases:

    // int nums=3;
    // switch(nums){
    //   case 1:
    //   case 2:
    //   case 3: 
    //     System.out.println("first 3");
    //     break;
    //   case 4:
    //   case 5: 
    //   case 6: 
    //     System.out.println("second three");

    //   default:
    //     System.out.println("Not first two three");
    // }

    // 
    // int nums=3;
    // switch(nums){
    //   case 1:
    //   case 2:
    //   case 3: 
    //     System.out.println("first 1 or");
    //     System.out.println("first 2 or");
    //     System.out.println("first 3");
    //     break;
    //   case 4:
    //   case 5: 
    //   case 6: 
    //     System.out.println("second three");

    //   default:
    //     System.out.println("Not first two three");
    // }


    // switch expression 
    // introduced in java 14
    // in java we can return a value from the switch expression 

    // return the name of the day.
    // int day=3;

    // String name=switch(day){
    //     case 1 -> "Sunday";
    //     case 2 -> "Monday";
    //     case 3 -> "Turesday";
    //     default -> "Not first three days";
    //   };

    // System.out.println(name);

    // multiple condition 
    // multiple statement 

      // 
    // int nums=3;
    // switch(nums){
    //   case 1:
    //   case 2:
    //   case 3: 
    //     System.out.println("first 1 or");
    //     System.out.println("first 2 or");
    //     System.out.println("first 3");
    //     break;
    //   case 4:
    //   case 5: 
    //   case 6: 
    //     System.out.println("second three");

    //   default:
    //     System.out.println("Not first two three");
    // }

    // convert this code in to switch expression 
    // int nums=1;

    // String message=  switch(nums){
    //     case 1,2,3-> "First 3";
    //     case 4,5,6-> "Second 3";
    //     default-> 
    //       "Not first two three";
    //   };

    //  System.out.println(message);


    //  multiple statement in switch case 
       int nums=1;

    String message=  switch(nums){
        case 1,2,3-> {
            System.out.println("First 3");
            yield "First 3";
        }
        case 4,5,6-> {
          System.out.println("Second 3");
            yield "Second 3";
        }
        default-> 
          "Not first two three";
      };

     System.out.println(message);
  }
}
