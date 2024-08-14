package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.dao.UserMongoDao;
import br.com.cod3r.bridge.mvc.dao.UserOracleDao;
import br.com.cod3r.bridge.mvc.dao.UserPostgresDao;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.UserEJB;
import br.com.cod3r.bridge.mvc.services.UserRest;
import br.com.cod3r.bridge.mvc.services.UserService;
import br.com.cod3r.bridge.mvc.services.UserSoap;

public class Client {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        User user = new User("user", "user@email.com", "passwd");

        UserDao dao = new UserMongoDao();
        UserService service = new UserEJB(dao);
        service.save(user);

        System.out.println("\n--------------\n");

        dao = new UserPostgresDao();
        service = new UserSoap(dao);
        service.save(user);

        System.out.println("\n--------------\n");

        dao = new UserOracleDao();
        service = new UserRest(dao);
        service.save(user);
    }
}
