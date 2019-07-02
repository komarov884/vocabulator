package com.komarov884.vocabulator.resource;

import com.komarov884.vocabulator.dto.IrregularVerbDto;

import java.util.List;

/**
 * IrregularVerbResource.
 *
 * @author Vasilii_Komarov
 */
public interface IrregularVerbResource {
    // TODO: remove create and delete methods, revise all other methods! it's temporal API for testing.
    IrregularVerbDto findById(String id);

    List<IrregularVerbDto> findAll(); //TODO: add pagination!

    IrregularVerbDto create(IrregularVerbDto dto);

    IrregularVerbDto update(IrregularVerbDto dto, String id);

    void deleteById(String id);

}
