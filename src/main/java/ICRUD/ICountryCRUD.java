/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICRUD;

import BD.Country;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Пользователь2
 */
//@Repository
public interface ICountryCRUD extends JpaRepository<Country, String> 
{

    Country findByCode(String code);
}
