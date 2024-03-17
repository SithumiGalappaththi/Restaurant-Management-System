package com.example.cafeshop.restImpl;

import com.example.cafeshop.rest.DashBoardRest;
import com.example.cafeshop.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DashBoardRestImpl implements DashBoardRest {

    @Autowired
    DashBoardService dashBoardService;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        return dashBoardService.getCount();
    }
}
