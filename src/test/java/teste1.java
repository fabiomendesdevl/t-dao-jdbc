import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) throws ParseException {
       // Department dp = new Department(2, "Fabio");
        //System.out.println(dp);

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date dt = sdf.parse(sc.next("10/10/2000"));

//        Seller sl = new Seller(1, "vendedor1", "fabio@gmail.com", new Date(), 1500.0, dp);
//        System.out.println(sl);

        SellerDao sellerDao  = DaoFactory.createSellerDao();
        System.out.println("=== Test number 1 FindById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);


        System.out.println("\n\n\n=== Test number 2 FindByDepartment ===");
        Department department= new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("\n\n\n=== Test number 3 Seller FindAll ===");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }
    }
}
