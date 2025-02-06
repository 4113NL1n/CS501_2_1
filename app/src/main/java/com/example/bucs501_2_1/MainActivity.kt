package com.example.bucs501_2_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.trackPipAnimationHintView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.Modifier.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bucs501_2_1.ui.theme.BUCS501_2_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BUCS501_2_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier.fillMaxSize().padding(innerPadding).background(Color(10,100,100))
                    ){
                        Card(
                            modifier = Modifier.align(Alignment.TopCenter).padding(top = 20.dp).wrapContentSize(),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(10,200,200)
                            )
                        ){
                            NameOfRecipe(
                                name = "Fried Rice",
                                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier.align(Alignment.TopCenter).padding(top = 80.dp).fillMaxWidth(),
                            ){
                            Row(
                                modifier = Modifier.align(Alignment.CenterHorizontally).width(100.dp).background(Color(200,100,0))
                                ){
                                    Text(
                                        text = "Ingredients",
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )

                            }
                            HorizontalDivider(
                                thickness = 20.dp,
                                color = Color(10,100,100)
                            )
                            Row(modifier = Modifier.fillMaxWidth().background(Color(10,100,100))
                            ){
                                Row(
                                    modifier = Modifier.background(Color(10,100,100)).padding(start = 50.dp)
                                ){
                                    Text("4 Eggs")
                                }
                                VerticalDivider(
                                    modifier = Modifier.height(0.dp),
                                    thickness = 20.dp
                                    )
                                Row (
                                    modifier = Modifier.background(Color(10,100,100))
                                ){
                                    Text("2 cups of cooked Rice")
                                }
                                VerticalDivider(
                                    modifier = Modifier.height(0.dp),
                                    thickness = 20.dp
                                )
                                Row(
                                    modifier = Modifier.background(Color(10,100,100)).padding(end = 20.dp)
                                ) {
                                    Text("2 Steak")
                                }

                            }
                            HorizontalDivider(
                                thickness = 20.dp,
                                color = Color(10,100,100)
                            )
                            Column(
                                modifier = Modifier.fillMaxSize().background(Color(10,100,100))
                            ){
                                Column(
                                    modifier = Modifier.fillMaxWidth().background(Color(10,130,100))
                                ){
                                    Text(text = "1) Scramble eggs till it's no longer liquid ")
                                }
                                HorizontalDivider(
                                    thickness = 20.dp,
                                    color = Color(10,100,100)
                                )
                                Column(
                                    modifier = Modifier.fillMaxWidth().background(Color(10,130,100))
                                ){
                                    Text(text = "2) Take eggs out the pan and heat pan to max for 30 second")
                                }
                                HorizontalDivider(
                                    thickness = 20.dp,
                                    color = Color(10,100,100)
                                )
                                Column(
                                    modifier = Modifier.fillMaxWidth().background(Color(10,130,100))
                                ){
                                    Text(text = "3) Put in the rice and stir constantly for 1 minute")
                                }
                                HorizontalDivider(
                                    thickness = 20.dp,
                                    color = Color(10,100,100)
                                )
                                Column(
                                    modifier = Modifier.fillMaxWidth().background(Color(10,130,100))
                                ){
                                    Text(text = "4) Take the rice out, heat pan for 30 more seconds")
                                }
                                HorizontalDivider(
                                    thickness = 20.dp,
                                    color = Color(10,100,100)
                                )
                                Column(
                                    modifier = Modifier.fillMaxWidth().background(Color(10,130,100))
                                ){
                                    Text(text = "5) Put in the diced steak and pan fiy each side for 1 to 2 min each")
                                }
                                HorizontalDivider(
                                    thickness = 20.dp,
                                    color = Color(10,100,100)
                                )
                                Column(
                                    modifier = Modifier.fillMaxWidth().background(Color(10,130,100))
                                ){
                                    Text(text = "6) Put back in the egg and rice and any desired seasoning")
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun NameOfRecipe(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Recipe : $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BUCS501_2_1Theme {
        NameOfRecipe("Android")
    }
}