package com.you.spark.test;

import spark.*;

public class Test {

	public static void main(String[] args) {
		Spark.get(new Route("/hello") {
			
			/* (non-Javadoc)
			 * @see spark.Route#handle(spark.Request, spark.Response)
			 */
			@Override
			public Object handle(Request request, Response response) {
				return "Hello World from Spark!";
			}
		});
		
	}

}