@Composable
fun MainActivity() {
    // ...

    // Register the background selector settings page as a composable function
    composable("BackgroundSelectorSettingsPage") {
        BackgroundSelectorSettingsPage()
    }

    // ...

    // Add a button to the app to navigate to the background selector settings page
    Button(onClick = {
        navigate("BackgroundSelectorSettingsPage")
    }) {
        Text(text = "Background Selector")
    }
}

