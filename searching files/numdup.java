import java.util.Scanner;
public class numdup{
    public static void main(String[]args){
        System.out.println("Enter the Array size");
        int n,i=0,k,c=0;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        k=input.nextInt();
      int[]arr =new int[n];
      for(i=0;i<n;i++){
          arr[i]=input.nextInt();
      }
      for(i=0;i<n;i++){
        if(arr[i] == k){
          c=c+1;
        }
        
      }
     System.out.println(c);
      
      

    }
}
    
