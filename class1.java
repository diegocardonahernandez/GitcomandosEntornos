package tareaGitcomandos;

public class class1 {

    int num1;
    int num2;

    int nuevaVariable;

    String modificacion6;

    String modi1Ramamaster;
    String modi2Ramamaster;
    String modi3Ramamaster;

    int num3;
    int num4;
    int num5;
    int num6;
    int num7;

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        class1 calculator = new class1();

        int resultadoSuma = calculator.sumar(5, 3);
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = calculator.restar(10, 4);
        System.out.println("La resta es: " + resultadoResta);

        int resultadoMultiplicacion = calculator.multiplicar(6, 7);
        System.out.println("La multiplicación es: " + resultadoMultiplicacion);

        double resultadoDivision = calculator.dividir(15, 3);
        System.out.println("La división es: " + resultadoDivision);
    }
}
