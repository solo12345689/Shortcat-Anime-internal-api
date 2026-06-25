package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import n4.C5737m;
import n4.C5745u;
import p4.InterfaceC5931b;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r implements InterfaceC2955e, androidx.work.impl.foreground.a {

    /* JADX INFO: renamed from: m */
    private static final String f32892m = i4.i.i("Processor");

    /* JADX INFO: renamed from: b */
    private Context f32894b;

    /* JADX INFO: renamed from: c */
    private androidx.work.a f32895c;

    /* JADX INFO: renamed from: d */
    private InterfaceC5931b f32896d;

    /* JADX INFO: renamed from: e */
    private WorkDatabase f32897e;

    /* JADX INFO: renamed from: i */
    private List f32901i;

    /* JADX INFO: renamed from: g */
    private Map f32899g = new HashMap();

    /* JADX INFO: renamed from: f */
    private Map f32898f = new HashMap();

    /* JADX INFO: renamed from: j */
    private Set f32902j = new HashSet();

    /* JADX INFO: renamed from: k */
    private final List f32903k = new ArrayList();

    /* JADX INFO: renamed from: a */
    private PowerManager.WakeLock f32893a = null;

    /* JADX INFO: renamed from: l */
    private final Object f32904l = new Object();

    /* JADX INFO: renamed from: h */
    private Map f32900h = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private InterfaceC2955e f32905a;

        /* JADX INFO: renamed from: b */
        private final C5737m f32906b;

        /* JADX INFO: renamed from: c */
        private com.google.common.util.concurrent.p f32907c;

        a(InterfaceC2955e interfaceC2955e, C5737m c5737m, com.google.common.util.concurrent.p pVar) {
            this.f32905a = interfaceC2955e;
            this.f32906b = c5737m;
            this.f32907c = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f32907c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f32905a.f(this.f32906b, zBooleanValue);
        }
    }

    public r(Context context, androidx.work.a aVar, InterfaceC5931b interfaceC5931b, WorkDatabase workDatabase, List list) {
        this.f32894b = context;
        this.f32895c = aVar;
        this.f32896d = interfaceC5931b;
        this.f32897e = workDatabase;
        this.f32901i = list;
    }

    public static /* synthetic */ C5745u e(r rVar, ArrayList arrayList, String str) {
        arrayList.addAll(rVar.f32897e.K().a(str));
        return rVar.f32897e.J().h(str);
    }

    private static boolean i(String str, K k10) {
        if (k10 == null) {
            i4.i.e().a(f32892m, "WorkerWrapper could not be found for " + str);
            return false;
        }
        k10.g();
        i4.i.e().a(f32892m, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void m(final C5737m c5737m, final boolean z10) {
        this.f32896d.a().execute(new Runnable() { // from class: androidx.work.impl.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f32889a.f(c5737m, z10);
            }
        });
    }

    private void q() {
        synchronized (this.f32904l) {
            try {
                if (this.f32898f.isEmpty()) {
                    try {
                        this.f32894b.startService(androidx.work.impl.foreground.b.g(this.f32894b));
                    } catch (Throwable th2) {
                        i4.i.e().d(f32892m, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f32893a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f32893a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(String str) {
        synchronized (this.f32904l) {
            this.f32898f.remove(str);
            q();
        }
    }

    @Override // androidx.work.impl.foreground.a
    public boolean b(String str) {
        boolean zContainsKey;
        synchronized (this.f32904l) {
            zContainsKey = this.f32898f.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.foreground.a
    public void c(String str, i4.e eVar) {
        synchronized (this.f32904l) {
            try {
                i4.i.e().f(f32892m, "Moving WorkSpec (" + str + ") to the foreground");
                K k10 = (K) this.f32899g.remove(str);
                if (k10 != null) {
                    if (this.f32893a == null) {
                        PowerManager.WakeLock wakeLockB = o4.x.b(this.f32894b, "ProcessorForegroundLck");
                        this.f32893a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f32898f.put(str, k10);
                    AbstractC7194b.p(this.f32894b, androidx.work.impl.foreground.b.d(this.f32894b, k10.d(), eVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC2955e
    public void f(C5737m c5737m, boolean z10) {
        synchronized (this.f32904l) {
            try {
                K k10 = (K) this.f32899g.get(c5737m.b());
                if (k10 != null && c5737m.equals(k10.d())) {
                    this.f32899g.remove(c5737m.b());
                }
                i4.i.e().a(f32892m, getClass().getSimpleName() + " " + c5737m.b() + " executed; reschedule = " + z10);
                Iterator it = this.f32903k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2955e) it.next()).f(c5737m, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(InterfaceC2955e interfaceC2955e) {
        synchronized (this.f32904l) {
            this.f32903k.add(interfaceC2955e);
        }
    }

    public C5745u h(String str) {
        synchronized (this.f32904l) {
            try {
                K k10 = (K) this.f32898f.get(str);
                if (k10 == null) {
                    k10 = (K) this.f32899g.get(str);
                }
                if (k10 == null) {
                    return null;
                }
                return k10.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f32904l) {
            zContains = this.f32902j.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f32904l) {
            try {
                z10 = this.f32899g.containsKey(str) || this.f32898f.containsKey(str);
            } finally {
            }
        }
        return z10;
    }

    public void l(InterfaceC2955e interfaceC2955e) {
        synchronized (this.f32904l) {
            this.f32903k.remove(interfaceC2955e);
        }
    }

    public boolean n(v vVar) {
        return o(vVar, null);
    }

    public boolean o(v vVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th2;
        C5737m c5737mA = vVar.a();
        final String strB = c5737mA.b();
        final ArrayList arrayList = new ArrayList();
        C5745u c5745u = (C5745u) this.f32897e.z(new Callable() { // from class: androidx.work.impl.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.e(this.f32886a, arrayList, strB);
            }
        });
        if (c5745u == null) {
            i4.i.e().k(f32892m, "Didn't find WorkSpec for id " + c5737mA);
            m(c5737mA, false);
            return false;
        }
        synchronized (this.f32904l) {
            try {
                try {
                    try {
                        if (k(strB)) {
                            Set set = (Set) this.f32900h.get(strB);
                            if (((v) set.iterator().next()).a().a() == c5737mA.a()) {
                                set.add(vVar);
                                i4.i.e().a(f32892m, "Work " + c5737mA + " is already enqueued for processing");
                            } else {
                                m(c5737mA, false);
                            }
                            return false;
                        }
                        if (c5745u.f() != c5737mA.a()) {
                            m(c5737mA, false);
                            return false;
                        }
                        K kB = new K.c(this.f32894b, this.f32895c, this.f32896d, this, this.f32897e, c5745u, arrayList).d(this.f32901i).c(aVar).b();
                        com.google.common.util.concurrent.p pVarC = kB.c();
                        pVarC.k(new a(this, vVar.a(), pVarC), this.f32896d.a());
                        this.f32899g.put(strB, kB);
                        HashSet hashSet = new HashSet();
                        hashSet.add(vVar);
                        this.f32900h.put(strB, hashSet);
                        this.f32896d.b().execute(kB);
                        i4.i.e().a(f32892m, getClass().getSimpleName() + ": processing " + c5737mA);
                        return true;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            th2 = th;
            throw th2;
        }
    }

    public boolean p(String str) {
        K k10;
        boolean z10;
        synchronized (this.f32904l) {
            try {
                i4.i.e().a(f32892m, "Processor cancelling " + str);
                this.f32902j.add(str);
                k10 = (K) this.f32898f.remove(str);
                z10 = k10 != null;
                if (k10 == null) {
                    k10 = (K) this.f32899g.remove(str);
                }
                if (k10 != null) {
                    this.f32900h.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zI = i(str, k10);
        if (z10) {
            q();
        }
        return zI;
    }

    public boolean r(v vVar) {
        K k10;
        String strB = vVar.a().b();
        synchronized (this.f32904l) {
            try {
                i4.i.e().a(f32892m, "Processor stopping foreground work " + strB);
                k10 = (K) this.f32898f.remove(strB);
                if (k10 != null) {
                    this.f32900h.remove(strB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i(strB, k10);
    }

    public boolean s(v vVar) {
        String strB = vVar.a().b();
        synchronized (this.f32904l) {
            try {
                K k10 = (K) this.f32899g.remove(strB);
                if (k10 == null) {
                    i4.i.e().a(f32892m, "WorkerWrapper could not be found for " + strB);
                    return false;
                }
                Set set = (Set) this.f32900h.get(strB);
                if (set != null && set.contains(vVar)) {
                    i4.i.e().a(f32892m, "Processor stopping background work " + strB);
                    this.f32900h.remove(strB);
                    return i(strB, k10);
                }
                return false;
            } finally {
            }
        }
    }
}
