package Loop;

public class break1 {
    public static void main(String[] args){
        int i;
        for(i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm successfully out of the loop");
    }
}
