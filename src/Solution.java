
import java.util.ArrayList;
import java.util.Scanner;

/*
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую короткую строку на экран.
4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        int str_min_len = -1;
        String tmp;
        int tmp_len = 0;

        for (int i=0; i<5;i++) {
            tmp = sc.nextLine();
            tmp_len = tmp.length();

            if (tmp_len < str_min_len || str_min_len == -1)
                str_min_len = tmp_len;

            list.add(tmp);
        }

        for (int i= 0; i<list.size();i++) {
            if (list.get(i).length() == str_min_len)
                System.out.println(list.get(i));
        }
    }
}
