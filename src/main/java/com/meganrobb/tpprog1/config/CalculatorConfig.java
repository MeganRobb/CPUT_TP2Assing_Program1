/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.tpprog1.config;

import com.meganrobb.tpprog1.service.Impl.CalculatorService;
import com.meganrobb.tpprog1.service.Impl.CalculatorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class CalculatorConfig {
    @Bean (name = "Calc")
    public CalculatorService getService()
    {
        return new CalculatorServiceImpl();
    }
    
}
