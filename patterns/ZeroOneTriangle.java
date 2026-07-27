package patterns; 

public class ZeroOneTriangle {
    public static void main(String[] args){
        int n=5;
        
        //outerloop
        for(int i=1; i<=n; i++) {

            //innerloop
            for(int j=1; j<=i; j++){

                int sum = i+j;
                if (sum % 2 == 0) {
                    
                    //even
                    System.out.print("1 ");
                }   else {
                    //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
