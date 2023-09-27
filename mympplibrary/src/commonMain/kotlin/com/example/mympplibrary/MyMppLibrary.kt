package com.example.mympplibrary

class MyMppLibrary {
    suspend fun executeSampleQuery(): List<LaunchListQuery.Launch?> {
        return getApolloClient()
            .query(LaunchListQuery())
            .execute()
            .dataOrThrow()
            .launches
            .launches
    }
}
