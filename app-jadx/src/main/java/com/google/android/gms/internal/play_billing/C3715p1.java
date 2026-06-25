package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3715p1 extends AbstractC3724r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40534d;

    /* synthetic */ C3715p1(byte[] bArr, int i10, int i11, boolean z10, AbstractC3720q1 abstractC3720q1) {
        super(null);
        this.f40534d = Integer.MAX_VALUE;
        this.f40532b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f40534d;
        this.f40534d = 0;
        int i12 = this.f40532b + this.f40533c;
        this.f40532b = i12;
        if (i12 <= 0) {
            this.f40533c = 0;
            return i11;
        }
        this.f40533c = i12;
        this.f40532b = 0;
        return i11;
    }
}
