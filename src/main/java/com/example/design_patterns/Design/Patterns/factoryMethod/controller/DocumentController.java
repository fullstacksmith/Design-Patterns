package com.example.design_patterns.Design.Patterns.factoryMethod.controller;

import com.example.design_patterns.Design.Patterns.factoryMethod.factory.DocumentFactory;
import com.example.design_patterns.Design.Patterns.factoryMethod.model.document.Document;
import com.example.design_patterns.Design.Patterns.factoryMethod.util.DocumentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document")
public class DocumentController {

    private final DocumentFactory documentFactory;

    public DocumentController(DocumentFactory  documentFactory) {
        this.documentFactory = documentFactory;
    }

    @GetMapping("/open/{type}")
    public ResponseEntity<String> openDocument(@PathVariable String type){

        getDocumentImplementation(type);

        return new ResponseEntity("Ok", HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }

    private void getDocumentImplementation(String type) {
        if(type.equals("pdf")){
            Document documentImpl = documentFactory.getImplementation(DocumentType.DOCUMENT_IDENTIFIER_PDF);
            documentImpl.open();
        }
    }
}
