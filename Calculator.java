public class Calculator {
    int num1 = 100;
    int num2 = 12;

    void add(){

        int rs = num1+num2;
        System.out.println(rs);
    }
    void sub(){
        int rs = num1-num2;
        System.out.println(rs);

    }
    void mul(){
        int rs = num1*num2;
        System.out.println(rs);
        
    }
    void div(){
        if(num2==0){
            System.out.println("Cannot divide by 0");

        }
        else{
            float rs = (float)num1/num2;
            System.out.println(rs);
        }
        
    }
    
}
class MyCalculator{
    public static void main(String[] args){
    Calculator m = new Calculator();
    m.add();
    m.sub();
    m.mul();
    m.div();
    }

}

