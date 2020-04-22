import java.io.*;

//Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.

public class ReferenceTypes_Ex_2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите оригинальный текст");
        String originalText = bufferedReader.readLine();

        System.out.println("Введите часть текста которую нажно заменить");
        String findText = bufferedReader.readLine();

        System.out.println("Введите текст, на который нужно заменить искомую часть");
        String replacedWithText = bufferedReader.readLine();

        int position = originalText.indexOf(findText);
        int length = findText.length();

        String result = originalText.substring(0,position) + replacedWithText + originalText.substring(position+length);
        System.out.println(result);

    }

}
