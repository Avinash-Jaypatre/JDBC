# JDBC (Java Database Connectivity)

## Introduction
JDBC (Java Database Connectivity) is an API that allows Java applications to interact with databases. It provides methods to connect to a database, execute queries, retrieve results, and manage database transactions.

## Features of JDBC
- Establishes a connection between Java applications and databases.
- Executes SQL queries (SELECT, INSERT, UPDATE, DELETE).
- Supports transaction management.
- Works with various relational databases like MySQL, PostgreSQL, Oracle, and SQL Server.
- Provides a standard interface for interacting with different databases.

## JDBC Architecture
JDBC consists of the following components:
1. **JDBC API** - Interfaces and classes that allow database interaction.
2. **JDBC Driver Manager** - Manages database drivers.
3. **JDBC Drivers** - Enables communication between Java applications and databases.
4. **Database** - The system where data is stored and managed.

## JDBC Drivers
JDBC supports four types of drivers:
1. **Type 1 (JDBC-ODBC Bridge Driver)** - Uses ODBC driver; now deprecated.
2. **Type 2 (Native-API Driver)** - Uses database-specific client libraries.
3. **Type 3 (Network Protocol Driver)** - Converts JDBC calls into database-independent network calls.
4. **Type 4 (Thin Driver)** - Directly interacts with the database using its native protocol (Most commonly used).

## Steps to Use JDBC
1. Load the JDBC driver.
2. Establish a database connection.
3. Create a `Statement` or `PreparedStatement`.
4. Execute SQL queries.
5. Process the results.
6. Close the connection.
