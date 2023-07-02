package Example.BoxPassOb;

class Box {
    // Здесь класс Вох позволяет один объект инициализировать c другим
    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор, который принимает обьект типа Box
    Box(Box ob) { //передать обьект конструктору
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

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

