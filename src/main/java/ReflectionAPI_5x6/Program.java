package ReflectionAPI_5x6;

import java.lang.reflect.Field;
import java.util.Random;

public class Program {

    public void fillObjectWithRandomData(Object object) throws IllegalAccessException {
        Random random = new Random();
        String sourceText = "LoremipsumdolorsitametrconsecteturadipiscingelitrCrasnecultriciespurusrSuspendisseligulaquamrtinciduntacullamcorpernonrconsequatvelnislrEtiamhendrerit";

        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            int position1 = random.nextInt(20 + 1);
            String randomData = sourceText.substring(position1, position1 + 1 + random.nextInt(20 + 1));
            field.set(object, randomData);
            field.setAccessible(false);
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Mouse mouse = new Mouse();
        Parrot parrot = new Parrot();

        Program program = new Program();
        program.fillObjectWithRandomData(mouse);
        program.fillObjectWithRandomData(parrot);

        Animal animal = new Animal();
        animal.getPrivateFieldsAndTheirVolume(mouse);
        animal.getPrivateFieldsAndTheirVolume(parrot);

    }
}
