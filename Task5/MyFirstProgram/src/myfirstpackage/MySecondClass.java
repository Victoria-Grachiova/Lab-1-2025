package myfirstpackage;
public class MySecondClass {
    private int Num1;
    private int Num2;

    public MySecondClass(int Num1, int Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public int getNum1() {   //Геттер для первого поля
        return Num1;
    }

    public int getNum2() {   //Геттер для второго поля
        return Num2;
    }

    public void setNum1(int Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }

    public int biggestNum() {
        if (Num1 > Num2)
            return Num1;
        else if (Num1 < Num2)
            return Num2;
        else
            return 1;
    }
}