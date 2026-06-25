package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O5 implements B5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E5 f39530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f39532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39533d;

    O5(E5 e52, String str, Object[] objArr) {
        this.f39530a = e52;
        this.f39531b = str;
        this.f39532c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f39533d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f39533d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f39531b;
    }

    final Object[] b() {
        return this.f39532c;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final E5 j() {
        return this.f39530a;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final int k() {
        int i10 = this.f39533d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final boolean zza() {
        return (this.f39533d & 2) == 2;
    }
}
