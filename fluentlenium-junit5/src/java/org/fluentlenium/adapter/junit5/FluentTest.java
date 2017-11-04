package org.fluentlenium.adapter.junit5;

import org.fluentlenium.adapter.FluentTestRunnerAdapter;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * JUnit 5 FluentLenium Test Runner Adapter.
 * <p>
 * Extends this class to provide FluentLenium support to your JUnit5 Test class.
 */
@ExtendWith(FluentJUnit5.class)
public class FluentTest extends FluentTestRunnerAdapter {
    /*package*/ void _starting(Class<?> testClass, String testName) {
        starting(testClass, testName);
    }

    /*package*/ void _finished(Class<?> testClass, String testName) {
        finished(testClass, testName);
    }

    /*package*/ void _failed(Throwable e, Class<?> testClass, String testName) {
        failed(e, testClass, testName);
    }
}
