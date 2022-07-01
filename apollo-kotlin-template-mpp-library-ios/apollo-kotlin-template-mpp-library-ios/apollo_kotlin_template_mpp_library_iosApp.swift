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
        Task {
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
