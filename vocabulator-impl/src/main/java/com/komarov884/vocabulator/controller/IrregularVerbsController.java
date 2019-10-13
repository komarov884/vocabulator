package com.komarov884.vocabulator.controller;

import com.komarov884.vocabulator.dto.IrregularVerbDto;
import com.komarov884.vocabulator.service.IrregularVerbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 * Created on 7/22/2019.
 *
 * @author Vasilii Komarov
 */
@Controller
@RequiredArgsConstructor
public class IrregularVerbsController {
    //todo: move on Java 13
    //todo: update dependencies
    private final IrregularVerbService irregularVerbService;

    @GetMapping("/irregular-verbs")
    public ModelAndView irregularVerbs(ModelAndView modelAndView) {
        List<IrregularVerbDto> irregularVerbs = irregularVerbService.findAll();
        modelAndView.setViewName("irregular-verbs");
        modelAndView.addObject("verb", irregularVerbs.get(0));
        return modelAndView;
    }

}
