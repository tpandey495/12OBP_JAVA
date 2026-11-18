import java.util.*;

public class Main {
    public static int[] SmallestGreaterElements(int[] nums) {
      // https://course.acciojob.com/idle?question=878481a2-35da-4f24-85ed-13c333ca59d3
        // Write your code here

        int n=nums.length;
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
              arr[i]=nums[i];
        }
        
        // bubble sort 
        for(int i=0;i<n-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                isSwapped=true;
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                }
            } 
            if(isSwapped==false){
                break;
            }  
        }

        // Linear search

        int[] sme = new int[n];
        for(int i=0;i<n;i++){
            int curr=nums[i];
            for(int j=0;j<n;j++){
                 if(curr==arr[j]){
                    if(j<n-1){
                      sme[i]=arr[j+1];
                    }
                    else{
                        sme[i]=-10000000;
                    }
                 }
            }

        }

        return sme;
    }
    public static void main(String[] args) {

        // SME
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++)
        //     arr[i] = sc.nextInt();
        // int[] ans = SmallestGreaterElements(arr);
        // for(int a : ans) {
        //     System.out.print(a + " ");
        // }

        // insertion sort 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }

        int i=1;
        while(i<n){
          int key=arr[i],j=i-1;
          while(j>=0&& arr[j]>key){
            arr[j+1]=arr[j];
            j--;
          }
          arr[j+1]=key;
          i++;
        }

        System.out.println(Arrays.toString(arr));

      // Time Complexity-
        // B.c-> o(n)(when array is already sorted )
        // A.c ->o(n^2)
        // w.c->o(n^2)
      // Space Complexity-> o(1)





    }
}

// 4
// 13 6 17 12