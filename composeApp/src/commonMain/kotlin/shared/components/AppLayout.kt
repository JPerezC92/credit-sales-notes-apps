package shared.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppLayout(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement = Arrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    content: @Composable () -> Unit,
) {
    Column(
        horizontalAlignment = horizontalAlignment,
        verticalArrangement = verticalArrangement.spacedBy(16.dp, Alignment.CenterVertically),
        modifier = modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        content()
    }
}