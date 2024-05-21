# Readme

## Erläuterung zum Programmierbeispiel:

Der Inhalt der Klasse HelloFX:

```java

public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFX Demo");

        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");


        Image dukeImage = new Image(HelloFX.class.getResourceAsStream("openduke.png"));
        ImageView imageView = new ImageView(dukeImage);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);


        VBox root = new VBox(30,imageView, label);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 600, 400);

        scene.getStylesheets().add(HelloFX.class.getResource("styles.css").toExternalForm());


        primaryStage.setScene(scene);
        primaryStage.show();

    } 


    public static void main(String[] args) {
        launch(args);
    }

}
```

Die Grundlage jeden Fensters ist `Stage`. Das Fenster wird mit der Methode `start()` aufgerufen und mit der Methode `show()`auf den Bildschirm gezeigt.

Die start-Methode erhält als Parameter ein Objekt vom Typ (der Klasse) Stage. Um auf diese Klasse zugreifen zu können, muss sie importiert werden:


```java
import javafx.stage.Stage;
```
Die gilt auch für die übrigen Klassen. Eine IDE fügt den Import meist automatisch ein.

Die eigene Klasse `HelloFX`erweitert die abstrakte Klasse `Application` um auf deren Methoden zuzugreifen. Die Methode `start()`stammt von dort, gekennzeichnet ist dies mit `@Override`:

```java
public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFX Demo");

        primaryStage.show();

    } 
```

In der Klasse `Stage` sind die Methoden `setTitle()`und `show()` implementiert. Sie werden mit dem Objekt aufgerufen.

Die nächst Ebene bildet die `Scene`, für die man eine Größe vorgeben kann. Sie nimmt wiederum andere Bereiche auf, z.B.:

- Group
- Region
- VBox

Eine "leere" Scene kann man nicht anlegen.


```java
Group root = new Group();
Scene scene = new Scene(root, 600, 400);
```

Die erste Zeile oben erstellt ein Objekt der Klasse Group, das in der nächsten Zeile auch gleich der neu erstellten Scene hinzugefügt wird.

Im Original-Beispiel wird VBox verwendet:

```java
VBox root = new VBox()
Scene scene = new Scene(root, 600, 400);
```


Anschließend wird die Scene zu Stage hinzugefügt:

```java
primaryStage.setScene(scene);
```

Alles zusammen ergibt nun ein leeres Fenster mit weißem Hintergrund und definierter Größe.

Innerhalb von Group, Region oder VBox finden weitere Elemnete Platz, im Beispiel ein Bild, das seinerseits aber in einen Image-View eingebettet ist.

```java
ImageView imageView = new ImageView();
```

```java
Image dukeImage = new Image()
```

Die Methode `getRecourceAsStream()`holt das Image "openduke.png" aus dem Verzeichnis `recources`.

```java
Image dukeImage = new Image(HelloFX.class.getResourceAsStream("openduke.png"));
```

Das Image wird an den Image-View als Argument übergeben:

```java
ImageView imageView = new ImageView(dukeImage);
```

Image-View und Image werden meist in einer Zeile zusammengefasst:

```java
ImageView imageView = new ImageView(new Image(HelloFX.class.getResourceAsStream("openduke.png")));
```

Und nun wird das Image mit dem umgebenden Image-View in die VBox eingefügt:

```java
VBox root = new VBox(imageView);
```

Die Hhe des Images auf 200 px begrenzen und das Seitenverhältnis beibehalten:

```java
imageView.setFitHeight(200);
imageView.setPreserveRatio(true);
```

Schließlich wird noch eine Beschriftung eingefügt:

```java
Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

```

In den Text werden die beiden Variablen `javafxVersion`und `javaversion`eingebettet. Diese haben das Ergebnis der Methoden `getProperty`gespeichert:

```java
String javaVersion = System.getProperty("java.version");
String javafxVersion = System.getProperty("javafx.version");
```

Das Label wird unter dem Bild plaziert, mit einem Abstand von 30 px:

```java
VBox root = new VBox(30,imageView, label);
```

Dann noch die VBox in die Fenstermitte rücken:

```java
root.setAlignment(Pos.CENTER);
```

und das Stylesheet - also die css-Datei aus dem Verzeichnis `resources` dazu holen, das geschieht in ähnlicher Weise, wie oben das Image:

```java
scene.getStylesheets().add(HelloFX.class.getResource("styles.css").toExternalForm());
```

## launch

Für den Aufruf all diesen Codes ist die statische `launch()`- Methode zuständig. Sie ist der Startpunkt aller FX-Anwendungen und wird selbst innerhalb der main-Mehtode aufgerufen.

```java
    public static void main(String[] args) {
        launch(args);
    }

```

Fertig!
