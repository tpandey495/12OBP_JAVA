public class Main
{
	public static void main(String[] args) {
	   //  loop 
	   //print hello five time 
	   //3 5 6 
	   //System.out.println("Hello");
	   //System.out.println("Hello");
	   //System.out.println("Hello");
	   //System.out.println("Hello");
	   //System.out.println("Hello");
	   
	   
	   //loop -> excute a peice of code multipe times 
	   
	   //for loop 
	   //while loop 
	   //do while
	   
	   //for(int i=0;i<5;i++){
	   //    System.out.println(i);
	   //    System.out.println("Hello");
	   //}
	   
	   //print 1 to n using loop 
	   //int n=10;
	   //for(int i=1;i<=n;i++){
	   //    System.out.println(i);
	   //}
	   
	   
	   
	   //find the sum of first n natural number 
	   //int sum=0;
	   //int n=10;
	   //for(int i=1;i<=n;i++){
	   //    sum+=i;

	   //}
	   //System.out.println(sum);
	   
	   
	   //find the factorial of a number
	   
	   //int fact=1,n=5;
	   //for(int i=1;i<=n;i++){
	   //    fact=fact*i;
	   //}
	   //System.out.println(fact);
	   
	   
	   ////solve it using while loop
	   
	   //int i=1,fact=1;
	   //while(i<=n){
	   //    fact=i*fact;
	   //    i++;
	   //}
	   //System.out.println(fact);
	   
	   
	   
	   //find sum of all even numbers from 1 to n 
	   // int n=10,sum=0;
	   // for(int i=1;i<=n;i++){
	   //      if(i%2==0)
	   //          sum+=i;
	   // }
	   
	   //System.out.println(sum);
	   
	   //approach 2
	   // int n=10,sum=0;
	   // for(int i=2;i<=n;i=i+2){
	   //          sum+=i;
	   // }
	   
	   //System.out.println(sum);
	   
	   
	   //while loop 
	   
	   //while(condition){
	       
	   //}
	   
	   //
	   
	   //int i=1,n=10;
	   //while(i<n){
	   //    System.out.println(i);
	   //    i++;
	   //}
	   
	 
	   
	   //find no of digit in a number 
	   //int n = 123;
	   //int digit=0;
	   
	   //while(n!=0){
	   //    digit++;
	   //    n=n/10;
	   //}
	   
	   //System.out.println(digit);
	   
	   // using for loop 
	   //int digit=0;
    //   int n=321;
	   //for(int i=n;i>0;i=i/10){
	   //    digit++;
	   //}
	  
	   //System.out.println(digit);
	   
	   //reverse a number 
	   int n=3214;
	   int rev=0;
	   while(n!=0){
	      int last_digit=n%10;
	      rev=rev*10+last_digit; //
	      n=n/10;
	   }
	   
	   System.out.println(rev);
	}
}