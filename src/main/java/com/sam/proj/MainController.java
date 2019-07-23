package com.sam.proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import sun.net.sdp.SdpSupport;

import javax.validation.Valid;

import java.util.Arrays;
import java.util.List;
@RestController
public class MainController {
    @Autowired
    RestTemplate resttemplate;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Account> welcome(){
     List<Account> accountList=accountService.ListAll();

        ResponseEntity<Sdetails[]> response=resttemplate.getForEntity("http://localhost:8080/wel",Sdetails[].class);
        response.getStatusCode();
        System.out.println(response);
        Sdetails[] student =response.getBody();
        System.out.println(Arrays.asList(student));
        return accountList;
    }

    @Autowired
AccountService accountService;
    @RequestMapping(value = "/accou",method = RequestMethod.POST)
public Account createAccount(@Valid  @RequestBody Account account) {
  Account aco = accountService.createAccount(account);
   return aco;

}
@GetMapping ("/sea")
public List<Account> search(@RequestParam String key)  {
        List<Account> result=accountService.search(key);
    System.out.println(key);
        return  result;
}
 @RequestMapping(value = "/update" ,method = RequestMethod.PUT)
    public Account update(@RequestBody Account account){
        accountService.update(account);
        return account;
 }

@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
   accountService.delete(id);

 }
}

