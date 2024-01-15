import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}


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

