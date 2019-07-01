package com.komarov884.vocabulator.repository;

import com.komarov884.vocabulator.domain.IrregularVerb;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * IrregularVerbRepository.
 *
 * @author Vasilii_Komarov
 */
public interface IrregularVerbRepository extends MongoRepository<IrregularVerb, String> {
}
