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


    @Override
    public String toString() {
        return super.toString() +
                " , honor = " + honor +
                " , bravery = " + bravery +
                " , nobility = " + nobility ;
    }

}