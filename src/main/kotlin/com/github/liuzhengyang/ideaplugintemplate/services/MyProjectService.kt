package com.github.liuzhengyang.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.liuzhengyang.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
