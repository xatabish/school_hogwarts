package faculties;

import service.PeopleService;

public class Hufflepuff extends PeopleService {
    private int hardworking;
    private int loyal;
    private int honest;

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public Hufflepuff(String name, String lastName, String facultiet, int range, int powerMagic, int hardworking, int loyal, int honest) {
        super(name, lastName, facultiet, range, powerMagic);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public void comparison (Hufflepuff people1 , Hufflepuff people2) {
        int allStats1 = people1.getHardworking() + people1.getHonest() + people1.getLoyal();
        int allStats2 = people2.getHardworking() + people2.getHonest() + people2.getLoyal();
        if (allStats1 > allStats2) {
            System.out.println(people1.getName() + people1.getLastName() + " сильнее чем  " + people2.getName() + people2.getLastName()  );
        } else {
            System.out.println(people2.getName() + people2.getLastName() + " сильнее чем  " + people1.getName() + people1.getLastName()  );
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                " , hardworking = " + hardworking +
                " , loyal = " + loyal +
                " , honest = " + honest ;
    }

}
