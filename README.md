# exposed-double-query

## Instructions
1. Create local database `exposed_dev`
2. Run all statements in `src/main/resources/init.sql`
3. `./gradlew bootRun`
4. Observe logs
```text
2024-04-23T13:52:30.610-04:00  INFO 66028 --- [           main] dev.aga.AppKt                            : Started AppKt in 1.36 seconds (process running for 1.5)
2024-04-23T13:52:30.693-04:00 DEBUG 66028 --- [           main] Exposed                                  : SELECT parents.id, parents."name" FROM parents WHERE parents.id = 1
2024-04-23T13:52:30.752-04:00 DEBUG 66028 --- [           main] Exposed                                  : SELECT childs.id, childs."name", childs.parent_id FROM childs WHERE childs.parent_id = 1
2024-04-23T13:52:30.753-04:00 DEBUG 66028 --- [           main] Exposed                                  : SELECT childs.id, childs."name", childs.parent_id FROM childs WHERE childs.parent_id = 1
```
