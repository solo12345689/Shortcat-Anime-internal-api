package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3596u7;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class J2 implements InterfaceC3596u7 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ P2 f40815a;

    J2(P2 p22) {
        Objects.requireNonNull(p22);
        this.f40815a = p22;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3596u7
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        C3873o2 c3873o2U = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.f40815a.f40611a.a().u() : z10 ? this.f40815a.f40611a.a().s() : !z11 ? this.f40815a.f40611a.a().t() : this.f40815a.f40611a.a().r() : this.f40815a.f40611a.a().w() : z10 ? this.f40815a.f40611a.a().p() : !z11 ? this.f40815a.f40611a.a().q() : this.f40815a.f40611a.a().o() : this.f40815a.f40611a.a().v();
        int size = list.size();
        if (size == 1) {
            c3873o2U.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c3873o2U.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c3873o2U.a(str);
        } else {
            c3873o2U.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
