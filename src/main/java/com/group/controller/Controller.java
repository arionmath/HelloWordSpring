package com.group.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	  @RequestMapping(method = RequestMethod.GET, value = {"/aws","/"})
	  public String aws() {
	    return    "Hello, i am application that must be deployed on aws.<br>"
	    		+ "Published by Arion Mathias.";
	  }


}
