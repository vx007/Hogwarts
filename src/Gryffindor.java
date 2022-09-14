public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magic, int distanceOfTransgress, int nobility, int honor, int courage) {
        super(name, magic, distanceOfTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public String compareInFaculty(Gryffindor student) {
        int c1, c2;
        c1 = this.nobility + this.honor + this.courage;
        c2 = student.nobility + student.honor + student.courage;
        if (c1 > c2)
            return String.format("%s is better than %s", this.getName(), student.getName());
        else if (c1 < c2)
            return String.format("%s is worse than %s", this.getName(), student.getName());
        else
            return String.format("%s equals %s", this.getName(), student.getName());
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d", super.toString(), nobility, honor, courage);
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
