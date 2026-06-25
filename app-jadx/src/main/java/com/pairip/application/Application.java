package com.pairip.application;

import android.content.Context;
import com.flagcat.shortcat.MainApplication;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends MainApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
