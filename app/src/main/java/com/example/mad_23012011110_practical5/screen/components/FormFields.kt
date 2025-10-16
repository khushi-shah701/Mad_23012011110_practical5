package com.example.mad_23012011110_practical5.screen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.mad_23012011110_practical5.ui.theme.Mad_23012011110_practical5Theme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun formField(label:String,
              textState: String,
              onTextChange: (String)->Unit,
              isPasswordField: Boolean=false,
              isNumber: Boolean=false) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp, horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "$label:",
            fontSize = 14.sp,
            modifier = Modifier.padding(end = 12.dp).weight(0.35f),
            color = androidx.compose.ui.graphics.Color.DarkGray
        )
        if (!isNumber) {
            OutlinedTextField(
                value = textState,
                onValueChange = onTextChange,
                modifier = Modifier.padding(start = 16.dp).weight(0.65f),
                textStyle = LocalTextStyle.current.copy(fontSize = 20.sp),
                visualTransformation = (
                        if (isPasswordField)
                            PasswordVisualTransformation()
                        else
                            VisualTransformation.None),
                label = { Text("Enter $label") },
                placeholder = { Text("Enter $label") })
        }
        else{
            NumericOutlinedTextField(label= label, value = textState,
                modifier = Modifier,
            onTextChange= onTextChange)}
    }
}
@Composable
fun NumericOutlinedTextField(label: String,
                             value: String,
                             modifier: Modifier,
                             onTextChange: (String)->Unit){
    OutlinedTextField(
        value=value,
        onValueChange = { newText ->
            if (newText.all{ it.isDigit() }){
                onTextChange(newText)
            }
        },
        modifier = modifier,
        label={ Text("Enter $label")},
        textStyle = LocalTextStyle.current.copy(fontSize = 14.sp),
        placeholder = { Text("Enter $label")},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        visualTransformation = VisualTransformation.None
    )
}
