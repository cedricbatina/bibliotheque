package catalog;

//All queries

public class SQLConstant {
  protected static final String SELECT_ALL_AUTHORS = "SELECT * FROM author";

  protected static final String SELECT_ALL_AUTHORS_BY_ID = "SELECT FROM" + "author where author_id=?";

  // book queries

  protected static final String SELECT_ALL_BOOKS = "SELECT * FROM book";

  protected static final String INSERT_BOOK = "INSERT INTO book (ISBN, "
      + "book_title, book_description, book_price, publication_date,"
      + "catalog_id, editor_id) VALUES (DEFAULT," + " ' ' ";

  // member queries

  protected static final String INSERT_MEMBER = "INSERT INTO member"
      + "(member_id, member_lastname, member_firstname, member_email,"
      + "(member_address, member_password) VALUES (DEFAULT, ?,?,?,?,'')";
  // connection queries

  protected static final String SELECT_MEMBER = "SELECT * FROM member WHERE "
      + "member_email = ? AND member_password = ?";
  protected static final String INSERT_AUTHOR = "INSERT INTO author( "
      + "author_id, author_lastname, author_firstname) VALUES (DEFAULT, ?,?) ";
  
  protected static final String UPDATE_AUTHOR = "UPDATE author SET "            
      +"author_lastname = ?, author_firstname=? WHERE author_id = ?"

}
