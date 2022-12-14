import java.sql.*;

public class JDBC02_Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "Suleyman42.");
        Statement st = con.createStatement();
        // String dropTable="drop table isciler";
        //   st.execute(dropTable);

        /* String createTable="create table isciler (id int, birim varchar(10) ,maas int )";

         st.execute(createTable);


        String insertData="insert into isciler values(80, 'ARGE',4000)";
        st.executeUpdate(insertData);  */
 /*=======================================================================
          ORNEK4: isciler tablosuna birden fazla yeni kayıt ekleyelim.

            INSERT INTO isciler VALUES(70, 'HR', 5000)
            INSERT INTO isciler VALUES(60, 'LAB', 3000)
            INSERT INTO isciler VALUES(50, 'ARGE', 4000)
         ========================================================================*/
       /* String[] inserts ={     "INSERT INTO isciler VALUES(70, 'HR', 5000)",
                                "INSERT INTO isciler VALUES(60, 'LAB', 3000)",
                               "INSERT INTO isciler VALUES(50, 'ARGE', 4000)"};
        int count=0;
        for (String each:inserts
             ) {
            st.executeUpdate(each);
            count++;
        }
        System.out.println(count+ " tane veri eklendi");*/
        /*
        String[] insert = {"INSERT INTO isciler VALUES(90, 'HR', 6000)",
                "INSERT INTO isciler VALUES(100, 'LAB', 4000)",
                "INSERT INTO isciler VALUES(110, 'ARGE', 5000)"};
        int count=0;
        for (String each : insert
        ) {
            st.addBatch(each);
            count++;
        }
        st.executeBatch();
        System.out.println(count+ " tane veri eklendi"); */

        String updateMaas="UPDATE isciler SET maas=maas*1.1 WHERE maas<5000";

        st.executeUpdate(updateMaas);

        con.close();
        st.close();

        }
    }
