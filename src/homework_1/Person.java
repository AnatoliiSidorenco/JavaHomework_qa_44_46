package homework_1;

public class Person {
   String fullName;
   int age;

   public Person() {
   }

   public Person(String fullName, int age) {
      this.fullName = fullName;
      this.age = age;
   }

   void  move (String text){
      System.out.println(text);
   }

   void talk (){
      System.out.println(fullName + " " + "говорит");
   }
}
