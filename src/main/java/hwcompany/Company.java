package hwcompany;

public class Company {
    private String name;
    private String startDate;
    private String bullstat;


    public Company(String name, String startDate, String bullstat) {
        this.setName(name);
        this.setStartDate(startDate);
        this.setBullstat(bullstat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (!startDate.isEmpty()) {
            this.startDate = startDate;
        } else {
            System.out.println("Error: Start date cannot be empty!");
        }
    }

    public String getBullstat() {
        return bullstat;
    }

    public void setBullstat(String bullstat) {
        if (bullstat.length() == 10) {
            this.bullstat = bullstat;
        } else {
            System.out.println("Error: Invalid bullstat!");
        }
    }
}
