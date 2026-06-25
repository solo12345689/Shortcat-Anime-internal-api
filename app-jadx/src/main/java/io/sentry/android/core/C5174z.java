package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5174z implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50062a;

    /* JADX INFO: renamed from: io.sentry.android.core.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50063a;

        static {
            int[] iArr = new int[EnumC5215i3.values().length];
            f50063a = iArr;
            try {
                iArr[EnumC5215i3.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50063a[EnumC5215i3.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50063a[EnumC5215i3.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50063a[EnumC5215i3.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50063a[EnumC5215i3.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C5174z() {
        this("Sentry");
    }

    private int e(EnumC5215i3 enumC5215i3) {
        int i10 = a.f50063a[enumC5215i3.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 != 2) {
            return i10 != 4 ? 3 : 7;
        }
        return 5;
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
        int i10 = a.f50063a[enumC5215i3.ordinal()];
        if (i10 == 1) {
            Log.i(this.f50062a, str, th2);
            return;
        }
        if (i10 == 2) {
            Log.w(this.f50062a, str, th2);
            return;
        }
        if (i10 == 3) {
            Log.e(this.f50062a, str, th2);
        } else if (i10 != 4) {
            Log.d(this.f50062a, str, th2);
        } else {
            Log.wtf(this.f50062a, str, th2);
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5215i3 enumC5215i3, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(enumC5215i3), this.f50062a, str);
        } else {
            Log.println(e(enumC5215i3), this.f50062a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC5215i3 enumC5215i3) {
        return true;
    }

    public C5174z(String str) {
        this.f50062a = str;
    }
}
