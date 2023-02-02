import java.util.Scanner;
public class Deletion{
    public static void deletion(int arr[],int position,int actual_len){
        for(int j=(position-1);j<(actual_len-1);j++){
            arr[j]=arr[j+1];
        }
        for(int k=0;k<(actual_len-1);k++){
            System.out.println(arr[k]);
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
        System.out.print("Enter the position where you want to delete the new element:");
        int position = nm.nextInt();
        deletion(arr,position,actual_len);
    }

}
