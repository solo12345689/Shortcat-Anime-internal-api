package M3;

import S3.h;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: o */
    public static final c f12145o = new c(null);

    /* JADX INFO: renamed from: a */
    protected volatile S3.g f12146a;

    /* JADX INFO: renamed from: b */
    private Executor f12147b;

    /* JADX INFO: renamed from: c */
    private Executor f12148c;

    /* JADX INFO: renamed from: d */
    private S3.h f12149d;

    /* JADX INFO: renamed from: f */
    private boolean f12151f;

    /* JADX INFO: renamed from: g */
    private boolean f12152g;

    /* JADX INFO: renamed from: h */
    protected List f12153h;

    /* JADX INFO: renamed from: k */
    private M3.c f12156k;

    /* JADX INFO: renamed from: m */
    private final Map f12158m;

    /* JADX INFO: renamed from: n */
    private final Map f12159n;

    /* JADX INFO: renamed from: e */
    private final androidx.room.c f12150e = g();

    /* JADX INFO: renamed from: i */
    private Map f12154i = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    private final ReentrantReadWriteLock f12155j = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: l */
    private final ThreadLocal f12157l = new ThreadLocal();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final Context f12160a;

        /* JADX INFO: renamed from: b */
        private final Class f12161b;

        /* JADX INFO: renamed from: c */
        private final String f12162c;

        /* JADX INFO: renamed from: d */
        private final List f12163d;

        /* JADX INFO: renamed from: e */
        private final List f12164e;

        /* JADX INFO: renamed from: f */
        private List f12165f;

        /* JADX INFO: renamed from: g */
        private Executor f12166g;

        /* JADX INFO: renamed from: h */
        private Executor f12167h;

        /* JADX INFO: renamed from: i */
        private h.c f12168i;

        /* JADX INFO: renamed from: j */
        private boolean f12169j;

        /* JADX INFO: renamed from: k */
        private d f12170k;

        /* JADX INFO: renamed from: l */
        private Intent f12171l;

        /* JADX INFO: renamed from: m */
        private boolean f12172m;

        /* JADX INFO: renamed from: n */
        private boolean f12173n;

        /* JADX INFO: renamed from: o */
        private long f12174o;

        /* JADX INFO: renamed from: p */
        private TimeUnit f12175p;

        /* JADX INFO: renamed from: q */
        private final e f12176q;

        /* JADX INFO: renamed from: r */
        private Set f12177r;

        /* JADX INFO: renamed from: s */
        private Set f12178s;

        /* JADX INFO: renamed from: t */
        private String f12179t;

        /* JADX INFO: renamed from: u */
        private File f12180u;

        /* JADX INFO: renamed from: v */
        private Callable f12181v;

        public a(Context context, Class klass, String str) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(klass, "klass");
            this.f12160a = context;
            this.f12161b = klass;
            this.f12162c = str;
            this.f12163d = new ArrayList();
            this.f12164e = new ArrayList();
            this.f12165f = new ArrayList();
            this.f12170k = d.AUTOMATIC;
            this.f12172m = true;
            this.f12174o = -1L;
            this.f12176q = new e();
            this.f12177r = new LinkedHashSet();
        }

        public a a(b callback) {
            AbstractC5504s.h(callback, "callback");
            this.f12163d.add(callback);
            return this;
        }

        public a b(N3.b... migrations) {
            AbstractC5504s.h(migrations, "migrations");
            if (this.f12178s == null) {
                this.f12178s = new HashSet();
            }
            for (N3.b bVar : migrations) {
                Set set = this.f12178s;
                AbstractC5504s.e(set);
                set.add(Integer.valueOf(bVar.f12665a));
                Set set2 = this.f12178s;
                AbstractC5504s.e(set2);
                set2.add(Integer.valueOf(bVar.f12666b));
            }
            this.f12176q.b((N3.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a c() {
            this.f12169j = true;
            return this;
        }

        public q d() {
            Executor executor = this.f12166g;
            if (executor == null && this.f12167h == null) {
                Executor executorF = o.c.f();
                this.f12167h = executorF;
                this.f12166g = executorF;
            } else if (executor != null && this.f12167h == null) {
                this.f12167h = executor;
            } else if (executor == null) {
                this.f12166g = this.f12167h;
            }
            Set set = this.f12178s;
            if (set != null) {
                AbstractC5504s.e(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f12177r.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            h.c vVar = this.f12168i;
            if (vVar == null) {
                vVar = new T3.f();
            }
            if (vVar != null) {
                if (this.f12174o > 0) {
                    if (this.f12162c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f12174o;
                    TimeUnit timeUnit = this.f12175p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f12166g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    vVar = new M3.e(vVar, new M3.c(j10, timeUnit, executor2));
                }
                String str = this.f12179t;
                if (str != null || this.f12180u != null || this.f12181v != null) {
                    if (this.f12162c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f12180u;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f12181v;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    vVar = new v(str, file, callable, vVar);
                }
            } else {
                vVar = null;
            }
            h.c cVar = vVar;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f12160a;
            String str2 = this.f12162c;
            e eVar = this.f12176q;
            List list = this.f12163d;
            boolean z10 = this.f12169j;
            d dVarC = this.f12170k.c(context);
            Executor executor3 = this.f12166g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f12167h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            M3.f fVar = new M3.f(context, str2, cVar, eVar, list, z10, dVarC, executor3, executor4, this.f12171l, this.f12172m, this.f12173n, this.f12177r, this.f12179t, this.f12180u, this.f12181v, null, this.f12164e, this.f12165f);
            q qVar = (q) p.b(this.f12161b, "_Impl");
            qVar.r(fVar);
            return qVar;
        }

        public a e() {
            this.f12172m = false;
            this.f12173n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f12168i = cVar;
            return this;
        }

        public a g(Executor executor) {
            AbstractC5504s.h(executor, "executor");
            this.f12166g = executor;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
        }

        public void b(S3.g db2) {
            AbstractC5504s.h(db2, "db");
        }

        public void c(S3.g db2) {
            AbstractC5504s.h(db2, "db");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean b(ActivityManager activityManager) {
            return S3.c.b(activityManager);
        }

        public final d c(Context context) {
            AbstractC5504s.h(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e {

        /* JADX INFO: renamed from: a */
        private final Map f12186a = new LinkedHashMap();

        private final void a(N3.b bVar) {
            int i10 = bVar.f12665a;
            int i11 = bVar.f12666b;
            Map map = this.f12186a;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + bVar);
            }
            treeMap2.put(Integer.valueOf(i11), bVar);
        }

        private final List e(List list, boolean z10, int i10, int i11) {
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f12186a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    return null;
                }
                for (Integer targetVersion : z10 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                    if (z10) {
                        int i12 = i10 + 1;
                        AbstractC5504s.g(targetVersion, "targetVersion");
                        int iIntValue = targetVersion.intValue();
                        if (i12 <= iIntValue && iIntValue <= i11) {
                            Object obj = treeMap.get(targetVersion);
                            AbstractC5504s.e(obj);
                            list.add(obj);
                            i10 = targetVersion.intValue();
                            z11 = true;
                            break;
                        }
                    } else {
                        AbstractC5504s.g(targetVersion, "targetVersion");
                        int iIntValue2 = targetVersion.intValue();
                        if (i11 <= iIntValue2 && iIntValue2 < i10) {
                            Object obj2 = treeMap.get(targetVersion);
                            AbstractC5504s.e(obj2);
                            list.add(obj2);
                            i10 = targetVersion.intValue();
                            z11 = true;
                            break;
                            break;
                        }
                    }
                }
                z11 = false;
            } while (z11);
            return null;
        }

        public void b(N3.b... migrations) {
            AbstractC5504s.h(migrations, "migrations");
            for (N3.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean c(int i10, int i11) {
            Map mapF = f();
            if (!mapF.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map mapI = (Map) mapF.get(Integer.valueOf(i10));
            if (mapI == null) {
                mapI = S.i();
            }
            return mapI.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            if (i10 == i11) {
                return AbstractC2279u.m();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map f() {
            return this.f12186a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(S3.g it) {
            AbstractC5504s.h(it, "it");
            q.this.s();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(S3.g it) {
            AbstractC5504s.h(it, "it");
            q.this.t();
            return null;
        }
    }

    public q() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC5504s.g(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f12158m = mapSynchronizedMap;
        this.f12159n = new LinkedHashMap();
    }

    private final Object C(Class cls, S3.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof M3.g) {
            return C(cls, ((M3.g) hVar).a());
        }
        return null;
    }

    public final void s() {
        c();
        S3.g writableDatabase = m().getWritableDatabase();
        l().u(writableDatabase);
        if (writableDatabase.R1()) {
            writableDatabase.n0();
        } else {
            writableDatabase.M();
        }
    }

    public final void t() {
        m().getWritableDatabase().v0();
        if (q()) {
            return;
        }
        l().m();
    }

    public static /* synthetic */ Cursor y(q qVar, S3.j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return qVar.x(jVar, cancellationSignal);
    }

    public void A(Runnable body) {
        AbstractC5504s.h(body, "body");
        e();
        try {
            body.run();
            B();
        } finally {
            i();
        }
    }

    public void B() {
        m().getWritableDatabase().l0();
    }

    public void c() {
        if (!this.f12151f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.f12157l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        M3.c cVar = this.f12156k;
        if (cVar == null) {
            s();
        } else {
            cVar.g(new g());
        }
    }

    public S3.k f(String sql) {
        AbstractC5504s.h(sql, "sql");
        c();
        d();
        return m().getWritableDatabase().c1(sql);
    }

    protected abstract androidx.room.c g();

    protected abstract S3.h h(M3.f fVar);

    public void i() {
        M3.c cVar = this.f12156k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new h());
        }
    }

    public List j(Map autoMigrationSpecs) {
        AbstractC5504s.h(autoMigrationSpecs, "autoMigrationSpecs");
        return AbstractC2279u.m();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock lock = this.f12155j.readLock();
        AbstractC5504s.g(lock, "readWriteLock.readLock()");
        return lock;
    }

    public androidx.room.c l() {
        return this.f12150e;
    }

    public S3.h m() {
        S3.h hVar = this.f12149d;
        if (hVar != null) {
            return hVar;
        }
        AbstractC5504s.u("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f12147b;
        if (executor != null) {
            return executor;
        }
        AbstractC5504s.u("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return a0.d();
    }

    protected Map p() {
        return S.i();
    }

    public boolean q() {
        return m().getWritableDatabase().L1();
    }

    public void r(M3.f configuration) {
        AbstractC5504s.h(configuration, "configuration");
        this.f12149d = h(configuration);
        Set setO = o();
        BitSet bitSet = new BitSet();
        Iterator it = setO.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f12132r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (cls.isAssignableFrom(configuration.f12132r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f12154i.put(cls, configuration.f12132r.get(i10));
            } else {
                int size2 = configuration.f12132r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (N3.b bVar : j(this.f12154i)) {
                    if (!configuration.f12118d.c(bVar.f12665a, bVar.f12666b)) {
                        configuration.f12118d.b(bVar);
                    }
                }
                u uVar = (u) C(u.class, m());
                if (uVar != null) {
                    uVar.h(configuration);
                }
                M3.d dVar = (M3.d) C(M3.d.class, m());
                if (dVar != null) {
                    this.f12156k = dVar.f12088b;
                    l().p(dVar.f12088b);
                }
                boolean z10 = configuration.f12121g == d.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z10);
                this.f12153h = configuration.f12119e;
                this.f12147b = configuration.f12122h;
                this.f12148c = new y(configuration.f12123i);
                this.f12151f = configuration.f12120f;
                this.f12152g = z10;
                if (configuration.f12124j != null) {
                    if (configuration.f12116b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    l().q(configuration.f12115a, configuration.f12116b, configuration.f12124j);
                }
                Map mapP = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapP.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f12131q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls3.isAssignableFrom(configuration.f12131q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    size3 = i13;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f12159n.put(cls3, configuration.f12131q.get(size3));
                    }
                }
                int size4 = configuration.f12131q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f12131q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    public void u(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        l().j(db2);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean w() {
        S3.g gVar = this.f12146a;
        return gVar != null && gVar.isOpen();
    }

    public Cursor x(S3.j query, CancellationSignal cancellationSignal) {
        AbstractC5504s.h(query, "query");
        c();
        d();
        return cancellationSignal != null ? m().getWritableDatabase().o0(query, cancellationSignal) : m().getWritableDatabase().E1(query);
    }

    public Object z(Callable body) {
        AbstractC5504s.h(body, "body");
        e();
        try {
            Object objCall = body.call();
            B();
            return objCall;
        } finally {
            i();
        }
    }
}
