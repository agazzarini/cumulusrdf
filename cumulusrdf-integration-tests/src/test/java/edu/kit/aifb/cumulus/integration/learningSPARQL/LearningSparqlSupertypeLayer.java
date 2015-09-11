package edu.kit.aifb.cumulus.integration.learningSPARQL;

import org.junit.After;

import edu.kit.aifb.cumulus.integration.IntegrationTestSupertypeLayer;

/**
 * Supertype layer for all "Learning SPARQL" integration tests.
 * 
 * @author Andrea Gazzarini
 * @since 1.0
 */
public abstract class LearningSparqlSupertypeLayer extends IntegrationTestSupertypeLayer {
	protected final static String LEARNING_SPARQL_EXAMPLES_DIR = "src/test/resources/LearningSPARQLExamples";
	
	/** 
	 * Shutdown procedure for this test.
	 * 
	 * @throws Exception hopefully never.
	 */
	@After
	public void tearDown() throws Exception {
		clearDatasets();
	}
	
	@Override
	protected String examplesDirectory() {
		return LEARNING_SPARQL_EXAMPLES_DIR;
	}
}