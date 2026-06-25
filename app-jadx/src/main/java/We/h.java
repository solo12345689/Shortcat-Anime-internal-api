package We;

import Se.j;
import Se.m;
import Se.o;
import Se.r;
import Se.v;
import Ud.AbstractC2279u;
import Ue.b;
import Ve.a;
import We.d;
import Ze.i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    public static final h f20878a = new h();

    /* JADX INFO: renamed from: b */
    private static final Ze.g f20879b;

    static {
        Ze.g gVarD = Ze.g.d();
        Ve.a.a(gVarD);
        AbstractC5504s.g(gVarD, "apply(...)");
        f20879b = gVarD;
    }

    private h() {
    }

    public static /* synthetic */ d.a d(h hVar, o oVar, Ue.d dVar, Ue.h hVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return hVar.c(oVar, dVar, hVar2, z10);
    }

    public static final boolean f(o proto) {
        AbstractC5504s.h(proto, "proto");
        b.C0337b c0337bA = c.f20861a.a();
        Object objV = proto.v(Ve.a.f20032e);
        AbstractC5504s.g(objV, "getExtension(...)");
        Boolean boolD = c0337bA.d(((Number) objV).intValue());
        AbstractC5504s.g(boolD, "get(...)");
        return boolD.booleanValue();
    }

    private final String g(r rVar, Ue.d dVar) {
        if (rVar.m0()) {
            return b.b(dVar.b(rVar.X()));
        }
        return null;
    }

    public static final Pair h(byte[] bytes, String[] strings) {
        AbstractC5504s.h(bytes, "bytes");
        AbstractC5504s.h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair(f20878a.k(byteArrayInputStream, strings), Se.c.C1(byteArrayInputStream, f20879b));
    }

    public static final Pair i(String[] data, String[] strings) {
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(strings, "strings");
        byte[] bArrE = a.e(data);
        AbstractC5504s.g(bArrE, "decodeBytes(...)");
        return h(bArrE, strings);
    }

    public static final Pair j(String[] data, String[] strings) {
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(data));
        return new Pair(f20878a.k(byteArrayInputStream, strings), j.J0(byteArrayInputStream, f20879b));
    }

    private final e k(InputStream inputStream, String[] strArr) {
        a.e eVarE = a.e.E(inputStream, f20879b);
        AbstractC5504s.g(eVarE, "parseDelimitedFrom(...)");
        return new e(eVarE, strArr);
    }

    public static final Pair l(byte[] bytes, String[] strings) {
        AbstractC5504s.h(bytes, "bytes");
        AbstractC5504s.h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair(f20878a.k(byteArrayInputStream, strings), m.e0(byteArrayInputStream, f20879b));
    }

    public static final Pair m(String[] data, String[] strings) {
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(strings, "strings");
        byte[] bArrE = a.e(data);
        AbstractC5504s.g(bArrE, "decodeBytes(...)");
        return l(bArrE, strings);
    }

    public final Ze.g a() {
        return f20879b;
    }

    public final d.b b(Se.e proto, Ue.d nameResolver, Ue.h typeTable) {
        String strW0;
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        i.f constructorSignature = Ve.a.f20028a;
        AbstractC5504s.g(constructorSignature, "constructorSignature");
        a.c cVar = (a.c) Ue.f.a(proto, constructorSignature);
        String string = (cVar == null || !cVar.A()) ? "<init>" : nameResolver.getString(cVar.y());
        if (cVar == null || !cVar.z()) {
            List<v> listR = proto.R();
            AbstractC5504s.g(listR, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listR, 10));
            for (v vVar : listR) {
                h hVar = f20878a;
                AbstractC5504s.e(vVar);
                String strG = hVar.g(Ue.g.q(vVar, typeTable), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strW0 = AbstractC2279u.w0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strW0 = nameResolver.getString(cVar.x());
        }
        return new d.b(string, strW0);
    }

    public final d.a c(o proto, Ue.d nameResolver, Ue.h typeTable, boolean z10) {
        String strG;
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        i.f propertySignature = Ve.a.f20031d;
        AbstractC5504s.g(propertySignature, "propertySignature");
        a.d dVar = (a.d) Ue.f.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        a.b bVarB = dVar.G() ? dVar.B() : null;
        if (bVarB == null && z10) {
            return null;
        }
        int iH0 = (bVarB == null || !bVarB.A()) ? proto.h0() : bVarB.y();
        if (bVarB == null || !bVarB.z()) {
            strG = g(Ue.g.n(proto, typeTable), nameResolver);
            if (strG == null) {
                return null;
            }
        } else {
            strG = nameResolver.getString(bVarB.x());
        }
        return new d.a(nameResolver.getString(iH0), strG);
    }

    public final d.b e(j proto, Ue.d nameResolver, Ue.h typeTable) {
        String string;
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        i.f methodSignature = Ve.a.f20029b;
        AbstractC5504s.g(methodSignature, "methodSignature");
        a.c cVar = (a.c) Ue.f.a(proto, methodSignature);
        int iI0 = (cVar == null || !cVar.A()) ? proto.i0() : cVar.y();
        if (cVar == null || !cVar.z()) {
            List listQ = AbstractC2279u.q(Ue.g.k(proto, typeTable));
            List<v> listU0 = proto.u0();
            AbstractC5504s.g(listU0, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listU0, 10));
            for (v vVar : listU0) {
                AbstractC5504s.e(vVar);
                arrayList.add(Ue.g.q(vVar, typeTable));
            }
            List listI0 = AbstractC2279u.I0(listQ, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(listI0, 10));
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                String strG = f20878a.g((r) it.next(), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(Ue.g.m(proto, typeTable), nameResolver);
            if (strG2 == null) {
                return null;
            }
            string = AbstractC2279u.w0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = nameResolver.getString(cVar.x());
        }
        return new d.b(nameResolver.getString(iI0), string);
    }
}
