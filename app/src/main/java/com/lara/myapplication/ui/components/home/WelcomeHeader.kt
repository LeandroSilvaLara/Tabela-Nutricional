package com.lara.myapplication.ui.components.home

import android.app.Notification
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.lara.myapplication.R
import com.lara.myapplication.ui.theme.TabelaNutricionalTheme
import com.lara.myapplication.ui.theme.TabelaNutricionalTheme.sizing
import com.lara.myapplication.ui.theme.Typography

@Composable
fun WelcomeHeader(
    modifier: Modifier = Modifier,
    hasNewNotification: Boolean,
    onNotificationBellClick: () -> Unit = {}
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(sizing.x2l),
            painter = painterResource(id = R.drawable.img_male_profile),
            contentDescription = stringResource(id = R.string.imagem_perfil_usuario)
        )
        Column(
            modifier = Modifier.weight(1f).padding(sizing.sm)
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Leandro Lara!",
                style = Typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(sizing.x2))
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Seja bem-vindo de volta!",
                style = Typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onSecondary)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun WelcomeHeaderPreview() {
    TabelaNutricionalTheme {
        WelcomeHeader(
            modifier = Modifier.padding(sizing.md),
            hasNewNotification = true
        )

    }
}