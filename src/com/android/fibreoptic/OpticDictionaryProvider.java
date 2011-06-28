package com.android.fibreoptic;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.net.Uri;

public class OpticDictionaryProvider extends ContentProvider{
       String TAG = "OpticDictioanryProvider";
       
       public static String AUTHORITY = "com.android.fibreoptic.OpticDictioanryProvider";
       public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/dictionary");

       
    // MIME types used for searching words or looking up a single definition
       public static final String WORDS_MIME_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE +
                                                     "/vnd.android.fibreoptic";
       public static final String DEFINITION_MIME_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE +
                                                          "/vnd.android.fibreoptic";

}
