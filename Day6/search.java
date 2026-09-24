

public class search {

    public static void main(String[] args) {

        //Binary Search

        int[] arr = {10, 20, 30, 40, 50, 60};
        // int left = 0;
        // int right = arr.length - 1;

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter Target Value :  ");
        // int target = scanner.nextInt();
        // boolean found = false;

        // while (left < right) {
        //     int mid = left + (right - left) / 2;
        //     if (arr[mid] == target) {
        //         found = true;
        //         System.out.print(found);
        //         break;
        //     } else if (arr[mid] < target) {
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
            


        // }
        // System.out.print(found);

        int max_sum = arr[0];
        int current_sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            current_sum = current_sum+arr[i];
            if(current_sum>max_sum){
                max_sum = current_sum;
            }
            if(max_sum<0){
                max_sum = 0;
            }
        }
    System.out.println(max_sum);
    }

}