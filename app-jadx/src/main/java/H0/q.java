package h0;

import h0.p;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import t.C6550P;
import t.d0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f47574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6550P f47575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C6550P f47576c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6550P f47577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f47579c;

        a(C6550P c6550p, String str, InterfaceC5082a interfaceC5082a) {
            this.f47577a = c6550p;
            this.f47578b = str;
            this.f47579c = interfaceC5082a;
        }

        @Override // h0.p.a
        public void a() {
            List list = (List) this.f47577a.u(this.f47578b);
            if (list != null) {
                list.remove(this.f47579c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f47577a.x(this.f47578b, list);
        }
    }

    public q(Map map, Function1 function1) {
        this.f47574a = function1;
        this.f47575b = (map == null || map.isEmpty()) ? null : s.h(map);
    }

    @Override // h0.p
    public boolean a(Object obj) {
        return ((Boolean) this.f47574a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    @Override // h0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map d() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q.d():java.util.Map");
    }

    @Override // h0.p
    public Object e(String str) {
        C6550P c6550p;
        C6550P c6550p2 = this.f47575b;
        List list = c6550p2 != null ? (List) c6550p2.u(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (c6550p = this.f47575b) != null) {
        }
        return list.get(0);
    }

    @Override // h0.p
    public p.a f(String str, InterfaceC5082a interfaceC5082a) {
        if (s.f(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        C6550P c6550pB = this.f47576c;
        if (c6550pB == null) {
            c6550pB = d0.b();
            this.f47576c = c6550pB;
        }
        Object objE = c6550pB.e(str);
        if (objE == null) {
            objE = new ArrayList();
            c6550pB.x(str, objE);
        }
        ((List) objE).add(interfaceC5082a);
        return new a(c6550pB, str, interfaceC5082a);
    }
}
