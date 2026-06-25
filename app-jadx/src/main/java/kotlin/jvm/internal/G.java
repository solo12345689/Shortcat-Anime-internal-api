package kotlin.jvm.internal;

import pe.InterfaceC6013c;
import pe.InterfaceC6026p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class G extends I implements InterfaceC6026p {
    public G(Class cls, String str, String str2, int i10) {
        super(AbstractC5492f.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    protected InterfaceC6013c computeReflected() {
        return O.l(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return w(obj, obj2);
    }

    @Override // pe.InterfaceC6023m
    public InterfaceC6026p.a d() {
        return ((InterfaceC6026p) getReflected()).d();
    }
}
