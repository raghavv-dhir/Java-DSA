package Functions;

public class nameChangeExample {
    public static void main(String[] args) {
        String name = "Raghav";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name){
        name = "Manav"; //created new string, not affected "Raghav"
    }
}
