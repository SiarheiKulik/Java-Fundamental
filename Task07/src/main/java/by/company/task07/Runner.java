/*4. Цветочница.

        Определить иерархию цветов.
        создать класс цветок, можно сделать абстрактным и унаследовать от него несколько классов конкретных цветов
        (тюльпан, роза и т.д.), можно пойти дальше и сверху иерархии внести еще несколько градаций, например полевые,
        тепличные, что то в этом роде

        Создать несколько объектов-цветов.

        Собрать букет (используя аксессуары) с  определением его стоимости.

        Провести сортировку цветов в букете на основе уровня свежести.
        можно и без этих интерфейсов, через геттеры доступаешься к поле длинаСтебля и сортируешь, если можешь, то делай
        с comparable / comparator

        Найти цветок в  букете, соответствующий заданному диапазону длин стеблей.*/


package by.company.task07;

public class Runner {

    public static void main(String[] args) {
        Bouquet firstDateBouquet = new Bouquet(5, 3, 5, 7, true, true);
        System.out.println(firstDateBouquet.sortFlowersByFreshness());
        System.out.println(firstDateBouquet.findStemLength(7, 45));
        System.out.println(firstDateBouquet.getBouquetPrice());
    }

}
