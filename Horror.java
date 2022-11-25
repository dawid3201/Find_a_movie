public class Horror extends Movie {
    private int ageRestriction;

    public Horror(String name, String startTime, String howLong) {
        super(name, startTime, howLong);
        this.ageRestriction = 16;
    }

}
