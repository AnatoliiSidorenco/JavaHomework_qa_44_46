package homework_1;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Jack", 35);

        System.out.println("------------ Task 1 --------------");

        person1.move("Bob ходит");
        person2.talk();

        System.out.println("------------ Task 2 --------------");

        Phone phone1 = new Phone(4915171189259L,"Xiaomi",100);
        Phone phone2 = new Phone(4915171189256L, "Samsung", 110);
        Phone phone3 = new Phone(4915171189253L,"Iphone",95);

        System.out.println(phone1.getNumber() + " " + phone1.model + " " + phone1.weight + " (gr)");
        System.out.println(phone2.getNumber() + " " + phone2.model + " " + phone2.weight + " (gr)");
        System.out.println(phone3.getNumber() + " " + phone3.model + " " + phone3.weight + " (gr)");

        System.out.println("---------------------");
        phone1.receiveCall("Nike");
        System.out.println(phone1.getNumber());

        System.out.println("---------------------");
        phone1.receiveCall("Dan");
        System.out.println(phone2.getNumber());

        System.out.println("---------------------");
        phone1.receiveCall("Andrew");
        System.out.println(phone3.getNumber());

        System.out.println("---------------------");
        System.out.println("Changed name Nike into Tolik");
        phone1.setName("Tolik");
        System.out.println(phone1.getName());

    }
}
