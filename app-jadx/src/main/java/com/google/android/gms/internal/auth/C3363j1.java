package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3363j1 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f39253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39254b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f39255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39256d;

    C3363j1(Z0 z02, String str, Object[] objArr) {
        this.f39253a = z02;
        this.f39255c = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.f39256d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i11);
            if (cCharAt2 < 55296) {
                this.f39256d = (cCharAt2 << i12) | i10;
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f39254b;
    }

    final Object[] b() {
        return this.f39255c;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final boolean j() {
        return (this.f39256d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final int k() {
        return (this.f39256d & 1) != 0 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final Z0 zza() {
        return this.f39253a;
    }
}
