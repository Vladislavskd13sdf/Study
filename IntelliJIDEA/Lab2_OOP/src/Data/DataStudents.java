package Data;

import java.lang.String;
import java.util.Objects;

public class DataStudents {
    private String id;
    private String Surname;
    private String Name;
    private String Patronymic;
    private String Date;
    private String Address;
    private String NunberOfPhone;
    private String Departament;
    private String Course;
    private String Groupe;

    public DataStudents(
            String id,
            String Surname,
            String Name,
            String Patronymic,
            String Date,
            String Address,
            String NunberOfPhone,
            String Departament,
            String Course,
            String Groupe
    ) {
        this.id = id;
        this.Surname = Surname;
        this.Name = Name;
        this.Patronymic = Patronymic;
        this.Date = Date;
        this.Address = Address;
        this.NunberOfPhone = NunberOfPhone;
        this.Departament = Departament;
        this.Course = Course;
        this.Groupe = Groupe;
    }

    //получить параметр
    public String getid(){return id;}
    public String getSurname(){return Surname;}
    public String getName(){return Name;}
    public String getPatronymic(){return Patronymic;}
    public String getDate(){return Date;}
    public String getAddress(){return Address;}
    public String getNunberOfPhone(){return NunberOfPhone;}
    public String getDepartament(){return Departament;}
    public String getCourse(){return Course;}
    public String getGroupe(){return Groupe;}

    //задать параметр
    public void setid(String id){this.id = id;}
    public void setSurname(String Surname){this.Surname = Surname;}
    public void setName(String Name){this.Name = Name;}
    public void setPatronymic(String Lastname){this.Patronymic = Lastname;}
    public void setDate(String Date){this.Date = Date;}
    public void setAddress(String Address){this.Address = Address;}
    public void setNunberOfPhone(String NunberOfPhone){this.NunberOfPhone = NunberOfPhone;}
    public void setDepartament(String Departament){this.Departament = Departament;}
    public void setCourse(String Course){this.Course = Course;}
    public void setGroupe(String Groupe){this.Groupe = Groupe;}

    @Override//переопределяем метод toString
    public String toString() {
        return "DataStudents{" +
                "id='" + id + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", Lastname='" + Patronymic + '\'' +
                ", Date='" + Date + '\'' +
                ", Address='" + Address + '\'' +
                ", NunberOfPhone='" + NunberOfPhone + '\'' +
                ", Departament='" + Departament + '\'' +
                ", Course='" + Course + '\'' +
                ", Groupe='" + Groupe + '\'' +
                '}';
    }

    @Override//переопределяем метод equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataStudents that = (DataStudents) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(Surname, that.Surname) &&
                Objects.equals(Name, that.Name) &&
                Objects.equals(Patronymic, that.Patronymic) &&
                Objects.equals(Date, that.Date) &&
                Objects.equals(Address, that.Address) &&
                Objects.equals(NunberOfPhone, that.NunberOfPhone) &&
                Objects.equals(Departament, that.Departament) &&
                Objects.equals(Course, that.Course) &&
                Objects.equals(Groupe, that.Groupe);
    }

    @Override//переопределяем метод hashCode
    public int hashCode() {
        return Objects.hash(id, Surname, Name, Patronymic, Date, Address, NunberOfPhone, Departament, Course, Groupe);
    }

    //write toString for access to datas
}
