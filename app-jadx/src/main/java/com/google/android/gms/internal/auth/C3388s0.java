package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3388s0 extends AbstractC3394u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f39300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39303e;

    /* synthetic */ C3388s0(byte[] bArr, int i10, int i11, boolean z10, AbstractC3385r0 abstractC3385r0) {
        super(null);
        this.f39303e = Integer.MAX_VALUE;
        this.f39300b = bArr;
        this.f39301c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f39303e;
        this.f39303e = 0;
        int i12 = this.f39301c + this.f39302d;
        this.f39301c = i12;
        if (i12 <= 0) {
            this.f39302d = 0;
            return i11;
        }
        this.f39302d = i12;
        this.f39301c = 0;
        return i11;
    }
}
