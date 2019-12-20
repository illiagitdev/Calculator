package lesson17_12_19.main.mainFX;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lesson17_12_19.main.User;
import okhttp3.*;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/* Задания 5.
        С помощью JavaFX создать оболочку, в которой будут поля пользователя -> Name, Surname, Salary, Gender.
        При нажатии кнопки Save, отпроавить запрос на ендпоинт /createUser и вывести сообщение, если сохранение
        пользователя прошло успешно “Saved!” или Статус и сообщение об ошибке “404 Страница не найдена” etc. */
public class Main extends Application {
    private static final int WIDTH = 650;
    private static final int HEIGHT = 500;
    private static OkHttpClient client = new OkHttpClient();
    private static final String URL_PATH = "https://pingponggoit.herokuapp.com/";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        CompletableFuture future;
        Group root = new Group();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        uiSetup(root);

        windowSetup(stage);
    }

    private void uiSetup(Group root) {
        VBox vBox = new VBox();
        vBox.setSpacing(10);

        Button saveButton = new Button("Save");
        saveButton.setTranslateX(50);

        TextField setName = new TextField("Name");
        vBox.getChildren().addAll(setName);

        TextField setSurname = new TextField("Surname");
        vBox.getChildren().addAll(setSurname);

        TextField setGender = new TextField("Gender");
        vBox.getChildren().addAll(setGender);

        TextField setID = new TextField("ID");
        vBox.getChildren().addAll(setID);

        TextField setSalary = new TextField("Salary");
        vBox.getChildren().addAll(setSalary);

        TextArea result = new TextArea();
        result.setWrapText(true);

        saveButton.setOnMouseClicked(event -> {
            User user = new User(setGender.getText(), getAnInt(setID.getText()), setName.getText(), setSurname.getText(), getAnInt(setSalary.getText()));
            ObjectMapper mapper = new ObjectMapper();
            String userJSON = null;
            String requestResult = "";
            try {
                userJSON = mapper.writeValueAsString(user);
                System.out.println(user);
                Response response = client.newCall(new Request.Builder().
                        url(String.format("%s%s", URL_PATH, "createUser")).
                        post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), userJSON)).
                        build()).
                        execute();
                requestResult = new String(Objects.requireNonNull(response.body().bytes()));
                System.out.println(requestResult);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            requestResult = "Saved!\n" + requestResult;
            System.out.println(requestResult);
            if (!result.getText().isEmpty())
                result.clear();
            result.appendText(requestResult);
        });

        vBox.getChildren().addAll(saveButton);
        HBox hBox = new HBox();
        hBox.setSpacing(25);
        hBox.getChildren().addAll(vBox, result);
        root.getChildren().addAll(hBox);
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
