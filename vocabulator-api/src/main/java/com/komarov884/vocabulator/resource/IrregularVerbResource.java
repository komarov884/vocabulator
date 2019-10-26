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

    IrregularVerbDto findRandom();

    List<IrregularVerbDto> findAll(); //TODO: add pagination!

    IrregularVerbDto create(IrregularVerbDto dto);

    IrregularVerbDto update(IrregularVerbDto dto, String id);

    void deleteById(String id);

    //TODO: The resource mustn't provide an API for deleting of initial data!
    //TODO: But user should have opportunity to add new irregular verbs. And these verbs - deletable.
    //TODO: "Init-data" flag in document which doesn't exist in DTO ????

}
