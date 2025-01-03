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
        System.out.println(people1);
        people5.comparison(people6 ,people4);
        people1.comparison(people3, people2);
        people8.comparison(people9,people7);
        people11.comparison(people12,people10);
        people1.comparisons(people10 , people2);

    }
}