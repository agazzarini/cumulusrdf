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
 * SELECT Integration tests using examples taken from LearningSPARQL book.
 *  
 * @author Andrea Gazzarini
 * @since 1.0
 * @see http://learningsparql.com
 */  
public class LearningSparql_SELECT_ITCase extends LearningSparqlSupertypeLayer {
	
	@Test
	public void queryWithPrefixes_I() throws Exception {
		selectTest(misteryGuest("ex003.rq", "ex002.ttl"));		
	}
	
	@Test
	public void queryWithPrefixes_II() throws Exception {
		selectTest(misteryGuest("ex006.rq", "ex002.ttl"));		
	}

	@Test
	public void fromKeyword() throws Exception {
		selectTest(misteryGuest("ex007.rq", "ex002.ttl"));		
	}

	@Test
	public void queryWithOneVariable() throws Exception {
		selectTest(misteryGuest("ex008.rq", "ex002.ttl"));		
	}

	@Test
	public void queryWithTwoVariables() throws Exception {
		selectTest(misteryGuest("ex010.rq", "ex002.ttl"));		
	}

	@Test
	public void twoTriplePatterns() throws Exception {
		selectTest(misteryGuest("ex013.rq", "ex012.ttl"));		
	}

	@Test
	public void threeTriplePatterns() throws Exception {
		selectTest(misteryGuest("ex015.rq", "ex012.ttl"));		
	}

	@Test
	public void humanReadableAnswersWithLabels() throws Exception {
		selectTest(misteryGuest("ex017.rq", "ex012.ttl"));		
	}

	@Test
	public void entityDescriptionQuery() throws Exception {
		selectTest(misteryGuest("ex019.rq", "ex012.ttl"));		
	}

	@Test
	public void filterWithRegularExpression() throws Exception {
		selectTest(misteryGuest("ex021.rq", "ex012.ttl"));		
	}

	@Test
	public void selectFirstAndLastName() throws Exception {
		selectTest(misteryGuest("ex047.rq", "ex046.ttl"));		
	}

	@Test
	public void queryingFOAFLabels() throws Exception {
		selectTest(misteryGuest("ex052.rq", "ex050.ttl", "foaf.rdf"));		
	}
	
	@Test
	public void dataThatMightBeNotThere() throws Exception {
		selectTest(misteryGuest("ex055.rq", "ex054.ttl"));		
	}	

	@Test
	public void optionalKeyword() throws Exception {
		selectTest(misteryGuest("ex057.rq", "ex054.ttl"));		
	}	

	@Test
	public void optionalGraphPattern() throws Exception {
		selectTest(misteryGuest("ex059.rq", "ex054.ttl"));		
	}	

	@Test
	public void optionalGraphPatterns() throws Exception {
		selectTest(misteryGuest("ex061.rq", "ex054.ttl"));		
	}	

	@Test
	public void orderOfOptionalGraphPatterns() throws Exception {
		selectTest(misteryGuest("ex063.rq", "ex054.ttl"));		
	}	

	@Test
	public void boundKeyword() throws Exception {
		selectTest(misteryGuest("ex065.rq", "ex054.ttl"));		
	}	

	@Test
	public void filterNotExists() throws Exception {
		selectTest(misteryGuest("ex067.rq", "ex054.ttl"));		
	}	

	@Test
	public void minusKeyword() throws Exception {
		selectTest(misteryGuest("ex068.rq", "ex054.ttl"));		
	}	

	@Test
	public void multipleTables() throws Exception {
		selectTest(misteryGuest("ex070.rq", "ex069.ttl"));		
	}	

	@Test
	public void multipleTablesWithSplitDatasets() throws Exception {
		selectTest(misteryGuest("ex070.rq", "ex072.ttl", "ex073.ttl", "ex368.ttl"));		
	}	

	@Test
	public void bindEither_I() throws Exception {
		selectTest(misteryGuest("ex075.rq", "ex074.ttl"));		
	}	
	
	@Test
	public void searchingWithBlankNodes() throws Exception {
		selectTest(misteryGuest("ex088.rq", "ex041.ttl"));		
	}		
	
	@Test
	public void duplicates() throws Exception {
		selectTest(misteryGuest("ex090.rq", "ex069.ttl"));		
	}		
	
	@Test
	public void distinct_I() throws Exception {
		selectTest(misteryGuest("ex092.rq", "ex069.ttl"));		
	}	
	
	@Test
	public void distinct_II() throws Exception {
		selectTest(misteryGuest("ex094.rq", "ex069.ttl"));		
	}	
	
	@Test
	public void union_I() throws Exception {
		selectTest(misteryGuest("ex101.rq", "ex100.ttl"));		
	}	
	
	@Test
	public void union_II() throws Exception {
		selectTest(misteryGuest("ex103.rq", "ex100.ttl"));		
	}	
	
	@Test
	public void filterWithSimpleMathExpression() throws Exception {
		selectTest(misteryGuest("ex105.rq", "ex104.ttl"));		
	}	

