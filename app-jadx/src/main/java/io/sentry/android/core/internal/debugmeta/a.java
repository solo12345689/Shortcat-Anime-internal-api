package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.util.AbstractC5291d;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f49763b;

    public a(Context context, ILogger iLogger) {
        this.f49762a = AbstractC5156p0.g(context);
        this.f49763b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f49762a.getAssets().open(AbstractC5291d.f51421a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f49763b.c(EnumC5215i3.INFO, "%s file was not found.", AbstractC5291d.f51421a);
            return null;
        } catch (IOException e10) {
            this.f49763b.b(EnumC5215i3.ERROR, "Error getting Proguard UUIDs.", e10);
            return null;
        } catch (RuntimeException e11) {
            this.f49763b.a(EnumC5215i3.ERROR, e11, "%s file is malformed.", AbstractC5291d.f51421a);
            return null;
        }
    }
}
