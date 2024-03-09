package week04;
public class Student{
    int id,rollno;
    String level,name,phoneno;

    public Student(int id,int rollno, String level,String name,String phoneno){
        this.id=id;
        this.rollno=rollno;
        this.level=level;
        this.name=name;
        this.phoneno=phoneno;
    }
    public void displayRecord(){
        System.out.println("ID="+id);
        System.out.println("ROLL NO="+rollno);
        System.out.println("Level="+level);
        System.out.println("Name="+name);
        System.out.println("Phone No="+phoneno);
        System.out.println("------------------");
    }
    
}
