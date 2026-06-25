package Ie;

import Oe.InterfaceC1981b;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import df.AbstractC4598g;
import df.C4593b;
import df.C4602k;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import ve.o;
import ye.H;
import ye.t0;
import ze.EnumC7383q;
import ze.EnumC7384r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    public static final f f9093a = new f();

    /* JADX INFO: renamed from: b */
    private static final Map f9094b = S.l(z.a(com.amazon.a.a.m.c.f34466f, EnumSet.noneOf(EnumC7384r.class)), z.a("TYPE", EnumSet.of(EnumC7384r.f66292t, EnumC7384r.f66256G)), z.a("ANNOTATION_TYPE", EnumSet.of(EnumC7384r.f66294u)), z.a("TYPE_PARAMETER", EnumSet.of(EnumC7384r.f66296v)), z.a("FIELD", EnumSet.of(EnumC7384r.f66300x)), z.a("LOCAL_VARIABLE", EnumSet.of(EnumC7384r.f66302y)), z.a("PARAMETER", EnumSet.of(EnumC7384r.f66304z)), z.a("CONSTRUCTOR", EnumSet.of(EnumC7384r.f66244A)), z.a("METHOD", EnumSet.of(EnumC7384r.f66246B, EnumC7384r.f66248C, EnumC7384r.f66250D)), z.a("TYPE_USE", EnumSet.of(EnumC7384r.f66252E)));

    /* JADX INFO: renamed from: c */
    private static final Map f9095c = S.l(z.a("RUNTIME", EnumC7383q.f66239a), z.a("CLASS", EnumC7383q.f66240b), z.a("SOURCE", EnumC7383q.f66241c));

    private f() {
    }

    public static final qf.S e(H module) {
        qf.S type;
        AbstractC5504s.h(module, "module");
        t0 t0VarB = a.b(d.f9087a.d(), module.n().p(o.a.f62197H));
        return (t0VarB == null || (type = t0VarB.getType()) == null) ? sf.l.d(sf.k.f59676b1, new String[0]) : type;
    }

    public final AbstractC4598g b(InterfaceC1981b interfaceC1981b) {
        Oe.m mVar = interfaceC1981b instanceof Oe.m ? (Oe.m) interfaceC1981b : null;
        if (mVar != null) {
            Map map = f9095c;
            Xe.f fVarE = mVar.e();
            EnumC7383q enumC7383q = (EnumC7383q) map.get(fVarE != null ? fVarE.b() : null);
            if (enumC7383q != null) {
                Xe.b bVarC = Xe.b.f21759d.c(o.a.f62203K);
                Xe.f fVarM = Xe.f.m(enumC7383q.name());
                AbstractC5504s.g(fVarM, "identifier(...)");
                return new C4602k(bVarC, fVarM);
            }
        }
        return null;
    }

    public final Set c(String str) {
        EnumSet enumSet = (EnumSet) f9094b.get(str);
        return enumSet != null ? enumSet : a0.d();
    }

    public final AbstractC4598g d(List arguments) {
        AbstractC5504s.h(arguments, "arguments");
        ArrayList<Oe.m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof Oe.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC7384r> arrayList2 = new ArrayList();
        for (Oe.m mVar : arrayList) {
            f fVar = f9093a;
            Xe.f fVarE = mVar.e();
            AbstractC2279u.D(arrayList2, fVar.c(fVarE != null ? fVarE.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(arrayList2, 10));
        for (EnumC7384r enumC7384r : arrayList2) {
            Xe.b bVarC = Xe.b.f21759d.c(o.a.f62201J);
            Xe.f fVarM = Xe.f.m(enumC7384r.name());
            AbstractC5504s.g(fVarM, "identifier(...)");
            arrayList3.add(new C4602k(bVarC, fVarM));
        }
        return new C4593b(arrayList3, e.f9092a);
    }
}
