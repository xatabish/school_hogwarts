package faculties;

import service.PeopleService;

public class Hufflepuff extends PeopleService {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String lastName, String facultiet, int range, int powerMagic, int hardworking, int loyal, int honest) {
        super(name, lastName, facultiet, range, powerMagic);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , hardworking = " + hardworking +
                " , loyal = " + loyal +
                " , honest = " + honest ;
    }

}
