import java.util.Scanner;
class binarysearch{  
  int Binarysearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return Binarysearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return Binarysearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
      int n,ke,first,l;
      Scanner input=new Scanner(System.in);
       n=input.nextInt(); 
       ke=input.nextInt();
       l=n-1;
       first=0;

        int[]arr=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=input.nextInt();
     }
   binarysearch b1= new binarysearch();
         int k= b1.Binarysearch(arr, first, l, ke);
        if (k == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+k);  
    }  
}  