public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int distanceOfTransgress, int smart, int wisdom, int wit, int creativity) {
        super(name, magic, distanceOfTransgress);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String compareInFaculty(Ravenclaw student){
        int c1, c2;
        c1 = this.smart + this.wisdom + this.wit + this.creativity;
        c2 = student.smart + student.wisdom + student.wit + student.creativity;
        if (c1 > c2)
            return String.format("%s is better than %s", this.getName(), student.getName());
        else if (c1< c2)
            return String.format("%s is worse than %s", this.getName(), student.getName());
        else
            return String.format("%s equals %s", this.getName(), student.getName());
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d, %d", super.toString(),
                smart, wisdom, wit, creativity);
    }

    @Override
    public void print(){
        System.out.println(this.toString());
    }
}
