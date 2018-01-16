package org.librairy.service.nlp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.librairy.service.nlp.facade.model.Annotation;
import org.librairy.service.nlp.facade.model.PoS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyService.class)
@WebAppConfiguration
public class MyServiceTest {


    @Autowired
    MyService service;

    @Test
    public void annotation() throws IOException {

        String text = "Sample text";

        List<PoS> filter = Collections.emptyList();

        List<Annotation> annotations = service.annotate(text, filter);

//        Assert.assertEquals(2, annotations.size());
    }
}