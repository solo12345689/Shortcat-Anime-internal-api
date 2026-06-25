package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3711o2 implements InterfaceC3651c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3666f2 f40525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f40527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40528d;

    C3711o2(InterfaceC3666f2 interfaceC3666f2, String str, Object[] objArr) {
        this.f40525a = interfaceC3666f2;
        this.f40526b = str;
        this.f40527c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f40528d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f40528d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f40526b;
    }

    final Object[] b() {
        return this.f40527c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3651c2
    public final boolean j() {
        return (this.f40528d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3651c2
    public final int k() {
        int i10 = this.f40528d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3651c2
    public final InterfaceC3666f2 zza() {
        return this.f40525a;
    }
}
