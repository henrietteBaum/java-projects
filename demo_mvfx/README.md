README

JavaFX und Maven

Mac mit M benötigt JavaFX Version 19 oder höher.

Die pom-Datei anpassen:

Java Version 22:

```xml
   <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>22</maven.compiler.source>
        <maven.compiler.target>22</maven.compiler.target>
    </properties>
``` 

Die aktuelle JavaFX Version:

```xml
<dependencies>
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-controls</artifactId>
        <version>21.0.1</version>
    </dependency>
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-fxml</artifactId>
        <version>21.0.1</version>
    </dependency>
</dependencies>
```

und Maven Plugin anpassen:

```xml
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.9.0</version>
                <configuration>
                    <release>22</release>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.openjfx</groupId>
                <artifactId>javafx-maven-plugin</artifactId>
                <version>21.0.1</version>
                <executions>
                    <execution>
                        <!-- Default configuration for running -->
                        <!-- Usage: mvn clean javafx:run -->
                        <id>default-cli</id>
                        <configuration>
                            <mainClass>info.zoomin.App</mainClass>
                        </configuration>
                    </execution>
                </executions>
            </plugin>

``` 


## Ohne fxml

Den Bereich entfernen:

```java

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * @param fxml
     * @return
     * @throws IOException
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

``` 

## Appp.java 

Um eine GUI ohne fxml zu erstellen, nehmen Sie die folgenden Änderungen vor:

Szene ändern:

löschen nach `new Szene) `:

```java 
loadFXML("primary"), 640, 480
```

Dateien löschen:
- PrimaryController.java
- SecondaryController.java

Verzeichnis löschen:

- resources

Ergänzen nach `new Szene( `:

```java
        scene = new Scene(new StackPane(), 640, 480);
``` 

Mit den Änderungen wird nun eine nues leeres Fenster erzeugt.


vgl:

https://maven.apache.org/docs/history.html

https://openjfx.io/openjfx-docs/#maven