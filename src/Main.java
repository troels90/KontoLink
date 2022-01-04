import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String args[]){

        Overview ov = new Overview();
        OverviewTransformer ot = new OverviewTransformer();

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Project> projects = new ArrayList<>();
        ArrayList<TimeLog> timelogs = new ArrayList<>();
        customers.add(new Customer(){{
            name="Ole";
            id=1;
        }});
        projects.add(new Project(){{
            id=2;
            customerId=1;
            projectName="Kaffe";
        }});
        timelogs.add(new TimeLog(){{
            id=3;
            projectId=2;
            timeSpent=23;
            date=new Date();
        }});
        timelogs.add(new TimeLog(){{
            id=4;
            projectId=2;
            timeSpent=10;
            date=new Date();
        }});

        ArrayList<OverviewCustomer> data = ot.TransformToOverview(customers, projects, timelogs);

        ov.printOverview(data);
    }
}
