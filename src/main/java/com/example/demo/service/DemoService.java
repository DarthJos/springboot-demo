package com.example.demo.service;

import com.example.demo.dto.ResponseDimoDTO;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public ResponseDimoDTO altaDimoService() {
        ResponseDimoDTO responseAlta = new ResponseDimoDTO();
        responseAlta.setTipoPeticion("Alta");
        responseAlta.setEdoPet("0");
        responseAlta.setFolioPet("1234567890");
        responseAlta.setEstadoRegistro("0");
        return responseAlta;
    }
}
