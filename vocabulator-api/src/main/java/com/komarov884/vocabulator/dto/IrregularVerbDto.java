package com.komarov884.vocabulator.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * IrregularVerbDto.
 *
 * @author Vasilii_Komarov
 */
@Data
@Accessors(chain = true)
public class IrregularVerbDto {

    private String id;

    private String infinitive;

    private String infinitiveTranscription;

    private String pastSimple;

    private String pastSimpleTranscription;

    private String pastPrinciple;

    private String pastPrincipleTranscription;

    private String meaning;

}
