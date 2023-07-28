package catalog.javabeans;

public class Author {
 private int author_id;
 private String author_lastname;
 private String author_firstname;
 
 public Author (int author_id, String author_lastname, String author_firstname) {
     this.author_id = author_id;
     this.author_lastname = author_lastname;
     this.author_firstname = author_firstname;
     
 }
 public Author (String author_lastname, String author_firstname) {
     this.author_lastname = author_lastname;
     this.author_firstname = author_firstname;
     this.author_id = 0;
 }
 
 //getters and setters
 // return the author_id 
 public int getAuthor_id () {
     return author_id;
 }
 // set author_id
 public void setAuthor_id (int author_id) {
     this.author_id = author_id;
 }
 
 //return author_lastname
 public String getAuthor_lastname () {
     return author_lastname;
 }
 
//set author_lastname
 public void setAuthor_lastname (String author_lastname) {
     this.author_lastname = author_lastname;
 }
 
 //return author_fistname
 public String getAuthor_firstname () {
     return author_firstname;
 }
 
//set author_lastname
 public void setAuthor_firstname (String author_firstname) {
     this.author_firstname = author_firstname;
 }
}
