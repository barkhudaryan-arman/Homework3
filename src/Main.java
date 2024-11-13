public class Main {
    public static void main(String[] args) {
        //Задача 1
        int box = 6;
        System.out.println("Значение переменной box c типом int равно " + box);
        byte apples = 120;
        System.out.println("Значение переменной apples c типом byte равно " + apples);
        short milles = 30000;
        System.out.println("Значение переменной milles c типом short равно " + milles);
        long worldPopulation = 810000000;
        System.out.println("Значение переменной worldPopulation c типом long равно " + worldPopulation);
        float temperature = 65.5F;
        System.out.println("Значение переменной temperature c типом float равно " + temperature);
        double temperatureSon = 9.930F;
        System.out.println("Значение переменной temperatureSon c типом double равно " + temperatureSon);
        //Задача 2
        double first = 27.12;
        long second = 987678965549L;
        double third = 2.786;
        short fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;
        //Задача 3
        byte firstGroupStudents = 23;
        byte secondGroupStudents = 27;
        byte thirdGroupStudents = 30;
        short paper = 480;
        short paperStudent = (short) ( paper/ (firstGroupStudents + secondGroupStudents + thirdGroupStudents) );
        System.out.println("На каждого ученика рассчитано "+ paperStudent + " листов бумаги");
        //Задача 4
        byte timeWork = 8;
        System.out.println("за одну минуту машина произвела " + timeWork + " штук бутылок" );
        int twentyMinute = timeWork * 20;
        System.out.println("за 20 минут машина произвела " + twentyMinute + " штук бутылок" );
        int threeDay = timeWork * 4320;
        System.out.println("за 3 дня машина произвела " + threeDay + " штук бутылок" );
        int oneMonth = timeWork * 44640;
        System.out.println("за месяц машина произвела " + oneMonth + " штук бутылок" );
        //Задача 5
        byte allPaintCans = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int allRooms = allPaintCans / (whiteColor + brownColor);
        int allWhiteColors = allRooms * whiteColor;
        int allBrownColors = allRooms * brownColor;
        System.out.println("В школе, где " + allRooms + " классов, нужно " + allWhiteColors +" банок белой краски и " + allBrownColors +" банок коричневой краски");
        //Задача 6
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int weight = bananas + milk + iceCream + eggs;
        int weightKilo = weight / 1000;
        System.out.println("Масса завтрака составляет " + weight + " грамм!");
        System.out.println("Масса завтрака составляет " + weightKilo + " килограмм!");
        //Задача 7
        short weightloss = 7000;
        int oneDayWeightLossMin = 250;
        int oneDayWeightLossMax = 500;
        int oneDayWeightLossMiddle = (oneDayWeightLossMin + oneDayWeightLossMax) / 2;
        int weightlossDaysMin = weightloss / oneDayWeightLossMin;
        int weightlossDaysMax = weightloss / oneDayWeightLossMax;
        int weightlossDaysMiddle = weightloss / oneDayWeightLossMiddle;
        System.out.println("eсли спортсмен будет терять каждый день по 250 грамм, то ему понадобится " + weightlossDaysMin + " дней!");
        System.out.println("eсли спортсмен будет терять каждый день по 500 грамм, то ему понадобится " + weightlossDaysMax + " дней!");
        System.out.println("eсли спортсмен будет терять каждый день среднее значение грамм, то ему понадобится " + weightlossDaysMiddle + " дней!");
        //Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaTen = (masha * 10)/100;
        int denisTen = (denis * 10)/100;
        int kristinaTen= (kristina * 10)/100;
        int mashaUp = masha + mashaTen;
        int denisUp = denis+ denisTen;
        int kristinaUp = kristina + kristinaTen;
        System.out.println("Маша теперь получает " + mashaUp + " рублей.Годовой доход вырос на " + mashaTen + " рублей");
        System.out.println("Денис теперь получает " + denisUp + " рублей.Годовой доход вырос на " + denisTen + " рублей");
        System.out.println("Кристина теперь получает " + kristinaUp + " рублей.Годовой доход вырос на " + kristinaTen + " рублей");
    }
}