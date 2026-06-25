package androidx.media3.exoplayer;

import M2.D;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;
import q2.C6082N;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: androidx.media3.exoplayer.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2907s extends C6082N {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f31212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f31213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f31214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C6109x f31215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f31216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D.b f31217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f31218p;

    private C2907s(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, null, false);
    }

    public static C2907s i(Throwable th2, String str, int i10, C6109x c6109x, int i11, D.b bVar, boolean z10, int i12) {
        if (c6109x == null) {
            i11 = 4;
        }
        return new C2907s(1, th2, null, i12, str, i10, c6109x, i11, bVar, z10);
    }

    public static C2907s j(IOException iOException, int i10) {
        return new C2907s(0, iOException, i10);
    }

    public static C2907s k(RuntimeException runtimeException, int i10) {
        return new C2907s(2, runtimeException, i10);
    }

    private static String l(int i10, String str, String str2, int i11, C6109x c6109x, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + c6109x + ", format_supported=" + t2.a0.f0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Override // q2.C6082N
    public boolean c(C6082N c6082n) {
        if (!super.c(c6082n)) {
            return false;
        }
        C2907s c2907s = (C2907s) t2.a0.l(c6082n);
        return this.f31212j == c2907s.f31212j && Objects.equals(this.f31213k, c2907s.f31213k) && this.f31214l == c2907s.f31214l && Objects.equals(this.f31215m, c2907s.f31215m) && this.f31216n == c2907s.f31216n && Objects.equals(this.f31217o, c2907s.f31217o) && this.f31218p == c2907s.f31218p;
    }

    C2907s h(D.b bVar) {
        return new C2907s((String) t2.a0.l(getMessage()), getCause(), this.f56595a, this.f31212j, this.f31213k, this.f31214l, this.f31215m, this.f31216n, bVar, this.f56596b, this.f31218p);
    }

    private C2907s(int i10, Throwable th2, String str, int i11, String str2, int i12, C6109x c6109x, int i13, D.b bVar, boolean z10) {
        this(l(i10, str, str2, i12, c6109x, i13), th2, i11, i10, str2, i12, c6109x, i13, bVar, SystemClock.elapsedRealtime(), z10);
    }

    private C2907s(String str, Throwable th2, int i10, int i11, String str2, int i12, C6109x c6109x, int i13, D.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        AbstractC6614a.a(!z10 || i11 == 1);
        AbstractC6614a.a(th2 != null || i11 == 3);
        this.f31212j = i11;
        this.f31213k = str2;
        this.f31214l = i12;
        this.f31215m = c6109x;
        this.f31216n = i13;
        this.f31217o = bVar;
        this.f31218p = z10;
    }
}
