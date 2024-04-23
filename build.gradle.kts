plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.kotlin.spring)
  alias(libs.plugins.springBoot)
}

kotlin { jvmToolchain(21) }

configurations.all { exclude(module = "commons-logging") }

dependencies {
  implementation(springLibs.spring.springBootStarterWeb)
  implementation(springLibs.spring.springBootStarterActuator)
  implementation(springLibs.spring.springBootStarterSecurity)

  implementation(libs.kotlin.reflect)

  implementation(exposedLibs.exposedCore)
  implementation(exposedLibs.exposedJavaTime)
  implementation(exposedLibs.exposedSpringBootStarter)
  implementation(exposedLibs.exposedJson)
  implementation(exposedLibs.exposedDao)
  runtimeOnly(springLibs.postgresql.postgresql)
  implementation(springLibs.jackson.jacksonDatabind)
  implementation(springLibs.jackson.jacksonModuleKotlin)
  implementation(springLibs.jackson.jacksonDatatypeJsr310)

  annotationProcessor(springLibs.spring.springBootConfigurationProcessor)
}
