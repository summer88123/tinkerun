package com.tinkerun.build.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 *
 *TinkerunPatch
 * @author tianlupan
 */
public class TinkerunPatchTask extends DefaultTask {

    TinkerunPatchTask() {
        group = 'tinkerun'
    }

    @TaskAction
    def patch() {

    }
}