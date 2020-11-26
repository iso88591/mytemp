package com.github.iso88591.mytemp.services

import com.intellij.openapi.project.Project
import com.github.iso88591.mytemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
