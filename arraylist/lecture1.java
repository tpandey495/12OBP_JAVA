import java.util.*;

public class Main {
    public static void main(String[] args) {
        //  Array -> 
          // list of items 
          // fixed in sized

        // ArrayList -> 
         //  list of items 
         //  Dyanmic 

        //  

        //  ArrayList<Integer> list = new ArrayList<>();

        //add(item)  -> insert a item at the end of the arrayList and return true if 
        // a value inserted successfully otherwise false  
        // System.out.println(list.add(1));
        // list.add(2);
        // list.add(5);

        // // add(index,element);

        // list.add(1,50);

        // list.add(4,30);

  //       // when index is greater than length of the array 
  //       // list.add(6,50);
  // //       java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
	// // at 


  //     //  set(index,value) -> update the value at the index and return previous value.
  //     list.set(1,40);

  //   // when index is equal to length
  //     list.set(6,70);
  // //     java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
	// // at 
     
  //  get(index) -> return the value at index .
    // System.out.println(list.get(0));


    // // 
    // System.out.println(list.size());

  //    ArrayList<Integer> list = new ArrayList<>();
  //    list.add(1);
  //    list.add(2);
  //    list.add(3);
  //    list.add(4);

  //   // remove(index) -> remove the value present at the index and return 
  //   // the removed value.
  //   System.out.println(list.remove(1));
  //   // list.remove(2);
  //   // list.remove(5);

  //   // System.out.println(list);

  //   // remove(Integer.valueOf(value))
  //   list.remove(Integer.valueOf(2));
  //   System.out.println(list);    

  //  // 
  //   System.out.println(list.isEmpty());

  // //remove all the item of the array list 
  //   list.clear();
  //   System.out.println(list);


   //  indexOf 
    // lastIndexOf 
    // given a sorted array find out the freq of item k.


    //  ArrayList<Integer> list = new ArrayList<>();
      
    //  list.add(4);
    //  list.add(1);
    //  list.add(2);
    //  list.add(3);
    //  list.add(2);
    
    

    //  int k=2;

    //  System.out.println(list.lastIndexOf(k)-list.indexOf(k)+1);

    //  traversing ArrayList 
    // for(int i=0;i<list.size();i++){
    //   System.out.println(list.get(i));
    // }

    // for(Integer a:list){
    //   System.out.println(a);
    // }

    // forEach()


    // collections -> utility class
    // max 
    // min 
     // reverse 
    // sort(reverseOrder)
   

    // System.out.println(Collections.max(list));

    // System.out.println(Collections.min(list));

    // // 
    // Collections.reverse(list);
    // System.out.println(list);


    // sort()
    // Collections.sort(list);
    // Best Case -> o(n) 
    //  Average and Worst-> o(nlogn)
    // space complexity -> o(n)


    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);

    // 2D ArrayList 
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    arr.add(new ArrayList<>());
    arr.add(new ArrayList<>());

    arr.get(0).add(1);
    arr.get(0).add(2);
    arr.get(0).add(3);

    arr.get(1).add(4);
    arr.get(1).add(5);

   for(int i=0;i<arr.size();i++){
    System.out.println(arr.get(i));
   }

   System.out.println(arr);

  //  question practice -> pascal's traingle 


  // Strings 





   


   



   

    



    }
}