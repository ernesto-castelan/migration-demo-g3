databaseChangeLog = {

    changeSet(author: "ernesto (generated)", id: "1502828901746-1") {
        createTable(tableName: "address") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "addressPK")
            }

            column(name: "person_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "street_name", type: "VARCHAR(255)")

            column(name: "city", type: "VARCHAR(255)")

            column(name: "zip_code", type: "VARCHAR(255)")
        }
    }

    // Added manually
    changeSet(author: "ernesto", id: "migrate-address-data") {
        sql("""INSERT INTO address (person_id, street_name, city, zip_code)
               SELECT id, street_name, city, zip_code FROM person
               WHERE street_name IS NOT NULL OR city IS NOT NULL OR zip_code  IS NOT NULL""")
    }

    changeSet(author: "ernesto (generated)", id: "1502828901746-2") {
        addForeignKeyConstraint(baseColumnNames: "person_id", baseTableName: "address", constraintName: "FK81ihijcn1kdfwffke0c0sjqeb", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "person")
    }

    changeSet(author: "ernesto (generated)", id: "1502828901746-3") {
        dropColumn(columnName: "city", tableName: "person")
    }

    changeSet(author: "ernesto (generated)", id: "1502828901746-4") {
        dropColumn(columnName: "street_name", tableName: "person")
    }

    changeSet(author: "ernesto (generated)", id: "1502828901746-5") {
        dropColumn(columnName: "zip_code", tableName: "person")
    }
}
