package com.amdocs.jshapi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.amdocs.jshapi.domain.Account;
import com.amdocs.jshapi.service.AccountDetailsService;

@Controller
public class TokenController {
    
    @Autowired
	private DefaultTokenServices defaultTokenServices;
     
    @Autowired
    private AccountDetailsService accountDetailsService;
     
    @RequestMapping(method = RequestMethod.POST, value = "/tokens/revoke/{tokenId:.*}")
    @ResponseBody
    public String revokeToken(@PathVariable String tokenId) {
        defaultTokenServices.revokeToken(tokenId);
        return tokenId;
    }
    
    
}

