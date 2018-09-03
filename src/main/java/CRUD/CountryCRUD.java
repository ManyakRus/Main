/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import BD.Country;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import IICRUD.IICountryCRUD;
import ICRUD.ICountryCRUD;

/**
 *
 * @author Пользователь2
 */
//@Service
public class CountryCRUD implements IICountryCRUD{
    @Autowired
    ICountryCRUD iCountryCrud;
    
    public Country findByCode(String code) {
        return iCountryCrud.findByCode(code);
    };
    
}
