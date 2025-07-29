class Student
{
    int rollno;
    String name;
    int marks;
}

class demo
{
    public static void main(String args[])
    {
        Student s1= new Student();
        s1.rollno=11;
        s1.name= "Kenisha";
        s1.marks = 95;

        Student s2= new Student();
        s2.rollno=12;
        s2.name= "Iva";
        s2.marks = 70;

        Student s3= new Student();
        s3.rollno=13;
        s3.name= "Evara";
        s3.marks = 91;

        Student students[] = new Student[3];
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;

        for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i].rollno + ":" + students[i].name);
        }
    }
}
