/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView weatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);


        weatherDisplay = (TextView)findViewById(R.id.tv_weather_data);

        String[] fakeData ={"a Olteniei și a Transilvaniei – depuneri de polei"," în zona de munte - intensificări ale vântului, ninsori însemnate cantitativ, strat de zăpadă consistent",
        "Bucuresti 26", "Alexandria 35", "Rosiori 27","Zimnicea 19", "Constanta 27", " Calarasi 15", "slobozia 20"};

        for (String data : fakeData)
        {
            weatherDisplay.append(data+"\n \n \n");
        }
    }
}