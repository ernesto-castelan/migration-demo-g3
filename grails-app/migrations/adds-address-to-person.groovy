databaseChangeLog = {

    changeSet(author: "ernesto (generated)", id: "1502817593054-1") {
        addColumn(tableName: "person") {
            column(name: "city", type: "varchar(255)")
        }
    }

    changeSet(author: "ernesto (generated)", id: "1502817593054-2") {
        addColumn(tableName: "person") {
            column(name: "street_name", type: "varchar(255)")
        }
    }

    changeSet(author: "ernesto (generated)", id: "1502817593054-3") {
        addColumn(tableName: "person") {
            column(name: "zip_code", type: "varchar(255)")
        }
    }
}
