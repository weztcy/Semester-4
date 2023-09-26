package inventori_barang;

public class Session_Employee {

    private static int employee_id;
    private static String employee_username;
    private static String employee_name;
    private static String employee_status;

    public static int getEmployee_id() {
        return employee_id;
    }

    public static void setEmployee_id(int employee_id) {
        Session_Employee.employee_id = employee_id;
    }

    public static String getEmployee_username() {
        return employee_username;
    }

    public static void setEmployee_username(String employee_username) {
        Session_Employee.employee_username = employee_username;
    }

    public static String getEmployee_name() {
        return employee_name;
    }

    public static void setEmployee_name(String employee_nama) {
        Session_Employee.employee_name = employee_nama;
    }

    public static String getEmployee_status() {
        return employee_status;
    }

    public static void setEmployee_status(String employee_status) {
        Session_Employee.employee_status = employee_status;
    }
}
