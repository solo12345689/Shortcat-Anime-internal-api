package W5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f20763a = a.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20764b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f20765c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20766d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f20767e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20768f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20769g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20770h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20771i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20772j = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static d a(float f10) {
        return new d().m(f10);
    }

    private float[] e() {
        if (this.f20765c == null) {
            this.f20765c = new float[8];
        }
        return this.f20765c;
    }

    public int b() {
        return this.f20768f;
    }

    public float c() {
        return this.f20767e;
    }

    public float[] d() {
        return this.f20765c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f20764b == dVar.f20764b && this.f20766d == dVar.f20766d && Float.compare(dVar.f20767e, this.f20767e) == 0 && this.f20768f == dVar.f20768f && Float.compare(dVar.f20769g, this.f20769g) == 0 && this.f20763a == dVar.f20763a && this.f20770h == dVar.f20770h && this.f20771i == dVar.f20771i) {
            return Arrays.equals(this.f20765c, dVar.f20765c);
        }
        return false;
    }

    public int f() {
        return this.f20766d;
    }

    public float g() {
        return this.f20769g;
    }

    public boolean h() {
        return this.f20771i;
    }

    public int hashCode() {
        a aVar = this.f20763a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f20764b ? 1 : 0)) * 31;
        float[] fArr = this.f20765c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f20766d) * 31;
        float f10 = this.f20767e;
        int iFloatToIntBits = (((iHashCode2 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f20768f) * 31;
        float f11 = this.f20769g;
        return ((((iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f20770h ? 1 : 0)) * 31) + (this.f20771i ? 1 : 0);
    }

    public boolean i() {
        return this.f20772j;
    }

    public boolean j() {
        return this.f20764b;
    }

    public a k() {
        return this.f20763a;
    }

    public boolean l() {
        return this.f20770h;
    }

    public d m(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public d n(int i10) {
        this.f20766d = i10;
        this.f20763a = a.OVERLAY_COLOR;
        return this;
    }

    public d o(boolean z10) {
        this.f20771i = z10;
        return this;
    }

    public d p(a aVar) {
        this.f20763a = aVar;
        return this;
    }
}
