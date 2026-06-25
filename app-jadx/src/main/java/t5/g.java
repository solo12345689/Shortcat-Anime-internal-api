package t5;

import D5.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import r5.InterfaceC6271a;
import s5.C6434e;
import s5.InterfaceC6430a;
import s5.InterfaceC6432c;
import s5.InterfaceC6433d;
import t5.f;
import v5.InterfaceC6847a;
import v5.InterfaceC6848b;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements k, InterfaceC6847a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class f60783r = g.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f60784s = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f60785t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f60786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f60787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f60788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f60789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6432c f60790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f60791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f60792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f60793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final D5.a f60794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f60795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f60796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC6430a f60797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f60798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f60799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final F5.a f60800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f60801p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f60802q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.this.f60801p) {
                g.this.p();
            }
            g.this.f60802q = true;
            g.this.f60788c.countDown();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f60804a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f60805b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f60806c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f60806c;
        }

        public synchronized long b() {
            return this.f60805b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f60804a) {
                this.f60805b += j10;
                this.f60806c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f60804a;
        }

        public synchronized void e() {
            this.f60804a = false;
            this.f60806c = -1L;
            this.f60805b = -1L;
        }

        public synchronized void f(long j10, long j11) {
            this.f60806c = j11;
            this.f60805b = j10;
            this.f60804a = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f60807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f60808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f60809c;

        public c(long j10, long j11, long j12) {
            this.f60807a = j10;
            this.f60808b = j11;
            this.f60809c = j12;
        }
    }

    public g(f fVar, j jVar, c cVar, InterfaceC6432c interfaceC6432c, InterfaceC6430a interfaceC6430a, InterfaceC6848b interfaceC6848b, Executor executor, boolean z10) {
        this.f60786a = cVar.f60808b;
        long j10 = cVar.f60809c;
        this.f60787b = j10;
        this.f60789d = j10;
        this.f60794i = D5.a.d();
        this.f60795j = fVar;
        this.f60796k = jVar;
        this.f60792g = -1L;
        this.f60790e = interfaceC6432c;
        this.f60793h = cVar.f60807a;
        this.f60797l = interfaceC6430a;
        this.f60799n = new b();
        this.f60800o = F5.d.a();
        this.f60798m = z10;
        this.f60791f = new HashSet();
        if (interfaceC6848b != null) {
            interfaceC6848b.a(this);
        }
        if (!z10) {
            this.f60788c = new CountDownLatch(0);
        } else {
            this.f60788c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private InterfaceC6271a l(f.b bVar, InterfaceC6433d interfaceC6433d, String str) {
        InterfaceC6271a interfaceC6271aR;
        synchronized (this.f60801p) {
            interfaceC6271aR = bVar.r(interfaceC6433d);
            this.f60791f.add(str);
            this.f60799n.c(interfaceC6271aR.size(), 1L);
        }
        return interfaceC6271aR;
    }

    private void m(long j10, InterfaceC6432c.a aVar) throws IOException {
        try {
            Collection<f.a> collectionN = n(this.f60795j.g());
            long jB = this.f60799n.b();
            long j11 = jB - j10;
            int i10 = 0;
            long j12 = 0;
            for (f.a aVar2 : collectionN) {
                if (j12 > j11) {
                    break;
                }
                long jH = this.f60795j.h(aVar2);
                this.f60791f.remove(aVar2.getId());
                if (jH > 0) {
                    i10++;
                    j12 += jH;
                    l lVarE = l.a().j(aVar2.getId()).g(aVar).i(jH).f(jB - j12).e(j10);
                    InterfaceC6432c interfaceC6432c = this.f60790e;
                    if (interfaceC6432c != null) {
                        interfaceC6432c.d(lVarE);
                    }
                    lVarE.b();
                }
            }
            this.f60799n.c(-j12, -i10);
            this.f60795j.b();
        } catch (IOException e10) {
            this.f60797l.a(InterfaceC6430a.EnumC0896a.EVICTION, f60783r, "evictAboveSize: " + e10.getMessage(), e10);
            throw e10;
        }
    }

    private Collection n(Collection collection) {
        long jNow = this.f60800o.now() + f60784s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f.a aVar = (f.a) it.next();
            if (aVar.getTimestamp() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f60796k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f60801p) {
            try {
                boolean zP = p();
                s();
                long jB = this.f60799n.b();
                if (jB > this.f60789d && !zP) {
                    this.f60799n.e();
                    p();
                }
                long j10 = this.f60789d;
                if (jB > j10) {
                    m((j10 * 9) / 10, InterfaceC6432c.a.CACHE_FULL);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long jNow = this.f60800o.now();
        if (this.f60799n.d()) {
            long j10 = this.f60792g;
            if (j10 != -1 && jNow - j10 <= f60785t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        boolean z10;
        long j10;
        long jNow = this.f60800o.now();
        long j11 = f60784s + jNow;
        Set hashSet = (this.f60798m && this.f60791f.isEmpty()) ? this.f60791f : this.f60798m ? new HashSet() : null;
        try {
            long size = 0;
            long jMax = -1;
            int size2 = 0;
            boolean z11 = false;
            int i10 = 0;
            int i11 = 0;
            z10 = false;
            for (f.a aVar : this.f60795j.g()) {
                try {
                    i10++;
                    size += aVar.getSize();
                    if (aVar.getTimestamp() > j11) {
                        i11++;
                        size2 = (int) (((long) size2) + aVar.getSize());
                        j10 = j11;
                        jMax = Math.max(aVar.getTimestamp() - jNow, jMax);
                        z11 = true;
                    } else {
                        j10 = j11;
                        if (this.f60798m) {
                            y5.k.g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j11 = j10;
                } catch (IOException e10) {
                    e = e10;
                    this.f60797l.a(InterfaceC6430a.EnumC0896a.GENERIC_IO, f60783r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z10;
                }
            }
            if (z11) {
                this.f60797l.a(InterfaceC6430a.EnumC0896a.READ_INVALID_ENTRY, f60783r, "Future timestamp found in " + i11 + " files , with a total size of " + size2 + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j12 = i10;
            if (this.f60799n.a() != j12 || this.f60799n.b() != size) {
                if (this.f60798m && this.f60791f != hashSet) {
                    y5.k.g(hashSet);
                    this.f60791f.clear();
                    this.f60791f.addAll(hashSet);
                }
                this.f60799n.f(size, j12);
            }
            this.f60792g = jNow;
            return true;
        } catch (IOException e11) {
            e = e11;
            z10 = false;
        }
    }

    private f.b r(String str, InterfaceC6433d interfaceC6433d) {
        o();
        return this.f60795j.d(str, interfaceC6433d);
    }

    private void s() {
        if (this.f60794i.f(this.f60795j.isExternal() ? a.EnumC0039a.EXTERNAL : a.EnumC0039a.INTERNAL, this.f60787b - this.f60799n.b())) {
            this.f60789d = this.f60786a;
        } else {
            this.f60789d = this.f60787b;
        }
    }

    @Override // t5.k
    public void a() {
        synchronized (this.f60801p) {
            try {
                this.f60795j.a();
                this.f60791f.clear();
                InterfaceC6432c interfaceC6432c = this.f60790e;
                if (interfaceC6432c != null) {
                    interfaceC6432c.e();
                }
            } catch (IOException | NullPointerException e10) {
                this.f60797l.a(InterfaceC6430a.EnumC0896a.EVICTION, f60783r, "clearAll: " + e10.getMessage(), e10);
            }
            this.f60799n.e();
        }
    }

    @Override // t5.k
    public boolean b(InterfaceC6433d interfaceC6433d) {
        synchronized (this.f60801p) {
            try {
                List listB = C6434e.b(interfaceC6433d);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    if (this.f60791f.contains((String) listB.get(i10))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t5.k
    public InterfaceC6271a c(InterfaceC6433d interfaceC6433d) {
        InterfaceC6271a interfaceC6271aF;
        l lVarD = l.a().d(interfaceC6433d);
        try {
            synchronized (this.f60801p) {
                try {
                    List listB = C6434e.b(interfaceC6433d);
                    String str = null;
                    interfaceC6271aF = null;
                    for (int i10 = 0; i10 < listB.size(); i10++) {
                        str = (String) listB.get(i10);
                        lVarD.j(str);
                        interfaceC6271aF = this.f60795j.f(str, interfaceC6433d);
                        if (interfaceC6271aF != null) {
                            break;
                        }
                    }
                    if (interfaceC6271aF == null) {
                        InterfaceC6432c interfaceC6432c = this.f60790e;
                        if (interfaceC6432c != null) {
                            interfaceC6432c.g(lVarD);
                        }
                        this.f60791f.remove(str);
                    } else {
                        y5.k.g(str);
                        InterfaceC6432c interfaceC6432c2 = this.f60790e;
                        if (interfaceC6432c2 != null) {
                            interfaceC6432c2.h(lVarD);
                        }
                        this.f60791f.add(str);
                    }
                } finally {
                }
            }
            return interfaceC6271aF;
        } catch (IOException e10) {
            this.f60797l.a(InterfaceC6430a.EnumC0896a.GENERIC_IO, f60783r, "getResource", e10);
            lVarD.h(e10);
            InterfaceC6432c interfaceC6432c3 = this.f60790e;
            if (interfaceC6432c3 != null) {
                interfaceC6432c3.f(lVarD);
            }
            return null;
        } finally {
            lVarD.b();
        }
    }

    @Override // t5.k
    public InterfaceC6271a d(InterfaceC6433d interfaceC6433d, s5.j jVar) {
        String strA;
        l lVarD = l.a().d(interfaceC6433d);
        InterfaceC6432c interfaceC6432c = this.f60790e;
        if (interfaceC6432c != null) {
            interfaceC6432c.b(lVarD);
        }
        synchronized (this.f60801p) {
            strA = C6434e.a(interfaceC6433d);
        }
        lVarD.j(strA);
        try {
            try {
                f.b bVarR = r(strA, interfaceC6433d);
                try {
                    bVarR.q(jVar, interfaceC6433d);
                    InterfaceC6271a interfaceC6271aL = l(bVarR, interfaceC6433d, strA);
                    lVarD.i(interfaceC6271aL.size()).f(this.f60799n.b());
                    InterfaceC6432c interfaceC6432c2 = this.f60790e;
                    if (interfaceC6432c2 != null) {
                        interfaceC6432c2.c(lVarD);
                    }
                    return interfaceC6271aL;
                } finally {
                    if (!bVarR.p()) {
                        AbstractC7283a.i(f60783r, "Failed to delete temp file");
                    }
                }
            } catch (IOException e10) {
                lVarD.h(e10);
                InterfaceC6432c interfaceC6432c3 = this.f60790e;
                if (interfaceC6432c3 != null) {
                    interfaceC6432c3.a(lVarD);
                }
                AbstractC7283a.j(f60783r, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } finally {
            lVarD.b();
        }
    }

    @Override // t5.k
    public void e(InterfaceC6433d interfaceC6433d) {
        synchronized (this.f60801p) {
            try {
                List listB = C6434e.b(interfaceC6433d);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    this.f60795j.remove(str);
                    this.f60791f.remove(str);
                }
            } catch (IOException e10) {
                this.f60797l.a(InterfaceC6430a.EnumC0896a.DELETE_FILE, f60783r, "delete: " + e10.getMessage(), e10);
            }
        }
    }

    @Override // t5.k
    public boolean f(InterfaceC6433d interfaceC6433d) {
        synchronized (this.f60801p) {
            if (b(interfaceC6433d)) {
                return true;
            }
            try {
                List listB = C6434e.b(interfaceC6433d);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    if (this.f60795j.e(str, interfaceC6433d)) {
                        this.f60791f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // t5.k
    public boolean g(InterfaceC6433d interfaceC6433d) throws Throwable {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f60801p) {
                    try {
                        List listB = C6434e.b(interfaceC6433d);
                        int i10 = 0;
                        while (i10 < listB.size()) {
                            String str3 = (String) listB.get(i10);
                            if (this.f60795j.c(str3, interfaceC6433d)) {
                                this.f60791f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th2) {
                        str = str2;
                        th = th2;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            l lVarH = l.a().d(interfaceC6433d).j(str).h(e10);
                            InterfaceC6432c interfaceC6432c = this.f60790e;
                            if (interfaceC6432c != null) {
                                interfaceC6432c.f(lVarH);
                            }
                            lVarH.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }
}
