package com.example.a21746033.noplanetb2;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

public class BMain extends AppCompatActivity {

    private ImageView ivBackground;

    private SwipeRefreshLayout swipeLayout;
    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {

            final RelativeLayout mrelativeLayout = findViewById(R.id.rlMain);

            Snackbar snackbar = Snackbar
                    .make(mrelativeLayout, "fancy a Snack while you refresh?", Snackbar.LENGTH_LONG)
                    .setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar snackbar1 = Snackbar.make(mrelativeLayout, "Action is restored!", Snackbar.LENGTH_SHORT);
                            snackbar1.show();
                        }
                    });

            snackbar.show();
            swipeLayout.setRefreshing(false);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmain);

        ivBackground = findViewById(R.id.ivBackground);

        Glide.with(this)
                .load(R.drawable.planetearth)
                .into(ivBackground);

        swipeLayout = findViewById(R.id.swipeLayout);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.mi_favourite){
            //TODO
        }
        else if(item.getItemId() == R.id.mi_exit){
            //TODO
        }

        return super.onOptionsItemSelected(item);
    }
}
