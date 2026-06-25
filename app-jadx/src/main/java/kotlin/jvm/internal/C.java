package kotlin.jvm.internal;

import pe.InterfaceC6013c;
import pe.InterfaceC6024n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C extends I implements InterfaceC6024n {
    public C(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    protected InterfaceC6013c computeReflected() {
        return O.j(this);
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return get();
    }

    @Override // pe.InterfaceC6023m
    public InterfaceC6024n.a d() {
        return ((InterfaceC6024n) getReflected()).d();
    }
}
