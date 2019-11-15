package lesson15_16.o9_collections_generics;

import java.util.*;

public class PerformanceChecker {
    public long checkAdding(Collection collection, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            collection.add(i*i );
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long checkReading(Collection collection, int count) {
        long start = System.currentTimeMillis();

        long end = System.currentTimeMillis();
        return end - start;
    }

   /*
* Задание 3
Создать класс PerfomanceChecker
Он должен уметь измерять время работы различных коллекций Java. А именно

Написать классу публичные методы для проверки:
Скорости вставки в коллекции - checkAdding(int count)
Функция создает пустую коллекцию, запускает таймер и начинает заполнять пустую коллекцию элементами по одному.
* Кол-во элементов = count


Скорости считывания с коллекции - checkReading(int count)
Функция должна создать коллекцию, заполнить ее на count элементов. Запустить таймер и начать count раз брать рандомный
* индекс элемента в коллекции и считывать его по индексу.


Скорости удаления из коллекции - checkRemoving(int count)
Функция должна создать коллекцию, заполнить ее на count элементов. Запустить таймер и начать count раз брать рандомный
*  индекс элемента в коллекции и удалять его по индексу.

Каждый метод должен замерить время работы одновременно для всех коллекций и вывести в консоль результаты указав чему
* был равен count.

Вставлять / считывать / удалять элементы в коллекциях можно только по одному. Это значит что нельзя пользоваться
* методами removeAll, addAll.

Подсказка:
System.currentTimeMillis() - этот метод возвращает текущее время в миллисекундах
    * */
}
