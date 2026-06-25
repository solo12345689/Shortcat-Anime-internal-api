package kotlin.jvm.internal;

import pe.InterfaceC6013c;
import pe.InterfaceC6025o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class E extends I implements InterfaceC6025o {
    public E(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    protected InterfaceC6013c computeReflected() {
        return O.k(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // pe.InterfaceC6023m
    /* JADX INFO: renamed from: d */
    public InterfaceC6025o.a j0() {
        return ((InterfaceC6025o) getReflected()).j0();
    }
}
