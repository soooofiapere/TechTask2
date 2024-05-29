package org.example;
import java.util.function.Supplier;

public class SpeedTest {

    public static void testSpeed(Supplier<String> function, String functionName) {
        long startTime = System.nanoTime();

        // Вызов функции
        String result = function.get();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Преобразуем наносекунды в миллисекунды

        System.out.println("Время выполнения функции " + functionName + ": " + duration + " мс");
        System.out.println("Результат функции " + functionName + ": " + result);
    }

    public static void main(String[] args) {
        // Пример использования
        testSpeed(() -> yourFunctionToTest_min(), "_min");
        testSpeed(() -> yourFunctionToTest_max(), "_max");
        testSpeed(() -> yourFunctionToTest_sum(), "_sum");
        testSpeed(() -> yourFunctionToTest_mult(), "_mult");
    }

    private static String yourFunctionToTest_min() {
        // Реализуйте вашу функцию для тестирования _min
        return "Результат выполнения вашей функции _min";
    }

    private static String yourFunctionToTest_max() {
        // Реализуйте вашу функцию для тестирования _max
        return "Результат выполнения вашей функции _max";
    }

    private static String yourFunctionToTest_sum() {
        // Реализуйте вашу функцию для тестирования _sum
        return "Результат выполнения вашей функции _sum";
    }

    private static String yourFunctionToTest_mult() {
        // Реализуйте вашу функцию для тестирования _mult
        return "Результат выполнения вашей функции _mult";
    }
}