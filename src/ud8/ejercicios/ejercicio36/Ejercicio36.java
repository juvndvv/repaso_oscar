package ud8.ejercicios.ejercicio36;

/**
 * Ejercicio 36 - Jerarquia de Notificaciones
 *
 * Crea:
 *   - abstract class Notificacion con protected String destinatario,
 *     protected String mensaje, constructor y metodo abstracto void enviar().
 *   - NotificacionEmail extends Notificacion: enviar() imprime
 *     "Email a X: mensaje".
 *   - NotificacionSMS extends Notificacion: enviar() imprime
 *     "SMS a X: mensaje".
 *   - NotificacionPush extends Notificacion: enviar() imprime
 *     "Push a X: mensaje".
 *
 * En main crea un array Notificacion[] con una de cada tipo, recorre y envia.
 *
 * Ejemplo de salida:
 *   Email a ana@x.com: Hola
 *   SMS a 600000000: Hola
 *   Push a Ana: Hola
 */
public class Ejercicio36 {
    public static void main(String[] args) {

    }
}
