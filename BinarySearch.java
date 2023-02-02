import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch{
    public static void bin_search (int arr[],int search,int first,int last){
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid]<search){
                first=mid+1;
            }else if(arr[mid]>search){
                last=mid-1;
            }else{
                System.out.println(search+" is found in the "+(mid+1)+"th position.");
                break;
            }
            mid=(first+last)/2;
            if(first>last){
                System.out.println(search+" is not present in the array.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.print("Enter the no of elements you want to add in the array:");
        int num = nm.nextInt();
        int []arr = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter the "+(i+1)+"th element:");
            arr[i]=nm.nextInt();
        }
        int last=arr.length-1;
        Arrays.sort(arr);
        System.out.println("The elements after sorting:");
        for(int j=0;j<num;j++){
            System.out.println(arr[j]);
        }
        System.out.print("Enter the element you want to search:");
        int search = nm.nextInt();
        bin_search(arr,search,0,last);
    }
}
