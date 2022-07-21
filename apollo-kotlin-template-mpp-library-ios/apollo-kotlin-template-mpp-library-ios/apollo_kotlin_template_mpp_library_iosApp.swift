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
        // Which should be possible with the New Memory Manager starting with Kotlin 1.7.20
        // See https://youtrack.jetbrains.com/issue/KT-51297
        Task {
            print(Thread.isMainThread)
            let results = try await myMppLibrary.executeSampleQuery()
            print(results)
        }
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
