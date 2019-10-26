package com.komarov884.vocabulator.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * IrregularVerb.
 *
 * @author Vasilii_Komarov
 */
@Data
@Document(collection = IrregularVerb.IRREGULAR_VERB_COLLECTION)
@Accessors(chain = true)
public class IrregularVerb {

    public static final String IRREGULAR_VERB_COLLECTION = "irregularVerbs";

    @Id
    private ObjectId id;

    private String infinitive;

    private String infinitiveTranscription;

    private String pastSimple;

    private String pastSimpleTranscription;

    private String pastPrinciple;

    private String pastPrincipleTranscription;

    private String meaning;

}
