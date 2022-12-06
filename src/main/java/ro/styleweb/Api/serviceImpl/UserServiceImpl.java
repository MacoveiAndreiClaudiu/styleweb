package ro.styleweb.Api.serviceImpl;

import org.springframework.stereotype.Service;
import ro.styleweb.Api.doa.UserDOA;
import ro.styleweb.Api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDOA getUser() {
        return new UserDOA(
                1,
                "Macovei",
                "Andrei",
                "contact@styleweb.ro",
                "5f4dcc3b5aa765d61d8327deb882cf99"
        );
    }
}
