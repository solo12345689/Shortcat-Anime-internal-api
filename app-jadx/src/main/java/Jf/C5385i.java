package jf;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C6041f;
import pf.InterfaceC6044i;

/* JADX INFO: renamed from: jf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5385i extends AbstractC5377a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6044i f51795b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5385i(InterfaceC5082a getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        AbstractC5504s.h(getScope, "getScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5387k k(InterfaceC5082a interfaceC5082a) {
        InterfaceC5387k interfaceC5387k = (InterfaceC5387k) interfaceC5082a.invoke();
        return interfaceC5387k instanceof AbstractC5377a ? ((AbstractC5377a) interfaceC5387k).h() : interfaceC5387k;
    }

    @Override // jf.AbstractC5377a
    protected InterfaceC5387k i() {
        return (InterfaceC5387k) this.f51795b.invoke();
    }

    public /* synthetic */ C5385i(pf.n nVar, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6041f.f56045e : nVar, interfaceC5082a);
    }

    public C5385i(pf.n storageManager, InterfaceC5082a getScope) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(getScope, "getScope");
        this.f51795b = storageManager.c(new C5384h(getScope));
    }
}
