public class Main {
    public static void main(String[] args) {
        A(11);
// Ніколи не називай так методи. В Java є свої правила назв і за цим дуже прискіпливо спостерігають. Привчайся робити правильно. Програма має самодокументуватися!

    }
    public static void A(int i){
        int factorial = 1;
        for(int j = 1; j<=i;j++){
            factorial = factorial*j;
        }
        System.out.println(factorial);
    }
}
