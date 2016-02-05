package org.gradle.samples

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
// https://github.com/bmuschko/gradle-gae-plugin/blob/master/src/main/groovy/org/gradle/api/plugins/gae/GaePlugin.groovy#L86
class AssemblyPlugin extends DefaultTask {
    String greeting = 'Hello all'

    @TaskAction
    def greet() {
        println greeting
    }
}
