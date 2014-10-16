package jenkins.security.admin;

import jenkins.ReflectiveFilePathFilter;

import java.io.File;

/**
 * Tests a match against file operation name of {@link ReflectiveFilePathFilter#op(String, File)}.
 *
 * @author Kohsuke Kawaguchi
 */
interface OpMatcher {
    boolean matches(String op);
}
