package com.goit.vovavoroncov;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person("Volodymyr", "Voroncov");

        ObjectMapper mapper = new ObjectMapper();
        String jsonPerson = mapper.writeValueAsString(person);
        System.out.println(jsonPerson);
    }
}
