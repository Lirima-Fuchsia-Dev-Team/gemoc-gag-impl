/*
 * generated by Xtext 2.14.0
 */
package fr.inria.gag.specification.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GagAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/inria/gag/specification/xtext/parser/antlr/internal/InternalGag.tokens");
	}
}
