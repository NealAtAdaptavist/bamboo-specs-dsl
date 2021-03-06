package com.thecodesmith.bamboo.specs.dsl

import com.atlassian.bamboo.specs.api.builders.plan.artifact.Artifact
import groovy.transform.CompileStatic

import static com.thecodesmith.bamboo.specs.dsl.utils.DslUtils.*

/**
 * @author Brian Stewart
 */
@CompileStatic
class ArtifactDsl {

    static Artifact artifact(String name) {
        new Artifact(name)
    }

    static Artifact artifact(@DelegatesTo(Artifact) Closure builder) {
        runWithDelegate(builder, new Artifact())
    }

    static Artifact artifact(String name, @DelegatesTo(Artifact) Closure builder) {
        runWithDelegate(builder, new Artifact(name))
    }
}
