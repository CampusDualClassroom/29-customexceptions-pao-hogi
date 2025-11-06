package com.campusdual.classroom;

public class Exercise {

    public static int divisionWithCustomException(int dividend, int divisor){
        if (divisor == 0){
            throw new DivisionByZeroException("No se puede dividir entre cero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int resultado = divisionWithCustomException(10, 0);
            System.out.println("Resultado: " + resultado);
        }catch (DivisionByZeroException e){
            System.out.println("Error controlado: " +  e.getMessage());
        }finally {
            System.out.println("Ejecución finalizada correctamente.");
        }
    }
}
