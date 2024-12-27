package com.example.kmm_fist_app.android

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kmm_fist_app.CounterLogic

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        CounterApp()  // First button
                        CounterApp2()

                    }

                }
            }
        }
    }
}

@Composable
fun CounterApp() {
    val counterLogic = remember { CounterLogic() }
    var count by remember { mutableStateOf(counterLogic.getCount()) }

    Column(
        modifier = Modifier
            .wrapContentSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CountText(count)
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            IncreaseButton(onIncrease = { count = counterLogic.increment() })
            ClearButton(onClear = {
                count = 0
            })
        }
    }
}

@Composable
fun CounterApp2() {
    val counterLogic = remember { CounterLogic() }
    var count by remember { mutableStateOf(counterLogic.getCount()) }

    Column(
        modifier = Modifier
            .wrapContentSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CountText(count)
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            IncreaseButton(onIncrease = { count = counterLogic.increment() })
            ClearButton(onClear = {
                count = 0
            })
        }
    }
}

@Composable
fun IncreaseButton(onIncrease: () -> Unit) {
    Button(
        onClick = {
            onIncrease()
        },
    ) {
        Text(text = "Increase")
    }
}

@Composable
fun CountText(text: Int) {
    Text(
        text = "Count: $text", style = MaterialTheme.typography.bodyMedium
    )
}

@Composable
fun ClearButton(onClear: () -> Unit) {
    IconButton(onClick = { onClear() }) {
        Icon(
            imageVector = Icons.Default.Clear,
            contentDescription = "Clear",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}


@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
