package com.mb.assignment.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.mb.assignment.constants.UrlMapping.BASE_URL;

@RestController
@CrossOrigin("*")
@RequestMapping(BASE_URL)
public class BaseController {

}
