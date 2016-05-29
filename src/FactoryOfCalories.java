/**
 * Created by soham on 29/5/16.
 */
public class FactoryOfCalories {
    public Calories getCalories(String which) {
        if (which.equals(Constants.TODAY)) {
            return new CaloriesOfToday();
        } else if (which.equals(Constants.YESTERDAY)) {
            return new CaloriesOfPreviousDay();
        } else if (which.equals(Constants.WEEK)) {
            return new CaloriesWeekAgo();
        }
        return null;
    }
}
