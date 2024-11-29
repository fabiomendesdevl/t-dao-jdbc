import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) throws ParseException {
        Department dp = new Department(2, "Fabio");
        //System.out.println(dp);

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date dt = sdf.parse(sc.next("10/10/2000"));

        Seller sl = new Seller(1, "vendedor1", "fabio@gmail.com", new Date(), 1500.0, dp);
        System.out.println(sl);
    }
}
