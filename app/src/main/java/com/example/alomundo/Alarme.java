package com.example.alomundo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.Toast;

public class Alarme extends BroadcastReceiver {
    private MediaPlayer mp;

    @Override
    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context,R.raw.musica);
        mp.start();
        Toast.makeText(context, "Recebido", Toast.LENGTH_SHORT).show();

    }
}
