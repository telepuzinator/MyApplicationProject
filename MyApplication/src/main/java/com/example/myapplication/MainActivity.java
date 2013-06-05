package com.example.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.turn.ttorrent.client.Client;
import com.turn.ttorrent.client.SharedTorrent;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startDownload();
    }

    private void startDownload() {
        File in = new File(Environment.getExternalStorageDirectory() + "/Download/example.torrent");
        Log.i("TAG", "File: " + in.getAbsolutePath());
        new DownloadTask(in).execute();
    }

    private class DownloadTask extends AsyncTask<Void, Void, Void> {
        File in;

        public DownloadTask(File input) {
            this.in = input;
        }

        @Override
        protected Void doInBackground(Void... params) {
            Log.i("TAG", "Async start");
            try {
                Client client = new Client(
                        InetAddress.getLocalHost(),
                        SharedTorrent.fromFile(in, Environment.getExternalStorageDirectory())
                );
                Log.i("TAG", "Client started");
                client.download();
                Log.i("TAG", "Download started");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
