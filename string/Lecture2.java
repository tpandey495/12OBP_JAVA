import java.util.*;

public class Main {

    static boolean isPalindrome(String str){

      int start=0,end=str.length()-1;
      while(end>start){
        if(str.charAt(start)!=str.charAt(end)){
          return false;
        }
        start++;
        end--;
      }
      return true;
    }

    public static void main(String[] args) {
      // 
      // difference bw isEmpty() && isBlank()
      // isEmpty() -> ""
      // isBlank() -> "  ";
      // String str1 =new String("hello");
      // String str2 =new String("hello1");
      // System.out.println(str1==str2);

      // System.out.println(str1.equals(str2));

      // String str = "Hello";
      // String [] arr=str.split("");

      // System.out.println(Arrays.toString(arr));

 
      // array of strings 
    //   for(int i=0;i<arr.length;i++){
    //      System.out.println(arr[i]);
    //   }

    //   // array of character 
    //   // toCharArray
    //  char [] charac=str.toCharArray();

    //  for(int i=0;i<charac.length;i++)
    //    System.out.println(charac[i]);

  
   
    // given a string check if it is palindrome or not.
    // String str = "nayana";
    // String result=(isPalindrome(str)==true)?"Palindrome":"Not Palindrome";
    // System.out.println(result);

    char [] arr ={'l','e','t'};

    // convert this to string 
    // String str="";

    // for(char ch:arr){
    //   str+=ch;
    // } 

    // System.out.println(str);

    // using String Object
    // String str=new String(arr);
    // System.out.println(str);

    // // using valueOf()

    // System.out.println(String.valueOf(arr));


    // 
    // String str = "abc";
    // String uppStr=str.toUpperCase();
    // String alt = "ABC";
    // System.out.println(alt==uppStr); //false


    // 

    //  System.out.println((char)('A'+32));


    // String str="hell12ABC";
    // String res="";
    
    // for(int i=0;i<str.length();i++){
    //   char ch=str.charAt(i);
    //   if('A'<=ch && ch<='Z'){
    //      res+=(char)(ch+32);
    //   }
    //   else if('a'<=ch && ch<='z'){
    //      res+=(char)(ch-32);
    //   }else{
    //     res+=ch;
    //   }
    // }

    // System.out.println(res);

    // // Character class methods 
    // System.out.println(Character.isDigit('0')); //true 
    // System.out.println(Character.isDigit('a')); //false 

    // System.out.println(Character.isUpperCase('B'));


     String str="hell12ABC";
    String res="";
    
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(Character.isUpperCase(ch)){
         res+=Character.toUpperCase(ch);
      }
      else if(Character.isLowerCase(ch)){
         res+=Character.toLowerCase(ch);
      }else{
        res+=ch;
      }
    }

    System.out.println(res);














     
     


    }
}