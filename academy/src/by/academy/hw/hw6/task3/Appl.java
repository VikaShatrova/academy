package by.academy.hw.hw6.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Appl {

    public static void main(String[] args) throws IOException {
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("user1", "surname1", 22));
        arrayList.add(new User("user2", "surname2", 21));
        arrayList.add(new User("user3", "surname3", 20));
        arrayList.add(new User("user4", "surname4", 21));
        arrayList.add(new User("user5", "surname5", 22));
        arrayList.add(new User("user6", "surname6", 22));
        arrayList.add(new User("user7", "surname7", 21));
        arrayList.add(new User("user8", "surname8", 22));
        arrayList.add(new User("user9", "surname9", 21));
        arrayList.add(new User("user10", "surname10", 22));

        File dir = new File("users");
        if (!dir.exists()) {
            dir.mkdir();
        }

        for (User user : arrayList) {
            String filesName = user.getName() + "_" + user.getSurname() + ".txt";
            File userFile = new File(dir, filesName);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(userFile));
            try {
                out.writeObject(user);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } finally {
                out.close();
            }
        }
    }
}
