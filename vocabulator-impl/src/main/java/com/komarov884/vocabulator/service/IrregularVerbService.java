package com.komarov884.vocabulator.service;

import com.komarov884.vocabulator.dto.IrregularVerbDto;

import java.util.List;

/**
 * IrregularVerbService.
 *
 * @author Vasilii_Komarov
 */
public interface IrregularVerbService {
    //TODO: revise all methods.
    IrregularVerbDto findById(String id);

    List<IrregularVerbDto> findAll();

    IrregularVerbDto findRandom();
}
