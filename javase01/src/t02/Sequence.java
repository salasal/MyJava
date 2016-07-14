package t02;

/**
 * Created by Alexey on 20.06.2016.
 */
public class Sequence {
    public static void main(String[] args) {
    double epsilon = 0.01d;
    int i=1;
    for ( i = 1; function(i) >= epsilon; i++);
    System.out.println(i);
    for (int j = 1; j <=i; j++)
        System.out.println(function(j));
}
    public static double function(int i){
        double result = 1.0/((i+1.0)*(i+1.0));
        return result;
    }
}
