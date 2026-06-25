package M3;

import Td.L;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements S3.j, S3.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f12198i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap f12199j = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f12201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f12202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f12203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f12204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f12205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f12206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12207h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(String query, int i10) {
            AbstractC5504s.h(query, "query");
            TreeMap treeMap = t.f12199j;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    L l10 = L.f17438a;
                    t tVar = new t(i10, null);
                    tVar.j(query, i10);
                    return tVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                t sqliteQuery = (t) entryCeilingEntry.getValue();
                sqliteQuery.j(query, i10);
                AbstractC5504s.g(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = t.f12199j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            AbstractC5504s.g(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ t(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static final t g(String str, int i10) {
        return f12198i.a(str, i10);
    }

    @Override // S3.i
    public void I1(int i10) {
        this.f12206g[i10] = 1;
    }

    @Override // S3.i
    public void Z0(int i10, String value) {
        AbstractC5504s.h(value, "value");
        this.f12206g[i10] = 4;
        this.f12204e[i10] = value;
    }

    @Override // S3.j
    public String a() {
        String str = this.f12201b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // S3.j
    public void b(S3.i statement) {
        AbstractC5504s.h(statement, "statement");
        int iH = h();
        if (1 > iH) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f12206g[i10];
            if (i11 == 1) {
                statement.I1(i10);
            } else if (i11 == 2) {
                statement.m1(i10, this.f12202c[i10]);
            } else if (i11 == 3) {
                statement.b0(i10, this.f12203d[i10]);
            } else if (i11 == 4) {
                String str = this.f12204e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.Z0(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f12205f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.p1(i10, bArr);
            }
            if (i10 == iH) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // S3.i
    public void b0(int i10, double d10) {
        this.f12206g[i10] = 3;
        this.f12203d[i10] = d10;
    }

    public int h() {
        return this.f12207h;
    }

    public final void j(String query, int i10) {
        AbstractC5504s.h(query, "query");
        this.f12201b = query;
        this.f12207h = i10;
    }

    public final void k() {
        TreeMap treeMap = f12199j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f12200a), this);
            f12198i.b();
            L l10 = L.f17438a;
        }
    }

    @Override // S3.i
    public void m1(int i10, long j10) {
        this.f12206g[i10] = 2;
        this.f12202c[i10] = j10;
    }

    @Override // S3.i
    public void p1(int i10, byte[] value) {
        AbstractC5504s.h(value, "value");
        this.f12206g[i10] = 5;
        this.f12205f[i10] = value;
    }

    private t(int i10) {
        this.f12200a = i10;
        int i11 = i10 + 1;
        this.f12206g = new int[i11];
        this.f12202c = new long[i11];
        this.f12203d = new double[i11];
        this.f12204e = new String[i11];
        this.f12205f = new byte[i11][];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
