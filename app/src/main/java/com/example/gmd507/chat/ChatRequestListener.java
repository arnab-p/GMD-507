package com.example.gmd507.chat;

import java.util.ArrayList;

public interface ChatRequestListener {
    void onSuccess(String chatResponse);

    void onError(String errorMsg);
}
