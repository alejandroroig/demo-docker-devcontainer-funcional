# Demo Java: estilo imperativo y funcional

El proyecto no usa paquetes, Maven, Gradle, Spring ni librerías externas.
Requiere Java 17 o posterior porque la versión funcional utiliza
`Stream.toList()`.

## Estructura

```text
demo-java-funcional/
├── data/
│   └── alumnos.csv
└── src/
    ├── Alumno.java
    ├── MainFuncional.java
    └── MainImperativo.java
```

## Compilar

Ejecutar desde la carpeta `demo-java-funcional`:

```bash
mkdir -p out
javac -d out src/*.java
```

## Ejecutar la versión imperativa

```bash
java -cp out MainImperativo
```

## Ejecutar la versión funcional

```bash
java -cp out MainFuncional
```

Ambos programas aceptan opcionalmente otra ruta de CSV:

```bash
java -cp out MainFuncional data/alumnos.csv
```

Las dos versiones leen el CSV, filtran los alumnos aprobados y calculan la
misma media: `7.57` (`7,57` si la configuración regional usa coma decimal).
