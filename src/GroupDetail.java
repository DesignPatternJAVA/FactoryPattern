/**
 * Created by soham on 29/5/16.
 */
public class GroupDetail {
    public static void main(String[] args){
        FactoryOfCalories factoryOfCalories=new FactoryOfCalories();
        Calories todayCalories=factoryOfCalories.getCalories(Constants.TODAY);
        printCalories(Constants.TODAY,todayCalories.calories());

        Calories yesterdayCalories=factoryOfCalories.getCalories(Constants.YESTERDAY);
        printCalories(Constants.YESTERDAY,yesterdayCalories.calories());

        Calories weekCalories=factoryOfCalories.getCalories(Constants.WEEK);
        printCalories(Constants.WEEK,weekCalories.calories());
    }

    private static void printCalories(String which, int calories){
        System.out.println(which+" calories is "+calories);
    }
}
