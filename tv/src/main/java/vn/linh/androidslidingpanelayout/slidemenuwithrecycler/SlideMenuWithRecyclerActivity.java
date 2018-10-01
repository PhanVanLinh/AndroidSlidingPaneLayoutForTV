package vn.linh.androidslidingpanelayout.slidemenuwithrecycler;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import vn.linh.androidslidingpanelayout.R;
import vn.linh.androidslidingpanelayout.normalslidemenu.fragment.Fragment1;
import vn.linh.androidslidingpanelayout.slidemenuwithrecycler.adapter.MenuAdapter;
import vn.linh.androidslidingpanelayout.slidemenuwithrecycler.adapter.MenuItem;

public class SlideMenuWithRecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerViewMenu;
    MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_menu_with_recycler);

        recyclerViewMenu = findViewById(R.id.recycler_view_menu);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));
        menuAdapter = new MenuAdapter();
        recyclerViewMenu.setAdapter(menuAdapter);

        menuAdapter.setData(adapters());
        replace();
    }

    private List<MenuItem> adapters() {
        return new ArrayList<MenuItem>() {{
            add(new MenuItem("1"));
            add(new MenuItem("2"));
            add(new MenuItem("3"));
            add(new MenuItem("4"));
        }};
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
