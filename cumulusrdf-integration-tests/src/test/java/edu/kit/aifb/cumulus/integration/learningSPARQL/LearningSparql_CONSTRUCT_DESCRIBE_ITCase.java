/*
 * This Test case makes use of some examples from 
 * 
 * "Learning SPARQL - Querying and Updating with SPARQL 1.1" by Bob DuCharme
 * 
 * Publisher: O'Reilly
 * Author: Bob DuCharme
 * ISBN: 978-1-449-37143-2
 * http://www.learningsparql.com/
 * http://shop.oreilly.com/product/0636920030829.do
 * 
 * We warmly appreciate and thank the author and O'Reilly for such permission.
 * 
 */
package edu.kit.aifb.cumulus.integration.learningSPARQL;

import static edu.kit.aifb.cumulus.test.MisteryGuest.misteryGuest;
import static edu.kit.aifb.cumulus.test.MisteryGuest.misteryGuestWithGraphURI;

import org.junit.Ignore;
import org.junit.Test;

/**
 * CONSTRUCT Integration tests using examples taken from LearningSPARQL book.
 *  
 * @author Andrea Gazzarini
 * @since 1.0
 * @see http://learningsparql.com
 */  
public class LearningSparql_CONSTRUCT_DESCRIBE_ITCase extends LearningSparqlSupertypeLayer {
	@Test
	public void copyingData() throws Exception {
		constructTest(misteryGuest("ex176.rq", "ex012.ttl"));		
	}
	
	@Test
	public void copyingDataFromAnotherGraph() throws Exception {
		load(misteryGuestWithGraphURI(null, "http://example.org.1#", "ex012.ttl"));		
		load(misteryGuestWithGraphURI(null, "http://example.org.1#", "ex125.ttl"));
		
		constructTest(misteryGuest("ex180.rq"));	
	}
	
	@Test
	public void creatingNewData_I() throws Exception {
		constructTest(misteryGuest("ex184.rq"));		
	}
	
	@Test
	public void creatingNewData_II() throws Exception {
		constructTest(misteryGuest("ex185.rq"));		
	}
	
	@Test
	public void creatingNewData_III() throws Exception {
		constructTest(misteryGuest("ex188.rq"));		
	}
	
	@Test
	public void creatingNewData_IV() throws Exception {
		constructTest(misteryGuest("ex190.rq"));		
	}
	
	@Test
	public void creatingNewData_V() throws Exception {
		constructTest(misteryGuest("ex192.rq"));		
	}
	
	@Test
	public void convertingData() throws Exception {
		constructTest(misteryGuest("ex194.rq", "ex012.ttl"));		
	}
	
	@Test
	@Ignore
	public void convertingDataFromRemoteService() throws Exception {
		constructTest(misteryGuest("ex196.rq"));		
	}

	@Test
	public void generatingDataAboutBrokenRules_I() throws Exception {
		constructTest(misteryGuest("ex203.rq", "ex198.ttl"));		
	}
	
	@Test
	public void generatingDataAboutBrokenRules_II() throws Exception {
		constructTest(misteryGuest("ex205.rq", "ex198.ttl"));		
	}
	
	@Test
	public void generatingDataAboutBrokenRules_III() throws Exception {
		constructTest(misteryGuest("ex207.rq", "ex198.ttl"));		
	}
	
	@Test
	public void generatingDataAboutBrokenRules_I_II_III() throws Exception {
		constructTest(misteryGuest("ex209.rq", "ex198.ttl"));		
	}
	
	@Test
	public void describeResource() throws Exception {
		describeTest(misteryGuest("ex213.rq", "ex069.ttl"));		
	}	
	
	@Test
	public void describeWithTriplePattern() throws Exception {
		describeTest(misteryGuest("ex216.rq", "ex069.ttl"));		
	}	
	
	@Test
	public void ifFunction() throws Exception {
		constructTest(misteryGuest("ex237.rq", "ex104.ttl"));		
	}	
	
	/**
	 * @see https://github.com/agazzarini/SolRDF/issues/81
	 */
	@Test
	@Ignore
	public void uriFunction() throws Exception {
		constructTest(misteryGuest("ex246.rq", "ex241.ttl"));		
	}	
	
	@Test
	public void encodeForUriFunction_I() throws Exception {
		constructTest(misteryGuest("ex248.rq", "ex241.ttl"));		
	}		
	
	@Test
	public void encodeForUriFunction_II() throws Exception {
		constructTest(misteryGuest("ex248.rq", "ex249.ttl"));		
	}	
		
	@Test
	public void strFunction() throws Exception {
		constructTest(misteryGuest("ex253.rq", "ex241.ttl"));		
	}		

	@Test
	public void strUriEncodeIfAndBindFunctions() throws Exception {
		constructTest(misteryGuest("ex255.rq", "ex241.ttl"));		
	}		
	
	@Test
	public void strdtFunction() throws Exception {
		constructTest(misteryGuest("ex267.rq", "ex266.ttl"));		
	}	

	@Test
	public void strlangFunction() throws Exception {
		constructTest(misteryGuest("ex282.rq", "ex281.ttl"));		
	}			
	
	@Test
	public void hashFunctions() throws Exception {
		constructTest(misteryGuest("ex305.rq", "ex012.ttl"));		
	}	
}