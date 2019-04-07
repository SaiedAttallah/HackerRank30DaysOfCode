package Day1to10;

/**
 * Created by SaiedAttallah on 4/17/2017.
 */
public class Person {
    private int age;

    public Person(int initialAge) {
        if(initialAge > 0){
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        String message;
        if (this.age < 13){
            message = "You are young.";
        } else if (this.age >= 13 && this.age < 18) {
            message = "You are a teenager.";
        } else {
            message = "You are old.";
        }
        System.out.println(message);
    }

    public void yearPasses() {
        this.age++;
    }
}
