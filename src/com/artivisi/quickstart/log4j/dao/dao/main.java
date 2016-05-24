/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.quickstart.log4j.dao.dao;
import org.apache.log4j.*;
import com.artivisi.quickstart.log4j.dao.HelloWorldDao;
import com.artivisi.quickstart.log4j.service.HelloWorldService;


/**
 *
 * @author Restu
 */
public class main {
    private static  Logger logger = Logger.getLogger(main.class);
    public static void main(String[] args) {
        logger.info("Mengintankan dao");
        HelloWorldDao dao = new HelloWorldDao();
        
        logger.info("menginstankan service");
        HelloWorldService service = new HelloWorldService();
        
        logger.debug("Melakukan method delete");
        service.deleteTheWorld(10);
    }
    
}
//iqbal restu maulana