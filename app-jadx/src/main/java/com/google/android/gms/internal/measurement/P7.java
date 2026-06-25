package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class P7 extends AbstractC3499k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3596u7 f39544c;

    public P7(InterfaceC3596u7 interfaceC3596u7) {
        super("internal.logger");
        this.f39544c = interfaceC3596u7;
        this.f39807b.put("log", new O7(this, false, true));
        this.f39807b.put("silent", new C3577s6(this, "silent"));
        ((AbstractC3499k) this.f39807b.get("silent")).d("log", new O7(this, true, true));
        this.f39807b.put("unmonitored", new T6(this, "unmonitored"));
        ((AbstractC3499k) this.f39807b.get("unmonitored")).d("log", new O7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k
    public final InterfaceC3553q a(Y1 y12, List list) {
        return InterfaceC3553q.f39929W;
    }

    final /* synthetic */ InterfaceC3596u7 h() {
        return this.f39544c;
    }
}
