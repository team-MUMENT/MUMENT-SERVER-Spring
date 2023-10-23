package com.mument.mument.core.mument.controller;

import com.mument.mument.core.mument.service.MumentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mument")
@AllArgsConstructor
public class MumentController {

    private final MumentService mumentService;
}
