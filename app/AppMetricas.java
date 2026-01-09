package org.app.pooexcepciones.ejemplo.app;

public class AppMetricas {

    public static void main(String[] args) {

        System.out.println("=== Sistema de Métricas ===");

        try {
            // Simulación de datos
            String visitasStr = "100";
            String conversionesStr = "25";

            int visitas = Integer.parseInt(visitasStr);
            int conversiones = Integer.parseInt(conversionesStr);

            if (visitas == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }

            double tasaConversion = (double) conversiones / visitas;
            System.out.println("Tasa de conversión calculada: " + tasaConversion);

        } catch (NumberFormatException e) {
            System.out.println("Se detectó una excepción: por favor digite un valor numérico.");
            System.out.println("Detalle técnico: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Error en el cálculo: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado.");

        } finally {
            System.out.println("Fin del proceso (bloque finally ejecutado).");
        }

        System.out.println("El programa continúa normalmente.");
    }
}
