import java.util.Scanner;
public class unique{
    public static void main(String[] args){
        int i,j;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n= input.nextInt();
     System.out.println("Enter the element to be searched: ");
        int k=input.nextInt();
        int a[]=new int[n];
        int count=0;
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                   count+=1;
                }
             }
        }
        if(count==n)
        {
            System.out.println("The unique elements: "+n);
        }
        else
        {
            System.out.println("Unique elements: "+(n-count));
        }
    }
}
   
