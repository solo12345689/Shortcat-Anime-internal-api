package Le;

import Re.a;
import Ud.AbstractC2279u;
import Xe.b;
import gf.C4881d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ye.InterfaceC7227e;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D extends Be.H {

    /* JADX INFO: renamed from: o */
    static final /* synthetic */ InterfaceC6023m[] f11402o = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(D.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(D.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};

    /* JADX INFO: renamed from: g */
    private final Oe.u f11403g;

    /* JADX INFO: renamed from: h */
    private final Ke.k f11404h;

    /* JADX INFO: renamed from: i */
    private final Ue.c f11405i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC6044i f11406j;

    /* JADX INFO: renamed from: k */
    private final C1874f f11407k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC6044i f11408l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC7374h f11409m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC6044i f11410n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11411a;

        static {
            int[] iArr = new int[a.EnumC0265a.values().length];
            try {
                iArr[a.EnumC0265a.f15483i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0265a.f15480f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11411a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Ke.k outerContext, Oe.u jPackage) {
        super(outerContext.d(), jPackage.f());
        AbstractC5504s.h(outerContext, "outerContext");
        AbstractC5504s.h(jPackage, "jPackage");
        this.f11403g = jPackage;
        Ke.k kVarF = Ke.c.f(outerContext, this, null, 0, 6, null);
        this.f11404h = kVarF;
        this.f11405i = outerContext.a().b().f().g().d();
        this.f11406j = kVarF.e().c(new A(this));
        this.f11407k = new C1874f(kVarF, jPackage, this);
        this.f11408l = kVarF.e().i(new B(this), AbstractC2279u.m());
        this.f11409m = kVarF.a().i().b() ? InterfaceC7374h.f66223k0.b() : Ke.h.a(kVarF, jPackage);
        this.f11410n = kVarF.e().c(new C(this));
    }

    public static final Map M0(D d10) {
        List<String> listA = d10.f11404h.a().o().a(d10.f().a());
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            b.a aVar = Xe.b.f21759d;
            Xe.c cVarE = C4881d.d(str).e();
            AbstractC5504s.g(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            Qe.x xVarB = Qe.w.b(d10.f11404h.a().j(), aVar.c(cVarE), d10.f11405i);
            Pair pairA = xVarB != null ? Td.z.a(str, xVarB) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return Ud.S.w(arrayList);
    }

    public static final HashMap R0(D d10) {
        HashMap map = new HashMap();
        for (Map.Entry entry : d10.O0().entrySet()) {
            String str = (String) entry.getKey();
            Qe.x xVar = (Qe.x) entry.getValue();
            C4881d c4881dD = C4881d.d(str);
            AbstractC5504s.g(c4881dD, "byInternalName(...)");
            Re.a aVarD = xVar.d();
            int i10 = a.f11411a[aVarD.c().ordinal()];
            if (i10 == 1) {
                String strE = aVarD.e();
                if (strE != null) {
                    map.put(c4881dD, C4881d.d(strE));
                }
            } else if (i10 == 2) {
                map.put(c4881dD, c4881dD);
            }
        }
        return map;
    }

    public static final List S0(D d10) {
        Collection collectionU = d10.f11403g.u();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionU, 10));
        Iterator it = collectionU.iterator();
        while (it.hasNext()) {
            arrayList.add(((Oe.u) it.next()).f());
        }
        return arrayList;
    }

    public final InterfaceC7227e N0(Oe.g jClass) {
        AbstractC5504s.h(jClass, "jClass");
        return this.f11407k.i().k0(jClass);
    }

    public final Map O0() {
        return (Map) AbstractC6048m.a(this.f11406j, this, f11402o[0]);
    }

    @Override // ye.N
    /* JADX INFO: renamed from: P0 */
    public C1874f o() {
        return this.f11407k;
    }

    public final List Q0() {
        return (List) this.f11408l.invoke();
    }

    @Override // ze.AbstractC7368b, ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        return this.f11409m;
    }

    @Override // Be.H, Be.AbstractC1119n, ye.InterfaceC7238p
    public h0 k() {
        return new Qe.y(this);
    }

    @Override // Be.H, Be.AbstractC1118m
    public String toString() {
        return "Lazy Java package fragment: " + f() + " of module " + this.f11404h.a().m();
    }
}
