public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n; 
    }

    public Person(int i, String n){
        id = i;
    }
    public String getName(){
        return name;
    }
}
