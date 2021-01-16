package com.example.gmd507.chat;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gmd507.R;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {
    private ArrayList<ChatDetails> chatDetails = new ArrayList<>();
    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chat_activity);
        recyclerView = findViewById(R.id.chatRecycler);

//        - Request for the chat data
//        - Setup the RecyclerView
//        - Wait for the chat data to come
//        - Parse the JSON data to ArrayList<ChatDetails>
//        - Once available, set the data to recycler view

        ChatRequestAsyncTask task = new ChatRequestAsyncTask(new ChatRequestListener() {
            @Override
            public void onSuccess(String chatResponse) {
                // parse the response to ArrayList<ChatDetails>
                // set data to recycler view

                parseResponse(chatResponse);
            }

            @Override
            public void onError(String errorMsg) {
                // show error message
            }
        });

        this.chatAdapter = new ChatAdapter(this, this.chatDetails);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        this.recyclerView.setLayoutManager(layoutManager);
        this.recyclerView.setAdapter(this.chatAdapter);
    }

    private void parseResponse(String response) {
        // responsible for parsing the JSON and forming the ArrayList

        this.chatAdapter.notifyDataSetChanged();
    }
}
