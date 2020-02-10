package es.iesnervion.diana.exampleroom;

import androidx.annotation.NonNull;

import es.iesnervion.diana.exampleroom.Entities.User;

public class DataBaseInitializer {

    private static final String TAG = DataBaseInitializer.class.getName();

//    public static void populateAsync(@NonNull final AppDatabase db){
//        PopulateDbAsync task = new PopulateDbAsync(db);
//        task.execute();
//    }

    private static User addUser(final AppDatabase db, User user){
        db.userDao().insertAll();

        return user;
    }

    private static void populateWithTestData(AppDatabase db){
        User user = new User();
        user.setFirstName("Diana");
        user.setLastName("Bejarano");
        user.setAge(26);
        addUser(db, user);

    }



}
