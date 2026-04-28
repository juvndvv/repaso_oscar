# UD4 — Matrices

## Que es una matriz

Una **matriz** (o array bidimensional) es una estructura de datos que organiza elementos en filas y columnas, formando una cuadricula. Se puede pensar en ella como un array de arrays.

En Java se declara asi:

```java
int[][] matriz = new int[3][4]; // 3 filas, 4 columnas
```

O inicializandola directamente con valores:

```java
int[][] matriz = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

## Acceder a los elementos

Cada elemento se identifica por su indice de fila y de columna, ambos empezando en 0:

```
         col 0  col 1  col 2  col 3
fila 0 [  1      2      3      4  ]
fila 1 [  5      6      7      8  ]
fila 2 [  9     10     11     12  ]
```

```java
matriz[0][0] // → 1
matriz[1][2] // → 7
matriz[2][3] // → 12
```

## Recorrer una matriz

Se usan dos bucles `for` anidados: el externo recorre filas y el interno recorre columnas.

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

- `matriz.length` → numero de filas
- `matriz[i].length` → numero de columnas de la fila `i`

## Conceptos clave

| Concepto | Descripcion |
|---|---|
| **Diagonal principal** | Elementos donde `fila == columna` |
| **Diagonal secundaria** | Elementos donde `fila + columna == N - 1` |
| **Matriz cuadrada** | Mismo numero de filas que de columnas |
| **Transpuesta** | Se intercambian filas por columnas: `T[j][i] = M[i][j]` |
| **Matriz identidad** | Cuadrada con 1 en la diagonal y 0 en el resto |
| **Matriz simetrica** | Igual a su transpuesta: `M[i][j] == M[j][i]` |

## Ejercicios

| Ejercicio | Tema | Solucion |
|---|---|---|
| 01 | Declarar, inicializar y mostrar una matriz | Si |
| 02 | Rellenar una matriz desde teclado | Si |
| 03 | Suma de todos los elementos | Si |
| 04 | Maximo y minimo con posicion | Si |
| 05 | Diagonal principal y su suma | Si |
| 06 | Transponer una matriz | Si |
| 07 | Suma de dos matrices | Si |
| 08 | Multiplicar por un escalar | Si |
| 09 | Comprobar si es simetrica | Si |
| 10 | Multiplicacion de dos matrices | Si |
| 11 | Recorrer al reves | No |
| 12 | Contar pares e impares | No |
| 13 | Suma de cada fila | No |
| 14 | Suma de cada columna | No |
| 15 | Fila con mayor suma | No |
| 16 | Triangulo superior | No |
| 17 | Triangulo inferior | No |
| 18 | Comprobar si es la identidad | No |
| 19 | Rotar 90 grados | No |
| 20 | Comparar dos matrices | No |
| 21 | Media de cada fila | No |
| 22 | Ordenar cada fila | No |
| 23 | Contar elementos segun umbral | No |
| 24 | Tabla de multiplicar como matriz | No |
| 25 | Suma del borde exterior | No |
| 26 | Reemplazar negativos por cero | No |
| 27 | Diagonal secundaria | No |
| 28 | Cuadrado magico | No |
| 29 | Buscar un valor en la matriz | No |
| 30 | Registro de notas por alumno y asignatura | No |
