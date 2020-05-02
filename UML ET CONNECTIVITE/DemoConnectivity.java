

                     //java data base connectivity




import java.sql.*;  //importing the package java.sql.*


public class DemoConnectivity {


	public static void main(String[] args)throws Exception {
	  //Paramétres de connexion: url,uname et pass
	 String url="jdbc:mysql//localhost:3307//DBusers"; 
	  String uname="root";
	  String pass="secret";
	  
	  //declaring sql queries variables:
	  String query1="CREATE Database IF NOT EXISTS  DBusers (id int,email varchar(255),password varchar(255),birthday varchar(255))";
	  String query2="USE DBusers";
	  Sting query3="CREATE TABLE User";
	  String query4="select*from User ";
	  String query5="INSERT INTO User VALUES(23,"John@gmail.com","Johnpassword","24/03/1960")";
	  String query6="DROP TABLE User";
		  
	  
      
	  
	 Class.forName("com.mysql.jdbc.Driver");      //class.forname =()methode pour enregistrer  SQl driver
     
	  
	 Connection con=DriverManger.getConnection(url,uname,pass);  //etablir la connexion:1)créer un objet connexion.
    
	 Statement st=con.createStatment();                          // 2)créer le Statement avec la variable statement
     
     //execution des queries//
    
     Result1 rs1=st.executeUpdate(query1);                         
     Result2 rs2=st.executeUpdate(query2);                         
     Result3 res3=st.executeUpdate(query3);                          
     
     Result4 res4=st.executeQuery(qyery);                             
     rs4.next();
     
     Result5 rs5=st.executeUpdateUpdate(query5);  
     
     Resultat6 res6=st.executeUpdate(query6);
                                                      
     
     
     st.colse;                                                           //fermer le statement
     con.close();                                                     //fermer la connexion
	}

}
