// Билет №1 Практическое задание: Напишите программу, которая переворачивает массив.
public class ArrayInverter {                           //создаю класс массивИнвертер;
    public static void invert(int[] array) {          //-создаю метод инверт;
        for (int i = 0; i < array.length /2; i++) {   //-в теле метода создаю цикл с перебором элементов до середины массива;
            int temp = array[i];                      //-для обмена значениями ввожу временную переменную temp;
            array[i] = array[array.length - i - 1];   //-циклом будут заменяться значения элементов [i] и [array.length - i -1],
                                                      // например в первой итерации - значение первого элемента с начала,
                                                      // на значение первого элемента с конца;
            array[array.length - i - 1] = temp;       //в последний элемент записываю значение temp.
        }
    }
}
