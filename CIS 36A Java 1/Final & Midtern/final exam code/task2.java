package javaapplication1;

class Time{
    int inputseconds;
    public Time(int s) {
        inputseconds = s;
    }
    public void convertMinutes(){
        int minutes = (inputseconds / 60) % 60;
        System.out.println("Called ConvertMinutes-\n"
                + "User inputed seconds: " + inputseconds + "\n"
                +  minutes + " minutes");
    }
    public void convertHMS(){
        int hours = inputseconds / 3600;
        int minutes = (inputseconds / 60) % 60;
        int seconds = inputseconds % 60;
        System.out.println("Called ConvertHMS-\n"
                + "User inputed seconds: " + inputseconds + "\n"
                + hours + " hours " 
                + minutes + " minutes " 
                + seconds + " seconds");
    }
}
public class task2 {

    public static void main(String[] args) {
        Time t = new Time(80000);
        t.convertMinutes();
        t.convertHMS();
    }
}
