package HomeWork_4;

import java.util.HashMap;
public class Main {
    //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать, сколько раз встречается каждое слово.
    public static void main(String[] args) {
        String[] word = {"лес", "песок", "лес", "ночь", "кот","небо", "лес", "песок", "тропа", "лес"};
        HashMap<String, Integer> unique = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (unique.containsKey(word[i])) {
                unique.put(word[i], unique.get(word[i]) + 1);
            } else {
                unique.put(word[i], 1);}
        }
        System.out.println(unique);
    }
}
