package es.iesnervion.diana.exampleroom.UserDao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import es.iesnervion.diana.exampleroom.Entities.User;

@Dao
public interface UserDao {

    //Obtiene todos los usuarios
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE firstName LIKE :firstName AND :lastName LIKE :lastName")
    User findByName(String firstName, String lastName);

    @Query("SELECT COUNT(*) FROM user")
    int countUsers();

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);

}
