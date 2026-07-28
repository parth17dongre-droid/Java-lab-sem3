class method_overloading{
    static int a=10;
    static int b = 20;
    static int c = a+b;
    static int count;
   

    method_overloading() {
        System.out.println("Default constructor called");
        System.out.println("Result is: "+c);
        count++;
        System.out.println("Number of Objects is: "+count);

    }
    method_overloading(int a, int b){

        System.out.println("Paramatrized Constructor Called");
        c = a+b;
        System.out.println("Result is: "+c);
        count++;
        System.out.println("Number of Objects is: "+count);




    }
    
}


public class assignment3 {
    public static void main(String[] args){
        method_overloading m = new method_overloading();
        method_overloading n = new method_overloading(30, 20);
        
    }
}
