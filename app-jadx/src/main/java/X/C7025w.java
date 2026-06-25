package x;

import android.content.Context;
import android.widget.EdgeEffect;
import i1.C5025r;

/* JADX INFO: renamed from: x.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7025w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f63380c = C5025r.f48570b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EdgeEffect f63381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EdgeEffect f63382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EdgeEffect f63383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EdgeEffect f63384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EdgeEffect f63385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EdgeEffect f63386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private EdgeEffect f63387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EdgeEffect f63388k;

    public C7025w(Context context, int i10) {
        this.f63378a = context;
        this.f63379b = i10;
    }

    private final EdgeEffect e() {
        EdgeEffect edgeEffectA = C7024v.f63377a.a(this.f63378a);
        edgeEffectA.setColor(this.f63379b);
        if (!C5025r.e(this.f63380c, C5025r.f48570b.a())) {
            edgeEffectA.setSize(C5025r.g(this.f63380c), C5025r.f(this.f63380c));
        }
        return edgeEffectA;
    }

    private final boolean n(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean x(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(C7024v.f63377a.b(edgeEffect) == 0.0f);
    }

    public final boolean A() {
        return x(this.f63381d);
    }

    public final void B(long j10) {
        this.f63380c = j10;
        EdgeEffect edgeEffect = this.f63381d;
        if (edgeEffect != null) {
            edgeEffect.setSize(C5025r.g(j10), C5025r.f(j10));
        }
        EdgeEffect edgeEffect2 = this.f63382e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(C5025r.g(j10), C5025r.f(j10));
        }
        EdgeEffect edgeEffect3 = this.f63383f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(C5025r.f(j10), C5025r.g(j10));
        }
        EdgeEffect edgeEffect4 = this.f63384g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(C5025r.f(j10), C5025r.g(j10));
        }
        EdgeEffect edgeEffect5 = this.f63385h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(C5025r.g(j10), C5025r.f(j10));
        }
        EdgeEffect edgeEffect6 = this.f63386i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(C5025r.g(j10), C5025r.f(j10));
        }
        EdgeEffect edgeEffect7 = this.f63387j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(C5025r.f(j10), C5025r.g(j10));
        }
        EdgeEffect edgeEffect8 = this.f63388k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(C5025r.f(j10), C5025r.g(j10));
        }
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.f63382e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63382e = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f63386i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63386i = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f63383f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63383f = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f63387j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63387j = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f63384g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63384g = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f63388k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63388k = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f63381d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63381d = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f63385h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f63385h = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean o() {
        return n(this.f63382e);
    }

    public final boolean p() {
        return x(this.f63386i);
    }

    public final boolean q() {
        return x(this.f63382e);
    }

    public final boolean r() {
        return n(this.f63383f);
    }

    public final boolean s() {
        return x(this.f63387j);
    }

    public final boolean t() {
        return x(this.f63383f);
    }

    public final boolean u() {
        return n(this.f63384g);
    }

    public final boolean v() {
        return x(this.f63388k);
    }

    public final boolean w() {
        return x(this.f63384g);
    }

    public final boolean y() {
        return n(this.f63381d);
    }

    public final boolean z() {
        return x(this.f63385h);
    }
}
