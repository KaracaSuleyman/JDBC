import java.sql.*;

public class JDBC01_Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

      //1-
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "Suleyman42.");
        Statement st= con.createStatement();
        ResultSet data= st.executeQuery("SELECT isim,maas  FROM calisanlar WHERE sehir='Ankara' ORDER BY maas DESC");
        while (data.next()){
            System.out.println(data.getString("isim")+ " "+data.getInt("maas"));
        }

        data.close();
        st.close();
        con.close();
    }
}
