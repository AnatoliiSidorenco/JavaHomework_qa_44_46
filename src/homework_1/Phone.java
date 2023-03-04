//2.Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов.

package homework_1;

public class Phone {
   private long number;
    String model;
    int weight;
  private String name;

    public Phone(String name) {
        this.name = name;
    }

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

   public void receiveCall(String name) {
        System.out.println("Звонит --- " + name);
    }

    public long getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
