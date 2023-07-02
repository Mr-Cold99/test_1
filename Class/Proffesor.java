package Class;

public class Proffesor {
    private String nun;
    private String cognonen;
    private int centuru;
    Student std=new Student("Lev",35,"Stepsnovych");
    public Proffesor(){

    }

    public Proffesor(String nun,String cognonen,int centuru){
        this.nun=nun;
        this.cognonen=cognonen;
        this.centuru=centuru;

    }
    public String getNun(){return nun; }
    public void setNun(String nun){
        if(nun.length()>15){this.nun=nun.substring(0,14);}
        this.nun=nun;}
    public String getCognonen(){return cognonen;}
    public void setCognonen(String cognonen){
        if(cognonen.length()>15){this.cognonen=cognonen.substring(0,14);}
        else{this.cognonen=cognonen;}
    }
    public  int getCenturu(){return centuru;}
    public void setCenturu(int centuru){
        if(centuru>80){this.centuru=80;}
        else {this.centuru=centuru;}
    }

}
