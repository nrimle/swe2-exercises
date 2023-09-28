package ch.juventus.collections;

import ch.juventus.object.Address;
import ch.juventus.object.Person;

import java.util.*;

public class CollectionsExercise {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
    }

    static void arrayList() {
        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> animals = new ArrayList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Maus");
        animals.add("Vogel");
        animals.add("Huhn");

//        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
//        System.out.println(animals.size());
//        // TODO: Füge ein weiteres Element mit Index 2 hinzu.
//        animals.add(2, "Pferd");
//        // TODO: Gib die ganze Liste auf der Konsole aus.
//        System.out.println(animals);
//        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
//        System.out.println(animals.contains("Vogel"));
//        // TODO: Ein Element lesen via Index.
//        System.out.println(animals.get(1));
//        // TODO: Ein Element löschen via Index
//        animals.remove(1);
//        // TODO: Ein Element löschen via String
//        animals.remove("Vogel");
//        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
//        //animals.remove(10);
//        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
//        animals.remove("ASDF");
//        // TODO: Alle Elemente aus der Liste löschen
//        animals.clear();

        for (String animal : animals) {
            System.out.println("Hello: " + animal);
        }
    }

    static void linkedList() {
        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> linkedList = new LinkedList<>();

        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        // TODO: Den Index eines bestimmten Elements finden
        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        // TODO: Ein Element via Index lesen
        // TODO: Das erste und letzte Element der Liste ausgeben
        // TODO: Das erste und letzte Element der Liste löschen
    }

    static void hashSet() {
        // TODO: Erstelle ein HashSet von Personen (object package)
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        // TODO: Lösche ein bestimmtes Element aus dem Set
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void linkedHashSet() {
        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void treeSet() {
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void hashMap() {
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        //  (Wieviele Einträge sind jetzt in der Map?)
        // TODO: Gib das entrySet auf der Konsole aus
        // TODO: Gib das keySet auf der Konsole aus
        // TODO: Gib die values auf der Konsole aus
    }

    static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        Map<Integer, Person> people = new LinkedHashMap<>(10, 0.75f, false);
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        Address address1 = new Address("Street", 1, 8050, "Zurich");
        people.put(1, new Person("First", "Person", address1, 50, false));
        people.put(2, new Person("Second", "Person", address1, 50, false));
        people.put(3, new Person("Third", "Person", address1, 50, false));
        people.put(1, new Person("FirstV2", "Person", address1, 50, false));
        people.put(4, new Person("Forth", "Person", address1, 50, false));
        // TODO: Gib die gesamte Map auf der Konsole aus
//        System.out.println(people);
//        // TODO: Greife auf mehrere Elemente zu
//        System.out.println(people.get(1));
//        System.out.println(people.get(2));
//        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
//        System.out.println(people);

        people.forEach((integer, person) -> System.out.println("Index=" + integer + ", FirstName=" + person.getFirstName()));
    }

    static void treeMap() {
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
    }



}