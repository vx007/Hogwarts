public class Hufflepuff extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int distanceOfTransgress, int hardWork, int loyalty, int honesty) {
        super(name, magic, distanceOfTransgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String compareInFaculty(Hufflepuff student){
        int c1, c2;
        c1 = this.hardWork + this.loyalty + this.honesty;
        c2 = student.hardWork + student.loyalty + student.honesty;
        if (c1 > c2)
            return String.format("%s is better than %s", this.getName(), student.getName());
        else if (c1< c2)
            return String.format("%s is worse than %s", this.getName(), student.getName());
        else
            return String.format("%s equals %s", this.getName(), student.getName());
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d", super.toString(), hardWork, loyalty, honesty);
    }

    @Override
    public void print(){
        System.out.println(this.toString());
    }
}
