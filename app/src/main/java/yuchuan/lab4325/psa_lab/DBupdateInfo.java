package yuchuan.lab4325.psa_lab;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by root on 10/14/15.
 */
public class DBupdateInfo {
    public static void updateDB(int InterId, double dis, double speed, double acc, int status, int remainTime, double minSpeed, double maxSpeed){
        try
        {
            Connection con=DBconnection.getConnection();
            PreparedStatement psta;
            psta = con.prepareStatement("insert into `field_data_result` (`InterId`, `distance`, `speed`, `acc`, `signal`, `remaintime`,`minspeed`,`maxspeed`) values ("
                    +InterId+","+dis+","+speed+","+acc+","+status+","+remainTime+","+minSpeed+","+maxSpeed+");");
//            ResultSet rs =
              psta.executeUpdate();
//            if(rs.next())
//                System.out.println("Success insert!"+rs.getString(1));
//            ;
//            rs.close();
            psta.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }


}
