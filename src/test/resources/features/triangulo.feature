#language: es
Característica: El usuario pueda validar el tipo de triangulo.


  @triangulo
  Esquema del escenario: Validar la generación de triangulos
    Dado que el usuario visita la pagina
    Cuando el usuario ingresa los campos: "<usuario>", "<ladoA>", "<ladoB>", "<ladoC>"
    Y el usuario presiona Check
    Entonces el sistema muestra el triangulo "<tipoTriangulo>"

    Ejemplos:
      | usuario | ladoA | ladoB | ladoC | tipoTriangulo  |
      | Jona    | 3     | 3     | 3     | equilateral    |
      | Leo     | 3     | 3     | 5     | Isosceles      |
      | Joaquin | 3     | 4     | 5     | scalene        |
      | Jona    | 3     | 5     | 1.3     | Not a triangle |

