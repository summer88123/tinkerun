package com.tinkerun.patch;

import android.content.Intent;
import android.util.Log;

import com.tencent.tinker.lib.service.DefaultTinkerResultService;

/**
 * Created by tianlupan on 2017/11/14.
 */

public class TinkerunResultService extends DefaultTinkerResultService {
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Tinkerun","收到result");
        super.onHandleIntent(intent);
    }
}
