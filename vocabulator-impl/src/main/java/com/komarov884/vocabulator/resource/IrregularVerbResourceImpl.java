package com.komarov884.vocabulator.resource;

import com.komarov884.vocabulator.dto.IrregularVerbDto;
import com.komarov884.vocabulator.service.IrregularVerbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * IrregularVerbResourceImpl.
 *
 * @author Vasilii_Komarov
 */
@CrossOrigin //TODO: read about it
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v0.1/irregular-verbs")
public class IrregularVerbResourceImpl implements IrregularVerbResource {

    private final IrregularVerbService service;

    @Override
    @GetMapping("/{id}")
    public IrregularVerbDto findById(@PathVariable String id) {
        return service.findById(id);
    }

    @Override
    @GetMapping
    public List<IrregularVerbDto> findAll() {
        return service.findAll();
    }

    @Override
    public IrregularVerbDto create(IrregularVerbDto dto) {
        return null; //TODO: implement!
    }

    @Override
    public IrregularVerbDto update(IrregularVerbDto dto, String id) {
        return null; //TODO: implement!
    }

    @Override
    public void deleteById(String id) {
        //TODO: implement!
    }
}
