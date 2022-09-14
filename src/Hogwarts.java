public abstract class Hogwarts {
    private String name;
    private int magic;
    private int distanceOfTransgress;

    public Hogwarts(String name, int magic, int distanceOfTransgress) {
        this.name = name;
        this.magic = magic;
        this.distanceOfTransgress = distanceOfTransgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDistanceOfTransgress() {
        return distanceOfTransgress;
    }

    public void setDistanceOfTransgress(int distanceOfTransgress) {
        this.distanceOfTransgress = distanceOfTransgress;
    }

    public String compare(Hogwarts student){
        int c1, c2;
        c1 = this.magic + this.distanceOfTransgress;
        c2 = student.magic + student.distanceOfTransgress;
        if (c1 > c2)
            return String.format("%s is better than %s", this.getName(), student.getName());
        else if (c1 < c2)
            return String.format("%s is worse than %s", this.getName(), student.getName());
        else
            return String.format("%s equals %s", this.getName(), student.getName());
    }

    public abstract void print();

    @Override
    public String toString() {
        return String.format("Name: %s, magic: %d, dOT: %d", name, magic, distanceOfTransgress);
    }

}
