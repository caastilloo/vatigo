package com.vatigo.scheduler;

import com.vatigo.service.CargaDatosService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Tareas programadas que lanzan las cargas de datos automáticamente.
 */
@Component
public class CargaPreciosScheduler {

    private final CargaDatosService cargaDatosService;

    public CargaPreciosScheduler(CargaDatosService cargaDatosService) {
        this.cargaDatosService = cargaDatosService;
    }

    /** Cada 30 minutos: precios de carburantes y comprobación de alertas. */
    @Scheduled(cron = "0 */30 * * * *")
    public void cargarCarburantes() {
        // TODO: cargaDatosService.cargarCarburantes();
    }

    /** Cada día a las 20:45: precios de la luz de mañana. */
    @Scheduled(cron = "0 45 20 * * *")
    public void cargarLuz() {
        // TODO: cargaDatosService.cargarLuz();
    }
}
