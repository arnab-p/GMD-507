package com.example.gmd507.network;

public interface NetworkResponseHandler {
    void onSuccess(String response);
    void onError(String error);
}
