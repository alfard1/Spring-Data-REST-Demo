Backend is built on Spring. I used Spring all Java configuration (no xml) and Maven for project
dependency management. For DAO I used EntityManager and standard JPA API.

EmployeeServiceImpl.findById - used "Optional" instead of checking for nulls (Java 8)