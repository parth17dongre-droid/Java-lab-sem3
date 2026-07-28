class calculator_class{
   
    void add(int n,int m){
        System.out.println("Result is: "+(m+n));
    }
     void add(double n,double m){
        System.out.println("Result is: "+(m+n));
    }
   
     void sub(int n,int m){
        System.out.println("Result is: "+(m-n));
    }
     void sub(double n,double m){
        System.out.println("Result is: "+(m-n));
    }
     void mul(int n,int m){
        System.out.println("Result is: "+(m*n));
    }
    void mul(double n,double m){
        System.out.println("Result is: "+(m*n));
          
    }
     void div(double n, double m){
        if(n==0){
            System.out.println("Result is: "+(m*n));
        }
        else{
            System.out.println("Cannot divide by 0");
        }
         
        
    
    }
    void div(int n,int m){
        if(n==0){
            System.out.println("Result is: "+(m*n));
        }
        else{
            System.out.println("Cannot divide by 0");
        }

        
    
    }

    static int count = 0;
    void constructor_class(){
        count++;
    }
   static void show_count(){
        System.out.println("Count of objects is: "+count);
    }
}
public class calculator {
    public static void main(String[] args) {
        calculator_class m = new calculator_class();
        m.add(3.5,4.8);
        m.add(4,5);
        calculator_class.show_count();

    }
}
