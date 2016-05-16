package Dao;

public class Factory {
    private static Factory instanse = new Factory();

    public UserDao userDao;
    public UserDetailDao userDetailDao;

    private Factory() {
    }

    public static Factory getInstanse() {
        return Factory.instanse;
    }

    public UserDao getUserDao() {
        if (userDao == null)
            userDao = new UserDao();
        return userDao;

    }

    public UserDetailDao getUserDetailDao() {
        if (userDetailDao == null) userDetailDao = new UserDetailDao();
        return userDetailDao;
    }
}
