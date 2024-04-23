import dev.aga.gradle.versioncatalogs.Generator.generate
import dev.aga.gradle.versioncatalogs.GeneratorConfig

plugins { id("dev.aga.gradle.version-catalog-generator") version "1.5.0" }

rootProject.name = "exposed-double-query"

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
  versionCatalogs {
    generate("springLibs") { from(toml("spring-springBootDependencies")) }
    generate("exposedLibs") {
      from(toml("exposed-bom"))
      aliasPrefixGenerator = GeneratorConfig.NO_PREFIX
    }
  }
}
