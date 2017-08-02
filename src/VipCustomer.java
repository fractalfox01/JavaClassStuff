import org.omg.CORBA.PUBLIC_MEMBER;

public class VipCustomer {
    private String vipName;
    private double vipLimit;
    private String vipEmail;
    private boolean IsAdmin;


    public VipCustomer() {
        this("Guest", 0.00, "guest@<this-site>.com");
        System.out.println("\n-----------------------------------WARNING!!! DEFAULT USER CREATED -----------------------------------" +
                "\n                       If this is intended, comment out  this print statement.");

    }

    public VipCustomer(String vipName, double vipLimit, String vipEmail) {

        System.out.println("\n\tNew VIP User Created\n");
        this.IsAdmin = false;
        this.vipName = vipName;
        this.vipLimit = setVipLimit(vipLimit);
        this.vipEmail = vipEmail;

        System.out.println("VIP UserName: " + this.vipName);
        System.out.println("VIP Spending Limit: $" + this.vipLimit);
        System.out.println("VIP User Email: " + this.vipEmail);
    }

    public VipCustomer(String vipName, String vipEmail) {
        this(vipName, 0.00d, vipEmail);
    }

    public String getVipName() {
        return this.vipName;
    }

    public double getVipLimit() {
        return this.vipLimit;
    }

    public double setVipLimit(double newLimit) {
        System.out.println(this.vipLimit);
        if (this.IsAdmin || (this.vipLimit <= 1000d)) {

            return newLimit;
        } else
            return 0.00d;
    }

    public String getVipEmail() {
        return vipEmail;
    }

    public boolean setAdmin(boolean adminVal) {
        if (adminVal == true) {
            if (this.vipName == "WebMaster-Thomas") {
                this.IsAdmin = true;
                //System.out.println("********Admin User*********");
            } else {
                System.out.println("\nInsufficient privilege");
                System.out.println("User " + this.getVipName() + " Will be logged\n");
            }

        } else {
            this.IsAdmin = false;

        }
        return this.IsAdmin;
    }

    public String getIsAdmin() {
        return ("Admin Status: " + this.IsAdmin);
    }
}

