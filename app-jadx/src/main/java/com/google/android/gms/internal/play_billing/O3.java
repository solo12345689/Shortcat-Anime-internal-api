package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class O3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f40242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    S3 f40243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U3 f40244c = U3.h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40245d;

    O3() {
    }

    final void a() {
        this.f40242a = null;
        this.f40243b = null;
        this.f40244c.c(null);
    }

    public final boolean b(Object obj) {
        this.f40245d = true;
        S3 s32 = this.f40243b;
        boolean z10 = s32 != null && s32.a(obj);
        if (z10) {
            this.f40242a = null;
            this.f40243b = null;
            this.f40244c = null;
        }
        return z10;
    }

    protected final void finalize() {
        U3 u32;
        S3 s32 = this.f40243b;
        if (s32 != null && !s32.isDone()) {
            s32.b(new P3("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f40242a))));
        }
        if (this.f40245d || (u32 = this.f40244c) == null) {
            return;
        }
        u32.c(null);
    }
}
