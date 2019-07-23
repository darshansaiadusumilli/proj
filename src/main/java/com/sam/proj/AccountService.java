package com.sam.proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountService {
    @Autowired
    AccRepository repository;
    public Account createAccount(Account account){
        return repository.save(account);
    }
    public List<Account> ListAll(){
        return (List<Account>) repository.findAll();
    }
  public List<Account> search(String key){
        return repository.findByName(key);
}
public Account update(Account account){
        return repository.save(account);
}
public void delete(Integer id){
       repository.deleteById(id);

}

}

