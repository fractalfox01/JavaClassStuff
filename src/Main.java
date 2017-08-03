/**
 * Created by fox on 7/20/17.
 */
public class Main {
    public static void main(String[] args) {
        //switchEx.startEx();
        //forLoopsEx();
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("$ " + calculateInterest(10000, i) + "0");
//
        //forLoopsEx();
        //whileDo();
        //calculateInterest(1000,25);
        //bankStuff();
        //animal();
        //myVehicle();
        myComputer();

//        int value = 1;
//        if (value ==1){
//            System.out.println("Value was 1");
//        }
//        else if (value == 2){
//            System.out.println("Value is 2");
//        }
//        else {
//            System.out.println("Value was not 1 or 2");
//        }
//
//
//        int switchValue = 3;
//
//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, 4, or 5");
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }
//    }
//
//}

    }

    public static void forLoopsEx() {
        for (int i = 1; i < 6; i++) {
            System.out.println("I is " + i);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }

    public static void whileDo() {
        int count = 0;
        while (count != 5) {
            System.out.println("count is " + count);
            count++;
        }
        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("count is again " + count);
            count++;
        }
        count = 6; // setting to 6 will break following.
        do {
            System.out.println("count third was " + count);
            count++;
            // following fixes "6" problem :)
            if (count == 100) {
                break;
            }
        } while (count != 5);
    }

    public static void bankStuff() {
        /**
         *  Bank Exercise
         */////////////////////////////////////////////////////
        //Bank cust1 = new Bank();
//        Bank customer1 = new Bank("Thomas Vandivier", "flgtom@aol.com", "928-707-2057");
//        System.out.println(customer1.get_custEmail());
//        System.out.println(customer1.get_custBalance());
//        System.out.println(customer1.get_acctNumber());
//        Bank customer2 = new Bank("Jim", "jim@google.com", "928-123-4567");
//        System.out.println(customer2.get_acctNumber());
//        Bank customer3 = new Bank();
//        System.out.println(customer3.get_acctNumber());
        //VipCustomer vip1 = new VipCustomer();
//        VipCustomer masterTom = new VipCustomer("WebMaster-Thomas", 999999999, "webmaster@coderealms.spiraledthoughts.com");
//        masterTom.setAdmin(true);
//        System.out.println(masterTom.getIsAdmin());
//        VipCustomer testvip = new VipCustomer("thomas", 10000000, "thomas@hacker.com");
//        //testvip.setAdmin(true);
//        System.out.println(testvip.getVipLimit());
//        System.out.println(testvip.getIsAdmin());
        //System.out.println(testvip.setAdmin(true));
        //VipCustomer vip3 = new VipCustomer("Joe", "Joey@place.com");
        //System.out.println(vip3.getVipLimit());
        //System.out.println(vip1.getVipName());
        //        Bank cust2 = new Bank();
        //        cust2.set_acctNumber("Ac002169-04");
        //        cust2.set_custName("tom");
        //        cust2.set_custBalance(550);
        //
        //        System.out.println(cust2.depositFunds(50));
        //
        //        Bank cust3 = new Bank("Ac005543-83","Thomas", "", "928-123-1234", 50000);
        //        Bank cust4 = new Bank("","","","",0);
        //        System.out.println(cust3.depositFunds(100000));
        //        System.out.println(cust4.depositFunds(9999999));

        /**
         *  Customer Number 1
         */
        //cust1.set_custName("tommy");
        //cust1.set_custBalance(420);
        //cust1.set_acctNumber("Ac001629-43");
        //cust1.set_custEmail("happy@stuff.com");
        //cust1.set_custPhone("928-420-4200");

        /**
         *  Customer Number 2
         */
        //cust2.set_acctNumber("Ac002169-04");
        //cust2.set_custName("tom");
        //cust2.set_custBalance(550);

        //System.out.println(cust1.depositFunds(1420));
        //System.out.println(cust1.deductFunds(1000));
        //System.out.println(cust2.deductFunds(750));


        /**
         * End Bank Exercise
         *///////////////////////////////////////////////////////
    }

    public static void animal() {
        Animal wolf = new Animal("Grey Wolf", 50, 50, 50, 50);
        System.out.println("Body Size: " + wolf.getBody());
        System.out.println("Brain Size: " + wolf.getBrain());
        Animal nullAnimal = new Animal();
        System.out.println("Name: " + nullAnimal.getName());
        Dog dog = new Dog("collie", 1, 1, 0, 0, 1, 1, "spiky");
        System.out.println(dog.eat());

    }

    public static void vehicle() {

//        Vehicle testVehicle = new Vehicle("Four", "Two", "Two", "Four");
//        System.out.println("Windows: " + testVehicle.getWheels());
//        System.out.println("Doors: " + testVehicle.getDoors());
//        System.out.println("Seats: " + testVehicle.getSeats());
//        System.out.println("Wheels: " + testVehicle.getWheels());
//        String direction = "RiGhT";
//        String s = direction;
//        testVehicle.steering(s);
        UglyDuck newDuck = new UglyDuck();
        System.out.println("Seat Count: " + newDuck.getSeats());
        //newDuck.steering("right");

        newDuck.speed(15);
        newDuck.steering("left");
        newDuck.steering("forward");

        newDuck.speed(25);
        newDuck.gear("down");
        newDuck.speed(10);
        newDuck.gear("up");
        newDuck.speed(25);
        newDuck.gear("up");
        newDuck.speed(50);
        newDuck.gear("up");
        newDuck.speed(60);
        //System.out.println(newDuck.getCurSpeed());
    }

    public static void myVehicle() {

        StingRay mysting = new StingRay();
        System.out.println(mysting.getGetInfo());
        System.out.println(mysting.getName());
//        mysting.changeSpeed(25);
//        mysting.changeGear(1);
//        mysting.changeDirection("South");
    }

    public static void myComputer(){
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case thecase = new Case("2288", "Dell","240", dimensions);

        Monitor theMoniter = new Monitor("27inch Beast","Acer", 27,new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        Pc thePc = new Pc(thecase, theMoniter, theMotherboard);
        thePc.powerUp();
    }
}
