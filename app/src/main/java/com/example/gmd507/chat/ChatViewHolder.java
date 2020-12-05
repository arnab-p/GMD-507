package com.example.gmd507.chat;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    private ChatDetails chatDetails;
    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void setChatDetails(ChatDetails chatDetails) {
        this.chatDetails = chatDetails;

        // put details from chatDetails on the view
    }
}
