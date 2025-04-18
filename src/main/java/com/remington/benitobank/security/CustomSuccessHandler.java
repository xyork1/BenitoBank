package com.remington.benitobank.security;

import java.io.IOException;

import java.util.Collection;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler{
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException {

        String redirectURL = request.getContextPath();


        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        for (GrantedAuthority auth : authorities) {
            String rol = auth.getAuthority();

            if (rol.equals("ROLE_ADMIN")) {
                redirectURL += "/admin";
                break;
            } else if (rol.equals("ROLE_CLIENTE")) {
                redirectURL += "/cliente";
                break;
            } else if (rol.equals("ROLE_EMPLEADO")) {
                redirectURL += "/empleado";
                break;
            }
        }

        response.sendRedirect(redirectURL);
    }
}

