package Stream;

public class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name,char sex,int age,int course,double avgGrade){
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student with name "+ getName()+ " his/her sex is "+ getSex()+" age = "+ getAge()+
                " on the " + getCourse()+" course and avg = "+ getAvgGrade();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
