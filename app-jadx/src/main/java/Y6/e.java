package y6;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64849a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64850b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f64851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f64852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f64853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f64855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap.Config f64856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap.Config f64857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C6.c f64858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f64859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f64860l;

    public e() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f64856h = config;
        this.f64857i = config;
    }

    public d a() {
        return new d(this);
    }

    public Bitmap.Config b() {
        return this.f64857i;
    }

    public Bitmap.Config c() {
        return this.f64856h;
    }

    public N6.a d() {
        return null;
    }

    public ColorSpace e() {
        return this.f64859k;
    }

    public C6.c f() {
        return this.f64858j;
    }

    public boolean g() {
        return this.f64854f;
    }

    public boolean h() {
        return this.f64851c;
    }

    public boolean i() {
        return this.f64860l;
    }

    public boolean j() {
        return this.f64855g;
    }

    public int k() {
        return this.f64850b;
    }

    public int l() {
        return this.f64849a;
    }

    public boolean m() {
        return this.f64853e;
    }

    public boolean n() {
        return this.f64852d;
    }
}
