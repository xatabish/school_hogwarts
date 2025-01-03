package service;

public abstract class PeopleService {

    private String name;
    private String lastName;
    private String facultiet;
    private int range;
    private int powerMagic;

    public PeopleService(String name, String lastName, String facultiet, int range, int powerMagic) {
        this.powerMagic = powerMagic;
        this.range = range;
        this.name = name;
        this.lastName = lastName;
        this.facultiet = facultiet;
    }

    @Override
    public String toString() {
        return " имя = " + name +
                " , фамилия = " + lastName +
                " , факультет = " + facultiet +
                " , сила магии =  " + powerMagic +
                " , дальность магии  = " + range;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }



    public void comparisons(PeopleService other1, PeopleService other2) {
        int full1 = other2.range + other2.powerMagic;
        int full2 = other1.range + other1.powerMagic;

        String result = "";
        if (full1 > full2  ) {
            result = other1.getName() + " сильнее " + other2.getName();
        }
        else if (full2 > full1) {
            result = other1.getName() + " сильнее "  + other2.getName();
        } else if (full1 == full2) {
            System.out.println("они равны");
        }


        System.out.println(result);

    }

}