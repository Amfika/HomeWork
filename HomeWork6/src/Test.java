public class Test {
    public static void main(String[] args) {
        NBRBLoader loader = new NBRBLoader();
        System.out.println(loader.load(SiteLoader.Currency.EUR)); //вызываем метод load у объекта loader с параметром EURи распечатываем то что нам вернул метод load, который мы вызывали
        System.out.println(loader.load(SiteLoader.Currency.RUB));//вызываем метод load у объекта loader с параметром RUB и распечатываем то что нам вернул метод load, который мы вызывали
        System.out.println(loader.load(SiteLoader.Currency.USD));//вызываем метод load у объекта loader с параметром USD и распечатываем то что нам вернул метод load, который мы вызывали
    }
}
