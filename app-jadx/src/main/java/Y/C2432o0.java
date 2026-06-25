package Y;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import Td.u;
import ae.AbstractC2605b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Y.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2432o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22390a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f22391b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f22392c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22393d = true;

    /* JADX INFO: renamed from: Y.o0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f22395b;

        a(InterfaceC1623n interfaceC1623n) {
            this.f22395b = interfaceC1623n;
        }

        public final void a(Throwable th2) {
            Object obj = C2432o0.this.f22390a;
            C2432o0 c2432o0 = C2432o0.this;
            InterfaceC1623n interfaceC1623n = this.f22395b;
            synchronized (obj) {
                c2432o0.f22391b.remove(interfaceC1623n);
                Td.L l10 = Td.L.f17438a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Td.L.f17438a;
        }
    }

    public final Object c(Zd.e eVar) {
        if (e()) {
            return Td.L.f17438a;
        }
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        synchronized (this.f22390a) {
            this.f22391b.add(c1627p);
        }
        c1627p.p(new a(c1627p));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : Td.L.f17438a;
    }

    public final void d() {
        synchronized (this.f22390a) {
            this.f22393d = false;
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f22390a) {
            z10 = this.f22393d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f22390a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.f22391b;
                this.f22391b = this.f22392c;
                this.f22392c = list;
                this.f22393d = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Zd.e eVar = (Zd.e) list.get(i10);
                    u.a aVar = Td.u.f17466b;
                    eVar.resumeWith(Td.u.b(Td.L.f17438a));
                }
                list.clear();
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
