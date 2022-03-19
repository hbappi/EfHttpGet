package com.efortshub.efhttpget;

import androidx.annotation.NonNull;

/**
 * Created by H. Bappi on  7:16 PM  3/19/22.
 * Contact email:
 * contact@efortshub.com
 * bappi@efortshub.com
 * contact.efortshub@gmail.com
 * github: https://github.com/hbappi
 * website: efortshub.com
 * Copyright (c) 2022 eFortsHub . All rights reserved.
 **/

 public class Sb{
    String ss;
    Sb(){ ss = ""; }
    @NonNull
    public String toStr() {
        return this.ss;
    }
    public void conc(String ss) {
        this.ss = this.ss+ss;
    }
}