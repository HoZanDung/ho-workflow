package cn.com.ho.workflow.security.account;

import cn.com.ho.workflow.util.IdWorker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Account account = new Account();
        account.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
        account.setAccount(s);
        return account;
    }
}
