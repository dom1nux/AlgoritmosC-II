public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        // System.out.println();
        System.out.printf("El nombre es: %s\n", name);
        System.out.printf("La edad es: %d\n", age);
    }
}
