import java.util.Scanner;
public class Insertion {
    public static void insertion(int arr[],int position,int element,int actual_len){
        for(int j=(actual_len-1);j>=position;j--){
            arr[j]=arr[j-1];
        }
        arr[position-1]=element;
        for(int k=0;k<actual_len;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String []args){
        Scanner nm = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int len_arr = nm.nextInt();
        int actual_len = len_arr + 1;
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
        System.out.print("Enter the position where you want to insert the new element:");
        int position = nm.nextInt();
        System.out.print("Enter the element you want to insert:");
        int element = nm.nextInt();
        insertion(arr,position,element,actual_len);
    }
}
