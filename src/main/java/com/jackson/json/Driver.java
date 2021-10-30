package com.jackson.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper objectMapper = new ObjectMapper();

			// read JSON and map/convert to Java POJO
			Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);

			// print name
			System.out.println("Student: " + student);

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
