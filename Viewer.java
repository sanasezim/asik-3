public class Viewer {
    private String name;
    private int age;

    public Viewer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Viewer: " + name + ", age: " + age);
    }
}
