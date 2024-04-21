# Das Beispiel erklärt

Wir haben den Programmcode auf zwei Dateien aufgeteilt: App.java enthält die main-Methode, bindet den übgrigen Programmcode ein und startet das Programm. Die Datei MainWindow.java enthält die Anweisungen zum Erstellen eines grafischen Fensters. 

## MainWindow.java

Für das grafische Fenster erstellen wir eine separate Klasse, also eine eigene Datei. In gräßeren Projekten erhöht dies die Übersichtlichkeit. Zudem kann eine solche Klasse an anderen Stellen wiederverwendet werden.

```java
import javax.swing.JFrame;

public class MainWindow {

    public MainWindow() {
        JFrame mainWindow = new JFrame("Main Window");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 300);
        mainWindow.setVisible(true);
    }   
}
```

### Bestandteile:

```java
import javax.swing.JFrame;
```

Mit der `import` Anweisung bindet man andere Bibliotheken, also letztendlich Dateien mit bereits vorgefertigem Programmcode, in das eigene Projekt, konkret in die eigenen Klasse ein.

`javax.swing` ist der Name des Pakests (der Bibliothek), die hier eingebunden wird. Ein Paket ist eine Art Sammlung von Code-Bausteinen. Dem Paketnamen ist immer der Name des "Herstellers" vorangestellt. Pakete, die mit `javax` oder `java` beginnen, stammen von Java selbst.

`JFrame` ist der Name der konkreten Komponente, die verwendet werden soll. Das ist hier der Programmcode, der ein grafisches Fenster erzeugt.

```java
public class MainWindow {

}
```

Das Grundgerüst einer Klasse.

`public` heißt, die Klasse kann von überall aufgerufen werden.

`class` das Schlüsselwort signalisiert, es wird eine Klasse erstellt.

`MainWindow` der Name der Klasse, er ist frei wählbar, der Datei-Name und der Klassen-Name müssen gleich lauten und beginnen immer mit einem Großbuchstaben, keine Leerzeichen.

Die Klasse liefert den abstrakten Bauplan für das spätere konkrete Programmfenster. Hier wird festgelegt, wie das Fenster später aussehen soll.

```java
public MainWindow() {

}
```

Das ist der "Konstruktor". Ein Konstruktor ist eine Methode (ähnlich einer Funktion) die von vornherein felstlegt, welche grundlegenden Komponenten das konkrete Objekt `MainWindow` später implizit bereits beim Erstellen mitbringt. Man muss dann im Hauptprogramm nur noch ein neues Objekt erzeugen.

```java
JFrame mainWindow = new JFrame("Main Window");
```

Von der Klasse `JFrame` wird ein neues Objekt erzeugt und in der Variablen `mainWindow` gespeichert. Auch hier wird mit `new JFrame()`  der Konstruktor der Klasse aufgerufen. In den runden Klammern wird als Attribut der Fenstertitel "Main Window" übergeben.

```java
mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

Für das neu erstellte Fenster (Objekt) kann man nun bestimmen, wie es sich verhalten soll. Hier wird erst einmal festgelegt, dass jedes neue Fenster die  Methode - das Standard-Verhalten -  `setDefaultCloseOperation()` haben soll und diese Methode soll das Fenster schließen beim Klick auf das X-Symbol. `EXIT_ON_CLOSE` ist eine Konstante, die in der Klasse `JFrame` definiert ist. Genauer gesagt implementiert `JFrams` selbst wieder um ein Interface, das diese Konstanten enthält: `WindowConstants`

```java
mainWindow.setSize(400, 300);
```

Für das Fenster wird die Methode `setSize()` aufgerufen, die die Fenstergröße in pixeln bestimmt.

```java
mainWindow.setVisible(true);
```

Die Methode `setVisible(true)` sorgt dafür, dass der Anwender das Fenster auch sieht.

## App.java

```java
public class App {
    public static void main(String[] args) throws Exception {
      
        new MainWindow();
    }
}
``` 

Diese Datei ist der Startpunkt des Programms, weil sie die main-Methode enthält.


```java
public class App {

}
```

Auch hier ist das Grundgerüst eine Klasse, signalisiert durch das Schlüsselwort `class` mit dem Namen `App`und die Datei selbst hat den gleichen Namen, `App.java`.

`{}`: Alles, was das Programm tun soll, muss in der main-Methode und innerhalb der geschweiften Klammern stehen. Weil dies bei umfangreicheren Programmen schnell unübersichtlich wird, lagert man Teile des Programmcodes ind andere Dateien / Klassen aus.

` ; `: Alle Anweisungen müssen mit eine Semikolon abgeschlossen werden.

```java
new MainWindow();
```

Mit der Methode - dem Konstruktor - `MainWindow()` erzeugt man ein neues Fesnter, genau so, wie es in der Datei `MainWindow.java` mit der gleichlautenden Klasse festgelegt wurde.Das Schlüsselwort `new` zeigt an, dass ein bestehender Konstruktor aufgerufen und nicht ein Konstruktor erstellt wird.

___


vgl. auch:

https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html

https://docs.oracle.com/javase/8/docs/api/javax/swing/WindowConstants.html
