package jeneric_homework;

public class Homework_Main {
    public static void main(String[] args) {
       Student std1=new Student("Ivan",38);
       Student std2=new Student("Lev",35);
        String text="AbraCadabra";
        Boolean booll=false;
        Pair val=new Pair<>(15,"mr_cold");
        System.out.println(val.getFirst()+"\n"+val.getSecond());
        Pair test_1=new Pair(booll,text);
        System.out.println(test_1.getFirst()+"\n"+test_1.getSecond());
        Pair test_2=new Pair<>(std1,std2);
        System.out.println(test_2.getFirst()+"\n"+test_2.getSecond());
    }
}
