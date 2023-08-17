package C16_Linkedin_Lambda.lambdasChallange;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    public String getFullName(Employee employee) {
        Function<Employee, String> fullName = (Employee e) -> e.getFirsName()+ " "+ e.getLastName();
        return fullName.apply(employee);
    }

    public String getManagerLastName(Employee employee){
        Function<Employee, String> managerLastName= (Employee e) -> e.getManager().getLastName();
        return managerLastName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee){
        Predicate<Employee> employedLongerThanFiveYears=(Employee e) -> (e.getYearsOfService()>5)? true: false;
        return employedLongerThanFiveYears.test(employee);
    }

    public boolean hasMoreThanThreeDirectReports(Employee employee){
        Predicate<Employee> moreThanThreeDirectReports=(Employee e ) ->(e.getNumberOfDirectReports()>3)? true: false;
        return moreThanThreeDirectReports.test(employee);

        }
    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee){
        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports=(Employee e) ->
                ((e.getYearsOfService()>3) && (e.getNumberOfDirectReports()>2))? true : false;
        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }

}
