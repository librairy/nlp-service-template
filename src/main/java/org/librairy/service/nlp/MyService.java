package org.librairy.service.nlp;

import org.apache.avro.AvroRemoteException;
import org.librairy.service.nlp.facade.model.Annotation;
import org.librairy.service.nlp.facade.model.Form;
import org.librairy.service.nlp.facade.model.NlpService;
import org.librairy.service.nlp.facade.model.PoS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Component
public class MyService implements NlpService {

    private static final Logger LOG = LoggerFactory.getLogger(MyService.class);

    @Value("#{environment['RESOURCE_FOLDER']?:'${resource.folder}'}")
    String resourceFolder;

    String model              ;

    @PostConstruct
    public void setup() throws IOException {

        //// Load resources
        //model              = Paths.get(resourceFolder,"resource.bin").toFile().getAbsolutePath();

        LOG.info("Service initialized");
    }

    @Override
    public String process(String text, List<PoS> filter, Form form) throws AvroRemoteException {

        LOG.debug("Processing text: "+ text + " by criteria: " + filter + " in form: " + form);

        // TODO
        return "to-be-implemented";
    }

    @Override
    public List<Annotation> annotate(String text, List<PoS> filter) throws AvroRemoteException {
        LOG.debug("Annotating text: "+ text + " by criteria: " + filter );
        // TODO
        return Collections.emptyList();
    }

}
