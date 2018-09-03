/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IICRUD;

import BD.Country;

/**
 *
 * @author Пользователь2
 */
public interface IICountryCRUD {
    Country findByCode(String code);
    
}
