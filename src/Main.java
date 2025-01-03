import faculties.Gryffindor;
import faculties.Hufflepuff;
import faculties.Ravenclaw;
import faculties.Slytherin;

public class Main {
    public static void main(String[] args) {
        Gryffindor people1 = new Gryffindor(" Гарри ", " Поттер ", " Гриффиндор ", 30, 30, 99, 56, 78);
        Gryffindor people2 = new Gryffindor(" Гермиона ", " Грейнджер ", " Гриффиндор ", 20, 20, 89, 46, 68);
        Gryffindor people3 = new Gryffindor(" Рон ", " Уизли ", " Гриффиндор ", 10, 10, 79, 36, 58);

        Slytherin people4 = new Slytherin(" Драко ", " Малфой ", " Слизерин ", 30, 30, 99, 56, 78);
        Slytherin people5 = new Slytherin(" Грэхэм ", " Монтегю ", " Слизерин ", 20, 20, 99, 56, 78);
        Slytherin people6 = new Slytherin(" Седрик ", " Диггори", " Слизерин ", 10, 10, 99, 56, 78);

        Hufflepuff people7 = new Hufflepuff(" Захария ", " Смит ", " Пуффендуй ", 30, 30, 99, 56, 78);
        Hufflepuff people8 = new Hufflepuff(" Седрик ", " Диггори ", " Пуффендуй ", 20, 20, 99, 56, 78);
        Hufflepuff people9 = new Hufflepuff(" Джастин ", " Финч-Флетчли ", " Пуффендуй ", 10, 10, 99, 56, 78);

        Ravenclaw people10 = new Ravenclaw(" Чжоу ", " Чанг ", " Когтевран ", 30, 30, 99, 56, 78);
        Ravenclaw people11 = new Ravenclaw(" Падма ", " Патил ", " Когтевран ", 20, 20, 99, 56, 78);
        Ravenclaw people12 = new Ravenclaw(" Маркус ", " Белби ", " Когтевран ", 10, 10, 99, 56, 78);
        System.out.println(people1.toString());

//                1. Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов. В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте каждому свойству произвольное числовое значение от 0 до 100.
//        2. Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
//        3. Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма свойств больше, считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
//        - Пример
//
//        Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
//
//                У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
//
//        4. Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
    }
}