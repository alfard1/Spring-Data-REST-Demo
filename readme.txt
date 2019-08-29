Backend is built on Spring. I used Spring all Java configuration (no xml) and Maven for project
dependency management.

* For DAO in the beginning I used EntityManager and standard JPA API.
* Then I changed it to Data JPA Repository where for EmployeeServiceImpl.findById I used "Optional" instead of checking for nulls (Java 8)
* Finally I used Spring Data REST and removed REST Controller and Service
