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

    @Override
    public String toString() {
        return super.toString() +
                " , smart = " + smart +
                " , wise = " + wise +
                " , creative = " + creative ;
    }

}
