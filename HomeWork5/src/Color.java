import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.text.rtf.RTFEditorKit;

public class Color {

    //Внутри класса создать константы цветов радуги которые будут содержать номера цветов
    //В отличие от переменных константам можно присвоить значение только один раз.
    //Константа объявляется также, как и переменная, только вначале идет ключевое слово final
    int colorNumber;
    String colorName;

    //Создать конструктор, который будет принимать параметр int
    public Color(int color) {
        colorNumber = color;
    }

    //Метод getNumber должен вернуть номер цвета который мы передали в конструктор
    public int getNumber() {
        return colorNumber;
    }

    //Метод getName должен возвращать название цвета ввиде строки
    public String getName() {
        switch (colorNumber) {
            case Constant.RED:
                return "Красный";
            case Constant.ORANGE:
                return "Оранжевый";
            case Constant.YELLOW:
                return "Жёлтый";
            case Constant.GREEN:
                return "Зелёный";
            case Constant.BLUE:
                return "Голубой";
            case Constant.DB:
                return "Синий";
            case Constant.VIOlET:
                return "Фиолетовый";
            default:
                return "Неизвестно";

        }
    }
    //----------------------------------------------------------------
}


