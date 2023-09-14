package ch.juventus.object;

public class Application {

    public static void main(String[] args){

        Address address = new Address("Street", 1, 8050, "Zurich");
        Person person = new Person("Hans", "Peter", address, 99, false);

        System.out.println(person.toString());

    }
}
