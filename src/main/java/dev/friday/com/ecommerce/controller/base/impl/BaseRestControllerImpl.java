package dev.friday.com.ecommerce.controller.base.impl;

import dev.friday.com.ecommerce.controller.base.BaseRestController;
import dev.friday.com.ecommerce.util.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Base rest controller for all base ecommerce endpoints
* */
@RestController
public class BaseRestControllerImpl implements BaseRestController {
    private final Utils utils;

    @GetMapping("/v1/status")
    public ResponseEntity<?> platformStatus() {
        return ResponseEntity.ok(utils.getPlatformStatus());
    }

    public BaseRestControllerImpl(Utils utils) {
        this.utils = utils;
    }
}
