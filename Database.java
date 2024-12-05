package registration;

import java.util.HashMap;

public class Database {

    public static HashMap<Integer, String[]> hm = new HashMap<Integer, String[]>();

    public static void addAdmin() {
        String[] adminRegInfos = {"admin", "admin", "admin123", "addmin1234", "", ",", ",", ""};
        int adminId = 1000;
        hm.put(adminId, adminRegInfos);
    }
}
