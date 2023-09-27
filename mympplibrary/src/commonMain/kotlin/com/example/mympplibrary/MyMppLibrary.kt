package com.example.mympplibrary

import com.apollographql.apollo3.cache.normalized.api.NormalizedCache
import com.apollographql.apollo3.cache.normalized.apolloStore

class MyMppLibrary {
    suspend fun executeSampleQuery(): List<LaunchListQuery.Launch?> {
        return getApolloClient()
            .query(LaunchListQuery())
            .execute()
            .dataOrThrow()
            .launches
            .launches
    }

    suspend fun getNormalizedCacheString(): String {
        val dump = getApolloClient().apolloStore.dump()
        return NormalizedCache.prettifyDump(dump)
    }
}
