package Example.Lesson8.BoxFinall;

public class Box {
    // В этой программе используется наследование для расширения класса Box.
    double width;
    double height;
    double depth;

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
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
// Здесь класс Box расширяется для включения свойства цвета
class ColorBox extends Box {
    int color;
    ColorBox(double w, double h , double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}