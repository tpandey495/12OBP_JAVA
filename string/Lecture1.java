import java.util.*;

public class Main {
    public static void main(String[] args) {

      // two way to create string 
    
    // String Literals
    //  String s = "hello";
    //  System.out.println(s);

    // //  new keyword 
    // String str = new String("Hello");
    // System.out.println(str);


    // Comparison :-

    // String Literal:-
    // String created using string constant pool is stored in string pool.
    // String s1 = "Hello";
    // String s2 = "Hello";
    // System.out.println(s1==s2); //true
    
    // new Keyword:- stored in heap.
    // String s1 = new String("hello");
    // String s2 = new String("hello");
    // System.out.println(s1==s2); //false


    // // Predict the output 
    // String a = "Rahul";
    // a="Vikash";
    // System.out.println(a);

    //String methods

    // String str = "";
    // length() ->o(1)
    // System.out.println(str.length());
    // // charAt(index)->o(1)
    // System.out.println(str.charAt(1));
    // // indexOf(string) -> first occurance of specified string 
    // System.out.println(str.indexOf("H")); ->o(n)
    // System.out.println(str.indexOf("Check"));

    // // lastIndexOf(string) ->o(n) returns index of last occurance of specified string.
    // System.out.println(str.lastIndexOf("e"));


    // substring(start,end?)->o() returns the substring of specified string from 
    // start to end(excluding);
    // default value of end is length;
    // System.out.println(str.substring(0));

    // System.out.println(str.substring(0,2));

    // System.out.println(str.substring(3,6));

    // isEmpty()
    // System.out.println(str.isEmpty());

    // // isBlank()-> o(n) return true if string is empty or contain only white space
    // System.out.println(str.isBlank());


  
    // contains(string) :->o(n) return true if specified string is substring otherwise false.
    // String s = "Hello Check";
    // System.out.println(s.contains(" "));

    // 
    // String s1 = new String("hello");
    // String s2 = new String("Hello");
    // System.out.println(s1==s2);

    // System.out.println(s1.equals(s2));


    // 
    // String s1 = "Check";
    // System.out.println(s1.toUpperCase());


    // String str = "orange";
    // // find reverse the given string 

    // String rev="";
    // for(int i=str.length()-1;i>=0;i--){
    //   rev+=str.charAt(i);
    // }

    // System.out.println(rev);


    // given a string find no of vowels in it.


    // trim() -> remove leading and trailing white space.
    // String str = " ttt ";
    // System.out.println(str.trim());

    // replace() -> remove the matching character with specified one.
    // String str = "Hello check";
    // // System.out.println(str.replace("e","a"));
    // System.out.println(str.replace("check","test"));

    // split(regx) -> split the string by delimeter or regx;
    // String str ="Hello Check Check Check";

    // String [] arr = str.split("e");
    // for(int i=0;i<arr.length;i++){
    //   System.out.println(arr[i]);
    // }


    // String str = "This     course is about Java";

    // approach 1
    // String trimmedStr=str.trim();
    // String[] arr = trimmedStr.split(" ");

    //  int count=0;
    // for(int i=0;i<arr.length;i++){
    //   System.out.println(arr[i]);
    //   if(arr[i]!=" ")
    //    count++;
    // }
    // System.out.println(count);

    // apporach 2 with in built method 
    // String s = "  This    course     is about Java  i ";
    // String str=s.trim();
    // int count=0;
    // for(int i=0;i<str.length();i++){
    //   if(str.charAt(i)==' '){
    //     if(str.charAt(i-1)!=' ')
    //      count++;
    //   }
    // }

    // System.out.println(count+1);

    //  userinput 

    // next()
    // Scanner sc = new Scanner(System.in);
    // String str =sc.next();
    // System.out.println(str);

    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // System.out.println(str);


    // take character input 
    Scanner sc = new Scanner(System.in);
    // char str = sc.nextLine().charAt(0);
    // System.out.println(str);

    // take n string as user input and create a array and then store it 
    int n = sc.nextInt();
    String [] arr = new String[n];

    for(int i=0;i<n;i++){
     arr[i]=sc.nextLine();
    }

   for(int i=0;i<n;i++){
    System.out.println(arr[i]);
   }

    System.out.println(arr.length);
  // 
  // int n=sc.nextInt();
  // String str=sc.nextLine();
  // System.out.println(n);
  // System.out.println(str.length());
  









    






    }
}