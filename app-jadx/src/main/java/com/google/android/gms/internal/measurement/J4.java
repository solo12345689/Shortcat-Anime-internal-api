package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class J4 extends K4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39399d;

    /* synthetic */ J4(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f39399d = Integer.MAX_VALUE;
        this.f39397b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f39399d;
        this.f39399d = 0;
        int i12 = this.f39397b + this.f39398c;
        this.f39397b = i12;
        if (i12 <= 0) {
            this.f39398c = 0;
            return i11;
        }
        this.f39398c = i12;
        this.f39397b = 0;
        return i11;
    }
}
