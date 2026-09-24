import java.util.Scanner;

public class array {
    static void main(String[] args) {
        int[] arr = {1,2,5,8,70};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1 ; i<arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Your minimum value  "+ min);
        System.out.println("Your maximum value  " + max);

        // Sum of array element

        int sum = 0;
        for (int i = 0 ; i<arr.length ; i++){
            sum = sum+arr[i];

        }
        System.out.println("Your Sum  " + sum);

        // count even and odd

        int even_count = 0;
        int odd_count = 0; 

        for(int i = 0; i<arr.length ; i++){
            if(arr[i]%2==0){
                even_count = even_count+1;
            }else{
                odd_count = odd_count+1;
            }

        }
        System.out.println("Even Number's  " + even_count);
        System.out.println("Odd Number's  " + odd_count);

        // find positive and nagetive

        int po = 0;
        int ne = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<0){
                ne++;
            }else{
                po++;
            }

        }
        System.out.println("Positive number = " + po);
        System.out.println("Negetive number = " + ne);


        // find target index

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter :  ");
         int ta = scanner.nextInt();

         for (int i = 0 ; i<arr.length ; i++){
            if(arr[i] == ta){
                System.out.println(i);
            }
         }
         // reverse array

         int n = arr.length;
         for(int i = n-1; i>=0; i--){
            System.out.print(arr[i]+" ");}
         System.out.println(" ");

         for(int i =0; i<5; i++){
            System.out.print(arr[i]+" ");
         }


    }

}
