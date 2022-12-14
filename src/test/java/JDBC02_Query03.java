import java.sql.*;

public class JDBC02_Query03 {


    // NOT1 : Sorgulama icin get ile istenirse sütun (field) ismini yazabilecegimiz gibi sutun index
    // (field olusturulma sirasina gore) yazilabilir.

    // NOT2 : Sorgumuzda SELECT'ten sonra sadece belli fieldlari dondurmesini istiyorsak
    // get ile cagirdigimiz field indexleri sorguda belirttigimiz sirayla ifade etmemiz gerekiyor

    /*=======================================================================
       ORNEK3: Maasi en yuksek 3 kisinin adini, yasadigi sehri ve maasini
        isim sirali listeyiniz.
     ========================================================================*/
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "Suleyman42.");
        Statement st= con.createStatement();
        String sorgu1=" select isim, sehir,maas from calisanlar order by maas desc  limit 3";
        ResultSet data2= st.executeQuery(sorgu1);
        while (data2.next()){
            System.out.println(data2.getString("isim")+ " "+data2.getString("sehir")+" "+data2.getInt("maas"));
    }

        data2.close();
        st.close();
        con.close();
}
}