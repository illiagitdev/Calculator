package lesson19online;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomDeserializer implements JsonDeserializer<List<Book>> {
    @Override
    public List<Book> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        List<Book> list=new ArrayList<>();

        JsonArray array=jsonElement.getAsJsonArray();

        Iterator<JsonElement>iterator=array.iterator();

        JsonElement element;
Gson gson=new Gson();
        for (;iterator.hasNext();             ) {
            element=iterator.next();
            list.add(gson.fromJson(element,Book.class));
        }
        return list;
    }
}
