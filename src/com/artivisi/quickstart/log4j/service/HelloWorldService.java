/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.quickstart.log4j.service;
import org.apache.log4j.*;
import com.artivisi.quickstart.log4j.dao.HelloWorldDao;

/**
 *
 * @author Restu
 */
public class HelloWorldService {
    private static final Logger logger = Logger.getLogger(HelloWorldService.class);
    private HelloWorldDao helloWorldDao;
    
    private void setHelloWorldDao(HelloWorldDao helloWorldDao){
        
    this.helloWorldDao = this.helloWorldDao;    }
    
    public void deleteTheWorld(Integer id){
        logger.log(Priority.WARN, "menjalankan methos delete the world");
        
        try {
            helloWorldDao.deleted(id);
        } catch (IllegalArgumentException e ) {
            logger.error(e.getMessage(), e);
                } {
        }
    }
    
    
    
    
}
