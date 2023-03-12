package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        String[] text = new String[strings.length];
        for (int i = strings.length - 1; i >= 0; i--) {
            text[i] = strings[strings.length - i - 1];
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = text[i];
        }
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        return strings;
    }

}