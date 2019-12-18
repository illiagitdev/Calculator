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

//        postUser();
//        getById();
        operateUser();
    }

    private static void operateUser() {
        /*Создать пользователя с помощью запроса /createUser, вывести список пользователей с помощью запроса /getUsers,
        ответ прийдем в виде списка пользователей, привести данный JsonArray to List<User>.
После полученного списка, отправить запрос на endpoint /removeUser. После выполнить запрос /getUsers, убедиться что
вашего User, которого вы создавали и удаляли, нет в этом списке.*/
        User user = new User("female", 83, "Jane", "Bunny", 1400);
        ObjectMapper mapper=new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(user);
            Response response = client.newCall(new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "createUser")).
                    post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json)).build()).execute();
            Request request = new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "getUsers")).
                    get().
                    build();

            Response response1 = client.newCall(request).execute();
            List<User> users = mapper.readValue(new String(response1.body().bytes()), new TypeReference<List<User>>(){});

            System.out.println(users);
            request = new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "getUserById?id=83")).
                    get().
                    build();
            response1 = client.newCall(request).execute();
            System.out.println(new String(response1.body().bytes()));
//
            request = new Request.Builder().
                    url(String.format("%s%s", URL_PATH, "removeUser")).
                    delete(request.body()).
                    build();
            Response removeUser = client.newCall(request).execute();
//                    new Request.Builder().
//                    url(String.format("%s%s", URL_PATH, "removeUser")).delete(request.body()).build()).execute();
//            System.out.println(removeUser.body());
//
//            List<User> users1 = mapper.readValue(new String(response1.body().bytes()), new TypeReference<List<User>>(){});
            System.out.println(new String(removeUser.body().bytes()));
            Optional.ofNullable(response.body()).ifPresent(ResponseBody::close);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getById() {
        /*Отправить запрос на endpoint /getUserById и получить пользователя по id. Получить ответ. Привести ответ к User.*/
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

    private static void postUser() throws IOException {
        /*
         * Создать пользователя отправив JSON на endpoint /createUser. Получить ответ. Привести ответ к User.*/
        User user = new User("male", 4, "Jack", "Foo", 1200);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        System.out.println(json);
        Response response = client.newCall(new Request.Builder().
                url(String.format("%s%s", URL_PATH, "createUser")).
                post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json)).
                build()).
                execute();

        System.out.println(new String(Objects.requireNonNull(response.body().bytes())));
        Optional.ofNullable(response.body()).ifPresent(ResponseBody::close);
    }
}
