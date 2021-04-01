public class TestClass5026201071 {

    public static void main(String[] args){
        ComputeMethods5026201071 Number= new ComputeMethods5026201071();

        double Celcius = Number.fToC(42);
        System.out.println("Temp in celsius is = "+ Celcius+" C");

        double Hypotenuse = Number.hypotenuse(9, 12);
        System.out.println("Hypotenuse is " +Hypotenuse);

        int DiceSum= Number.roll();
        System.out.println("The sum of the dice values is  " + DiceSum);

    }
}