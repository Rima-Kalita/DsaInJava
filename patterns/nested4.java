package patterns;

public class nested4 {
    public static void main(String[] args) {
        
        int n = 5;

        //outer loop
        for(int i = n; i >= 1; i--){

            //innerloop
            for(int j = 1; j<=i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}