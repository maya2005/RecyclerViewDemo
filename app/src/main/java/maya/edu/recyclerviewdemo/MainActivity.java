package maya.edu.recyclerviewdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import maya.edu.recyclerviewdemo.models.Song;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView recycler = (RecyclerView) findViewById(R.id.songRecycler);

        recycler.setAdapter(new SongAdapter(getLayoutInflater(), getSongs()));

        recycler.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private ArrayList<Song> getSongs(){

        ArrayList <Song> songs = new ArrayList<>();


            songs.add(new Song("דברי איתי יותר", "נתן גושן ", R.drawable.song_dabri_iti_yoter));
            songs.add(new Song("ההבוקר שאחרי ","יותן רוזן ", R.drawable.song_haboker_shahri));
            songs.add(new Song("אם כבר ","היהודים", R.drawable.song_io_kavar));
            songs.add(new Song("השמלה ממדריד","מוניקה סקס", R.drawable.song_hsimla));
            songs.add(new Song("תסחטי אותי"," פורטיס", R.drawable.song_tishti_oti));

        return songs;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
