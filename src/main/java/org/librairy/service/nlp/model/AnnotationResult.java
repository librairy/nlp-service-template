package org.librairy.service.nlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AnnotationResult {

    private final List<Annotation> annotations;

    public AnnotationResult(List<org.librairy.service.nlp.facade.model.Annotation> annotations) {
        this.annotations = annotations.stream().map( a -> new Annotation(a)).collect(Collectors.toList());
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of annotations created by the service", required = true)
    public List<Annotation> getAnnotatedText() {
        return annotations;
    }
}
