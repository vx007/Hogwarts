import java.util.Random;

public class Main {
    private static final java.util.Random random = new Random();

    public static void main(String[] args) {
        Gryffindor[] gryffindors = new Gryffindor[]{
                new Gryffindor("Harry Potter", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Hermione Granger", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Ron Weasley", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
        };
        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Zacharias Smith", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Hufflepuff("Cedric Diggory", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Hufflepuff("Justin Finch-Fletchley", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
        };
        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Zhou Chang", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Ravenclaw("Padma Patil", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Ravenclaw("Marcus Belby", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
        };
        Slytherin[] slytherins = new Slytherin[]{
                new Slytherin("Draco Malfoy", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Graham Montague", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Gregory Goyle", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
        };

        for (Gryffindor student : gryffindors) {
            student.print();
        }

        for (Hufflepuff student : hufflepuffs) {
            student.print();
        }

        for (Ravenclaw student: ravenclaws){
            student.print();
        }

        for (Slytherin student: slytherins){
            student.print();
        }

        System.out.println(gryffindors[1].compareInFaculty(gryffindors[2]));
        System.out.println(gryffindors[0].compare(slytherins[0]));
    }
}
