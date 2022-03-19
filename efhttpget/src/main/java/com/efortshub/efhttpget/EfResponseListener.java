package com.efortshub.efhttpget;

/**
 * Created by H. Bappi on  7:08 PM  3/19/22.
 * Contact email:
 * contact@efortshub.com
 * bappi@efortshub.com
 * contact.efortshub@gmail.com
 * github: https://github.com/hbappi
 * website: efortshub.com
 * Copyright (c) 2022 eFortsHub . All rights reserved.
 **/

public interface EfResponseListener {
    void onSuccess(String response);
    void onError(String errorResponse);
}
