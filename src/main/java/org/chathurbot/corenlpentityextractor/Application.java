package org.chathurbot.corenlpentityextractor;

import org.wso2.msf4j.MicroservicesRunner;

/**
 * Application entry point.
 *
 * @since 0.1-SNAPSHOT
 */
public class Application {
    public static void main(String[] args) {
        new MicroservicesRunner()
                .deploy(new Service())
                .start();
    }
}
