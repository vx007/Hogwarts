public class Slytherin extends Hogwarts {
    private int guile;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magic, int distanceOfTransgress, int guile, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, distanceOfTransgress);
        this.guile = guile;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getGuile() {
        return guile;
    }

    public void setGuile(int guile) {
        this.guile = guile;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String compareInFaculty(Slytherin student) {
        int c1, c2;
        c1 = this.guile + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        c2 = student.guile + student.determination + student.ambition + student.resourcefulness + student.lustForPower;
        if (c1 > c2)
            return String.format("%s is better than %s", this.getName(), student.getName());
        else if (c1 < c2)
            return String.format("%s is worse than %s", this.getName(), student.getName());
        else
            return String.format("%s equals %s", this.getName(), student.getName());
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d, %d, %d", super.toString(),
                guile, determination, ambition, resourcefulness, lustForPower);
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
