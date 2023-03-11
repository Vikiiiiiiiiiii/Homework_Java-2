/* 3. Напишите метод, который принимает на вход строку (String) 
и определяет является ли строка палиндромом (возвращает boolean значение). 
Без встр. функций. Палиндром – это слово-перевёртыш. */

public class decision_3 {
        public static void main(String[] args) {
        System.out.println(isPalindrome("топот"));
        System.out.println(isPalindrome("молоко")); 
        System.out.println(isPalindrome("колос")); 
        System.out.println(isPalindrome("заказ")); 
        System.out.println(isPalindrome("мадам")); 
    }
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
        }
}