
package TableView;


public class Student {
    private String Name;
    private String Surname;
    private int mark;

    public Student() {
    }

    public Student(String Name, String Surname, int mark) {
        this.Name = Name;
        this.Surname = Surname;
        this.mark = mark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
}
