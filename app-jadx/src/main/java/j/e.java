package J;

import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5096o;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.E1;
import s0.InterfaceC6374m1;
import s0.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5096o f9194a;

    public e(InterfaceC5096o interfaceC5096o) {
        this.f9194a = interfaceC5096o;
    }

    @Override // s0.E1
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public AbstractC6362i1 mo6createOutlinePq9zytI(long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d) {
        InterfaceC6374m1 interfaceC6374m1A = V.a();
        this.f9194a.invoke(interfaceC6374m1A, C6230l.c(j10), enumC5027t);
        interfaceC6374m1A.close();
        return new AbstractC6362i1.a(interfaceC6374m1A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return (eVar != null ? eVar.f9194a : null) == this.f9194a;
    }

    public int hashCode() {
        return this.f9194a.hashCode();
    }
}
