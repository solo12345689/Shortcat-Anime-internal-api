package Yb;

import Td.L;
import Td.z;
import Ub.e;
import Ud.AbstractC2279u;
import Ud.S;
import dc.AbstractC4580a;
import dc.C4581b;
import dc.r;
import expo.modules.kotlin.sharedobjects.SharedObject;
import hc.AbstractC4934f;
import hc.C4936h;
import hc.C4941m;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import nc.g;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6018h;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC4934f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Ub.d f22882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f22883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC6014d f22884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C5972b f22885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r f22886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f22887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f22888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f22889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map f22890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map f22891t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22892a = new a();

        a() {
            super(2, SharedObject.class, "onStartListeningToEvent", "onStartListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            j((SharedObject) obj, (String) obj2);
            return L.f17438a;
        }

        public final void j(SharedObject p02, String p12) {
            AbstractC5504s.h(p02, "p0");
            AbstractC5504s.h(p12, "p1");
            p02.z(p12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22893a = new b();

        b() {
            super(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            j((SharedObject) obj, (String) obj2);
            return L.f17438a;
        }

        public final void j(SharedObject p02, String p12) {
            AbstractC5504s.h(p02, "p0");
            AbstractC5504s.h(p12, "p1");
            p02.C(p12);
        }
    }

    /* JADX INFO: renamed from: Yb.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0391c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0391c f22894a = new C0391c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Ub.d appContext, String name, InterfaceC6014d ownerClass, C5972b ownerType, X x10) {
        super(x10);
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(ownerClass, "ownerClass");
        AbstractC5504s.h(ownerType, "ownerType");
        this.f22882k = appContext;
        this.f22883l = name;
        this.f22884m = ownerClass;
        this.f22885n = ownerType;
        this.f22887p = new ArrayList();
        this.f22888q = new LinkedHashMap();
        this.f22889r = new LinkedHashMap();
        this.f22890s = new LinkedHashMap();
        this.f22891t = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L w(InterfaceC6018h interfaceC6018h, Object[] objArr) {
        AbstractC5504s.h(objArr, "<destruct>");
        ((Function2) interfaceC6018h).invoke(objArr[0], objArr[1]);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L x(Object[] it) {
        AbstractC5504s.h(it, "it");
        return L.f17438a;
    }

    public final Map A() {
        return this.f22888q;
    }

    public final void B(r rVar) {
        this.f22886o = rVar;
    }

    public C4941m u(String name) {
        AbstractC5504s.h(name, "name");
        C4941m c4941m = new C4941m(this.f22885n.g(), name);
        o().put(name, c4941m);
        return c4941m;
    }

    public final d v() {
        Object next;
        boolean zC = AbstractC5504s.c(this.f22884m, O.b(L.class));
        boolean z10 = !zC && nc.d.a(this.f22884m);
        boolean z11 = !zC && g.a(this.f22884m);
        if (n() != null && z10) {
            for (Pair pair : AbstractC2279u.p(z.a("__expo_onStartListeningToEvent", a.f22892a), z.a("__expo_onStopListeningToEvent", b.f22893a))) {
                String str = (String) pair.getFirst();
                final InterfaceC6018h interfaceC6018h = (InterfaceC6018h) pair.getSecond();
                C5972b c5972b = this.f22885n;
                C5972b c5972b2 = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.FALSE));
                if (c5972b2 == null) {
                    c5972b2 = new C5972b(new M(O.b(String.class), false, C0391c.f22894a), null);
                }
                C5972b[] c5972bArr = {c5972b, c5972b2};
                V v10 = V.f55908a;
                U u10 = (U) v10.a().get(O.b(L.class));
                if (u10 == null) {
                    u10 = new U(O.b(L.class));
                    v10.a().put(O.b(L.class), u10);
                }
                r rVar = new r(str, c5972bArr, u10, new Function1() { // from class: Yb.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return c.w(interfaceC6018h, (Object[]) obj);
                    }
                });
                rVar.d(false);
                p().put(str, rVar);
            }
        }
        C4936h c4936hJ = j();
        List list = this.f22887p;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = ((C4936h) next).i((C4936h) it2.next());
            }
        } else {
            next = null;
        }
        C4936h c4936hI = c4936hJ.i((C4936h) next);
        e eVarE = c4936hI.e();
        while (eVarE.hasNext()) {
            AbstractC4580a abstractC4580a = (AbstractC4580a) eVarE.next();
            abstractC4580a.l(this.f22885n.g());
            abstractC4580a.k(true);
        }
        if (!zC && this.f22886o == null && !z11) {
            throw new IllegalArgumentException("constructor cannot be null");
        }
        r rVar2 = this.f22886o;
        if (rVar2 == null) {
            C5972b[] c5972bArr2 = new C5972b[0];
            V v11 = V.f55908a;
            U u11 = (U) v11.a().get(O.b(L.class));
            if (u11 == null) {
                u11 = new U(O.b(L.class));
                v11.a().put(O.b(L.class), u11);
            }
            rVar2 = new r("constructor", c5972bArr2, u11, new Function1() { // from class: Yb.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.x((Object[]) obj);
                }
            });
        }
        r rVar3 = rVar2;
        rVar3.k(true);
        rVar3.l(this.f22885n.g());
        String str2 = this.f22883l;
        Map map = this.f22888q;
        Map map2 = this.f22889r;
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(map2.size()));
        Iterator it3 = map2.entrySet().iterator();
        if (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            entry.getKey();
            android.support.v4.media.session.b.a(entry.getValue());
            throw null;
        }
        Map mapP = S.p(map, linkedHashMap);
        Map map3 = this.f22890s;
        Map map4 = this.f22891t;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(map4.size()));
        for (Map.Entry entry2 : map4.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), ((C4581b) entry2.getValue()).a());
        }
        return new d(str2, rVar3, mapP, S.p(map3, linkedHashMap2), c4936hI, z11);
    }

    public final C5972b y() {
        return this.f22885n;
    }

    public final Map z() {
        return this.f22890s;
    }
}
