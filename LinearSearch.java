import java.util.Scanner;
public class LinearSearch {
    public static void linearSearch(int []arr,int search,int actual_len){
        for(int i=0;i<actual_len;i++){
            if(arr[i]==search){
                System.out.println("The element is found in the "+(i+1)+"th location.");
                break;
            }
        }
    }
    public static void main(String args[]){
        Scanner nm = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int len_arr = nm.nextInt();
        int actual_len = len_arr;
        int arr[] = new int[actual_len];
        for(int i=0;i<len_arr;i++){
            if(i==0){
                System.out.print("Enter the "+(i+1)+"st element:");
                arr[i]=nm.nextInt();
            }
            else if(i==1 || i==2){
                System.out.print("Enter the "+(i+1)+"rd element:");
                arr[i]=nm.nextInt();
            }else{
                System.out.print("Enter the "+(i+1)+"th element:");
                arr[i]=nm.nextInt();
            }
        }
        System.out.print("Enter the element you want to search:");
        int search = nm.nextInt();
        linearSearch(arr,search,actual_len);
    }
}
