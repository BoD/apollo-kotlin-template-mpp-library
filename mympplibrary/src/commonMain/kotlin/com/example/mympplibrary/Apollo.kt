package com.example.mympplibrary

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.cache.normalized.normalizedCache
import com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCacheFactory

private var instance: ApolloClient? = null

fun getApolloClient(): ApolloClient {
    if (instance != null) {
        return instance!!
    }

    instance = ApolloClient.Builder()
        .serverUrl("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
        .webSocketServerUrl("wss://apollo-fullstack-tutorial.herokuapp.com/graphql")
        .normalizedCache(SqlNormalizedCacheFactory("apollo.db"))
        .build()

    return instance!!
}
