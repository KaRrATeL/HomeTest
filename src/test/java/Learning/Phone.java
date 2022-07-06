package Learning;

public class Phone {
    String model;
    int number;
    double weight;
public void receiveCall(){
    System.out.println("Calling Sergey");
}
public Phone(String model,int number,double weight){
    this.model=model;
    this.number=number;
    this.weight=weight;
}
public Phone(int number, String model){
    this.number=number;
    this.model=model;
}
public Phone(){}

    public static void main(String[] args){
    Phone phone1 = new Phone();
    Phone phone2 = new Phone();
    Phone phone3 = new Phone();
    phone1.model= "Samsung";
    phone1.number=0612354;
    phone1.weight=15.5;
    phone1.receiveCall();
        System.out.println("Name phone its "+phone1.model);
        System.out.println("Ur number "+phone1.number);
        System.out.println("Weight "+phone1.weight);
    phone2.model= "Nokia";
    phone2.number=17855434;
    phone2.weight=8.5;
    phone2.receiveCall();
        System.out.println("Name phone its "+phone2.model);
        System.out.println("Ur number "+phone2.number);
        System.out.println("Weight "+phone2.weight);
    phone3.model="Huawei";
    phone3.number=06170054;
    phone3.weight=8.6;
    phone3.receiveCall();
        System.out.println("Name phone its "+phone3.model);
        System.out.println("Ur number "+phone3.number);
        System.out.println("Weight "+phone3.weight);

    }
}
