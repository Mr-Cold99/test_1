package Class;

public class Student {
    private int age;
    private String name;
    private String surname;

   public Student(){

    }
    /*
    public Student(String name,int age){
        this.name=name;
        this.age=age;

    }*/
    public Student(String name, int age,String surname){
        this.name=name;
        this.age=age;
        this.surname=surname;
    }
    public String getName(){ return name;}
    public void setName(String name){
        if(name.length()>15){
            this.name=name.substring(0,14);
        }
        this.name=name;}

    public String getSurname(){ return surname;}
    public void setSurname(String surname) {
        if (surname.length()>15) {
            this.surname = surname.substring(0,14);
        } else {
            this.surname = surname;
        }
    }

    public int  getAge(){ return age;}

    public void setAge(int age){
        if(age>60){
            this.age=60;

        }
        this.age=age;}




}
