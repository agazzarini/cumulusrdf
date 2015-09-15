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

import org.junit.Test;

/**
 * ASK Integration tests using examples taken from LearningSPARQL book.
 *  
 * @author Andrea Gazzarini
 * @since 1.0
 * @see http://learningsparql.com
 */  
public class LearningSparql_ASK_ITCase extends LearningSparqlSupertypeLayer {
	@Test
	public void findingBadData() throws Exception {
		askTest(misteryGuest("ex199.rq", "ex198.ttl"));		
	}

	@Test
	public void datatypeFunction() throws Exception {
		askTest(misteryGuest("ex201.rq", "ex198.ttl"));		
	}

	@Test
	public void bindAndFilter() throws Exception {
		askTest(misteryGuest("ex202.rq", "ex198.ttl"));		
	}
}