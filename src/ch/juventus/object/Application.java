package ch.juventus.object;

public class Application {

    public static void main(String[] args){

        Address address1 = new Address("Street", 1, 8050, "Zurich");
        Person person1 = new Person("Hans", "Peter", address1, 99, false);

        Address address2 = new Address("Street", 1, 8050, "Zurich");
        Person person2 = new Person("Hans", "Peter", address1, 99, false);

        System.out.println("Compare result: " + person1.equals(person2));

    }
}
