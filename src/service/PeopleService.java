package service;

public abstract class PeopleService {
    private String name;
    private String lastName;
    private String facultiet;
    private int range;
    private int powerMagic;


    public void setRange(int range) {
        this.range = range;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getRange() {
        return range;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFacultiet(String facultiet) {
        this.facultiet = facultiet;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFacultiet() {
        return facultiet;
    }


}