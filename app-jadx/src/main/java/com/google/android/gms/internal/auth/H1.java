package com.google.android.gms.internal.auth;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H1 extends C0 implements InterfaceC3336a1 {
    private static final H1 zzb;
    private E0 zzd = C0.e();

    static {
        H1 h12 = new H1();
        zzb = h12;
        C0.j(H1.class, h12);
    }

    private H1() {
    }

    public static H1 r(byte[] bArr) {
        return (H1) C0.d(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.C0
    protected final Object o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return C0.g(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new H1();
        }
        F1 f12 = null;
        if (i11 == 4) {
            return new G1(f12);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List s() {
        return this.zzd;
    }
}
