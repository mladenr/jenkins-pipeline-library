#!/usr/bin/env groovy
package com.sap.commissions.pipeline

class ModuleBuild implements Serializable {

    Script script

    static test(Script script) {
        script.echo "Test pipeline..."
    }

}
