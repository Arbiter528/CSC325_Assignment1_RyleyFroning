public class HelloWorld{ 
    String name; 
    private int age;
    
    public HelloWorld(String name) {
         this.name = name; 
        } 
    
    public void introduce(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    
    public void greet() { 
        System.out.println("Hello, " + name + "!"); 
    } 

    public static void main(String[] args) { 
        HelloWorld student = new HelloWorld("Jason"); 
        student.introduce("Jason", 20);
        student.greet(); 
    } 
}
