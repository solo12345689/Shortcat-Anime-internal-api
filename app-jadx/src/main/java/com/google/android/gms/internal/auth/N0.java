package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class N0 extends P0 {
    /* synthetic */ N0(M0 m02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j10) {
        ((E0) A1.f(obj, j10)).j();
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void b(Object obj, Object obj2, long j10) {
        E0 e0A = (E0) A1.f(obj, j10);
        E0 e02 = (E0) A1.f(obj2, j10);
        int size = e0A.size();
        int size2 = e02.size();
        if (size > 0 && size2 > 0) {
            if (!e0A.k()) {
                e0A = e0A.a(size2 + size);
            }
            e0A.addAll(e02);
        }
        if (size > 0) {
            e02 = e0A;
        }
        A1.p(obj, j10, e02);
    }
}
