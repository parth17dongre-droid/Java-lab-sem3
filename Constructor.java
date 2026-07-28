 class Student{
    String name;
    int age;
    String height;
    int weight;
    int PRN;


Student(){
    name = "Guest";
    age = 18;
    height = "5'7";
    weight = 60;
    PRN = 007;


}
Student(String n,int a){
    name = n;
    age = a;
 
}

Student(Student s){
    this.name = s.name;
    this.age = s.age;
    this.height = s.height;
    this.weight = s.weight;
    this.PRN = s.PRN;

}
void display(){
    System.out.println("Hello " + name + "\nAge: "+age);
    System.out.println("Height: "+height);
    System.out.println("Weight: "+weight);
    System.out.println("PRN: "+PRN);

}
 }
 
 



public class Constructor {
    public static void main(String[] args) {
        Student m = new Student();
        m.display();
        
        Student c = new Student(m);
        c.display();
    }
}
