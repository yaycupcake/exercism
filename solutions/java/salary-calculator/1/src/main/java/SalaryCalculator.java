public class SalaryCalculator {
    private static double BASE_SALARY = 1000.00;
    private static int DAYS_SKIPPED_THRESHOLD = 5;
    private static int STANDARD_SALARY_PERCENTAGE = 1;
    private static double REDUCED_SALARY_PERCENTAGE = 0.85;
    private static int PRODUCTS_SOLD_THRESHOLD = 20;
    private static int STANDARD_PRODUCTS_SOLD_MULTIPLIER = 10;
    private static int INCREASED_PRODUCTS_SOLD_MULTIPLIER = 13;
    private static double FINAL_SALARY_MAXIMUM = 2000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= DAYS_SKIPPED_THRESHOLD ? REDUCED_SALARY_PERCENTAGE : STANDARD_SALARY_PERCENTAGE;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= PRODUCTS_SOLD_THRESHOLD ? INCREASED_PRODUCTS_SOLD_MULTIPLIER : STANDARD_PRODUCTS_SOLD_MULTIPLIER;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double multipliedSalary = BASE_SALARY * salaryMultiplier(daysSkipped);
        double multipliedSalaryWithBonus = multipliedSalary + bonusForProductsSold(productsSold);
        return multipliedSalaryWithBonus >= FINAL_SALARY_MAXIMUM ? FINAL_SALARY_MAXIMUM : multipliedSalaryWithBonus;
    } 
}
