package ferros.json_serelization;

import com.google.gson.Gson;

public class Foo {
    public int intValue;
    public String stringValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Foo foo = (Foo) o;

        if (intValue != foo.intValue) return false;
        return stringValue.equals(foo.stringValue);
    }

    @Override
    public int hashCode() {
        int result = intValue;
        result = 31 * result + stringValue.hashCode();
        return result;
    }

//    @Test
//    public void whenDeserializingToSimpleObject_thenCorrect() {
//        String json = "{" intValue ":1," stringValue ":" one "}";
//
//        Foo targetObject = new Gson().fromJson(json, Foo.class);
//
//        assertEquals(targetObject.intValue, 1);
//        assertEquals(targetObject.stringValue, "one");
//    }
}
