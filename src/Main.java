public class Main {
    public static void main(String[] args) {
        A(11);
    }
    public static void A(int i){
        int factorial = 1;
        for(int j = 1; j<=i;j++){
            factorial = factorial*j;
        }
        System.out.println(factorial);
    }
}