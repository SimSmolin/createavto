import models.Avto;
import models.Creater;
import services.Service;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Service createrService = new Service();
        Creater creater = new Creater("Masha","conveer compiler");
        createrService.saveCreater(creater);
        Avto ferrari = new Avto("Ferrari", "red");
        ferrari.setCreater(creater);
        creater.addAvto(ferrari);
        Avto ford = new Avto("Ford", "black");
        ford.setCreater(creater);
        creater.addAvto(ford);
        createrService.updateCreater(creater);

        ford.setCreater(creater);
        creater.addAvto(ford);
        createrService.updateCreater(creater);
        creater.setName("Masha");
        createrService.updateCreater(creater);
        createrService.deleteCreater(creater);
/*
        createrService.deleteCreater(creater);
*/
    }
}
