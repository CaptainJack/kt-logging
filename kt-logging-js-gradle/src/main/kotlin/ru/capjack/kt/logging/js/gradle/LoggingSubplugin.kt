package ru.capjack.kt.logging.js.gradle

import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class LoggingSubplugin : KotlinGradleSubplugin<AbstractCompile> {
	override fun apply(
		project: Project,
		kotlinCompile: AbstractCompile,
		javaCompile: AbstractCompile?,
		variantData: Any?,
		androidProjectHandler: Any?,
		kotlinCompilation: KotlinCompilation?
	): List<SubpluginOption> {
		return emptyList()
	}
	
	override fun isApplicable(project: Project, task: AbstractCompile): Boolean {
		return LoggingPlugin.isEnabled(project)
	}
	
	override fun getCompilerPluginId(): String {
		return Const.PLUGIN
	}
	
	override fun getPluginArtifact(): SubpluginArtifact {
		return SubpluginArtifact(Const.GROUP, Const.ARTIFACT_PLUGIN, LoggingPlugin.VERSION)
	}
}