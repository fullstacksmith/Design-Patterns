package com.example.design_patterns.Design.Patterns.factoryMethod.model.document;

import com.example.design_patterns.Design.Patterns.factoryMethod.util.DocumentType;

public interface Document {

    DocumentType getClassIdentifier();
    void open();
    Document createDocument();
}
