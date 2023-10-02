package org.example;

public class Database {
    private Database(){};

    private static class DatabaseHolder{
        public static Database databaseInstance = new Database();
    }

    public static Database getInstance(){
        return DatabaseHolder.databaseInstance;
    }

    public static void fetchUsers () {
        System.out.println("Fetched users: [1, 2, 3]");
    }
}