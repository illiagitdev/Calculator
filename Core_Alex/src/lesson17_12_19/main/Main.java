package lesson17_12_19.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    private static OkHttpClient client = new OkHttpClient();
    private static final String URL_PATH = "https://pingponggoit.herokuapp.com/";

    public static void main(String[] args) {
        /*Открыть портал https://pingponggoit.herokuapp.com/swagger-ui.html
        Ознакомиться с Swagger IP.
        Задание 1.
        Создать пользователя отправив JSON на endpoint /createUser. Получить ответ. Привести ответ к User.*/
        postUser();

        /*Задание 2.
        Отправить запрос на endpoint /getUserById и получить пользователя по id. Получить ответ. Привести ответ к User.*/
//        getById();

        /*Задание 3.
        Создать пользователя с помощью запроса /createUser, вывести список пользователей с помощью запроса /getUsers,
        ответ прийдем в виде списка пользователей, привести данный JsonArray to List<User>.
        После полученного списка, отправить запрос на endpoint /removeUser. После выполнить запрос /getUsers,
        убедиться что вашего User, которого вы создавали и удаляли, нет в этом списке.*/
//        operateUser();

                /*Задание 4.
        Получить список пользователей с помощью запроса /getUsers, перезаписать пользователя под любым идентификатором
        на другого пользователя, выполнить запрос /getUsers и убедиться что ваш пользователь перезаписан на другого
         пользователя.*/
//                rewriteUserByID();

               /* Задания 5.
        С помощью JavaFX создать оболочку, в которой будут поля пользователя -> Name, Surname, Salary, Gender.
        При нажатии кнопки Save, отпроавить запрос на ендпоинт /createUser и вывести сообщение, если сохранение
        пользователя прошло успешно “Saved!” или Статус и сообщение об ошибке “404 Страница не найдена” etc. */
        /*   separate file   */
    }

    private static void rewriteUserByID() {
        System.out.println("\n\trewriteUserByID()\n");
        try {
            Response response = client.newCall(new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "getUsers")
                    ).get().
                    build()).
                    execute();
            ObjectMapper mapper = new ObjectMapper();
            List<User> users = mapper.readValue(response.body().bytes(),new TypeReference<List<User>>(){});
            System.out.println(users);

            int id = (users.size() < 2) ? users.get(0).getId() : users.get(users.size() - 2).getId();
            User userNew = new User("female", id, "Joan","Francy",2133);

            String json = mapper.writeValueAsString(userNew);
            System.out.println(json);

            client.newCall(new Request.Builder().
                    url(String.format("%s%s%s", URL_PATH, "overwrite?id=", id)).
                    put(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json)).
                    build()).
                    execute();

            response = client.newCall(new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "getUsers")
                    ).get().
                    build()).
                    execute();
            users = mapper.readValue(response.body().bytes(),new TypeReference<List<User>>(){});
            System.out.println(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void operateUser() {
        User user = new User("female", 83, "Jane1", "Bunny", 1450);
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(user);
            //add user
            Response response = client.newCall(new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "createUser")).
                    post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json)).build()).execute();
            System.out.println("add user " + new String(response.body().bytes()));

            //build & execute request for all users
            Request request = new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "getUsers")).
                    get().
                    build();
            response = client.newCall(request).execute();
            List<User> users = mapper.readValue(new String(response.body().bytes()), new TypeReference<List<User>>() {
            });
            System.out.println("build & execute request for all users \n" + users);

            request = new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "getUserById?id=926")).
                    get().
                    build();
            response = client.newCall(request).execute();
            System.out.println(new String(response.body().bytes()));

            //delete ang check if user deleted
            user.setId(242);
            json = mapper.writeValueAsString(user);
            request = new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "removeUser")).
                    delete(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json)).
                    build();
            response = client.newCall(request).execute();
            System.out.println("remove response: " + new String(response.body().bytes()));

            request = new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "getUsers")).
                    get().
                    build();
            response = client.newCall(request).execute();
            users = mapper.readValue(new String(response.body().bytes()), new TypeReference<List<User>>() {
            });
            System.out.println("build & execute request for all users(delete) \n" + users);

            Optional.ofNullable(response.body()).ifPresent(ResponseBody::close);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getById() {
        Request request = new Request.Builder().
                url(String.format("%s%s", URL_PATH, "getUserById?id=325")).
                get().
                build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(new String(response.body().bytes()));
            Optional.ofNullable(response.body()).ifPresent(ResponseBody::close);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void postUser() {
        User user = new User("male", 4, "Jack", "Foo", 1200);
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        Response response = null;
        try {
            response = client.newCall(new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "createUser")).
                    post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json)).
                    build()).
                    execute();
            System.out.println(new String(Objects.requireNonNull(response.body().bytes())));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Optional.ofNullable(response.body()).ifPresent(ResponseBody::close);
    }
}
