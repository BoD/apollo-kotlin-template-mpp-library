//
//  apollo_kotlin_template_mpp_library_iosApp.swift
//  apollo-kotlin-template-mpp-library-ios
//
//  Created by BoD on 01/07/2022.
//

import SwiftUI
import MyMppLibrary

@main
struct apollo_kotlin_template_mpp_library_iosApp: App {
    init() {
        let myMppLibrary = MyMppLibrary()
        
        // Use `Task {` to be on the main thread and `Task.detached {` to be on a background thread
        Task{
            print(Thread.isMainThread)
            
            // 1st call will go to the network
            var results = try await myMppLibrary.executeSampleQuery()
            print("\nNetwork:")
            print(results)

            // 2nd call will get the cached results
            results = try await myMppLibrary.executeSampleQuery()
            print("\nCached:")
            print(results)
            
            // Show normalized cache contents
            let normalizedCacheStr = try await myMppLibrary.getNormalizedCacheString()
            print("\nNormalized cache contents:")
            print(normalizedCacheStr)
        }
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
