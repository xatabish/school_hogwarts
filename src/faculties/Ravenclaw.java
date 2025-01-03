package faculties;

import service.PeopleService;

public class Ravenclaw extends PeopleService {
    private int smart;
    private int wise;
    private int creative;
    public Ravenclaw(String name, String lastName, String facultiet, int range, int powerMagic, int smart, int wise, int creative) {
        super(name, lastName, facultiet, range, powerMagic);
        this.smart = smart;
        this.wise = wise;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getCreative() {
        return creative;
    }

    public void comparison (Ravenclaw people1 , Ravenclaw people2) {
        int allStats1 = people1.getWise() + people1.getSmart() + people1.getCreative();
        int allStats2 = people2.getWise() + people2.getSmart() + people2.getCreative();
        if (allStats1 > allStats2) {
            System.out.println(people1.getName() + people1.getLastName() + " сильнее чем  " + people2.getName() + people2.getLastName()  );
        } else {
            System.out.println(people2.getName() + people2.getLastName() + " сильнее чем  " + people1.getName() + people1.getLastName()  );
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                " , smart = " + smart +
                " , wise = " + wise +
                " , creative = " + creative ;
    }

}
