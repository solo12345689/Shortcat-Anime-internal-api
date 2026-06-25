package lh;

/* JADX INFO: loaded from: classes5.dex */
public class f implements Fg.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f52838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f52839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f52840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f52841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f52842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f52843o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f52848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f52849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Fg.j f52850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f52851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f52852i;

    static {
        j jVar = j.CLASSIC;
        f52838j = new f("rainbow-III-classic", 3, jVar);
        j jVar2 = j.CIRCUMZENITHAL;
        f52839k = new f("rainbow-III-circumzenithal", 3, jVar2);
        j jVar3 = j.COMPRESSED;
        f52840l = new f("rainbow-III-compressed", 3, jVar3);
        f52841m = new f("rainbow-V-classic", 5, jVar);
        f52842n = new f("rainbow-V-circumzenithal", 5, jVar2);
        f52843o = new f("rainbow-V-compressed", 5, jVar3);
    }

    private f(String str, int i10, j jVar) {
        Fg.j eVar;
        this.f52852i = str;
        if (i10 == 3) {
            this.f52844a = 68;
            this.f52846c = 32;
            this.f52847d = 48;
            eVar = new Hg.e();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f52844a = 96;
            this.f52846c = 36;
            this.f52847d = 64;
            eVar = new Hg.g();
        }
        this.f52850g = eVar;
        int i11 = this.f52844a;
        int i12 = this.f52846c;
        this.f52845b = i11 + i12;
        int i13 = this.f52847d;
        this.f52848e = i11 + i12 + i13;
        this.f52849f = i12 + i13;
        this.f52851h = jVar;
    }

    Fg.j a() {
        return this.f52850g;
    }

    int b() {
        return 32;
    }

    int c() {
        return 32;
    }

    int d() {
        return this.f52849f;
    }

    int e() {
        return this.f52848e;
    }

    int f() {
        return this.f52846c;
    }

    int g() {
        return this.f52847d;
    }

    int h() {
        return this.f52844a;
    }

    j i() {
        return this.f52851h;
    }
}
