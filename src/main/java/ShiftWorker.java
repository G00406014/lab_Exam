public class ShiftWorker {
    private String name;
    private double age;
    private String gender;
    private String shift;

    public ShiftWorker() {
    }

    public ShiftWorker(String name, double age, String gender, String shift) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}




