package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3389s1 extends AbstractC3381p1 {
    C3389s1() {
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3381p1
    final /* synthetic */ Object a(Object obj) {
        return ((C0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3381p1
    final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) {
        if (!C3386r1.a().equals(obj2)) {
            if (C3386r1.a().equals(obj)) {
                return C3386r1.c((C3386r1) obj, (C3386r1) obj2);
            }
            ((C3386r1) obj).b((C3386r1) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3381p1
    final void c(Object obj) {
        ((C0) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3381p1
    final /* synthetic */ void d(Object obj, Object obj2) {
        ((C0) obj).zzc = (C3386r1) obj2;
    }
}
