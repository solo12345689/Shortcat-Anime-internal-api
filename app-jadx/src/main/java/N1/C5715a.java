package n1;

/* JADX INFO: renamed from: n1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5715a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f53834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f53837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f53839f;

    public C5715a(C5715a c5715a) {
        this.f53836c = Integer.MIN_VALUE;
        this.f53837d = Float.NaN;
        this.f53838e = null;
        this.f53834a = c5715a.f53834a;
        this.f53835b = c5715a.f53835b;
        this.f53836c = c5715a.f53836c;
        this.f53837d = c5715a.f53837d;
        this.f53838e = c5715a.f53838e;
        this.f53839f = c5715a.f53839f;
    }

    public static String a(int i10) {
        return "#" + ("00000000" + Integer.toHexString(i10)).substring(r2.length() - 8);
    }

    public C5715a b() {
        return new C5715a(this);
    }

    public boolean c() {
        return this.f53839f;
    }

    public float d() {
        return this.f53837d;
    }

    public int e() {
        return this.f53836c;
    }

    public String f() {
        return this.f53834a;
    }

    public String g() {
        return this.f53838e;
    }

    public int h() {
        return this.f53835b;
    }

    public void i(float f10) {
        this.f53837d = f10;
    }

    public void j(int i10) {
        this.f53836c = i10;
    }

    public String toString() {
        String str = this.f53834a + ':';
        switch (this.f53835b) {
            case 900:
                return str + this.f53836c;
            case 901:
                return str + this.f53837d;
            case 902:
                return str + a(this.f53836c);
            case 903:
                return str + this.f53838e;
            case 904:
                return str + Boolean.valueOf(this.f53839f);
            case 905:
                return str + this.f53837d;
            default:
                return str + "????";
        }
    }

    public C5715a(String str, int i10, int i11) {
        this.f53836c = Integer.MIN_VALUE;
        this.f53837d = Float.NaN;
        this.f53838e = null;
        this.f53834a = str;
        this.f53835b = i10;
        if (i10 == 901) {
            this.f53837d = i11;
        } else {
            this.f53836c = i11;
        }
    }

    public C5715a(String str, int i10, float f10) {
        this.f53836c = Integer.MIN_VALUE;
        this.f53838e = null;
        this.f53834a = str;
        this.f53835b = i10;
        this.f53837d = f10;
    }
}
