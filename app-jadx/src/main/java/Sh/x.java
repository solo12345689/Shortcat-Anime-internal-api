package sh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: i */
    private static final Map f59924i;

    /* JADX INFO: renamed from: a */
    private final w f59925a;

    /* JADX INFO: renamed from: b */
    private final int f59926b;

    /* JADX INFO: renamed from: c */
    private final int f59927c;

    /* JADX INFO: renamed from: d */
    private final C7427t f59928d;

    /* JADX INFO: renamed from: e */
    private final int f59929e;

    /* JADX INFO: renamed from: f */
    private final String f59930f;

    /* JADX INFO: renamed from: g */
    private final int f59931g;

    /* JADX INFO: renamed from: h */
    private final m f59932h;

    static {
        HashMap map = new HashMap();
        Integer numB = Oh.e.b(1);
        C7427t c7427t = Bg.a.f1958c;
        map.put(numB, new x(10, c7427t));
        map.put(Oh.e.b(2), new x(16, c7427t));
        map.put(Oh.e.b(3), new x(20, c7427t));
        Integer numB2 = Oh.e.b(4);
        C7427t c7427t2 = Bg.a.f1962e;
        map.put(numB2, new x(10, c7427t2));
        map.put(Oh.e.b(5), new x(16, c7427t2));
        map.put(Oh.e.b(6), new x(20, c7427t2));
        Integer numB3 = Oh.e.b(7);
        C7427t c7427t3 = Bg.a.f1978m;
        map.put(numB3, new x(10, c7427t3));
        map.put(Oh.e.b(8), new x(16, c7427t3));
        map.put(Oh.e.b(9), new x(20, c7427t3));
        Integer numB4 = Oh.e.b(10);
        C7427t c7427t4 = Bg.a.f1980n;
        map.put(numB4, new x(10, c7427t4));
        map.put(Oh.e.b(11), new x(16, c7427t4));
        map.put(Oh.e.b(12), new x(20, c7427t4));
        f59924i = Collections.unmodifiableMap(map);
    }

    public x(int i10, Fg.j jVar) {
        this(i10, f.c(jVar.c()));
    }

    private int a() {
        int i10 = 2;
        while (true) {
            int i11 = this.f59926b;
            if (i10 > i11) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i11 - i10) % 2 == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static x k(int i10) {
        return (x) f59924i.get(Oh.e.b(i10));
    }

    public int b() {
        return this.f59926b;
    }

    int c() {
        return this.f59927c;
    }

    int d() {
        return this.f59932h.a();
    }

    w e() {
        return this.f59925a;
    }

    String f() {
        return this.f59930f;
    }

    public C7427t g() {
        return this.f59928d;
    }

    public int h() {
        return this.f59931g;
    }

    k i() {
        return new k(this.f59932h);
    }

    int j() {
        return this.f59929e;
    }

    public x(int i10, C7427t c7427t) {
        if (i10 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c7427t == null) {
            throw new NullPointerException("digest == null");
        }
        this.f59926b = i10;
        this.f59927c = a();
        String strB = f.b(c7427t);
        this.f59930f = strB;
        this.f59928d = c7427t;
        m mVar = new m(c7427t);
        this.f59932h = mVar;
        int iC = mVar.c();
        this.f59931g = iC;
        int iD = mVar.d();
        this.f59929e = iD;
        this.f59925a = e.c(strB, iC, iD, mVar.a(), i10);
    }
}
