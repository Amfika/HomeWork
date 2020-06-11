public class Cikles_TablicaUmnozeniya {
    public static void main(String[] args) {
        for (int a=1;a<11;a++){
            for (int b=1;b<11;b++){//выполняется 10 раз умножением на 1
                                    //далее переходит на верхний цикл прибавляя (а++)
                                    //далее уже с новой а выполняет умножение на b снова 10 раз
                System.out.print(a*b+ "  ");
            }
            System.out.println("");
        }
    }

}
