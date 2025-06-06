public class ConsChaning {
    String name;
    int age;
    String course;

    // Constructor 1
    public ConsChaning() {
        this("Default Name");
        System.out.println("No-argument constructor called");
    }

    // Constructor 2
    public ConsChaning(String name) {
        this(name, 18);
        System.out.println("Constructor with 1 argument called");
    }

    // Constructor 3
    public ConsChaning(String name, int age) {
        this(name, age, "Computer Science");
        System.out.println("Constructor with 2 arguments called");
    }

    // Constructor 4
    public ConsChaning(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Constructor with 3 arguments called");
    }

    void display() {
        System.out.println(name + ", " + age + ", " + course);
    }

    public static void main(String[] args) {
        ConsChaning s1 = new ConsChaning();
        s1.display();
    }
}
