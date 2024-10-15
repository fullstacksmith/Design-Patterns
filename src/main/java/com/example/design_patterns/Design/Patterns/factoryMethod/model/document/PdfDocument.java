package com.example.design_patterns.Design.Patterns.factoryMethod.model.document;

import com.example.design_patterns.Design.Patterns.factoryMethod.util.DocumentType;
import org.springframework.stereotype.Component;

import static com.example.design_patterns.Design.Patterns.factoryMethod.util.DocumentType.DOCUMENT_IDENTIFIER_PDF;

@Component("pdfDocument")
public class PdfDocument implements Document{

    @Override
    public DocumentType getClassIdentifier() {
        return DOCUMENT_IDENTIFIER_PDF;
    }

    @Override
    public void open() {
        System.out.println("PdfDocument.open");
    }

    @Override
    public Document createDocument() {
        return null;
    }
}
