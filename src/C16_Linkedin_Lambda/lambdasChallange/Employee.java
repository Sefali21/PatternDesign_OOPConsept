package C16_Linkedin_Lambda.lambdasChallange;

public class Employee {
    private String firsName;
    private String lastName;
    private int yearsOfService;
    private Employee manager;
    private int numberOfDirectReports;


    public String getFirsName() {  return firsName;    }

    public void setFirsName(String firsName) {  this.firsName = firsName;    }

    public String getLastName() {    return lastName;    }

    public void setLastName(String lastName) {    this.lastName = lastName;    }

    public int getYearsOfService() {    return yearsOfService;    }

    public void setYearsOfService(int yearsOfService) {  this.yearsOfService = yearsOfService;    }

    public Employee getManager() {   return manager;    }

    public void setManager(Employee manager) {  this.manager = manager;    }

    public int getNumberOfDirectReports() { return numberOfDirectReports;    }

    public void setNumberOfDirectReports(int numberOfDirectReports) { this.numberOfDirectReports = numberOfDirectReports;    }
}
