import java.lang.reflect.Array;
import java.util.ArrayList;

public class OverviewTransformer {

    public ArrayList<OverviewCustomer> TransformToOverview (ArrayList<Customer> customers,
                                                            ArrayList<Project> projects, ArrayList<TimeLog> timelog){
        ArrayList<OverviewCustomer> data = new ArrayList<>();


        for(int i = 0; i < customers.size(); i++){
            OverviewCustomer overviewModel = new OverviewCustomer();
            overviewModel.name = customers.get(i).name;

            for(int y = 0; y < projects.size(); y++){
                Project project = projects.get(y);
                if(projects.get(y).customerId == customers.get(i).id){
                    Projekt projectModel = new Projekt();
                    projectModel.projectName = project.projectName;

                    for(int x = 0; x < timelog.size(); x++){
                        if(project.id == timelog.get(x).projectId){
                            projectModel.time += timelog.get(x).timeSpent;
                        }
                    }
                    overviewModel.projects.add(projectModel);
                }
            }

            data.add(overviewModel);
        }



        return data;
    }

}
