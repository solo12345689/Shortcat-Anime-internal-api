package sh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f59892e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f59893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f59894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f59895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59896d;

    static {
        HashMap map = new HashMap();
        Integer numB = Oh.e.b(1);
        C7427t c7427t = Bg.a.f1958c;
        map.put(numB, new r(20, 2, c7427t));
        map.put(Oh.e.b(2), new r(20, 4, c7427t));
        map.put(Oh.e.b(3), new r(40, 2, c7427t));
        map.put(Oh.e.b(4), new r(40, 4, c7427t));
        map.put(Oh.e.b(5), new r(40, 8, c7427t));
        map.put(Oh.e.b(6), new r(60, 3, c7427t));
        map.put(Oh.e.b(7), new r(60, 6, c7427t));
        map.put(Oh.e.b(8), new r(60, 12, c7427t));
        Integer numB2 = Oh.e.b(9);
        C7427t c7427t2 = Bg.a.f1962e;
        map.put(numB2, new r(20, 2, c7427t2));
        map.put(Oh.e.b(10), new r(20, 4, c7427t2));
        map.put(Oh.e.b(11), new r(40, 2, c7427t2));
        map.put(Oh.e.b(12), new r(40, 4, c7427t2));
        map.put(Oh.e.b(13), new r(40, 8, c7427t2));
        map.put(Oh.e.b(14), new r(60, 3, c7427t2));
        map.put(Oh.e.b(15), new r(60, 6, c7427t2));
        map.put(Oh.e.b(16), new r(60, 12, c7427t2));
        Integer numB3 = Oh.e.b(17);
        C7427t c7427t3 = Bg.a.f1978m;
        map.put(numB3, new r(20, 2, c7427t3));
        map.put(Oh.e.b(18), new r(20, 4, c7427t3));
        map.put(Oh.e.b(19), new r(40, 2, c7427t3));
        map.put(Oh.e.b(20), new r(40, 4, c7427t3));
        map.put(Oh.e.b(21), new r(40, 8, c7427t3));
        map.put(Oh.e.b(22), new r(60, 3, c7427t3));
        map.put(Oh.e.b(23), new r(60, 6, c7427t3));
        map.put(Oh.e.b(24), new r(60, 12, c7427t3));
        Integer numB4 = Oh.e.b(25);
        C7427t c7427t4 = Bg.a.f1980n;
        map.put(numB4, new r(20, 2, c7427t4));
        map.put(Oh.e.b(26), new r(20, 4, c7427t4));
        map.put(Oh.e.b(27), new r(40, 2, c7427t4));
        map.put(Oh.e.b(28), new r(40, 4, c7427t4));
        map.put(Oh.e.b(29), new r(40, 8, c7427t4));
        map.put(Oh.e.b(30), new r(60, 3, c7427t4));
        map.put(Oh.e.b(31), new r(60, 6, c7427t4));
        map.put(Oh.e.b(32), new r(60, 12, c7427t4));
        f59892e = Collections.unmodifiableMap(map);
    }

    public r(int i10, int i11, Fg.j jVar) {
        this(i10, i11, f.c(jVar.c()));
    }

    public static r i(int i10) {
        return (r) f59892e.get(Oh.e.b(i10));
    }

    private static int j(int i10, int i11) {
        if (i10 < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i10 % i11 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i12 = i10 / i11;
        if (i12 != 1) {
            return i12;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int a() {
        return this.f59895c;
    }

    public int b() {
        return this.f59896d;
    }

    protected int c() {
        return this.f59894b.d();
    }

    protected w d() {
        return this.f59893a;
    }

    protected String e() {
        return this.f59894b.f();
    }

    public int f() {
        return this.f59894b.h();
    }

    int g() {
        return this.f59894b.j();
    }

    protected x h() {
        return this.f59894b;
    }

    public r(int i10, int i11, C7427t c7427t) {
        this.f59895c = i10;
        this.f59896d = i11;
        this.f59894b = new x(j(i10, i11), c7427t);
        this.f59893a = d.c(e(), f(), g(), c(), a(), i11);
    }
}
