package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.AbstractC5204g2;
import io.sentry.C5205g3;
import io.sentry.EnumC5215i3;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryInitProvider extends A0 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C5174z c5174z = new C5174z();
        Context context = getContext();
        if (context == null) {
            c5174z.c(EnumC5215i3.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!O0.c(context, c5174z) || AbstractC5156p0.f(context)) {
            return true;
        }
        Y0.e(context, c5174z);
        C5205g3.d().a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        AbstractC5204g2.k();
    }
}
