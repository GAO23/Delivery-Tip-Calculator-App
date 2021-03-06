package io.github.gao23.myapplication.UI;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import io.github.gao23.myapplication.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ((TextView) findViewById(R.id.aboutText)).setText("Cash tip is delivery in which the food is unpaid and customer will pay you in cash when you deliver. Computer tip is delivery in which customer has already paid for the food. Order ID can be order number or the delivery address or anything you can use to identify which delivery this is. Fields for cash tip are pretty much self explanatory. For computer tip, if the customer pays for the food already but wish to tip you in cash, check cash tip. After the day closes, tap on calculate to see amount of money you owed to the store in cash. This is calculated by subtracting your tips from store's sales in food that are paid in cash.\n\nVisit my github page to report bugs:");
        this.getSupportActionBar().setTitle("About");
    }


    public void openGithub(View view){
        Uri uri = Uri.parse("https://github.com/GAO23/Delivery-Tip-Tracker");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        startActivity(intent);

    }
}
