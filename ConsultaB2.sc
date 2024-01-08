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
//**¿Que es un framework reactivo? **
/**
//Un framework reactivo es una herramienta de programación que permite el
//desarrollo de aplicaciones basadas en flujos de datos asíncronos y la propagación del cambio. En lugar de
//trabajar con datos estáticos, los frameworks reactivos permiten trabajar con flujos de datos que cambian con el tiempo.
//[Esto significa que los desarrolladores pueden crear aplicaciones que respondan
//automáticamente a los cambios en los datos, mejorando la eficiencia y la escalabilidad de la aplicación
*/

// Cuales son sus desventajas y ventajas del patron Observer?
/**
*El patrón Observer es útil para resolver varios problemas de diseño.
 * Su gran ventaja es que el objeto observado (sujeto) y los objetos observadores interesados
 * en su estado pueden operar de manera independiente.
 * El sujeto no necesita saber nada sobre los observadores,
 * ya que la comunicación se realiza a través de la interfaz de los observadores, quienes reciben
 * actualizaciones automáticamente sin necesidad de solicitarlas constantemente.

No obstante, la actualización automática hacia todos los observadores puede tener desventajas,
ya que la información transmitida puede no ser relevante para algunos observadores.
Esto puede ser problemático cuando hay muchos observadores, ya que puede llevar mucho tiempo. Además,
el código del sujeto a menudo no revela qué observadores están siendo notificados.
*/