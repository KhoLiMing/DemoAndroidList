package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView VersionList;
    ArrayList ListofVersion;
    ArrayAdapter VersionListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VersionList=findViewById(R.id.listOfVersions);

        ListofVersion=new ArrayList<AndroidVersion>();

        ListofVersion.add(new AndroidVersion("pie","9.0"));
        ListofVersion.add(new AndroidVersion("apple","8.0"));

        VersionListAdapter=new CustomAdapter(this,R.layout.row,ListofVersion);

        VersionList.setAdapter(VersionListAdapter);




    }
}
