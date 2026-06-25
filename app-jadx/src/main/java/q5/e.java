package q5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f57174c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f57175d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f57176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f57177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f57178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f57179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f57180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f57181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f57182k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f57183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f57184b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f57176e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f57177f = new e(aVar2, bVar);
        f57178g = new e(a.xMaxYMax, bVar);
        f57179h = new e(a.xMidYMin, bVar);
        f57180i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f57181j = new e(aVar, bVar2);
        f57182k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f57183a = aVar;
        this.f57184b = bVar;
    }

    public a a() {
        return this.f57183a;
    }

    public b b() {
        return this.f57184b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f57183a == eVar.f57183a && this.f57184b == eVar.f57184b;
    }

    public String toString() {
        return this.f57183a + " " + this.f57184b;
    }
}
