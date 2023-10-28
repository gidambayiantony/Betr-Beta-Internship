//  BackgroundSelectorSettingsPage.kt
@Composable
fun BackgroundSelectorSettingsPage() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Background Selector Settings", style = MaterialTheme.typography.h6)

        Spacer(modifier = Modifier.height(8.dp))

        // Background selection dropdown
        DropdownMenu(
            expanded = false,
            onToggle = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            // List of background options
            listOf("Default", "Light", "Dark").forEach { background ->
                DropdownMenuItem(onClick = {}) {
                    Text(text = background)
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Button to update the background
        Button(onClick = {}) {
            Text(text = "Update Background")
        }
    }
}

