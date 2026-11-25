import java.util.*;

public class Main {
    public static void main(String[] args) {

    // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    //  ArrayList<Integer>row1=new ArrayList<>();
    //  row1.add(1);
    //  row1.add(2);
    //  row1.add(3);

    //  list.add(row1);


    //  ArrayList<Integer>row2=new ArrayList<>();
    //  row2.add(4);
    //  row2.add(5);
    //  row2.add(6);
     

    
    // // Adding row in 2d arraylist 

    //  list.add(row2);
     
    // //  accessing value from 2d array list 

    // // System.out.println(list.get(1).get(2));

    // // Adding value inside 2d array list 
    // list.get(1).add(7);

    // // add a new row 
    // ArrayList<Integer>row3=new ArrayList<>();
    // list.add(row3);

    // // System.out.println(list);

    // // no of row 
    // // System.out.println(list.size());

    // // // no of item in 0th row 
    // // System.out.println(list.get(0).size());



    // //  traverse 2d arraylist 
    // for(int row=0;row<list.size();row++){
    //   for(int col=0;col<list.get(row).size();col++){
    //     System.out.print(list.get(row).get(col)+" ");
    //   }
    //   System.out.println();
    // }


    // // traverse 2d  arraylist 

    // for(ArrayList<Integer> rows:list){
    //   for(Integer a:rows){
    //     System.out.print(a+" ");
    //   }
    //   System.out.println();
    // }

    // user input 

    // take user input 
    // and create 2ArrayList of n*m size then find the sum of all the items 
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m =sc.nextInt();


    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    for(int row=0;row<n;row++){
      ArrayList<Integer>rows = new ArrayList<>();
      for(int col=0;col<m;col++){
          rows.add(sc.nextInt());
      }
      list.add(rows);
    }


    System.out.println(list);

    sc.close();


    // pascal traingle 

 Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();

      ArrayList<ArrayList<Integer>> list = new ArrayList<>();

      for(int row=0;row<n;row++){
        ArrayList<Integer> rows=new ArrayList<>();

        for(int col=0;col<=row;col++){
          if(col==0){
            rows.add(1);
          }
          else if(col==row){
            rows.add(1);
          }
          else{
            rows.add(list.get(row-1).get(col-1)+list.get(row-1).get(col));
          }
        }
        list.add(rows);
      }

     System.out.println(list);



      
    }
}