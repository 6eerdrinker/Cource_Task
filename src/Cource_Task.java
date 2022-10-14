// Билет №1 Практическое задание: Напишите программу, которая переворачивает массив.

import java.util.Arrays;                                        //- импортирую классовый пакет Arrays с методами для массивов,
                                                                // в данном случае необходим метод Arrays.toString;
public class Cource_Task {
    private static void resultInvert(int[] array) {             //- создаю отдельный от метода main, метод resultInvert,
                                                                // чтобы можно было использовать его неоднократно;
        System.out.print(Arrays.toString(array) + " ===>>> ");  //- выожу на консоль сам массив;
        ArrayInverter.invert(array);                            //- инвертирую;
        System.out.println(Arrays.toString(array));             //- распечатываю инвертированный вид.
    }
    public static void main(String[] args) {                    //- вызываю метод resultInvert в методе main;
                                                                //- в метод передаю массив, который планирую перевернуть.
resultInvert(new int[]{10, 11, 12, 13, 14, 15, 16});
        resultInvert(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

    }
}
