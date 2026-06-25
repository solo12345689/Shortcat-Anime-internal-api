package hc;

import Td.L;
import Ub.u;
import Ud.AbstractC2273n;
import Ud.S;
import dc.C4581b;
import dc.n;
import dc.s;
import hc.C4932d;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: hc.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4934f {

    /* JADX INFO: renamed from: a */
    private final X f47811a;

    /* JADX INFO: renamed from: c */
    private bc.f f47813c;

    /* JADX INFO: renamed from: b */
    private InterfaceC5082a f47812b = new InterfaceC5082a() { // from class: hc.e
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return AbstractC4934f.q();
        }
    };

    /* JADX INFO: renamed from: d */
    private Map f47814d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    private Map f47815e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    private Map f47816f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    private Map f47817g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    private Map f47818h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    private Map f47819i = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    private final List f47820j = new ArrayList();

    /* JADX INFO: renamed from: hc.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4932d.c f47822b;

        public a(C4932d.c cVar) {
            this.f47822b = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) promise;
            Iterator it = AbstractC4934f.this.f47820j.iterator();
            while (it.hasNext()) {
                ((C4932d) it.next()).a(this.f47822b, str);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: hc.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final b f47823a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: hc.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4932d.c f47825b;

        public c(C4932d.c cVar) {
            this.f47825b = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            String str = (String) objArr[0];
            Iterator it = AbstractC4934f.this.f47820j.iterator();
            while (it.hasNext()) {
                ((C4932d) it.next()).a(this.f47825b, str);
            }
            return L.f17438a;
        }
    }

    public AbstractC4934f(X x10) {
        this.f47811a = x10;
    }

    public static final Map q() {
        return S.i();
    }

    public final C4581b b(String name) {
        AbstractC5504s.h(name, "name");
        C4581b c4581b = new C4581b(name, this.f47811a);
        this.f47817g.put(name, c4581b);
        return c4581b;
    }

    public final void c(InterfaceC5082a legacyConstantsProvider) {
        AbstractC5504s.h(legacyConstantsProvider, "legacyConstantsProvider");
        this.f47812b = legacyConstantsProvider;
    }

    public final void d(String... events) {
        AbstractC5504s.h(events, "events");
        this.f47813c = new bc.f((String[]) AbstractC2273n.e(events).toArray(new String[0]));
    }

    public final void e(Enum r22, InterfaceC5082a body) {
        AbstractC5504s.h(r22, "enum");
        AbstractC5504s.h(body, "body");
        f(Ub.h.a(r22), body);
    }

    public final void f(String eventName, InterfaceC5082a body) {
        AbstractC5504s.h(eventName, "eventName");
        AbstractC5504s.h(body, "body");
        this.f47820j.add(new C4932d(C4932d.c.f47806b, new C4932d.b(eventName), body));
    }

    public final void g(Enum r22, InterfaceC5082a body) {
        AbstractC5504s.h(r22, "enum");
        AbstractC5504s.h(body, "body");
        h(Ub.h.a(r22), body);
    }

    public final void h(String eventName, InterfaceC5082a body) {
        AbstractC5504s.h(eventName, "eventName");
        AbstractC5504s.h(body, "body");
        this.f47820j.add(new C4932d(C4932d.c.f47807c, new C4932d.b(eventName), body));
    }

    public final C4936h j() {
        dc.g lVar;
        for (C4932d.c cVar : C4932d.c.b()) {
            if (!this.f47816f.containsKey(cVar.c())) {
                String strC = cVar.c();
                if (AbstractC5504s.c(String.class, u.class)) {
                    lVar = new dc.f(strC, new C5972b[0], new a(cVar));
                } else {
                    X xM = m();
                    C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.FALSE));
                    if (c5972b == null) {
                        c5972b = new C5972b(new M(O.b(String.class), false, b.f47823a), xM);
                    }
                    C5972b[] c5972bArr = {c5972b};
                    c cVar2 = new c(cVar);
                    lVar = AbstractC5504s.c(L.class, Integer.TYPE) ? new dc.l(strC, c5972bArr, cVar2) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new dc.h(strC, c5972bArr, cVar2) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i(strC, c5972bArr, cVar2) : AbstractC5504s.c(L.class, Float.TYPE) ? new dc.j(strC, c5972bArr, cVar2) : AbstractC5504s.c(L.class, String.class) ? new n(strC, c5972bArr, cVar2) : new s(strC, c5972bArr, cVar2);
                }
                k().put(strC, lVar);
            }
        }
        Map map = this.f47816f;
        Map map2 = this.f47817g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C4581b) entry.getValue()).a());
        }
        Map mapB = S.B(S.p(map, linkedHashMap));
        InterfaceC5082a interfaceC5082a = this.f47812b;
        Map map3 = this.f47814d;
        Map map4 = this.f47815e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(map4.size()));
        Iterator it = map4.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            entry2.getKey();
            android.support.v4.media.session.b.a(entry2.getValue());
            throw null;
        }
        Map mapP = S.p(map3, linkedHashMap2);
        bc.f fVar = this.f47813c;
        Map map5 = this.f47818h;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(S.e(map5.size()));
        for (Map.Entry entry3 : map5.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), ((C4940l) entry3.getValue()).a());
        }
        Map map6 = this.f47819i;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(S.e(map6.size()));
        for (Map.Entry entry4 : map6.entrySet()) {
            linkedHashMap4.put(entry4.getKey(), ((C4931c) entry4.getValue()).a());
        }
        return new C4936h(interfaceC5082a, mapP, mapB, fVar, linkedHashMap3, linkedHashMap4);
    }

    public final Map k() {
        return this.f47816f;
    }

    public final Map l() {
        return this.f47819i;
    }

    public final X m() {
        return this.f47811a;
    }

    public final bc.f n() {
        return this.f47813c;
    }

    public final Map o() {
        return this.f47818h;
    }

    public final Map p() {
        return this.f47814d;
    }

    public final void r(bc.f fVar) {
        this.f47813c = fVar;
    }
}
