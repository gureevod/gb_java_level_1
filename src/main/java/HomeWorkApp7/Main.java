package HomeWorkApp7;

public class Main
{
    public static void main(String[] args)
    {
        Cat[] cats = {
                new Cat(5, "Пуся"),
                new Cat(7, "Тори"),
                new Cat(10, "Мякиш")
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }

        plate.increaseFood(50);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }
    }
}
