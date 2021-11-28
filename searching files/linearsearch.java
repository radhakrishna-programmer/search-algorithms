import java.util.Scanner;
public class linearsearch{
    public static void main(String[]args){
        System.out.println("Enter the Array size");
        int n,i=0,k;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        k=input.nextInt();
      int[]arr =new int[n];
      for(i=0;i<n;i++){
          arr[i]=input.nextInt();
      }
      for(i=0;i<n;i++){
        if(arr[i] == k){
          System.out.println(i);
          break;
        }
        
      }
      if(i==n)
        System.out.println("element not found");
      
      

    }
}