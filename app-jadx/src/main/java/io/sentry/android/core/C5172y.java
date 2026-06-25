package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5172y implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50058a;

    public C5172y() {
        this("Sentry");
    }

    private int e(EnumC5215i3 enumC5215i3) {
        return 7;
    }

    @Override // io.sentry.ILogger
    public void a(EnumC5215i3 enumC5215i3, Throwable th2, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            b(enumC5215i3, str, th2);
        } else {
            b(enumC5215i3, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC5215i3 enumC5215i3, String str, Throwable th2) {
        Log.wtf(this.f50058a, str, th2);
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5215i3 enumC5215i3, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(enumC5215i3), this.f50058a, str);
        } else {
            Log.println(e(enumC5215i3), this.f50058a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC5215i3 enumC5215i3) {
        return true;
    }

    public C5172y(String str) {
        this.f50058a = str;
    }
}
