databaseChangeLog = {

    changeSet(author: "ernesto (generated)", id: "1502755436183-1") {
        dropNotNullConstraint(columnDataType: "int", columnName: "age", tableName: "person")

        // * Added manually *
        // modifyDataType will drop null constraint
        // modifyDataType(columnName: "name", newDataType: "VARCHAR(100)", tableName: "person")
        // addNotNullConstraint will update data type AND preserve null constraint
        addNotNullConstraint(columnName: "name", columnDataType: "VARCHAR(100)", tableName: "person")
    }
}
