package com.example.mympplibrary

import com.apollographql.apollo3.ApolloClient

private var instance: ApolloClient? = null

fun getApolloClient(): ApolloClient {
    if (instance != null) {
        return instance!!
    }

    instance = ApolloClient.Builder()
        .serverUrl("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
        .webSocketServerUrl("wss://apollo-fullstack-tutorial.herokuapp.com/graphql")
        .autoPersistedQueries()
        .build()

    return instance!!
}
