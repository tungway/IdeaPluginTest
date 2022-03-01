package com.github.tungway.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.tungway.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
