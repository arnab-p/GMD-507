package com.example.gmd507.chat;

import android.os.AsyncTask;

public class ChatRequestAsyncTask extends AsyncTask<Void, Void, Void> {

    private ChatRequestListener listener;

    public ChatRequestAsyncTask(ChatRequestListener listener) {
        this.listener = listener;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }
}
