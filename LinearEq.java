public class LinearEq {
    public static void main(String[] args){
        //get 3 numbers from the command-line and define them as a variable of type double
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        // calculate x - a*x+b=x
        double x = (c-b)/a;
        // print
        System.out.println("x = " + x);

        
    }
}
