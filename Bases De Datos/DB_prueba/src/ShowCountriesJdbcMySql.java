import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Example of connection to MySql database using Java JDBC bridge.
 *
 * @author Jose
 */
public class ShowCountriesJdbcMySql {

    public static void main(String[] args) throws Exception {
        ShowCountriesJdbcMySql ap = new ShowCountriesJdbcMySql();
        ap.run();
    }

    private void run() {
        try {
            //load the driver (only once).
            DbConnect.loadDriver();
            //printMetadata();
            printCountries();
            pause();
            updateCountries();
            pause();
            printCountries();
//            insertANewCountry();
//            pause();
//            modifyACountry();
//            pause();
//            deleteACountry();
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }

    private void printMetadata() {
        System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
        try {
            //get a connection to database.
            Connection conn = DbConnect.getConnection();
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query and get a resultset.
                String query = "SELECT * FROM countries WHERE lifeexpectancy > 77";
                ResultSet res = stmt.executeQuery(query);
                //get and write metadata.
                ResultSetMetaData rsmd = res.getMetaData();
                int numCol = rsmd.getColumnCount();
//                System.out.println("Number of columns: " + rsmd.getColumnCount());
//                System.out.println("Label \t Name \t Type \t Type name \t Auto increment \t Null \t Precision");
//                for (int i = 0; i < numCol; i++) {
//                    System.out.print(rsmd.getColumnLabel(i + 1) + " \t ");
//                    System.out.print(rsmd.getColumnName(i + 1) + " \t ");
//                    System.out.print(rsmd.getColumnType(i + 1) + " \t ");
//                    System.out.print(rsmd.getColumnTypeName(i + 1) + " \t ");
//                    System.out.print(rsmd.isAutoIncrement(i + 1) + " \t ");
//                    System.out.print(rsmd.isNullable(i + 1) + " \t ");
//                    System.out.print(rsmd.getPrecision(i + 1) + " \t ");
//                    System.out.println("");
//                }
//                //write headers.
//                System.out.println("");
                for (int i = 0; i < numCol; i++) {
                    System.out.print(rsmd.getColumnLabel(i + 1) + "\t");
                }
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }

    private void insertANewCountry() {
        System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
        try {
            //get a connection to database.
            Connection conn = DbConnect.getConnection();
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query.
                String query
                        = "insert into countries values "
                        + "(null, 'Wonderland', 'Capital', 1000.0, 100000, 2500.0, 90)";
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.format("%d rows created\n", numRowsAffected);
                //close resources.
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }

    private void modifyACountry() {
        System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
        try {
            //get a connection to database.
            Connection conn = DbConnect.getConnection();
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query.
                String query
                        = "update countries set pib = 50000.0 where id=41";
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.format("%d rows updated\n", numRowsAffected);
                //close resources.
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }

    private void deleteACountry() {
        System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
        try {
            //get a connection to database.
            Connection conn = DbConnect.getConnection();
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query.
                String query
                        = "delete from countries where id=41";
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.format("%d rows deleted\n", numRowsAffected);
                //close resources.
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }

    private void pause() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press any key to continue...");
        sc.nextLine();
    }

    private void printCountries() {
        try {
            Connection conn = DbConnect.getConnection();
            if(conn !=null){
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query and get a resultset.
                String query = "SELECT * FROM countries WHERE lifeexpectancy > 77";
                ResultSet res = stmt.executeQuery(query);
                //iterate the resultset and write the rows.
                while (res.next()) {
                    //convert data to java format.
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String capital = res.getString("capital");
                    double surface = res.getDouble("surface");
                    int inhabitants = res.getInt("inhabitants");
                    double pib = res.getDouble("pib");
                    int lifeexpectancy = res.getInt("lifeexpectancy");
                    //instantiate a country object.
                    Country country = new Country(id, name, capital, surface, inhabitants, pib, lifeexpectancy);
                    //write data.
                    //System.out.println(country.toString());
                    System.out.println(
                    id + " \t" + name + " \t " + capital + " \t " + surface
                    + " \t " + inhabitants + " \t " + pib + " \t " + lifeexpectancy);
                }
                //close resources.
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateCountries() {
        System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
        try {
            //get a connection to database.
            Connection conn = DbConnect.getConnection();
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query.
                String query = "update countries set capital = 'Catalunya' where name='España'";//Capital de España a Catalunya.
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.format("%d rows updated\n", numRowsAffected);
                //close resources.
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }
}