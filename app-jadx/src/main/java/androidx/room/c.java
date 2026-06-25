package androidx.room;

import Df.r;
import M3.q;
import S3.g;
import S3.k;
import Td.L;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.C5905b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f32175q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f32176r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f32177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f32180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f32181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private M3.c f32182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f32183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f32184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile k f32185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f32186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final M3.k f32187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C5905b f32188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.room.d f32189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f32190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f32191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f32192p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(g database) {
            AbstractC5504s.h(database, "database");
            if (database.R1()) {
                database.n0();
            } else {
                database.M();
            }
        }

        public final String b(String tableName, String triggerType) {
            AbstractC5504s.h(tableName, "tableName");
            AbstractC5504s.h(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f32193e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f32194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f32195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f32196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32197d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f32194a = new long[i10];
            this.f32195b = new boolean[i10];
            this.f32196c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f32197d) {
                        return null;
                    }
                    long[] jArr = this.f32194a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f32195b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f32196c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f32196c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f32197d = false;
                    return (int[]) this.f32196c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            AbstractC5504s.h(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f32194a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.f32197d = true;
                        }
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            AbstractC5504s.h(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f32194a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.f32197d = true;
                        }
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f32195b, false);
                this.f32197d = true;
                L l10 = L.f17438a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractC0534c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f32198a;

        public AbstractC0534c(String[] tables) {
            AbstractC5504s.h(tables, "tables");
            this.f32198a = tables;
        }

        public final String[] a() {
            return this.f32198a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0534c f32199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f32200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f32201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f32202d;

        public d(AbstractC0534c observer, int[] tableIds, String[] tableNames) {
            AbstractC5504s.h(observer, "observer");
            AbstractC5504s.h(tableIds, "tableIds");
            AbstractC5504s.h(tableNames, "tableNames");
            this.f32199a = observer;
            this.f32200b = tableIds;
            this.f32201c = tableNames;
            this.f32202d = !(tableNames.length == 0) ? a0.c(tableNames[0]) : a0.d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f32200b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set setD;
            AbstractC5504s.h(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f32200b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setB = a0.b();
                    int[] iArr2 = this.f32200b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setB.add(this.f32201c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setD = a0.a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f32202d : a0.d();
                }
            } else {
                setD = a0.d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f32199a.c(setD);
        }

        public final void c(String[] tables) {
            Set setD;
            AbstractC5504s.h(tables, "tables");
            int length = this.f32201c.length;
            if (length == 0) {
                setD = a0.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setD = a0.d();
                        break;
                    } else {
                        if (r.B(tables[i10], this.f32201c[0], true)) {
                            setD = this.f32202d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setB = a0.b();
                for (String str : tables) {
                    for (String str2 : this.f32201c) {
                        if (r.B(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = a0.a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f32199a.c(setD);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Runnable {
        e() {
        }

        private final Set a() throws IOException {
            c cVar = c.this;
            Set setB = a0.b();
            Cursor cursorY = q.y(cVar.f(), new S3.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorY.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorY.getInt(0)));
                } finally {
                }
            }
            L l10 = L.f17438a;
            fe.c.a(cursorY, null);
            Set setA = a0.a(setB);
            if (setA.isEmpty()) {
                return setA;
            }
            if (c.this.e() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            k kVarE = c.this.e();
            if (kVarE == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kVarE.Z();
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setD;
            M3.c cVar;
            M3.c cVar2;
            Lock lockK = c.this.f().k();
            lockK.lock();
            try {
                try {
                } catch (SQLiteException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setD = a0.d();
                    lockK.unlock();
                    cVar = c.this.f32182f;
                    if (cVar != null) {
                    }
                } catch (IllegalStateException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    setD = a0.d();
                    lockK.unlock();
                    cVar = c.this.f32182f;
                    if (cVar != null) {
                    }
                }
                if (!c.this.d()) {
                    if (cVar2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!c.this.h().compareAndSet(true, false)) {
                    lockK.unlock();
                    M3.c cVar3 = c.this.f32182f;
                    if (cVar3 != null) {
                        cVar3.e();
                        return;
                    }
                    return;
                }
                if (c.this.f().q()) {
                    lockK.unlock();
                    M3.c cVar4 = c.this.f32182f;
                    if (cVar4 != null) {
                        cVar4.e();
                        return;
                    }
                    return;
                }
                g writableDatabase = c.this.f().m().getWritableDatabase();
                writableDatabase.n0();
                try {
                    setD = a();
                    writableDatabase.l0();
                    lockK.unlock();
                    cVar = c.this.f32182f;
                    if (cVar != null) {
                        cVar.e();
                    }
                    if (setD.isEmpty()) {
                        return;
                    }
                    C5905b c5905bG = c.this.g();
                    c cVar5 = c.this;
                    synchronized (c5905bG) {
                        try {
                            Iterator it = cVar5.g().iterator();
                            while (it.hasNext()) {
                                ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                            }
                            L l10 = L.f17438a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } finally {
                    writableDatabase.v0();
                }
            } finally {
                lockK.unlock();
                cVar2 = c.this.f32182f;
                if (cVar2 != null) {
                    cVar2.e();
                }
            }
        }
    }

    public c(q database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(shadowTablesMap, "shadowTablesMap");
        AbstractC5504s.h(viewTables, "viewTables");
        AbstractC5504s.h(tableNames, "tableNames");
        this.f32177a = database;
        this.f32178b = shadowTablesMap;
        this.f32179c = viewTables;
        this.f32183g = new AtomicBoolean(false);
        this.f32186j = new b(tableNames.length);
        this.f32187k = new M3.k(database);
        this.f32188l = new C5905b();
        this.f32190n = new Object();
        this.f32191o = new Object();
        this.f32180d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            AbstractC5504s.g(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            AbstractC5504s.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f32180d.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f32178b.get(tableNames[i10]);
            if (str2 != null) {
                AbstractC5504s.g(US, "US");
                lowerCase = str2.toLowerCase(US);
                AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f32181e = strArr;
        for (Map.Entry entry : this.f32178b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            AbstractC5504s.g(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            AbstractC5504s.g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f32180d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                AbstractC5504s.g(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                AbstractC5504s.g(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f32180d;
                map.put(lowerCase4, S.j(map, lowerCase3));
            }
        }
        this.f32192p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f32191o) {
            this.f32184h = false;
            this.f32186j.d();
            k kVar = this.f32185i;
            if (kVar != null) {
                kVar.close();
                L l10 = L.f17438a;
            }
        }
    }

    private final String[] o(String[] strArr) {
        Set setB = a0.b();
        for (String str : strArr) {
            Map map = this.f32179c;
            Locale US = Locale.US;
            AbstractC5504s.g(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f32179c;
                AbstractC5504s.g(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                AbstractC5504s.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                AbstractC5504s.e(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        return (String[]) a0.a(setB).toArray(new String[0]);
    }

    private final void r(g gVar, int i10) {
        gVar.T("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f32181e[i10];
        for (String str2 : f32176r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f32175q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            AbstractC5504s.g(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.T(str3);
        }
    }

    private final void s(g gVar, int i10) {
        String str = this.f32181e[i10];
        for (String str2 : f32176r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f32175q.b(str, str2);
            AbstractC5504s.g(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.T(str3);
        }
    }

    public void c(AbstractC0534c observer) {
        d dVar;
        AbstractC5504s.h(observer, "observer");
        String[] strArrO = o(observer.a());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map map = this.f32180d;
            Locale US = Locale.US;
            AbstractC5504s.g(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrA1 = AbstractC2279u.a1(arrayList);
        d dVar2 = new d(observer, iArrA1, strArrO);
        synchronized (this.f32188l) {
            dVar = (d) this.f32188l.i(observer, dVar2);
        }
        if (dVar == null && this.f32186j.b(Arrays.copyOf(iArrA1, iArrA1.length))) {
            t();
        }
    }

    public final boolean d() {
        if (!this.f32177a.w()) {
            return false;
        }
        if (!this.f32184h) {
            this.f32177a.m().getWritableDatabase();
        }
        if (this.f32184h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k e() {
        return this.f32185i;
    }

    public final q f() {
        return this.f32177a;
    }

    public final C5905b g() {
        return this.f32188l;
    }

    public final AtomicBoolean h() {
        return this.f32183g;
    }

    public final Map i() {
        return this.f32180d;
    }

    public final void j(g database) {
        AbstractC5504s.h(database, "database");
        synchronized (this.f32191o) {
            if (this.f32184h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.T("PRAGMA temp_store = MEMORY;");
            database.T("PRAGMA recursive_triggers='ON';");
            database.T("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            u(database);
            this.f32185i = database.c1("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f32184h = true;
            L l10 = L.f17438a;
        }
    }

    public final void k(String... tables) {
        AbstractC5504s.h(tables, "tables");
        synchronized (this.f32188l) {
            try {
                for (Map.Entry entry : this.f32188l) {
                    AbstractC5504s.g(entry, "(observer, wrapper)");
                    AbstractC0534c abstractC0534c = (AbstractC0534c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!abstractC0534c.b()) {
                        dVar.c(tables);
                    }
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m() {
        if (this.f32183g.compareAndSet(false, true)) {
            M3.c cVar = this.f32182f;
            if (cVar != null) {
                cVar.j();
            }
            this.f32177a.n().execute(this.f32192p);
        }
    }

    public void n(AbstractC0534c observer) {
        d dVar;
        AbstractC5504s.h(observer, "observer");
        synchronized (this.f32188l) {
            dVar = (d) this.f32188l.l(observer);
        }
        if (dVar != null) {
            b bVar = this.f32186j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                t();
            }
        }
    }

    public final void p(M3.c autoCloser) {
        AbstractC5504s.h(autoCloser, "autoCloser");
        this.f32182f = autoCloser;
        autoCloser.l(new Runnable() { // from class: M3.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f12139a.l();
            }
        });
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(serviceIntent, "serviceIntent");
        this.f32189m = new androidx.room.d(context, name, serviceIntent, this, this.f32177a.n());
    }

    public final void t() {
        if (this.f32177a.w()) {
            u(this.f32177a.m().getWritableDatabase());
        }
    }

    public final void u(g database) {
        AbstractC5504s.h(database, "database");
        if (database.L1()) {
            return;
        }
        try {
            Lock lockK = this.f32177a.k();
            lockK.lock();
            try {
                synchronized (this.f32190n) {
                    int[] iArrA = this.f32186j.a();
                    if (iArrA != null) {
                        f32175q.a(database);
                        try {
                            int length = iArrA.length;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length) {
                                int i12 = iArrA[i10];
                                int i13 = i11 + 1;
                                if (i12 == 1) {
                                    r(database, i11);
                                } else if (i12 == 2) {
                                    s(database, i11);
                                }
                                i10++;
                                i11 = i13;
                            }
                            database.l0();
                            database.v0();
                            L l10 = L.f17438a;
                        } catch (Throwable th2) {
                            database.v0();
                            throw th2;
                        }
                    }
                }
            } finally {
                lockK.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
