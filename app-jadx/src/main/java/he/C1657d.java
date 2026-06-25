package He;

import Ud.AbstractC2279u;
import df.AbstractC4598g;
import df.C4593b;
import df.C4602k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: He.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1657d extends AbstractC1655b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657d(D javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        AbstractC5504s.h(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List B(AbstractC4598g abstractC4598g) {
        if (!(abstractC4598g instanceof C4593b)) {
            return abstractC4598g instanceof C4602k ? AbstractC2279u.e(((C4602k) abstractC4598g).c().h()) : AbstractC2279u.m();
        }
        Iterable iterable = (Iterable) ((C4593b) abstractC4598g).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, B((AbstractC4598g) it.next()));
        }
        return arrayList;
    }

    @Override // He.AbstractC1655b
    /* JADX INFO: renamed from: A */
    public Iterable m(InterfaceC7369c interfaceC7369c) {
        InterfaceC7374h annotations;
        AbstractC5504s.h(interfaceC7369c, "<this>");
        InterfaceC7227e interfaceC7227eL = ff.e.l(interfaceC7369c);
        return (interfaceC7227eL == null || (annotations = interfaceC7227eL.getAnnotations()) == null) ? AbstractC2279u.m() : annotations;
    }

    @Override // He.AbstractC1655b
    public boolean o() {
        return false;
    }

    @Override // He.AbstractC1655b
    /* JADX INFO: renamed from: x */
    public Iterable c(InterfaceC7369c interfaceC7369c, boolean z10) {
        AbstractC5504s.h(interfaceC7369c, "<this>");
        Map mapA = interfaceC7369c.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapA.entrySet()) {
            AbstractC2279u.D(arrayList, (!z10 || AbstractC5504s.c((Xe.f) entry.getKey(), I.f8446c)) ? B((AbstractC4598g) entry.getValue()) : AbstractC2279u.m());
        }
        return arrayList;
    }

    @Override // He.AbstractC1655b
    /* JADX INFO: renamed from: y */
    public Xe.c k(InterfaceC7369c interfaceC7369c) {
        AbstractC5504s.h(interfaceC7369c, "<this>");
        return interfaceC7369c.f();
    }

    @Override // He.AbstractC1655b
    /* JADX INFO: renamed from: z */
    public Object l(InterfaceC7369c interfaceC7369c) {
        AbstractC5504s.h(interfaceC7369c, "<this>");
        InterfaceC7227e interfaceC7227eL = ff.e.l(interfaceC7369c);
        AbstractC5504s.e(interfaceC7227eL);
        return interfaceC7227eL;
    }
}
