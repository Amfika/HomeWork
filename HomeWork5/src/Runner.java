public class Runner {
    public static void main(String[] args) {
        Color color = new Color(3); //создаём объект через конструктор с параметром
        int colorNumber = color.getNumber();//возвращаем через метод
        String colorName = color.getName();
        System.out.println(colorNumber);
        System.out.println(colorName);
    }
}
