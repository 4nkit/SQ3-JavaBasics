package ClassesObjects;

public class StudentsMain {
    public static void main(String[] args) {
        //Instantiate against the newly created Students class
        Students mystudents = new Students();

        //Students = class name
        // new = implies new object to be created
        //Students() =  a call to the Students constructor

        //I want to reach out to the fields and methods inside the Students class
        // through the mystudents object

        System.out.println(mystudents.studentsArray[4]);

    }
}