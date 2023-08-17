//package C16_Linkedin_Lambda.test;
//
//import C16_Linkedin_Lambda.lambdasChallange.Employee;
//import C16_Linkedin_Lambda.lambdasChallange.EmployeeUtils;
//import static org.assertj.core.api.Assertions.assertThat; // Import for assertions
//import org.junit.jupiter.api.Test; // Import for @Test annotation
//
//public class EmployeeTest {
//    private EmployeeUtils employeeUtils=new EmployeeUtils();
//
//    @Test
//    void employeeFullName(){
//        Employee employee=new Employee();
//        employee.setFirsName("Jerome");
//        employee.setLastName("Donaldson");
//
//        String actual=employeeUtils.getFullName(employee);
//        assertThat(actual).isEqualTo("Jerome Donaldson");
//    }
//
//    @Test
//    void employeeManagerLastName(){
//        Employee employee1=new Employee();
//        Employee employee2=new Employee();
//        employee2.setLastName("Westbay");
//        employee1.setManager(employee2);
//
//        String actual=employeeUtils.getManagerLastName(employee1);
//
//        assertThat(actual).isEqualTo("Westbay");
//
//    }
//
//    @Test
//    void employeeInEmploymentLongerThanFiveYears(){
//        Employee employee=new Employee();
//        employee.setYearsOfService(20);
//
//        Boolean actual=employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);
//
//        assertThat(actual).isTrue();
//    }
//
//    @Test
//    void employeeHasMoreThanThreeDirectReports(){
//        Employee employee=new Employee();
//        employee.setNumberOfDirectReports(5);
//
//        Boolean actual=employeeUtils.hasMoreThanThreeDirectReports(employee);
//
//        assertThat(actual).isTrue();
//    }
//
//    @Test
//    void employeeMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(){
//        Employee employee=new Employee();
//        employee.setYearsOfService(5);
//        employee.setNumberOfDirectReports(1);
//
//        Boolean actual=employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);
//
//        assertThat(actual).isTrue();
//    }
//
//
//
//
//
//
//}
