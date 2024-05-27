/**
 * ﻿    Copyright © Temenos Headquarters SA 2018.  All rights reserved.
 */
package com.api.service.RTGSAcBalContainer;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.temenos.vocab.VocabularyLoader;

public class BuildSwaggerDocumentValidatorTest {

    private final List<String> skipFilesList =  Arrays.asList("meta-statistics-v1.0.0-swagger.json", "meta-apis-service-v1.0.0-swagger.json", "party-consent-service-v1.0.0-swagger.json");

    @Test
    public void validateSwaggersTest() throws IOException {
        List<Resource> mappingLocations = getResources();
        VocabularyLoader.getInstance();
        Validator validator = new Validator();
        List<ObjectNode> responses = mappingLocations.parallelStream().map(e -> validator.validate(getFileContentAsString(e),e.getFilename())).collect(Collectors.toList());
        boolean isInvalidSwagger = responses.parallelStream().anyMatch(e -> e.get("body") != null);
        assertFalse(isInvalidSwagger);
    }

    /**
     * Method to get the File content as String
     * @param resource
     * @return
     */
    private String getFileContentAsString(Resource resource) {
        try (InputStream inputStream = resource.getInputStream()) {
            return IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Method to get the Resources of files.
     * @return
     * @throws IOException
     */
    private List<Resource> getResources() throws IOException {
        ResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource[] mappingLocations = patternResolver.getResources("classpath*:*/*swagger.json");
        return Arrays.stream(mappingLocations).parallel().filter(e -> !Objects.requireNonNull(e.getFilename()).contains("internal")).filter(e -> !skipFilesList.contains(e.getFilename())).collect(Collectors.toList());
    }
}
