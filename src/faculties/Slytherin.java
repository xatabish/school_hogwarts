package faculties;

import service.PeopleService;

public class Slytherin extends PeopleService {
    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(String name, String lastName, String facultiet, int range, int powerMagic, int cunning, int determination, int ambition) {
        super(name, lastName, facultiet, range, powerMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , cunning = " + cunning +
                " , determination = " + determination +
                " , ambition = " + ambition ;
    }

}
