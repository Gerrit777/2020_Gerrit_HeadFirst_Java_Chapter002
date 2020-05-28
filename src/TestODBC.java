import java.sql.*;  // bevat alle JDBC-materiaal

/** Demonstratieprogramma met enkele JDBC-opdrachten
 *   die een tabel creeren en er enkele rijen in
 *   wegschrijven.
 *   @author Lieven Smits
 *   @version 1.1 9/7/2000
 */
class TestODBC {
    /** Maak een verbinding met de ODBC-datasource
     *   "Kruidenier". Creeer een tabel "klant" en
     *   maak twee rijen in deze tabel.
     */
    public static void main(String[] args) {
        Connection con;
        Statement stmt;
        try {
            // driver in het geheugen laden
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // verbinding maken met data source "Kruidenier"
            con = DriverManager.getConnection(
                    "jdbc:odbc:Kruidenier", "", "");

            // opdrachtobject creeren; de opdrachtformulering volgt later
            stmt = con.createStatement();

      /* Maak een tabel met twee kolommen. De precieze vorm
         van dit SQL-statement is gericht op het MS Access-dialect
         van SQL. Normaal gezien (in ANSI SQL) zouden de woorden
         "CONSTRAINT PK" niet noodzakelijk mogen zijn. */
            int resultaat = stmt.executeUpdate(
                    "CREATE TABLE klant (klantnummer INTEGER CONSTRAINT"
                            + " PK PRIMARY KEY, naam CHAR(30))");
            System.out.println("resultaatwaarde van CREATE TABLE: "
                    + resultaat);

            // voeg eerste rij toe
            resultaat = stmt.executeUpdate(
                    "INSERT INTO klant (klantnummer, naam)"
                            + " VALUES (18, 'Smits')");
            System.out.println("aantal rijen toegevoegd:" + resultaat);

            resultaat = stmt.executeUpdate(
                    "INSERT INTO klant (klantnummer, naam)"
                            + " VALUES (19, 'Janssens')");
            System.out.println("aantal rijen toegevoegd:" + resultaat);

            stmt.close();
            con.close();
        }
        catch (Exception e) {
      /* Welke exception ook optreedt, we drukken ze gewoon
         af en stoppen ermee */
            System.out.println(e);
        }
    }
}
