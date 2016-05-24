/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.quickstart.log4j.dao;
import com.artivisi.quickstart.log4j.dao.dao.main;

import org.apache.log4j.*;

/**
 *
 * @author Restu
 */
public class HelloWorldDao {
    private static final Logger logger  = Logger.getLogger(HelloWorldDao.class);
    

public void save() {
    logger.info("menjalankan save");
}

public void delete(Integer id){
    logger.info("ini menjalankan method delete");
    
    if (logger.isDebugEnabled()){
        logger.debug("ID : "+id);
    }
}

public void deleted(Integer id){
    logger.info("ini menjalankan delete");
    if(logger.isDebugEnabled()){
        logger.debug("ID :"+id);
    }
    if (id < 0){
        throw new IllegalArgumentException("id tidak boleh kuang dai satu");
    }
}
}
