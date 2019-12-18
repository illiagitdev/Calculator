package lesson17_12_19.main.mainFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lesson17_12_19.main.User;

/* Задания 5.
        С помощью JavaFX создать оболочку, в которой будут поля пользователя -> Name, Surname, Salary, Gender.
        При нажатии кнопки Save, отпроавить запрос на ендпоинт /createUser и вывести сообщение, если сохранение
        пользователя прошло успешно “Saved!” или Статус и сообщение об ошибке “404 Страница не найдена” etc. */
public class Main extends Application {
    private static final int WIDTH = 650;
    private static final int HEIGHT = 500;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
//        Pane root1 = new Pane();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        uiSetup(root);

        windowSetup(stage);
    }

    private void uiSetup(Group root) {
        Button saveButton = new Button("Save");
        saveButton.setTranslateX(75);
        saveButton.setTranslateY(400);


        VBox vBox = new VBox();

        Label labelName = new Label();
        TextField setName = new TextField("Name");
        vBox.getChildren().addAll(labelName, setName);

        Label labelSurname = new Label();
        TextField setSurname = new TextField("Surname");
        vBox.getChildren().addAll(labelSurname, setSurname);

        Label labelGender = new Label();
        TextField setGender = new TextField("Gender");
        vBox.getChildren().addAll(labelGender, setGender);

        Label labelID = new Label();
        TextField setID = new TextField("ID");
        vBox.getChildren().addAll(labelID, setID);

        Label labelSalary = new Label();
        TextField setSalary = new TextField("Salary");
        vBox.getChildren().addAll(labelSalary, setSalary);

        saveButton.setOnMouseClicked((event -> {
            User user= new User(setGender.getText(), getAnInt(setID.getText()),setName.getText(),setSurname.getText(),getAnInt(setSalary.getText()));
            System.out.println(user);
        }));

        root.getChildren().addAll(saveButton, vBox);
    }

    private int getAnInt(String value) {
        return Integer.valueOf(value);
    }

    private void windowSetup(Stage stage) {
        stage.setTitle("Task 5 on OkHTTP");
        stage.setMaxHeight(HEIGHT * 2);
        stage.setMaxWidth(WIDTH * 2);

        stage.setMinHeight(HEIGHT);
        stage.setMinWidth(WIDTH);

        stage.setHeight(HEIGHT);
        stage.setWidth(WIDTH);

    }
}
