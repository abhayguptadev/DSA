public class sort {
    public static void main(String[] args) {

        //selection sort

        int [] original = {2,1,5,3,4};
        int[]  arr1 = original.clone();
        int[] arr2 = original.clone();

        System.out.println("Selection Sort : ");
        selectionSort(arr1);
        printArry(arr1);
        System.out.println("");
        System.out.println("Insertion Sort : ");
        insertionSort(arr2);
        printArry(arr2);



        
    }
    public static void printArry(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }   
    }
    public static void selectionSort(int [] arr) {
        for(int i = 0 ; i<arr.length ; i++){
            int min_num = i;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[min_num]>arr[j]){

                    min_num=j;

                }
            }
            int teemp = arr[i];
            arr[i] = arr[min_num];
            arr[min_num] = teemp;
        }        
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void mergeSort(int [] arr , int left , int right){
        if(left>right){
            
        }

    }




        
    }

