// ¿Que es la programacion reaciva?
/**
 * La Programación Funcional Reactiva (FRP) permite aplicar principios de la
 * programación funcional moderna en sistemas reactivos al modelar entradas y salidas como señales que varían en el tiempo.
 * La FRP simplifica la simulación de leyes físicas, como ecuaciones diferenciales, en sistemas grandes, como videojuegos.
 * La aproximación funcional facilita la paralelización y distribución del sistema, ya que los datos funcionales puros
 * evitan interferencias entre nodos de procesamiento de señales en una red FRP.
 * En resumen, la FRP, combinada con la programación funcional,ofrece beneficios en modularidad,
 * abstracción y facilidad para la paralelización en sistemas reactivos.
 */

//¿que es un manifiesto reactivo?
/**
// Los sistemas reactivos, tal como se describen en el Manifiesto Reactivoson sistemas
// que se diseñan utilizando principios reactivos para ser más resistentes, receptivos,
// elásticos y basados en mensajes.
*/

//¿Que es patron Observer?
/**
 * El Observer Pattern, también conocido como patrón de diseño Observer,
 * destaca como uno de los enfoques más ampliamente utilizados en el diseño de software.
 * Este patrón facilita la creación de una conexión uno a uno entre varios objetos,
 * permitiendo la transmisión eficiente y sencilla de todos los cambios ocurridos en un objeto concreto.
 * Para lograr esto, cualquier objeto puede inscribirse como observador en otro objeto designado como el observado.
 * El objeto inicial,también referido como sujeto, notifica a los observadores registrados cada vez que experimenta una modificación.
 */

// ¿Cuales son sus desventajas y ventajas del patron Observer?
/**
El patrón Observer es útil para resolver varios problemas de diseño.
Su gran ventaja es que el objeto observado (sujeto) y los objetos observadores interesados
en su estado pueden operar de manera independiente.
El sujeto no necesita saber nada sobre los observadores,
ya que la comunicación se realiza a través de la interfaz de los observadores, quienes reciben
actualizaciones automáticamente sin necesidad de solicitarlas constantemente.

No obstante, la actualización automática hacia todos los observadores puede tener desventajas,
ya que la información transmitida puede no ser relevante para algunos observadores.
Esto puede ser problemático cuando hay muchos observadores, ya que puede llevar mucho tiempo. Además,
el código del sujeto a menudo no revela qué observadores están siendo notificados.
*/
//**¿Que es un framework reactivo? **
/**
//Un framework reactivo es una herramienta de programación que permite el
//desarrollo de aplicaciones basadas en flujos de datos asíncronos y la propagación del cambio. En lugar de
//trabajar con datos estáticos, los frameworks reactivos permiten trabajar con flujos de datos que cambian con el tiempo.
//[Esto significa que los desarrolladores pueden crear aplicaciones que respondan
//automáticamente a los cambios en los datos, mejorando la eficiencia y la escalabilidad de la aplicación
 */
//¿Que son los operadores?
/**
 * permiten aplicar transformaciones sobre los flujos de datos.
 * Si bien no forman parte de la especificación Reactive Streams,
 * todas las librerías que la implementan los soportan de manera completamente compatible.
*/
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class Escalabilidad {

  // Contador de tareas
  var contadorTareas = 0

  // Ejemplo simple de escalabilidad
  def tareaEscalable(numero: Int): Future[Int] = Future {
    contadorTareas += 1
    val resultado = numero * 2
    println(s"Tarea $contadorTareas completada. Resultado: $resultado")
    resultado
  }

  // Crear una secuencia de 10 tareas escalables
  val tareasEscalables = (1 to 10).map(tareaEscalable)

  // Esperar a que todas las tareas se completen
  val resultadosFuturos: Future[Seq[Int]] = Future.sequence(tareasEscalables)

  // Manejar el resultado cuando todas las tareas se completen
  resultadosFuturos.onComplete {
    case Success(resultados) => println(s"Resultados finales: $resultados")
    case Failure(ex) => println(s"Error: $ex")
  }

}