package df;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.S;
import ye.AbstractC7246y;
import ye.H;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: df.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4602k extends AbstractC4598g {

    /* JADX INFO: renamed from: b */
    private final Xe.b f45157b;

    /* JADX INFO: renamed from: c */
    private final Xe.f f45158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4602k(Xe.b enumClassId, Xe.f enumEntryName) {
        super(Td.z.a(enumClassId, enumEntryName));
        AbstractC5504s.h(enumClassId, "enumClassId");
        AbstractC5504s.h(enumEntryName, "enumEntryName");
        this.f45157b = enumClassId;
        this.f45158c = enumEntryName;
    }

    @Override // df.AbstractC4598g
    public S a(H module) {
        AbstractC6183d0 abstractC6183d0P;
        AbstractC5504s.h(module, "module");
        InterfaceC7227e interfaceC7227eB = AbstractC7246y.b(module, this.f45157b);
        if (interfaceC7227eB != null) {
            if (!bf.i.A(interfaceC7227eB)) {
                interfaceC7227eB = null;
            }
            if (interfaceC7227eB != null && (abstractC6183d0P = interfaceC7227eB.p()) != null) {
                return abstractC6183d0P;
            }
        }
        return sf.l.d(sf.k.f59668W0, this.f45157b.toString(), this.f45158c.toString());
    }

    public final Xe.f c() {
        return this.f45158c;
    }

    @Override // df.AbstractC4598g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45157b.h());
        sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb2.append(this.f45158c);
        return sb2.toString();
    }
}
