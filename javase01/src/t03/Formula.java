package t03;

/**
 * Created by Alexey on 20.06.2016.
 */
public class Formula {
    public static void main(String[] args) {
        double a = 0.0d;
        double b = 10.0d;
        double h = 0.2d;
        for(int i = 0;(a + i*h) <= b ; i++){
            System.out.print(a+h*i);
            System.out.print("\t");
            System.out.println(F(a+i*h));
        }
    }
    public static double F(double x){
        double result = 1.0/Math.tan(2.0*x) - 3;
        return result;
    }
}
