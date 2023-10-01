public class User {

    // Fields (attributes)

    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void sayHello() {
        System.out.println("- Hello, my name is " + name);
    }


    
}
