package com.example.demo.controller;

import com.example.demo.dto.ResponseDimoDTO;
import com.example.demo.service.DemoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagocelhsbc")
public class DemoAppController {
    String tituloDivisor = "------------- NUEVA OPERACIÓN -------------";
    private static final Logger log = LogManager.getLogger(DemoAppController.class);

    @Autowired
    DemoService demoService;

    @PostMapping("/altaCuentahsbc")
    public ResponseEntity<ResponseDimoDTO> altaDimoBanxico(){
        log.info(tituloDivisor);
        log.info("\t Inicia --- altaDimoBanxico()");
        ResponseDimoDTO responseEntity = demoService.altaDimoService();
        return new ResponseEntity(responseEntity, HttpStatus.OK);
    }
}
