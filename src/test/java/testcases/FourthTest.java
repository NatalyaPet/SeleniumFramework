import org.testng.annotations.Test;

public class FourthTest {
    @Test
    public void salaryTax(){
        boolean amount =true;
        int salary = 10275;
        String taxRate1 = "your tax will be 10% ";
        if(salary >= 10275 && amount == true){
        System.out.println(taxRate1);
}
        salary = 41775;
        String taxRate2 = "your tax will be 12% ";

        if((salary >= 10276 && salary < 41775) && amount == true);
        System.out.println(taxRate2);

        salary = 89075;
        String taxRate3 = "your tax will be 22% ";

        if((salary >= 41776 && salary < 89075) && amount == true);

        System.out.println(taxRate2);

        salary = 89076;
        String taxRate4 = "please call your CPA!";

        if(salary > 89075 && amount == true);
        System.out.println(taxRate4);
    }

    @Test
public void workingHours(){
    String department = "sales";
    switch (department){
        case "sales" :
            System.out.println("Sales department works from 8am to 12pm.");
        case "operations":
            System.out.println("Operations department works from 8am to 12pm");
        case "logistics":
            System.out.println("Logistics department works from 8am to 12pm");
        case "customer service":
            System.out.println("Customer service department works from 8am to 12pm");
        case "merchandise":
            System.out.println("Merchandise department works from 8am to 12pm");
        case "returns":
            System.out.println("Returns department works from 8am to 12pm");
        default:
            System.out.println("Please enter department name.");
    }
}

@Test
    public void forLoop() {
    for (int i = 1; i < 24; i++){
        i++;
        System.out.println(i);
    }

      }
}