	@Test
	public void filterWithIsURIFunction() throws Exception {
		selectTest(misteryGuest("ex107.rq", "ex104.ttl"));		
	}	
	
	@Test
	public void filterWithINFunction() throws Exception {
		selectTest(misteryGuest("ex109.rq", "ex104.ttl"));		
	}	
	
	@Test
	public void filterWithNOTINFunction() throws Exception {
		selectTest(misteryGuest("ex112.rq", "ex104.ttl"));		
	}	
	
	@Test
	public void limit() throws Exception {
		selectTest(misteryGuest("ex116.rq", "ex115.ttl"));		
	}	
	
	@Test
	public void offset() throws Exception {
		selectTest(misteryGuest("ex118.rq", "ex115.ttl"));		
	}	

	@Test
	public void limitWithOffset() throws Exception {
		selectTest(misteryGuest("ex120.rq", "ex115.ttl"));		
	}	

	/**
	 * Curiously the Jena memory mode fails while SolRDF returns expected results
	 */
	@Test
	public void from() throws Exception {
		load(misteryGuestWithGraphURI(null, "http://example.org.1#", "ex069.ttl"));
		load(misteryGuestWithGraphURI(null, "http://example.org.2#", "ex122.ttl"));
		
		selectTest(misteryGuest("ex123.rq"));		
	}	
	
	@Test
	public void fromNamed() throws Exception {
		load(misteryGuestWithGraphURI(null, "http://example.org.1#", "ex069.ttl"));
		load(misteryGuestWithGraphURI(null, "http://example.org.2#", "ex122.ttl"));
		load(misteryGuestWithGraphURI(null, "http://example.org.3#", "ex125.ttl"));
		
		selectTest(misteryGuest("ex126.rq"));		
	}	
	
	@Test
	public void subQueries() throws Exception {
		selectTest(misteryGuest("ex137.rq", "ex069.ttl"));		
	}	
	
	@Test
	public void combiningValuesAndAssigningValuesToVariables_I() throws Exception {
		selectTest(misteryGuest("ex139.rq", "ex138.ttl"));		
	}		
	
	@Test
	public void combiningValuesAndAssigningValuesToVariables_II() throws Exception {
		selectTest(misteryGuest("ex141.rq", "ex138.ttl"));		
	}		
	
	@Test
	public void combiningValuesAndAssigningValuesToVariables_withSubqueries() throws Exception {
		selectTest(misteryGuest("ex143.rq", "ex138.ttl"));		
	}			
	
	@Test
	public void bindKeyword() throws Exception {
		selectTest(misteryGuest("ex144.rq", "ex138.ttl"));		
	}	
	
	@Test
	public void valueKeyword_I() throws Exception {
		selectTest(misteryGuest("ex492.rq", "ex138.ttl"));		
	}	
	
	@Test
	public void valueKeyword_II() throws Exception {
		selectTest(misteryGuest("ex496.rq", "ex145.ttl"));		
	}		
	
	@Test
	public void valueKeyword_III() throws Exception {
		selectTest(misteryGuest("ex498.rq", "ex145.ttl"));		
	}		
	
	@Test
	public void valueKeyword_IV() throws Exception {
		selectTest(misteryGuest("ex500.rq", "ex145.ttl"));		
	}		

	@Test
	public void orderByKeywordAsc() throws Exception {
		selectTest(misteryGuest("ex146.rq", "ex145.ttl"));		
	}		
	
	@Test
	public void orderByKeywordDesc() throws Exception {
		selectTest(misteryGuest("ex148.rq", "ex145.ttl"));		
	}		
	
	@Test
	public void orderByKeywordWithTwoKeys() throws Exception {
		selectTest(misteryGuest("ex149.rq", "ex145.ttl"));		
	}	
	
	@Test
	public void limitAndOrderKeywords() throws Exception {
		selectTest(misteryGuest("ex151.rq", "ex145.ttl"));		
	}		
	
	@Test
	public void maxFunction_I() throws Exception {
		selectTest(misteryGuest("ex153.rq", "ex145.ttl"));		
	}	
	
	@Test
	public void maxFunction_II() throws Exception {
		selectTest(misteryGuest("ex155.rq", "ex145.ttl"));		
	}	
	
	@Test
	public void avgFunction() throws Exception {
		selectTest(misteryGuest("ex156.rq", "ex145.ttl"));		
	}	
	
	/**
	 * Fails because of the different order of the results.
	 */
	@Test
	@Ignore
	public void groupConcatFunction() throws Exception {
		selectTest(misteryGuest("ex158.rq", "ex145.ttl"));		
	}	
	
	@Test
	public void groupByKeyword() throws Exception {
		selectTest(misteryGuest("ex160.rq", "ex145.ttl"));		
	}	
	
	@Test
	public void countFunction() throws Exception {
		selectTest(misteryGuest("ex162.rq", "ex145.ttl"));		
	}	
	
