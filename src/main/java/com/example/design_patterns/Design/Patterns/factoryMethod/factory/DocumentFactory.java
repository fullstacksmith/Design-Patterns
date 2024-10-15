package com.example.design_patterns.Design.Patterns.factoryMethod.factory;

import com.example.design_patterns.Design.Patterns.factoryMethod.model.document.Document;
import com.example.design_patterns.Design.Patterns.factoryMethod.util.DocumentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DocumentFactory {

    private final Map<DocumentType, Document> documentMap;

    @Autowired
    private DocumentFactory(List<Document> services){
        documentMap = services.stream()
                .collect(Collectors.toMap(Document::getClassIdentifier, Function.identity()));
    }

    public Document getImplementation(DocumentType identifier) {
        return Optional.ofNullable(documentMap.get(identifier)).orElseThrow(IllegalArgumentException::new);
    }


}
