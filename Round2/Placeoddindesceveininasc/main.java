// Write a program to sort the elements in odd positions in descending order and elements in ascending order
// Eg 1: Input: 13,2 4,15,12,10,5
//         Output: 13,2,12,10,5,15,4
// Eg 2: Input: 1,2,3,4,5,6,7,8,9
//         Output: 9,2,7,4,5,6,3,8,1 
import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] arr = new int[n];
// int[] arr = {13,2 4,15,12,10,5};
for(int i=0;i<n;i++)
{
    int get = sc.nextInt();
    arr[i]=get;
}
// int n=arr.length;
sortNumbers(arr,n);

    }
    
    private static void sortNumbers(int[] arr, int l)
    {
        int i=1, j=l-1,m=0;
        int temp=arr[j];
        int[] res = new int[l];
        
        while(m <l)
        {
            int inplace=j;

        for(int k=j-2;k >=0;k-=2)
        {
            if(arr[k] >temp)
            {
                temp=arr[k];
                inplace=k;
            }
        }
         res[m++] = temp;
        if (arr[i] == -1) {
            i += 2;
        
            if (i >= l)
                continue;
        }
        
        temp = arr[i];
         arr[inplace]=-1;
         inplace = i;
         
         for(int k=i+2;k<l;k+=2)
         {
             if(arr[k]< temp && arr[k] != -1)
             {
                 temp=arr[k];
                 inplace=k;
             }
         }
         
         if(m == l)
         {
           break;
         }
  
         res[m++]=temp;
        if (arr[j] == -1) {
            j -= 2;
        
            if (j < 0)
                continue;
        }
        
        temp = arr[j];
        arr[inplace]=-1;
        }
System.out.println(Arrays.toString(res));
    }
}
