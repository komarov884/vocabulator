package com.komarov884.vocabulator.service.impl;

import com.komarov884.vocabulator.domain.IrregularVerb;
import com.komarov884.vocabulator.dto.IrregularVerbDto;
import com.komarov884.vocabulator.exception.DocumentNotFoundException;
import com.komarov884.vocabulator.repository.IrregularVerbRepository;
import com.komarov884.vocabulator.service.IrregularVerbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * IrregularVerbServiceImpl.
 *
 * @author Vasilii_Komarov
 */
@Service
@RequiredArgsConstructor
public class IrregularVerbServiceImpl implements IrregularVerbService {
    //TODO: think about abstract service!
    private final IrregularVerbRepository repository;

    @Override
    public IrregularVerbDto findById(String id) {
        return mapToDto(repository.findById(id).orElseThrow(() -> new DocumentNotFoundException(""))); //TODO: add message!
    }

    @Override
    public List<IrregularVerbDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private IrregularVerbDto mapToDto(IrregularVerb irregularVerb) { //TODO: remove it and use some kind of mapper.
        return new IrregularVerbDto()
                .setId(irregularVerb.getId().toString())
                .setInfinitive(irregularVerb.getInfinitive())
                .setInfinitiveTranscription(irregularVerb.getInfinitiveTranscription())
                .setPastSimple(irregularVerb.getPastSimple())
                .setPastSimpleTranscription(irregularVerb.getPastSimpleTranscription())
                .setPastPrinciple(irregularVerb.getPastPrinciple())
                .setPastPrincipleTranscription(irregularVerb.getPastPrincipleTranscription())
                .setMeaning(irregularVerb.getMeaning());
    }
}
