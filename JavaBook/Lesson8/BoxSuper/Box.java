package Example.Lesson8.BoxSuper;

public class Box {
    // Законченная реализация класса BoxWeight
    private double width;
    private double height;
    private double depth;

    // Конструктор, применяемы для клонирования обьекта.
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // Конструктор, используемый в случае указания всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор , применяемый в случае, если рамеры вообще не указаны
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    // Конструктор, использованный в случае создания обьекта кубической коробки
    Box(double len) {
        width = height = depth = len;
    }
    //Вычислить и возвратить обьем
    double volume() {
        return width*height*depth;
    }
}

// Здесь класс Box расщиряется с целью включения члена weight
class BoxWeight extends Box {
    double weight;
    // Конструк применяемый для клонирования обьекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    // Конструктор используемый в случае сказания всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w , h , d);
        weight = m;
    }
    // Стандартный конструктор
    BoxWeight() {
        super();
        weight = -1;
    }
    // Конструктор используемый в случае создания обьекта кубической коробки
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
// Здесь класс Box расширяется для включения свойства цвета
class ColorBox extends Box {
    int color;
    ColorBox(double w, double h , double d, int c) {
        super(w,h,d);
        color = c;
    }
}