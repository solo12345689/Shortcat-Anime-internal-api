package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3588u implements Iterable, InterfaceC3553q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39996a;

    public C3588u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f39996a = str;
    }

    final /* synthetic */ String b() {
        return this.f39996a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3588u) {
            return this.f39996a.equals(((C3588u) obj).f39996a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39996a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3579t(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        return this.f39996a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        String str = this.f39996a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        return Boolean.valueOf(!this.f39996a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return new C3570s(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        return new C3588u(this.f39996a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d8 A[PHI: r10
  0x02d8: PHI (r10v6 boolean) = (r10v12 boolean), (r10v13 boolean), (r10v16 boolean) binds: [B:100:0x02c4, B:101:0x02c6, B:103:0x02d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e2 A[LOOP:0: B:108:0x02e0->B:109:0x02e2, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC3553q r(java.lang.String r26, com.google.android.gms.internal.measurement.Y1 r27, java.util.List r28) {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3588u.r(java.lang.String, com.google.android.gms.internal.measurement.Y1, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    public final String toString() {
        String str = this.f39996a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }
}
