package com.br.rbcapital.passivoFavorito.portlet;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonConverter {

    public static <T> List<T> readFromList(String src, Class<? extends T> type) throws JacksonConverterException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            if (StringUtils.isBlank(src)) {
                return new ArrayList<>();
            }
            return mapper.readValue(src, mapper.getTypeFactory().constructCollectionType(List.class, type));
        } catch (JsonParseException e) {
            throw new JacksonConverterException(e);
        } catch (JsonMappingException e) {
            throw new JacksonConverterException(e);
        } catch (IOException e) {
            throw new JacksonConverterException(e);
        }
    }

    public static <T> T readFrom(String src, Class<T> type) throws JacksonConverterException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(src, type);
        } catch (JsonParseException e) {
            throw new JacksonConverterException(e);
        } catch (JsonMappingException e) {
            throw new JacksonConverterException(e);
        } catch (IOException e) {
            throw new JacksonConverterException(e);
        }
    }

    public static <T> T readIgnoreUnknownProperties(String src, Class<T> type) throws JacksonConverterException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        try {
            return mapper.readValue(src, type);
        } catch (Exception e) {
            throw new JacksonConverterException(e);
        }
    }

    public static String toJson(Object object) throws JacksonConverterException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonParseException e) {
            throw new JacksonConverterException(e);
        } catch (JsonMappingException e) {
            throw new JacksonConverterException(e);
        } catch (IOException e) {
            throw new JacksonConverterException(e);
        }
    }

}
