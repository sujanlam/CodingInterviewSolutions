package equalsNHashcode;

public class HashCodeEqualsMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(22,"Johns Cena", 30);
        Employee e2 = new Employee(22,"Johns Cena", 30);

        System.out.println("Shallow compare: "+(e1 == e2));
        System.out.println("   Deep compare: "+(e1.equals(e2)));
    }
}
