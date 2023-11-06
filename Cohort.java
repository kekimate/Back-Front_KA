class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this("Jane Doe", 30, "female");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment.");
    }
}

class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this("Jane Doe", 30, "female", "The School of Life");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization +
                " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}

class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        this("Jane Doe", 30, "female", "intermediate");
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }
}

class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        this("Jane Doe", 30, "female", "Google");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company +
                " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}

class Cohort {
    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}

public class Campus {
    public static void main(String[] args) {
        Cohort awesomeCohort = new Cohort("AWESOME");
        Student student1 = new Student("Mark", 46, "male", "BME");
        Student student2 = new Student("Jane Doe", 30, "female", "The School of Life");
        Mentor mentor1 = new Mentor("John Doe", 20, "male", "junior");
        Mentor mentor2 = new Mentor("Jane Doe", 30, "female", "senior");
        Sponsor sponsor1 = new Sponsor("Gandhi", 148, "male", "none");
        Sponsor sponsor2 = new Sponsor("Jane Doe", 30, "female", "Google");

        student1.skipDays(0);
        student2.skipDays(3);
        mentor1.introduce();
        mentor2.introduce();
        sponsor1.introduce();
        sponsor2.introduce();

        awesomeCohort.addStudent(student1);
        awesomeCohort.addStudent(student2);
        awesomeCohort.addMentor(mentor1);
        awesomeCohort.addMentor(mentor2);

        awesomeCohort.info();
    }
}
