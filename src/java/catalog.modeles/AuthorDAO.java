package catalog;

import catalog.javabeans.Author;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

// interface d'accès au composant author @ author Cédric Batina

public class AuthorDAO extends CommonDAO<Author> {

 ArrayList<Author> authorList = new ArrayList<>();
 Author author = null;

 public AuthorDAO(Connection connection) {
  super(connection);
 }

 // récupérer un auteur à partir de son id @param id @return author
 public Author findAll(int author_id) {
  try {
   // creation of the PreparedStatement

   PreparedStatement statement = connection.prepareStatement(SQLConstant.SELECT_ALL_AUTHORS_BY_ID);

   // insert parameter at the location of the question mark in the SQL Query
   statement.setInt(1, author_id);

   // executing the preparedStatement
   ResultSet result = statement.executeQuery();

   if (result.next()) {
    // initialize author object
    author = new Author(result.getInt("author_id"), result.getString("author_lastname"),
      result.getString("author_firstname"));
   }

  } catch (SQLException ex) {
   Logger.getLogger(AuthorDAO.class.getName()).log(Level.SEVERE, null, ex);
  }
  return author;
 }

 @overrride
 public Author create (Author author) {
     try {
         //creation of the preparedStatement
         PreparedStatement statement = connection.prepareStatement(SQLConstant.INSERT_AUTHOR);
         //insert parameter at the location of the question mark in SQL query
         //statement.setString(1, "DEFAULT");
    statement.setString(1, author.getAuthor_lastname());
        statement.setString(2, author.getAuthor_firstname());
        //executing the preparedStatement
        int result = statement.executeUpdate();

     }  catch(SQLException ex) {
     Logger.getLogger(AuthorDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
     return author;
 }
 
   @override
 public boolean update(Author object) {
  try {
      // creation of the PreparedStatement
      PreparedStatement statement = connection.prepareStatement(SQLConstant.UPDATE_AUTHOR);
      
      //insert parameter at the location of the question mark in the SQL query
      //statement.setString (1, "DEFAULT");
      statement.setString(1,author.getAuthor_lastname());
      statement.setString(2,author.getAuthor_firstname());
      statement.setInt(3,author_getAuthor_id());
      //executing the preparedStatement
      statement.executeUpdate();
      statement.close();
  } catch(SQLException ex){
    Logger.getLogger(AuthorDAO.class.getName()).log(Level.SEVERE, null, ex);
} 
  return true;
 }
 
 
 @Override
 public Author findByName(String name) {
  // to do
 }

 @Override
 public ArrayList<Author> findAll() {
  try {
   ResultSet result = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).
   executeQuery(SQLConstant.SELECT_ALL_AUTHORS);
   if (result.first()) {
    result.first();
    // on initialise les objets authors
    author = new Author(result.getInt("author_id"), result.getString("author_lastname"),
      result.getString("author_firstname"));
    authorList.add(author);

    while (result.next()) {
     // on initialise les objets auteurs
     author = new Author(result.getInt("author_id"), result.getString("author_lastname"),
       result.getString("author_firstname"));
     authorList.add(author);

    }
   }
  } catch (SQLException ex) {
   Logger.getLogger(AuthorDAO.class.getName()).log(Level.SEVERE, null, ex);
  }
  return authorList;
 }
 


 @override
 public boolean delete(Author object) {
try {
    // creation of the PresparedStatement
  PreparedStatement statement = connection.PrepareStatement(SQLConstant.DELETE_AUTHOR);
  statement.setInt(1, author.getAuthor_id());
  //executing and close the preparedStatement
  
  statement.executeUpdate();
  statement.close();
 } catch(SQLException ex){
     Logger.getLogger(AuthorDAO.class.getName()).log(Level.SEVERE, null, ex);
 }
 return true;
         
         }


};
