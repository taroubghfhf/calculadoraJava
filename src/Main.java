public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int resultado=suma(1,2);
        System.out.println("este es el resultado:"+resultado);

        int resultadoResta=resta(9,8);
        System.out.println("este es el resultado:"+resultadoResta);

    }
  
    public static int suma(int numero1,int numero2){
        int total = numero1 + numero2;
        return total;
    }

    public static int resta(int numero1,int numero2){
        int totalResta= numero1 - numero2;
        return totalResta;
    }

    public static int multiplicacion(int numero1,int numero2){
        return 0;
    }

    public static double division(int numero1,int numero2){
        return 0;
    }
}