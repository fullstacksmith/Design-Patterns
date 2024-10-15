package com.example.design_patterns.Design.Patterns.factoryMethod.model.document;

import com.example.design_patterns.Design.Patterns.factoryMethod.util.DocumentType;
import org.springframework.stereotype.Component;

@Component("textDocument")
public class TextDocument implements Document{
    @Override
    public DocumentType getClassIdentifier() {
        return DocumentType.DOCUMENT_IDENTIFIER_TEXT;
    }

    @Override
    public void open() {
        System.out.println("TextDocument.open");
    }

    @Override
    public Document createDocument() {
        return null;
    }
}
