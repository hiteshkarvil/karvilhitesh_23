public class recursion {
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return(n * factorial(n-1));
        }
    }
    public static void main(String[] args){
        int a = 9;
        System.out.println("the value of factorial a is : " +factorial(a));
    }
}
