package dev.aga.config

import org.jetbrains.exposed.spring.autoconfigure.ExposedAutoConfiguration
import org.jetbrains.exposed.sql.DatabaseConfig
import org.jetbrains.exposed.sql.Slf4jSqlDebugLogger
import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@ImportAutoConfiguration(
  value = [ExposedAutoConfiguration::class],
  exclude = [DataSourceTransactionManagerAutoConfiguration::class],
)
class ExposedConfig {
  @Bean
  internal fun databaseConfig() = DatabaseConfig {
    keepLoadedReferencesOutOfTransaction = true
    sqlLogger = Slf4jSqlDebugLogger
  }
}
