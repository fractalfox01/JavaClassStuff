public class Bank {

    private String _acctNumber;
    private String _custName;
    private String _custEmail;
    private String _custPhone;
    private double _custBalance;

    public Bank() {
        System.out.println("Null Account Created\n");
    }

    public Bank(String _acctNumber, String _custName, String _custEmail, String _custPhone, double _custBalance) {

        this._acctNumber = _acctNumber;
        this._custName = _custName;
        this._custEmail = _custEmail;
        this._custPhone = _custPhone;
        this._custBalance = _custBalance;
        System.out.println("New Account Created:\n" + "Name: " + this._custName + "\nAcct# " + this._acctNumber + "\n");
    }

    public Bank(String _custName, String _custEmail, String _custPhone) {
        this("Un-Assigned", _custName, _custEmail, _custPhone, 0.00);
        set_acctNumber("Un-Assigned");
    }

    /**
     * Customer Account Number:
     *//////////////////////////////////////
    public void set_acctNumber(String _acctNumber) {
        String tempAcct = "Ac";
        String tempName = this.get_custName();
        String tempPhone = this.get_custPhone();
        String tempEmail = this.get_custEmail();
        // Ac001234-56
        if (this._custName == "Null") {

        } else {
            this._acctNumber = _acctNumber;
        }
        if (this._acctNumber == "Un-Assigned") {
            tempAcct += tempName.charAt(0);
            tempAcct += tempEmail.charAt(0);
            tempAcct += tempPhone.charAt(8);
            tempAcct += tempPhone.charAt(9);
            tempAcct += tempPhone.charAt(10);
            tempAcct += tempPhone.charAt(11) + "-";
            tempAcct += "AS";

            this._acctNumber = tempAcct;
        }
    }

    public String get_acctNumber() {
        return _acctNumber;
    }

    /**
     * Customer Name:
     *//////////////////////////////////////
    public void set_custName(String custName) {
        this._custName = custName;
    }

    public String get_custName() {
        return _custName;
    }

    /**
     * Customer E-Mail
     *//////////////////////////////////////
    public void set_custEmail(String custEmail) {
        this._custEmail = custEmail;
    }

    public String get_custEmail() {
        return _custEmail;
    }

    /**
     * Customer Phone Number
     *//////////////////////////////////////
    public void set_custPhone(String _custPhone) {
        this._custPhone = _custPhone;
    }

    public String get_custPhone() {
        return _custPhone;
    }

    /**
     * Customer Account Balance
     */
    public void set_custBalance(double _custBalance) {
        this._custBalance = _custBalance;
    }

    public double get_custBalance() {
        return _custBalance;
    }

    public String depositFunds(double depositAmount) {
        System.out.println("Deposit of an Amount of $" + depositAmount + " to Acct# " + this._acctNumber + " Attempted");
        System.out.println("Previous Balance: $" + this._custBalance);
        if (this._custName != null && this._acctNumber != null) {
            this._custBalance = this._custBalance + depositAmount;
        } else {
            System.out.println("Account Setup Not Complete - Required Fields Missing");
        }
        return ("Total funds for Acct# " + this._acctNumber + " are:\n\tTotal: $" + this._custBalance + "\n");
    }

    public String deductFunds(double deductAmount) {
        System.out.println("Dedction of an Amount of $" + deductAmount + " from Acct# " + this._acctNumber + " Attempted");
        System.out.println("Previous Balance: $" + this._custBalance);
        if (this._custBalance - deductAmount >= 0) {
            this._custBalance -= deductAmount;
            return ("Total funds for Acct# " + this._acctNumber + " are:\n\tTotal: $" + this._custBalance + "\n");
        } else {
            return ("Insufficient Funds\n");
        }
    }

}
