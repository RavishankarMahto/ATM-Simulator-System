package Function;

public class pattern {
    public static void hollowRec(int totRow, int totCol) {
        // outer loop
        for(int i=1; i<=totRow; i++){
            // inner column
            for(int j=1; j<=totCol; j++) {
                //cell-(i,j)
                if(i==1 || i==totRow || j==1 || j==totCol) {
                    // boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        hollowRec(4,5);
    }
}
