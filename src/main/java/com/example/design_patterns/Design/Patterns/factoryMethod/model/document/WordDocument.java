package com.example.design_patterns.Design.Patterns.factoryMethod.model.document;

import com.example.design_patterns.Design.Patterns.factoryMethod.util.DocumentType;
import org.springframework.stereotype.Component;

@Component("wordDocument")
public class WordDocument implements Document{
    @Override
    public DocumentType getClassIdentifier() {
        return DocumentType.DOCUMENT_IDENTIFIER_WORD;
    }

    @Override
    public void open() {
        System.out.println("WordDocument.open");
    }

    @Override
    public Document createDocument() {
        return null;
    }
}
