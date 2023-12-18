public class Triangle {
    public static void main(String[] args) {
        //get 3 numbers from the command-line and define them as a variable of type int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // define a boolean variable that represent the answaer (if the 3 numbers can form triangle)
        boolean answer = false;
        // check if any two sides is greater than the length of the remaining side
        if(((a+b)>=c)&&((b+c)>=a)&&((a+c)>=b))
        {
            answer = true;
        }
        // print the 3 numbers and the answer
        System.out.println(a + " , " + b + " , " + c + ": " + answer); 
    }
}
