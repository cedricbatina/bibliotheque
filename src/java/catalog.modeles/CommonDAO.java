package catalog;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class CommonDAO <T>{

 protected Connection connection;

 public CommonDAO(Connection connection) {
  this.connection = connection;
 }

 // méthode de création @param object, return boolean

 public abstract T create(T object);

 // méthode pour effacer @param object @return boolean

 public abstract boolean delete(T object);

 // méthode de mise à jour
 public abstract boolean update(T object);

 // récuperer un objet à partir d'un champs de type int @param id @return T
 public abstract T findById(int id);

 // récupérer l'objet çà partir d'une chaîne de caractères @param name @return T

 public abstract T findByName(String name);

 // récupérer tous les objts en base de données @return ArrayList<T>

 public abstract ArrayList<T> findAll();

}
