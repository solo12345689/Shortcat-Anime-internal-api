package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f49663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f49664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49665e;

    public void a(long j10, long j11, boolean z10, boolean z11) {
        this.f49665e += j10;
        if (z11) {
            this.f49664d += j11;
            this.f49662b++;
        } else if (z10) {
            this.f49663c += j11;
            this.f49661a++;
        }
    }

    public int b() {
        return this.f49662b;
    }

    public long c() {
        return this.f49664d;
    }

    public int d() {
        return this.f49661a;
    }

    public long e() {
        return this.f49663c;
    }

    public int f() {
        return this.f49661a + this.f49662b;
    }

    public long g() {
        return this.f49665e;
    }
}
