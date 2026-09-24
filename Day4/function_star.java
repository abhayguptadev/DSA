public class function_star {
    
    static void printStar(int n) {
        int k = 2;
        for (int i = 1; i<n ;i++){
            for(int j=1; j<3;j++){
                System.out.println("*".repeat(k));
            }
            k+=2;      
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        printStar(4);
    }

    
}

