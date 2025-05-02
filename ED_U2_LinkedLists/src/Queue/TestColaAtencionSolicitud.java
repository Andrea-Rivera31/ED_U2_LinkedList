/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USUARIO
 */
public class TestColaAtencionSolicitud {
    public static void main(String[] args) {
        ColaAtencionSolicitud soporte = new ColaAtencionSolicitud();

        soporte.agregar_solicitud(new Solicitud("Cliente1", "normal"));
        soporte.agregar_solicitud(new Solicitud("Cliente2", "urgente"));
        soporte.agregar_solicitud(new Solicitud("Cliente3", "normal"));
        soporte.agregar_solicitud(new Solicitud("Cliente4", "urgente"));
        soporte.agregar_solicitud(new Solicitud("Cliente5", "urgente"));
        soporte.agregar_solicitud(new Solicitud("Cliente6", "normal"));

        System.out.println("\n--- Cola actual ---");
        soporte.mostrar_cola();

        System.out.println("\n--- Atendiendo solicitudes ---");
        for (int i = 1; i <= 3; i++) {
            Solicitud atendida = soporte.atender_siguiente();
            System.out.println("Atendida " + i + ": " + atendida);
        }

        System.out.println("\n--- Cola final ---");
        soporte.mostrar_cola();
    }
}    

