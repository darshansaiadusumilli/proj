package com.sam.proj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface AccRepository extends CrudRepository<Account,Integer> {

     List<Account> findByName(String name);

     //Account delete(Integer id);



}



