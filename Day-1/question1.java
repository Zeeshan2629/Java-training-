class question1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 123;
        s.name = "Zeeshan";
        s.marks = 1100;
        
        char grade = s.grade();  
        System.out.println("GRADE IS : " + grade);
    }
}

class Student {
    int id;
    String name;
    int marks;

    
    public char grade() {
        if (marks >= 1100) {
            return 'A';
        } else if (marks >= 800){
            return 'B';
        } else if (marks >= 600) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
