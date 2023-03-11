/* 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл. */ 
import java.io.IOException;
import java.util.Arrays; 
import java.util.logging.*;

public class decision_1 {

    private static final Logger logger = Logger.getLogger(decision_1.class.getName());

    public static void main(String[] args) throws IOException{
        int[] arr = {65, 22, 15, 12, 24, 10, 70};
        logger.setLevel(Level.INFO); 
        FileHandler fh = new FileHandler("logBubble.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
       
        logger.info("Исходный массив: " + Arrays.toString(arr));
        bubbleSort(arr);
        logger.info("Отсортированный массив: " + Arrays.toString(arr));
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            logger.info("Промежуточный результат на " + (i+1) + "-й итерации: " + Arrays.toString(arr)); 
        }
    }
}