package com.github.nunnatsa.ginkgoplugin.services

import com.intellij.openapi.project.Project
import com.github.nunnatsa.ginkgoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
