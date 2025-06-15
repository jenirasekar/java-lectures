public class Student {
    private int id;
    private String name;
    private double chinese;
    private double english;
    private double math;

    public Student() {
    }

    public Student(int id, String name, double chinese, double english, double math) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public void displayInfo() {
        System.out.println("Id: " + id + ", Name: " + name + ", Chinese: " + chinese
        + ", English: " + english + ", Math: " + math);
    }

    public double totalScore() {
        return chinese + english + math;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
