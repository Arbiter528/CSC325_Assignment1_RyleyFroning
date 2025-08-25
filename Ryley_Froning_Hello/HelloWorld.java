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
    public void greet(String message) { 
        System.out.println(message);
    }
    public static void main(String[] args) { 
        HelloWorld student = new HelloWorld("Jason"); 
        HelloWorld student2 = new HelloWorld("John"); 
        student2.greet();
        student.introduce("Jason", 20);
        student.greet(); 
        student2.greet("good morning");
        student2.introduce("John", 21);
    } 
}
