import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Person {
    char fullName;
    int age;

    public void move(){
        System.out.println("He move");
    }
    public void talk(){
        System.out.println("He talk");
    }
 public Person(){

 }
 public Person(int age, char fullName){
        this.age=age;
        this.fullName=fullName;
 }


    public static void main(String[] args) {
       Person human1 = new Person();
 //      Person human2 = new Person(20,"Laboda");
    }
}
