/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }//вызываем метод load с 2 параметрами String и SiteLoader.Currency и возвращаем результат работы метода load, который мы вызывали

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {//по параметру content передается то, что вернул сервис. В виде строки.
        System.out.println(content);
        int posOfficialRate = content.indexOf("Cur_OfficialRate");
        int posOfficialRate2 = content.indexOf(":", posOfficialRate);
        int posOfficialRateEnd = content.indexOf(",", posOfficialRate2);
        if(posOfficialRateEnd == -1){
            posOfficialRateEnd = content.indexOf("}", posOfficialRate2);
        }
        String rateStr = content.substring(posOfficialRate2+1, posOfficialRateEnd);
        double diggit = Double.parseDouble(rateStr);
        return diggit;
    }
}
