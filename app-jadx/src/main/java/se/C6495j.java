package se;

import Be.AbstractC1120o;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: se.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6495j extends AbstractC1120o {

    /* JADX INFO: renamed from: a */
    private final AbstractC6484d0 f59516a;

    public C6495j(AbstractC6484d0 container) {
        AbstractC5504s.h(container, "container");
        this.f59516a = container;
    }

    @Override // Be.AbstractC1120o, ye.InterfaceC7237o
    /* JADX INFO: renamed from: p */
    public AbstractC6453A b(InterfaceC7247z descriptor, Td.L data) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(data, "data");
        return new C6494i0(this.f59516a, descriptor);
    }

    @Override // ye.InterfaceC7237o
    /* JADX INFO: renamed from: q */
    public AbstractC6453A c(ye.Z descriptor, Td.L data) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(data, "data");
        int i10 = (descriptor.K() != null ? 1 : 0) + (descriptor.O() != null ? 1 : 0);
        if (descriptor.N()) {
            if (i10 == 0) {
                return new C6498k0(this.f59516a, descriptor);
            }
            if (i10 == 1) {
                return new C6502m0(this.f59516a, descriptor);
            }
            if (i10 == 2) {
                return new C6506o0(this.f59516a, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new B0(this.f59516a, descriptor);
            }
            if (i10 == 1) {
                return new E0(this.f59516a, descriptor);
            }
            if (i10 == 2) {
                return new H0(this.f59516a, descriptor);
            }
        }
        throw new Y0("Unsupported property: " + descriptor);
    }
}
