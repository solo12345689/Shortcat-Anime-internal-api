package Xf;

import Tf.l;
import Wf.AbstractC2358b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class K extends AbstractC2366c {

    /* JADX INFO: renamed from: g */
    private final Wf.C f21911g;

    /* JADX INFO: renamed from: h */
    private final Tf.e f21912h;

    /* JADX INFO: renamed from: i */
    private int f21913i;

    /* JADX INFO: renamed from: j */
    private boolean f21914j;

    public /* synthetic */ K(AbstractC2358b abstractC2358b, Wf.C c10, String str, Tf.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2358b, c10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : eVar);
    }

    private final boolean C0(Tf.e eVar, int i10) {
        boolean z10 = (d().f().j() || eVar.p(i10) || !eVar.n(i10).i()) ? false : true;
        this.f21914j = z10;
        return z10;
    }

    private final boolean D0(Tf.e eVar, int i10, String str) {
        AbstractC2358b abstractC2358bD = d();
        boolean zP = eVar.p(i10);
        Tf.e eVarN = eVar.n(i10);
        if (zP && !eVarN.i() && (l0(str) instanceof Wf.z)) {
            return true;
        }
        if (!AbstractC5504s.c(eVarN.h(), l.b.f17533a) || (eVarN.i() && (l0(str) instanceof Wf.z))) {
            return false;
        }
        Wf.i iVarL0 = l0(str);
        Wf.E e10 = iVarL0 instanceof Wf.E ? (Wf.E) iVarL0 : null;
        String strF = e10 != null ? Wf.j.f(e10) : null;
        if (strF == null) {
            return false;
        }
        return E.i(eVarN, abstractC2358bD, strF) == -3 && (zP || (!abstractC2358bD.f().j() && eVarN.i()));
    }

    @Override // Xf.AbstractC2366c, Uf.e
    public boolean D() {
        return !this.f21914j && super.D();
    }

    @Override // Xf.AbstractC2366c
    /* JADX INFO: renamed from: E0 */
    public Wf.C z0() {
        return this.f21911g;
    }

    @Override // Xf.AbstractC2366c, Uf.e
    public Uf.c b(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (descriptor != this.f21912h) {
            return super.b(descriptor);
        }
        AbstractC2358b abstractC2358bD = d();
        Wf.i iVarM0 = m0();
        String strO = this.f21912h.o();
        if (iVarM0 instanceof Wf.C) {
            return new K(abstractC2358bD, (Wf.C) iVarM0, y0(), this.f21912h);
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.C.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarM0.getClass()).v() + " as the serialized body of " + strO + " at element: " + i0(), iVarM0.toString());
    }

    @Override // Xf.AbstractC2366c, Uf.c
    public void c(Tf.e descriptor) {
        Set setL;
        AbstractC5504s.h(descriptor, "descriptor");
        if (this.f21974f.k() || (descriptor.h() instanceof Tf.c)) {
            return;
        }
        E.m(descriptor, d());
        if (this.f21974f.o()) {
            Set setA = Vf.K.a(descriptor);
            Map map = (Map) Wf.G.a(d()).a(descriptor, E.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = Ud.a0.d();
            }
            setL = Ud.a0.l(setA, setKeySet);
        } else {
            setL = Vf.K.a(descriptor);
        }
        for (String str : z0().keySet()) {
            if (!setL.contains(str) && !AbstractC5504s.c(str, y0())) {
                throw C.g(str, z0().toString());
            }
        }
    }

    @Override // Vf.U
    protected String f0(Tf.e descriptor, int i10) {
        Object next;
        AbstractC5504s.h(descriptor, "descriptor");
        E.m(descriptor, d());
        String strL = descriptor.l(i10);
        if (!this.f21974f.o() || z0().keySet().contains(strL)) {
            return strL;
        }
        Map mapE = E.e(d(), descriptor);
        Iterator<T> it = z0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapE.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strL;
    }

    @Override // Uf.c
    public int i(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        while (this.f21913i < descriptor.k()) {
            int i10 = this.f21913i;
            this.f21913i = i10 + 1;
            String strZ = Z(descriptor, i10);
            int i11 = this.f21913i - 1;
            this.f21914j = false;
            if (z0().containsKey(strZ) || C0(descriptor, i11)) {
                if (!this.f21974f.g() || !D0(descriptor, i11, strZ)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @Override // Xf.AbstractC2366c
    public Wf.i l0(String tag) {
        AbstractC5504s.h(tag, "tag");
        return (Wf.i) Ud.S.j(z0(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(AbstractC2358b json, Wf.C value, String str, Tf.e eVar) {
        super(json, value, str, null);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(value, "value");
        this.f21911g = value;
        this.f21912h = eVar;
    }
}
