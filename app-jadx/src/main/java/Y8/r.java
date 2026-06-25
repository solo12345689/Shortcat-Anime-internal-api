package y8;

import A8.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p8.C5938c;
import r8.AbstractC6283i;
import r8.AbstractC6289o;
import r8.C6282h;
import s8.g;
import u8.C6743a;
import u8.c;
import v8.AbstractC6852a;
import z8.AbstractC7334k;
import z8.InterfaceC7326c;
import z8.InterfaceC7327d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a */
    private final Context f64957a;

    /* JADX INFO: renamed from: b */
    private final s8.e f64958b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC7327d f64959c;

    /* JADX INFO: renamed from: d */
    private final x f64960d;

    /* JADX INFO: renamed from: e */
    private final Executor f64961e;

    /* JADX INFO: renamed from: f */
    private final A8.b f64962f;

    /* JADX INFO: renamed from: g */
    private final B8.a f64963g;

    /* JADX INFO: renamed from: h */
    private final B8.a f64964h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC7326c f64965i;

    public r(Context context, s8.e eVar, InterfaceC7327d interfaceC7327d, x xVar, Executor executor, A8.b bVar, B8.a aVar, B8.a aVar2, InterfaceC7326c interfaceC7326c) {
        this.f64957a = context;
        this.f64958b = eVar;
        this.f64959c = interfaceC7327d;
        this.f64960d = xVar;
        this.f64961e = executor;
        this.f64962f = bVar;
        this.f64963g = aVar;
        this.f64964h = aVar2;
        this.f64965i = interfaceC7326c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, AbstractC6289o abstractC6289o, long j10) {
        rVar.f64959c.Q0(iterable);
        rVar.f64959c.g1(abstractC6289o, rVar.f64963g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f64965i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f64959c.Q(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, AbstractC6289o abstractC6289o, int i10) {
        rVar.f64960d.a(abstractC6289o, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, AbstractC6289o abstractC6289o, long j10) {
        rVar.f64959c.g1(abstractC6289o, rVar.f64963g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f64965i.h(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final AbstractC6289o abstractC6289o, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                A8.b bVar = rVar.f64962f;
                final InterfaceC7327d interfaceC7327d = rVar.f64959c;
                Objects.requireNonNull(interfaceC7327d);
                bVar.g(new b.a() { // from class: y8.i
                    @Override // A8.b.a
                    public final Object b() {
                        return Integer.valueOf(interfaceC7327d.p());
                    }
                });
                if (rVar.k()) {
                    rVar.l(abstractC6289o, i10);
                } else {
                    rVar.f64962f.g(new b.a() { // from class: y8.j
                        @Override // A8.b.a
                        public final Object b() {
                            return r.f(this.f64938a, abstractC6289o, i10);
                        }
                    });
                }
                runnable.run();
            } catch (A8.a unused) {
                rVar.f64960d.a(abstractC6289o, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    public AbstractC6283i j(s8.m mVar) {
        A8.b bVar = this.f64962f;
        final InterfaceC7326c interfaceC7326c = this.f64965i;
        Objects.requireNonNull(interfaceC7326c);
        return mVar.b(AbstractC6283i.a().i(this.f64963g.a()).k(this.f64964h.a()).j("GDT_CLIENT_METRICS").h(new C6282h(C5938c.b("proto"), ((C6743a) bVar.g(new b.a() { // from class: y8.h
            @Override // A8.b.a
            public final Object b() {
                return interfaceC7326c.b();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f64957a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public s8.g l(final AbstractC6289o abstractC6289o, int i10) {
        s8.g gVarA;
        s8.m mVarB = this.f64958b.b(abstractC6289o.b());
        s8.g gVarE = s8.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f64962f.g(new b.a() { // from class: y8.k
            @Override // A8.b.a
            public final Object b() {
                return Boolean.valueOf(this.f64941a.f64959c.F1(abstractC6289o));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f64962f.g(new b.a() { // from class: y8.l
                @Override // A8.b.a
                public final Object b() {
                    return this.f64943a.f64959c.P(abstractC6289o);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVarB == null) {
                AbstractC6852a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC6289o);
                gVarA = s8.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC7334k) it.next()).b());
                }
                if (abstractC6289o.e()) {
                    arrayList.add(j(mVarB));
                }
                gVarA = mVarB.a(s8.f.a().b(arrayList).c(abstractC6289o.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                final AbstractC6289o abstractC6289o2 = abstractC6289o;
                this.f64962f.g(new b.a() { // from class: y8.m
                    @Override // A8.b.a
                    public final Object b() {
                        return r.b(this.f64945a, iterable, abstractC6289o2, j10);
                    }
                });
                this.f64960d.b(abstractC6289o2, i10 + 1, true);
                return gVarE;
            }
            AbstractC6289o abstractC6289o3 = abstractC6289o;
            this.f64962f.g(new b.a() { // from class: y8.n
                @Override // A8.b.a
                public final Object b() {
                    return r.e(this.f64949a, iterable);
                }
            });
            if (gVarE.c() == g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (abstractC6289o3.e()) {
                    this.f64962f.g(new b.a() { // from class: y8.o
                        @Override // A8.b.a
                        public final Object b() {
                            return r.c(this.f64951a);
                        }
                    });
                }
                j10 = jMax;
            } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((AbstractC7334k) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f64962f.g(new b.a() { // from class: y8.p
                    @Override // A8.b.a
                    public final Object b() {
                        return r.h(this.f64952a, map);
                    }
                });
            }
            abstractC6289o = abstractC6289o3;
        }
        final AbstractC6289o abstractC6289o4 = abstractC6289o;
        this.f64962f.g(new b.a() { // from class: y8.q
            @Override // A8.b.a
            public final Object b() {
                return r.g(this.f64954a, abstractC6289o4, j10);
            }
        });
        return gVarE;
    }

    public void m(final AbstractC6289o abstractC6289o, final int i10, final Runnable runnable) {
        this.f64961e.execute(new Runnable() { // from class: y8.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f64932a, abstractC6289o, i10, runnable);
            }
        });
    }
}
