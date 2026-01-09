package org.app.pooexcepciones.ejemplo.service;

import org.app.pooexcepciones.ejemplo.exception.CalculationException;
import org.app.pooexcepciones.ejemplo.exception.InvalidMetricException;
import org.app.pooexcepciones.ejemplo.model.MetricResult;

public class MetricAnalyzer {

    public MetricResult calcularTasa(String nombreMetrica,
                                     String numeradorStr,
                                     String denominadorStr)
            throws InvalidMetricException {

        int numerador;
        int denominador;

        try {
            numerador = Integer.parseInt(numeradorStr);
            denominador = Integer.parseInt(denominadorStr);
        } catch (NumberFormatException e) {
            throw new InvalidMetricException(
                    "Se detectó una excepción: por favor digite un valor numérico.",
                    e
            );
        }

        if (denominador == 0) {
            throw new CalculationException(
                    "No se puede calcular la métrica porque el denominador es cero."
            );
        }

        double resultado = (double) numerador / denominador;
        return new MetricResult(nombreMetrica, resultado);
    }
}
