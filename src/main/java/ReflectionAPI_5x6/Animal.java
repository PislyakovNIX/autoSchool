package ReflectionAPI_5x6;

import java.lang.reflect.Field;

public class Animal {

    public void getPrivateFieldsAndTheirVolume(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.print("Название приватного поля: " + field.getName());
            field.setAccessible(true);
            String volume = (String) field.get(object);
            System.out.println("  Значение переменной: " + volume);
        }
    }
}
