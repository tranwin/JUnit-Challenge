public class People {

    public static void main(String[] args) {
        Student a = new Student("Tran", 18, 1.6f);
        System.out.println("University (from class):" + Student.universityName);
        System.out.println("University(from instance):" + a.universityName);

        System.out.println("total from class):" + Student.total);
        Student b = new Student("Long", 24, 1.8f);
        Student c = new Student("Lan", 24, 1.8f);
        System.out.println("total (from instance:)" + c.total);


    }

}
