package kotlin.jvm.internal;

import pe.InterfaceC6013c;
import pe.InterfaceC6020j;
import pe.InterfaceC6024n;

/* JADX INFO: renamed from: kotlin.jvm.internal.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5508w extends A implements InterfaceC6020j {
    public AbstractC5508w(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    protected InterfaceC6013c computeReflected() {
        return O.d(this);
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return get();
    }

    @Override // pe.InterfaceC6023m
    /* JADX INFO: renamed from: d */
    public InterfaceC6024n.a j0() {
        return ((InterfaceC6020j) getReflected()).j0();
    }

    @Override // pe.InterfaceC6019i
    public InterfaceC6020j.a g() {
        return ((InterfaceC6020j) getReflected()).g();
    }
}
