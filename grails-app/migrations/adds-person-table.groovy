databaseChangeLog = {

    changeSet(author: "ernesto (generated)", id: "1502755042586-1") {
        createTable(tableName: "person") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "personPK")
            }

            column(name: "age", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }
        }
    }
}
