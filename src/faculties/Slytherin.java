package faculties;

import service.PeopleService;

public class Slytherin extends PeopleService {
    private int cunning;
    private int determination;
    private int ambition;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public Slytherin(String name, String lastName, String facultiet, int range, int powerMagic, int cunning, int determination, int ambition) {
        super(name, lastName, facultiet, range, powerMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }
    public void comparison (Slytherin people1 , Slytherin people2) {
        int allStats1 = people1.getAmbition() + people1.getCunning() + people1.getDetermination();
        int allStats2 = people2.getAmbition() + people2.getCunning() + people2.getDetermination();
        if (allStats1 > allStats2) {
            System.out.println(people1.getName() + people1.getLastName() + " сильнее чем  " + people2.getName() + people2.getLastName()  );
        } else {
            System.out.println(people2.getName() + people2.getLastName() + " сильнее чем  " + people1.getName() + people1.getLastName()  );
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                " , cunning = " + cunning +
                " , determination = " + determination +
                " , ambition = " + ambition ;
    }

}
