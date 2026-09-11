# Sistema-de-plan-de-estudios
El ejercicio en cuestión, se nos proponía diseñar e implementar (Por consola) contabilizar materias aprobadas de un determinado plan de estudios. Cada materia, tenía un código, un nombre y una cantidad de créditos, y puede ser obligatorio u optativa.
Una carrera está compuesta por un listado de materias (que pueden ser obligatorias u optativas), y una cantidad mínima de créditos. Para terminar la carrera hay que aprobar todas las materias obligatorias y además cumplir la cantidad de créditos.
El sistema ofrece sus servicios a múltiples usuarios. Cada usuario puede cursar cero, una o más carreras. El sistema debe permitir al usuario inscribirse a una carrera, marcar materias como aprobadas y consultar el estado de cada una de sus carreras.

## Pendiente (a pulir antes de considerarlo terminado)

- [ ] Agregar `private` a `vector_carreras_inscriptas` y `vector_materias_aprobadas` 
      en Alumno.java (quedaron sin modificador de acceso)
- [ ] Sacar el `System.out.println` de `getEstadoCarrera()` — un método que 
      devuelve un String no debería imprimir nada por su cuenta
- [ ] Arreglar la lógica de `getEstadoCarrera()`: el parámetro `info` (Carrera) 
      no se usa — hay que filtrar los créditos solo por las materias de 
      ESA carrera, no sumar todas las materias aprobadas del alumno
- [ ] Renombrar `setcréditos()` → `setCreditos()` en Materia.java 
      (inconsistencia de nombres, tilde + minúscula rompe la convención camelCase)
- [ ] Sacar el `System.out.println("Hola")` suelto al final del main.java

## Una vez resuelto esto
- [ ] Escribir README con estructura: objetivo, diseño de clases (Alumno-Carrera-Materia), 
      cómo correrlo
- [ ] Pinear el repo si queda a la altura del resto de la vidriera
