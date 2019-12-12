package lesson12_12_19;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws Exception {
//        javaDefault();

//        okHttpClient();

//        postRequest();

        getWithuerry();
    }

    private static void getWithuerry() throws Exception {
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(new Request.Builder()
                .get()
                .url("https://pingponggoit.herokuapp.com/getUser?name=Olexandr&surname=Yanov&salary=12121&gender=male")
                .build()).execute();
        System.out.println(new String(response.body().bytes()));
        ObjectMapper mapper = new ObjectMapper();

        String str = new String(response.body().bytes());
        User user = null;
        user = mapper.readValue(str, User.class);

        System.out.println(user);
    }

    private static void postRequest() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Response new_massege = client.newCall(new Request.Builder().url("https://pingponggoit.herokuapp.com/sendMessage")
                .post(RequestBody.create(MediaType.parse("application/json"), "new massege"))
                .build()).execute();
        ObjectMapper mapper = new ObjectMapper();

        String str = new String(new_massege.body().bytes());
        User user = mapper.readValue(str, User.class);

        System.out.println(user);
    }

    private static void okHttpClient() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://pingponggoit.herokuapp.com/")
                .get()
                .build();
        Response response = client.newCall(request).execute();
        String headers = response.headers().toString();
        String body = new String(response.body().bytes());
        System.out.println("Headers " + headers);
        System.out.println("Headers general: " + response.networkResponse());
        System.out.println("Body " + body);
    }

    private static void javaDefault() throws IOException {
        URL url = new URL("https://pingponggoit.herokuapp.com/");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        InputStream inputStream = urlConnection.getInputStream();

        BufferedReader bufferedInput = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer buffer = new StringBuffer();
        String response;
        while ((response = bufferedInput.readLine()) != null) {
            buffer.append(response);
            System.out.println(buffer.toString());
        }
    }
}
