package com.facebook.react.views.scroll;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f38015f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38019d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38016a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38017b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f38020e = -11;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final float a() {
        return this.f38018c;
    }

    public final float b() {
        return this.f38019d;
    }

    public final boolean c(int i10, int i11) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f38020e;
        boolean z10 = (jUptimeMillis - j10 <= 10 && this.f38016a == i10 && this.f38017b == i11) ? false : true;
        if (jUptimeMillis - j10 != 0) {
            this.f38018c = (i10 - this.f38016a) / (jUptimeMillis - j10);
            this.f38019d = (i11 - this.f38017b) / (jUptimeMillis - j10);
        }
        this.f38020e = jUptimeMillis;
        this.f38016a = i10;
        this.f38017b = i11;
        return z10;
    }
}
