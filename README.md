# MetodoEuleryRugueKutta
[# Metodo_Euler-y-RugueKutta

Actividad Unidad 6 – SCC-1017 Métodos Numéricos
Instituto Tecnológico Superior de Xalapa – Ingeniería en Sistemas Computacionales
Alumno: Uzziel David Castillo Gabriel. 

## Descripción

Implementación en Java del Método de Euler y del Método de Runge-Kutta de 4to orden (RK4). A partir de los códigos base proporcionados, se agregaron las fórmulas de cada método, una clase `Main` para ejecutar ambos programas y la variación del tamaño de paso h (0.1, 0.05 y 0.01). Cada programa compara los resultados con la solución exacta y calcula el error absoluto.

| Método | EDO | Solución exacta |
|--------|-----|-----------------|
| Euler | y' = x − y, y(0) = 1 | y(x) = x − 1 + 2e^(−x) |
| RK4 | y' = x + y, y(0) = 1 | y(x) = 2e^x − x − 1 |

Ambos se resuelven hasta x = 0.3.

## Archivos

- `MetodoEuler.java`: método de Euler
- `MetodoRungeKutta.java`: método RK4
- `Main.java`: ejecuta ambos métodos

## Requisitos

- Java JDK 8 o superior

## Clonar el repositorio

```
git clone https://github.com/UzzielD-crypto/Metodo_Euler-y-RugueKutta/blob/main/README.md
```

## Compilar

```
javac Main.java MetodoEuler.java MetodoRungeKutta.java
```

## Ejecutar

java Main
```

También se puede ejecutar cada método por separado:

```
java MetodoEuler
java MetodoRungeKutta
```

## Salida

El programa imprime una tabla con n, xₙ, yₙ aproximado, y exacta y error absoluto para cada paso.
