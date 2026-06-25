package ig;

import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends AbstractC5097a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC5082a f48885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z10, InterfaceC5082a interfaceC5082a) {
        super(str, z10);
        this.f48885e = interfaceC5082a;
    }

    @Override // ig.AbstractC5097a
    public long f() {
        this.f48885e.invoke();
        return -1L;
    }
}
