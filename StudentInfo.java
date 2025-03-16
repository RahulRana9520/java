
public class StudentInfo {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java StudentInfo <Name> <UniversityRollNo> <Course> <Semester>");
            return;
        }

        String name = args[0];
        String universityRollNo = args[1];
        String course = args[2];
        String semester = args[3];

        System.out.println("Name: " + name);
        System.out.println("University Roll No: " + universityRollNo);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}
