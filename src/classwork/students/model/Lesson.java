package classwork.students.model;


public class Lesson {

    private String name;
    private String teacherName;
    private int duration;
    private double price;

    public Lesson(String name, String teacherName, int duration, double price) {
        this.name = name;
        this.teacherName = teacherName;
        this.duration = duration;
        this.price = price;
    }

    public Lesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
