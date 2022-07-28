package ferros.json_serelization;

//import org.jetbrains.annotations.TestOnly;
//import reository.GenericRepository;

import java.lang.reflect.Type;

public class GenericFoo <T> {
    public T theValue;
}

//@Test
//    Type typeToken = new TypeToken<GenericFoo<Integer>>(){
//    }.getType();
//    String json = "{"theValue":1}";
//
//    GenericFoo<Integer> targetObject = new Gson().fromJson(json,typeToken);
//
//    assertEquals(targetObject.theValue, new Integer(1));
//}
