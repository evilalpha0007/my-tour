package com.example.mytour;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView gatewayimg = findViewById(R.id.gatewayofindiaimg);
        ImageView redfortimg = findViewById(R.id.redfortimg);
        ImageView shaniwaarwadaimg = findViewById(R.id.shaniwaarwadaimg);
        TextView gatewaytxt = findViewById(R.id.gatewayofindiatxt);
        TextView redforttxt = findViewById(R.id.Redforttxt);
        TextView shaniwaarwadatxt = findViewById(R.id.shaniwaarwadatxt);

        gatewayimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchWeb(" https://en.wikipedia.org/wiki/Gateway_of_India ");
            }
        });

        gatewaytxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchWeb(" https://en.wikipedia.org/wiki/Gateway_of_India ");
            }
        });

        redfortimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchWeb(" https://www.britannica.com/topic/Red-Fort");
            }
        });

        redforttxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchWeb(" https://www.britannica.com/topic/Red-Fort");
            }
        });

        shaniwaarwadaimg.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchWeb(" en.wikipedia.org/wiki/Shaniwar_Wada ");
            }
        }));

        shaniwaarwadatxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchWeb(" en.wikipedia.org/wiki/Shaniwar_Wada ");
            }
        });

    }
    public void searchWeb(String query) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, query);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

          }

