import java.util.ArrayList;
import java.util.List;

public class Comedy extends Movie {
    private int ageRestriction;
    public Comedy(String name, String startTime, String howLong) {
        super(name, startTime, howLong);
        this.ageRestriction = 12;
    }
}
