package Qe;

import Qe.A;
import Qe.x;
import df.C4610s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import mf.EnumC5673d;
import mf.InterfaceC5674e;
import mf.N;
import pf.InterfaceC6042g;
import qf.S;
import ue.C6768a;
import ye.h0;

/* JADX INFO: renamed from: Qe.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2085d extends AbstractC2086e implements InterfaceC5674e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6042g f14831c;

    /* JADX INFO: renamed from: Qe.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements x.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f14833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f14834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap f14835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap f14836e;

        /* JADX INFO: renamed from: Qe.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public final class C0248a extends b implements x.e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f14837d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0248a(a aVar, A signature) {
                super(aVar, signature);
                AbstractC5504s.h(signature, "signature");
                this.f14837d = aVar;
            }

            @Override // Qe.x.e
            public x.a c(int i10, Xe.b classId, h0 source) {
                AbstractC5504s.h(classId, "classId");
                AbstractC5504s.h(source, "source");
                A aE = A.f14801b.e(d(), i10);
                List arrayList = (List) this.f14837d.f14833b.get(aE);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f14837d.f14833b.put(aE, arrayList);
                }
                return AbstractC2085d.this.y(classId, source, arrayList);
            }
        }

        /* JADX INFO: renamed from: Qe.d$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public class b implements x.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final A f14838a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ArrayList f14839b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f14840c;

            public b(a aVar, A signature) {
                AbstractC5504s.h(signature, "signature");
                this.f14840c = aVar;
                this.f14838a = signature;
                this.f14839b = new ArrayList();
            }

            @Override // Qe.x.c
            public void a() {
                if (this.f14839b.isEmpty()) {
                    return;
                }
                this.f14840c.f14833b.put(this.f14838a, this.f14839b);
            }

            @Override // Qe.x.c
            public x.a b(Xe.b classId, h0 source) {
                AbstractC5504s.h(classId, "classId");
                AbstractC5504s.h(source, "source");
                return AbstractC2085d.this.y(classId, source, this.f14839b);
            }

            protected final A d() {
                return this.f14838a;
            }
        }

        a(HashMap map, x xVar, HashMap map2, HashMap map3) {
            this.f14833b = map;
            this.f14834c = xVar;
            this.f14835d = map2;
            this.f14836e = map3;
        }

        @Override // Qe.x.d
        public x.e a(Xe.f name, String desc) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(desc, "desc");
            A.a aVar = A.f14801b;
            String strB = name.b();
            AbstractC5504s.g(strB, "asString(...)");
            return new C0248a(this, aVar.d(strB, desc));
        }

        @Override // Qe.x.d
        public x.c b(Xe.f name, String desc, Object obj) {
            Object objI;
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(desc, "desc");
            A.a aVar = A.f14801b;
            String strB = name.b();
            AbstractC5504s.g(strB, "asString(...)");
            A a10 = aVar.a(strB, desc);
            if (obj != null && (objI = AbstractC2085d.this.I(desc, obj)) != null) {
                this.f14836e.put(a10, objI);
            }
            return new b(this, a10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2085d(pf.n storageManager, v kotlinClassFinder) {
        super(kotlinClassFinder);
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
        this.f14831c = storageManager.h(new C2082a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(C2088g loadConstantFromProperty, A it) {
        AbstractC5504s.h(loadConstantFromProperty, "$this$loadConstantFromProperty");
        AbstractC5504s.h(it, "it");
        return loadConstantFromProperty.b().get(it);
    }

    private final C2088g H(x xVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        xVar.c(new a(map, xVar, map3, map2), r(xVar));
        return new C2088g(map, map2, map3);
    }

    private final Object J(N n10, Se.o oVar, EnumC5673d enumC5673d, S s10, Function2 function2) {
        Object objInvoke;
        x xVarP = p(n10, AbstractC2086e.f14841b.a(n10, true, true, Ue.b.f19530B.d(oVar.f0()), We.h.f(oVar), u(), v()));
        if (xVarP == null) {
            return null;
        }
        A aS = s(oVar, n10.b(), n10.d(), enumC5673d, xVarP.d().d().d(n.f14883b.a()));
        if (aS == null || (objInvoke = function2.invoke(this.f14831c.invoke(xVarP), aS)) == null) {
            return null;
        }
        return ve.s.d(s10) ? M(objInvoke) : objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(C2088g loadConstantFromProperty, A it) {
        AbstractC5504s.h(loadConstantFromProperty, "$this$loadConstantFromProperty");
        AbstractC5504s.h(it, "it");
        return loadConstantFromProperty.c().get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2088g L(AbstractC2085d abstractC2085d, x kotlinClass) {
        AbstractC5504s.h(kotlinClass, "kotlinClass");
        return abstractC2085d.H(kotlinClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Qe.AbstractC2086e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C2088g q(x binaryClass) {
        AbstractC5504s.h(binaryClass, "binaryClass");
        return (C2088g) this.f14831c.invoke(binaryClass);
    }

    protected final boolean F(Xe.b annotationClassId, Map arguments) {
        AbstractC5504s.h(annotationClassId, "annotationClassId");
        AbstractC5504s.h(arguments, "arguments");
        if (!AbstractC5504s.c(annotationClassId, C6768a.f61506a.a())) {
            return false;
        }
        Object obj = arguments.get(Xe.f.m("value"));
        C4610s c4610s = obj instanceof C4610s ? (C4610s) obj : null;
        if (c4610s == null) {
            return false;
        }
        Object objB = c4610s.b();
        C4610s.b.C0712b c0712b = objB instanceof C4610s.b.C0712b ? (C4610s.b.C0712b) objB : null;
        if (c0712b == null) {
            return false;
        }
        return w(c0712b.b());
    }

    protected abstract Object I(String str, Object obj);

    protected abstract Object M(Object obj);

    @Override // mf.InterfaceC5674e
    public Object k(N container, Se.o proto, S expectedType) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(expectedType, "expectedType");
        return J(container, proto, EnumC5673d.PROPERTY, expectedType, C2084c.f14830a);
    }

    @Override // mf.InterfaceC5674e
    public Object l(N container, Se.o proto, S expectedType) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(expectedType, "expectedType");
        return J(container, proto, EnumC5673d.PROPERTY_GETTER, expectedType, C2083b.f14829a);
    }
}
