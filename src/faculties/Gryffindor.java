package faculties;


import service.PeopleService;

public class Gryffindor extends PeopleService {
    private int honor ;
    private int bravery;
    private int nobility;

    public Gryffindor(String name, String lastName, String facultiet,int powerMagic, int range, int honor, int bravery, int nobility) {
        super(name, lastName, facultiet,range , powerMagic);
        this.honor = honor;
        this.bravery = bravery;
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void comparison (Gryffindor people1 , Gryffindor people2) {
        int allStats1 = people1.getBravery() + people1.getHonor() + people1.getNobility();
        int allStats2 = people2.getBravery() + people2.getHonor() + people2.getNobility();
        if (allStats1 > allStats2) {
            System.out.println(people1.getName() + people1.getLastName() + " сильнее чем  " + people2.getName() + people2.getLastName()  );
        } else if (allStats2 >allStats1) {
            System.out.println(people2.getName() + people2.getLastName() + " сильнее чем  " + people1.getName() + people1.getLastName()  );
        }

    }


    @Override
    public String toString() {
        return super.toString() +
                " , honor = " + honor +
                " , bravery = " + bravery +
                " , nobility = " + nobility ;
    }

}