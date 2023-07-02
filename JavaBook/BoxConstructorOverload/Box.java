package Example.BoxConstructorOverload;

class Box {
    // Здесь в классе Вох определены три конструктора для инициализации
    //размеров объекта коробки различными способами .
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) { //конструктор использованный в случае указания всех размеров
        width = w;
        height = h;
        depth = d;
    }

    Box () { // Конструктор , применяемый в случае если размеры вообще не указаны
        width = -1;   //Использовать -1 для обозначения
        height = -1;  // неинциализированого
        depth = -1;   // обьекта коробки
    }
    Box(double len) { //Конструктор использованный в случае создания обьекта кубика
        width = height = depth = len;
    }
    double volume() { //вычислить   и возвратить обьем
        return width * height * depth;
    }
}

