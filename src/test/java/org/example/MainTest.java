package org.example;

import org.example.Main;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainTest {

    @Test
    public void testMinEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        // Проверяем, что функция возвращает 0, если список пуст
        assertEquals(0, Main._min(emptyList));
    }

    @Test
    public void testMin() {
        List<Integer> myList = Arrays.asList(2, 3, 4);
        // Проверяем, что функция правильно находит минимальное число в списке
        assertEquals(2, Main._min(myList)); // Ожидаемый результат: минимальное число в списке равно 2
    }

    @Test
    public void testMaxEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        // Проверяем, что функция возвращает 0, если список пуст
        assertEquals(0, Main._max(emptyList));
    }

    @Test
    public void testMax() {
        List<Integer> myList = Arrays.asList(2, 3, 4);
        // Проверяем, что функция правильно находит максимальное число в списке
        assertEquals(4, Main._max(myList)); // Ожидаемый результат: максимальное число в списке равно 4
    }

    @Test
    public void testSumEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        // Проверяем, что функция возвращает 0, если список пуст
        assertEquals(0, Main._sum(emptyList));
    }

    @Test
    public void testSum() {
        List<Integer> myList = Arrays.asList(2, 3, 4);
        // Проверяем, что функция правильно суммирует все элементы списка
        assertEquals(9, Main._sum(myList)); // Ожидаемый результат: сумма чисел 2, 3 и 4 равна 9
    }

    @Test
    public void testMultEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        // Проверяем, что функция возвращает 1, если список пуст
        assertEquals(0, Main._mult(emptyList));
    }

    @Test
    public void testMult() {
        List<Integer> myList = Arrays.asList(2, 3, 4);
        // Проверяем, что функция правильно умножает все элементы списка
        assertEquals(24, Main._mult(myList)); // Ожидаемый результат: произведение чисел 2, 3 и 4 равно 24
    }


}