	@Test
	public void havingKeyword() throws Exception {
		selectTest(misteryGuest("ex164.rq", "ex145.ttl"));		
	}
	
	@Test
	public void serviceKeyword() throws Exception {
		selectTest(misteryGuest("ex167.rq", "ex145.ttl"));		
	}
	
	@Test
	public void integerDatatypeAssumption() throws Exception {
		selectTest(misteryGuest("ex218.rq", "ex217.ttl"));		
	}	
	
	@Test
	public void stringDatatypeAssumption_I() throws Exception {
		selectTest(misteryGuest("ex220.rq", "ex217.ttl"));		
	}		
	
	@Test
	public void explicitStringDatatype() throws Exception {
		selectTest(misteryGuest("ex221.rq", "ex217.ttl"));		
	}	
	
	@Test
	@Ignore
	/**
	 * @see https://github.com/agazzarini/SolRDF/issues/79
	 */
	public void customDatatype() throws Exception {
		selectTest(misteryGuest("ex222.rq", "ex217.ttl"));		
	}		
	
	@Test
	public void ignoreDatatypeAndLanguage() throws Exception {
		selectTest(misteryGuest("ex223.rq", "ex217.ttl"));		
	}	
	
	@Test
	public void representingStrings() throws Exception {
		selectTest(misteryGuest("ex225.rq", "ex224.ttl"));		
	}	
	
	@Test
	public void comparingDecimals() throws Exception {
		selectTest(misteryGuest("ex228.rq", "ex227.ttl"));		
	}	
	
	@Test
	public void comparingDate() throws Exception {
		selectTest(misteryGuest("ex230.rq", "ex227.ttl"));		
	}			

	@Test
	public void arithmeticExpressionWithBind_I() throws Exception {
		selectTest(misteryGuest("ex232.rq", "ex138.ttl"));		
	}			

	@Test
	public void arithmeticExpressionWithBind_II() throws Exception {
		selectTest(misteryGuest("ex233.rq", "ex033.ttl"));		
	}	
	
	@Test
	public void ifFunctionWithInMemoryData() throws Exception {
		selectTest(misteryGuest("ex235.rq"));		
	}	
	
	@Test
	public void coalesceFunction() throws Exception {
		selectTest(misteryGuest("ex239.rq", "ex054.ttl"));		
	}	
	
	@Test
	public void nodeTypeCheckingFunction() throws Exception {
		selectTest(misteryGuest("ex242.rq", "ex241.ttl"));		
	}	
	
	@Test
	public void dataTypeCheckingFunction() throws Exception {
		selectTest(misteryGuest("ex244.rq", "ex241.ttl"));		
	}	
	
	@Test
	public void strFunction() throws Exception {
		selectTest(misteryGuest("ex251.rq", "ex241.ttl"));		
	}	
	
	@Test
	public void datatypeConversion_I() throws Exception {
		selectTest(misteryGuest("ex257.rq", "ex241.ttl"));		
	}	

	@Test
	public void datatypeConversion_II() throws Exception {
		selectTest(misteryGuest("ex260.rq", "ex259.ttl"));		
	}	

	@Test
	public void datatypeConversion_III() throws Exception {
		selectTest(misteryGuest("ex262.rq", "ex259.ttl"));		
	}	
	
	@Test
	public void strdtFunction() throws Exception {
		selectTest(misteryGuest("ex264.rq", "ex259.ttl"));		
	}	
	
	@Test
	public void langFunction() throws Exception {
		selectTest(misteryGuest("ex271.rq", "ex039.ttl"));		
	}		

	@Test
	public void removeLanguageTag_I() throws Exception {
		selectTest(misteryGuest("ex273.rq", "ex039.ttl"));		
	}	
	
	@Test
	public void removeLanguageTag_II() throws Exception {
		selectTest(misteryGuest("ex273.rq", "ex037.ttl"));		
	}	
	
	@Test
	public void langMatchesFunction_I() throws Exception {
		selectTest(misteryGuest("ex276.rq", "ex037.ttl"));		
	}	
	
	@Test
	public void langMatchesFunction_II() throws Exception {
		selectTest(misteryGuest("ex279.rq", "ex278.ttl"));		
	}	
	
	@Test
	public void stringFunctions_I() throws Exception {
		selectTest(misteryGuest("ex285.rq", "ex284.ttl"));		
	}		
	
	@Test
	public void stringFunctions_II() throws Exception {
		selectTest(misteryGuest("ex287.rq", "ex284.ttl"));		
	}
	
	@Test
	public void stringFunctions_III() throws Exception {
		selectTest(misteryGuest("ex290.rq", "ex289.ttl"));		
	}
	
	@Test
	public void numericFunctions() throws Exception {
		selectTest(misteryGuest("ex293.rq", "ex292.ttl"));		
	}	
	
	@Test
	public void dateAndTimeFunctions() throws Exception {
		selectTest(misteryGuest("ex303.rq"));		
	}	
}