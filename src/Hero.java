public class Hero extends Person{
    String power;

    @Override
    public String toString() {
        return super.toString()+this.power;
    }

    Hero(String name, int age, String power){
        super(name,age);
//        this.name = name;
//        this.age = age;
        this.power = power;

    }
}
