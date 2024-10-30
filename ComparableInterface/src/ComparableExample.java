public class ComparableExample {

    public static void main(String[] args){
        Person p1 = new Person("Emma", 20);
        Person p2 = new Person("Smith", 21);
        System.out.println(p1.compareTo(p2));
    }

}

class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String n, int a){
        name = n;
        age = a;
    }

    public int compareTo(Person otherPerson){
        return this.age - otherPerson.age;
    }
}
