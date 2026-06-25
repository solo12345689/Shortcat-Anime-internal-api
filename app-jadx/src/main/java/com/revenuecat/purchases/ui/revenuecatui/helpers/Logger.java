package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;", "", "<init>", "()V", "", "message", "LTd/L;", "e", "(Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "w", "i", "d", "TAG", "Ljava/lang/String;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Logger {
    public static final int $stable = 0;
    public static final Logger INSTANCE = new Logger();
    private static final String TAG = "[Purchases]";

    private Logger() {
    }

    public final void d(String message) {
        AbstractC5504s.h(message, "message");
        Log.d(TAG, message);
    }

    public final void e(String message) {
        AbstractC5504s.h(message, "message");
        Log.e(TAG, message);
    }

    public final void i(String message) {
        AbstractC5504s.h(message, "message");
        Log.i(TAG, message);
    }

    public final void w(String message) {
        AbstractC5504s.h(message, "message");
        Log.w(TAG, message);
    }

    public final void e(String message, Throwable throwable) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(throwable, "throwable");
        Log.e(TAG, message, throwable);
    }
}
