/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package vn.linh.androidslidingpanelayout.normalslidemenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import vn.linh.androidslidingpanelayout.R;
import vn.linh.androidslidingpanelayout.normalslidemenu.fragment.Fragment1;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replace();
    }

    private void replace(){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                Fragment1.newInstance()).commit();
    }

    View currentFocus;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(currentFocus!=null){
            currentFocus.setBackgroundColor(Color.TRANSPARENT);
        }
        currentFocus = getCurrentFocus();
        currentFocus.setBackgroundColor(Color.RED);
        return super.onKeyDown(keyCode, event);
    }
}
