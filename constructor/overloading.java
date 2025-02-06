public class overloading {
    int id;
    String name;
    int age;

    overloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    overloading(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + name + age);
    }

    public static void main(String[] args) {
        System.out.println("constructor overloading ...");
        overloading o = new overloading(10, "mashood");
        overloading o1 = new overloading(20, "kiran", 30);

        o.display();
        o1.display();

    }
}
