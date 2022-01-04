import java.util.ArrayList;

public class Overview {

    public void printOverview(ArrayList<OverviewCustomer> data){

        for(int i = 0; i < data.size(); i++) {
            OverviewCustomer customer = data.get(i);
            System.out.println(customer.name);
            for(int y = 0; y < customer.projects.size(); y++){
                    Projekt project = customer.projects.get(y);
                    System.out.println("Project: " + project.projectName +
                            " -- Time: " + project.time);
            }
        }
    }
}
