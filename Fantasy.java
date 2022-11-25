public class Fantasy extends Movie{
    private int ageRestriction;
    public Fantasy(String name, String startTime, String howLong) {
        super(name, startTime, howLong);
        this.ageRestriction = 6;
    }
}
