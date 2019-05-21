package com.lucatic.agenda.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({Exception.class, RuntimeException.class})
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        System.out.println(req.getRequestURL());
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Lo siento. No puedo encontrar lo que estás buscando." + ex.getMessage());
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
}