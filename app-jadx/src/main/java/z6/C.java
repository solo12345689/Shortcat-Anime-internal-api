package z6;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.C3181a;
import com.facebook.imagepipeline.producers.C3187g;
import com.facebook.imagepipeline.producers.C3188h;
import com.facebook.imagepipeline.producers.C3189i;
import com.facebook.imagepipeline.producers.C3190j;
import com.facebook.imagepipeline.producers.C3191k;
import com.facebook.imagepipeline.producers.C3192l;
import com.facebook.imagepipeline.producers.C3195o;
import com.facebook.imagepipeline.producers.C3196p;
import com.facebook.imagepipeline.producers.C3198s;
import com.facebook.imagepipeline.producers.C3201v;
import com.facebook.imagepipeline.producers.C3202w;
import com.facebook.imagepipeline.producers.C3204y;
import com.facebook.imagepipeline.producers.C3205z;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import x6.C7059d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C {

    /* JADX INFO: renamed from: a */
    protected ContentResolver f65619a;

    /* JADX INFO: renamed from: b */
    protected Resources f65620b;

    /* JADX INFO: renamed from: c */
    protected AssetManager f65621c;

    /* JADX INFO: renamed from: d */
    protected final B5.a f65622d;

    /* JADX INFO: renamed from: e */
    protected final C6.c f65623e;

    /* JADX INFO: renamed from: f */
    protected final C6.e f65624f;

    /* JADX INFO: renamed from: g */
    protected final EnumC7300n f65625g;

    /* JADX INFO: renamed from: h */
    protected final boolean f65626h;

    /* JADX INFO: renamed from: i */
    protected final boolean f65627i;

    /* JADX INFO: renamed from: j */
    protected final InterfaceC7302p f65628j;

    /* JADX INFO: renamed from: k */
    protected final B5.i f65629k;

    /* JADX INFO: renamed from: l */
    protected final y5.n f65630l;

    /* JADX INFO: renamed from: m */
    protected final x6.x f65631m;

    /* JADX INFO: renamed from: n */
    protected final x6.x f65632n;

    /* JADX INFO: renamed from: o */
    protected final x6.k f65633o;

    /* JADX INFO: renamed from: p */
    protected final C7059d f65634p;

    /* JADX INFO: renamed from: q */
    protected final C7059d f65635q;

    /* JADX INFO: renamed from: r */
    protected final w6.d f65636r;

    /* JADX INFO: renamed from: s */
    protected final int f65637s;

    /* JADX INFO: renamed from: t */
    protected final int f65638t;

    /* JADX INFO: renamed from: u */
    protected boolean f65639u;

    /* JADX INFO: renamed from: v */
    protected final C7287a f65640v;

    /* JADX INFO: renamed from: w */
    protected final int f65641w;

    /* JADX INFO: renamed from: x */
    protected final boolean f65642x;

    public C(Context context, B5.a aVar, C6.c cVar, C6.e eVar, EnumC7300n enumC7300n, boolean z10, boolean z11, InterfaceC7302p interfaceC7302p, B5.i iVar, x6.x xVar, x6.x xVar2, y5.n nVar, x6.k kVar, w6.d dVar, int i10, int i11, boolean z12, int i12, C7287a c7287a, boolean z13, int i13) {
        this.f65619a = context.getApplicationContext().getContentResolver();
        this.f65620b = context.getApplicationContext().getResources();
        this.f65621c = context.getApplicationContext().getAssets();
        this.f65622d = aVar;
        this.f65623e = cVar;
        this.f65624f = eVar;
        this.f65625g = enumC7300n;
        this.f65626h = z10;
        this.f65627i = z11;
        this.f65628j = interfaceC7302p;
        this.f65629k = iVar;
        this.f65632n = xVar;
        this.f65631m = xVar2;
        this.f65630l = nVar;
        this.f65633o = kVar;
        this.f65636r = dVar;
        this.f65634p = new C7059d(i13);
        this.f65635q = new C7059d(i13);
        this.f65637s = i10;
        this.f65638t = i11;
        this.f65639u = z12;
        this.f65641w = i12;
        this.f65640v = c7287a;
        this.f65642x = z13;
    }

    public static C3181a a(d0 d0Var) {
        return new C3181a(d0Var);
    }

    public static C3192l h(d0 d0Var, d0 d0Var2) {
        return new C3192l(d0Var, d0Var2);
    }

    public a0 A(d0 d0Var) {
        return new a0(this.f65632n, this.f65633o, d0Var);
    }

    public b0 B(d0 d0Var) {
        return new b0(d0Var, this.f65636r, this.f65628j.e());
    }

    public i0 C() {
        return new i0(this.f65628j.f(), this.f65629k, this.f65619a);
    }

    public k0 D(d0 d0Var, boolean z10, M6.d dVar) {
        return new k0(this.f65628j.e(), this.f65629k, d0Var, z10, dVar);
    }

    public n0 E(d0 d0Var) {
        return new n0(d0Var);
    }

    public r0 F(d0 d0Var) {
        return new r0(5, this.f65628j.a(), d0Var);
    }

    public t0 G(u0[] u0VarArr) {
        return new t0(u0VarArr);
    }

    public d0 b(d0 d0Var, p0 p0Var) {
        return new o0(d0Var, p0Var);
    }

    public C3187g c(d0 d0Var) {
        return new C3187g(this.f65632n, this.f65633o, d0Var);
    }

    public C3188h d(d0 d0Var) {
        return new C3188h(this.f65633o, d0Var);
    }

    public C3189i e(d0 d0Var) {
        return new C3189i(this.f65632n, this.f65633o, d0Var);
    }

    public C3190j f(d0 d0Var) {
        return new C3190j(d0Var, this.f65637s, this.f65638t, this.f65639u);
    }

    public C3191k g(d0 d0Var) {
        return new C3191k(this.f65631m, this.f65630l, this.f65633o, this.f65634p, this.f65635q, d0Var);
    }

    public C3195o i() {
        return new C3195o(this.f65629k);
    }

    public C3196p j(d0 d0Var) {
        return new C3196p(this.f65622d, this.f65628j.d(), this.f65623e, this.f65624f, this.f65625g, this.f65626h, this.f65627i, d0Var, this.f65641w, this.f65640v, null, y5.o.f64829b);
    }

    public C3198s k(d0 d0Var) {
        return new C3198s(d0Var, this.f65628j.c());
    }

    public C3201v l(d0 d0Var) {
        return new C3201v(this.f65630l, this.f65633o, d0Var);
    }

    public C3202w m(d0 d0Var) {
        return new C3202w(this.f65630l, this.f65633o, d0Var);
    }

    public C3204y n(d0 d0Var) {
        return new C3204y(this.f65633o, this.f65642x, d0Var);
    }

    public d0 o(d0 d0Var) {
        return new C3205z(this.f65631m, this.f65633o, d0Var);
    }

    public com.facebook.imagepipeline.producers.A p(d0 d0Var) {
        return new com.facebook.imagepipeline.producers.A(this.f65630l, this.f65633o, this.f65634p, this.f65635q, d0Var);
    }

    public com.facebook.imagepipeline.producers.H q() {
        return new com.facebook.imagepipeline.producers.H(this.f65628j.f(), this.f65629k, this.f65621c);
    }

    public com.facebook.imagepipeline.producers.I r() {
        return new com.facebook.imagepipeline.producers.I(this.f65628j.f(), this.f65629k, this.f65619a);
    }

    public com.facebook.imagepipeline.producers.J s() {
        return new com.facebook.imagepipeline.producers.J(this.f65628j.f(), this.f65629k, this.f65619a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f65628j.g(), this.f65629k, this.f65619a);
    }

    public com.facebook.imagepipeline.producers.M u() {
        return new com.facebook.imagepipeline.producers.M(this.f65628j.f(), this.f65629k);
    }

    public com.facebook.imagepipeline.producers.N v() {
        return new com.facebook.imagepipeline.producers.N(this.f65628j.f(), this.f65629k, this.f65620b);
    }

    public com.facebook.imagepipeline.producers.S w() {
        return new com.facebook.imagepipeline.producers.S(this.f65628j.e(), this.f65619a);
    }

    public com.facebook.imagepipeline.producers.T x() {
        return new com.facebook.imagepipeline.producers.T(this.f65628j.f(), this.f65619a);
    }

    public d0 y(X x10) {
        return new com.facebook.imagepipeline.producers.W(this.f65629k, this.f65622d, x10);
    }

    public Y z(d0 d0Var) {
        return new Y(this.f65630l, this.f65633o, this.f65629k, this.f65622d, d0Var);
    }
}
