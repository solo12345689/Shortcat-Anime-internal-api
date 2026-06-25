package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f49793e;

    public b(Context context, ILogger iLogger) {
        super(iLogger);
        this.f49793e = AbstractC5156p0.g(context);
        new Thread(new Runnable() { // from class: io.sentry.android.core.internal.modules.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f49792a.a();
            }
        }).start();
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f49793e.getAssets().open("sentry-external-modules.txt");
            try {
                Map mapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return mapC;
                }
                inputStreamOpen.close();
                return mapC;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f50766a.c(EnumC5215i3.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e10) {
            this.f50766a.b(EnumC5215i3.ERROR, "Error extracting modules.", e10);
            return treeMap;
        }
    }
}
