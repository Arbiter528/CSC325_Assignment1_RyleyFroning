public class HelloWorld{ 
    private String name; 
    private int age;
    
    public HelloWorld(String name, int age) {
         this.name = name; 
         this.age = age;
        } 
    
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    
    public void greet() { 
        System.out.println("Hello, " + name + "!"); 
    } 
    public void greet(String message) { 
        System.out.println(message);
    }
    public static void main(String[] args) { 
        HelloWorld student = new HelloWorld("Jason", 20); 
        HelloWorld student2 = new HelloWorld("John", 21); 
        student2.greet();
        student.introduce();
        student.greet(); 
        student2.greet("good morning");
        student2.introduce();
    } 
}
