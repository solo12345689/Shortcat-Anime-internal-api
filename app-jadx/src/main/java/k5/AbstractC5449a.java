package k5;

import S4.l;
import U4.j;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b5.AbstractC3012n;
import b5.C3001c;
import b5.C3010l;
import b5.C3017t;
import b5.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import f5.C4776c;
import f5.i;
import java.util.Map;
import o5.C5825b;
import o5.k;

/* JADX INFO: renamed from: k5.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5449a implements Cloneable {

    /* JADX INFO: renamed from: a */
    private int f52056a;

    /* JADX INFO: renamed from: e */
    private Drawable f52060e;

    /* JADX INFO: renamed from: f */
    private int f52061f;

    /* JADX INFO: renamed from: g */
    private Drawable f52062g;

    /* JADX INFO: renamed from: h */
    private int f52063h;

    /* JADX INFO: renamed from: m */
    private boolean f52068m;

    /* JADX INFO: renamed from: o */
    private Drawable f52070o;

    /* JADX INFO: renamed from: p */
    private int f52071p;

    /* JADX INFO: renamed from: t */
    private boolean f52075t;

    /* JADX INFO: renamed from: u */
    private Resources.Theme f52076u;

    /* JADX INFO: renamed from: v */
    private boolean f52077v;

    /* JADX INFO: renamed from: w */
    private boolean f52078w;

    /* JADX INFO: renamed from: x */
    private boolean f52079x;

    /* JADX INFO: renamed from: z */
    private boolean f52081z;

    /* JADX INFO: renamed from: b */
    private float f52057b = 1.0f;

    /* JADX INFO: renamed from: c */
    private j f52058c = j.f19229e;

    /* JADX INFO: renamed from: d */
    private com.bumptech.glide.g f52059d = com.bumptech.glide.g.NORMAL;

    /* JADX INFO: renamed from: i */
    private boolean f52064i = true;

    /* JADX INFO: renamed from: j */
    private int f52065j = -1;

    /* JADX INFO: renamed from: k */
    private int f52066k = -1;

    /* JADX INFO: renamed from: l */
    private S4.f f52067l = n5.b.c();

    /* JADX INFO: renamed from: n */
    private boolean f52069n = true;

    /* JADX INFO: renamed from: q */
    private S4.h f52072q = new S4.h();

    /* JADX INFO: renamed from: r */
    private Map f52073r = new C5825b();

    /* JADX INFO: renamed from: s */
    private Class f52074s = Object.class;

    /* JADX INFO: renamed from: y */
    private boolean f52080y = true;

    private boolean M(int i10) {
        return N(this.f52056a, i10);
    }

    private static boolean N(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private AbstractC5449a V(AbstractC3012n abstractC3012n, l lVar) {
        return W(abstractC3012n, lVar, true);
    }

    private AbstractC5449a W(AbstractC3012n abstractC3012n, l lVar, boolean z10) {
        AbstractC5449a abstractC5449aF0 = z10 ? f0(abstractC3012n, lVar) : S(abstractC3012n, lVar);
        abstractC5449aF0.f52080y = true;
        return abstractC5449aF0;
    }

    public final Class A() {
        return this.f52074s;
    }

    public final S4.f B() {
        return this.f52067l;
    }

    public final float C() {
        return this.f52057b;
    }

    public final Resources.Theme D() {
        return this.f52076u;
    }

    public final Map E() {
        return this.f52073r;
    }

    public final boolean F() {
        return this.f52081z;
    }

    public final boolean G() {
        return this.f52078w;
    }

    protected final boolean H() {
        return this.f52077v;
    }

    public final boolean I(AbstractC5449a abstractC5449a) {
        return Float.compare(abstractC5449a.f52057b, this.f52057b) == 0 && this.f52061f == abstractC5449a.f52061f && o5.l.e(this.f52060e, abstractC5449a.f52060e) && this.f52063h == abstractC5449a.f52063h && o5.l.e(this.f52062g, abstractC5449a.f52062g) && this.f52071p == abstractC5449a.f52071p && o5.l.e(this.f52070o, abstractC5449a.f52070o) && this.f52064i == abstractC5449a.f52064i && this.f52065j == abstractC5449a.f52065j && this.f52066k == abstractC5449a.f52066k && this.f52068m == abstractC5449a.f52068m && this.f52069n == abstractC5449a.f52069n && this.f52078w == abstractC5449a.f52078w && this.f52079x == abstractC5449a.f52079x && this.f52058c.equals(abstractC5449a.f52058c) && this.f52059d == abstractC5449a.f52059d && this.f52072q.equals(abstractC5449a.f52072q) && this.f52073r.equals(abstractC5449a.f52073r) && this.f52074s.equals(abstractC5449a.f52074s) && o5.l.e(this.f52067l, abstractC5449a.f52067l) && o5.l.e(this.f52076u, abstractC5449a.f52076u);
    }

    public final boolean J() {
        return this.f52064i;
    }

    public final boolean K() {
        return M(8);
    }

    boolean L() {
        return this.f52080y;
    }

    public final boolean O() {
        return this.f52068m;
    }

    public final boolean P() {
        return o5.l.u(this.f52066k, this.f52065j);
    }

    public AbstractC5449a Q() {
        this.f52075t = true;
        return X();
    }

    public AbstractC5449a R(boolean z10) {
        if (this.f52077v) {
            return clone().R(z10);
        }
        this.f52079x = z10;
        this.f52056a |= 524288;
        return Y();
    }

    final AbstractC5449a S(AbstractC3012n abstractC3012n, l lVar) {
        if (this.f52077v) {
            return clone().S(abstractC3012n, lVar);
        }
        h(abstractC3012n);
        return e0(lVar, false);
    }

    public AbstractC5449a T(int i10, int i11) {
        if (this.f52077v) {
            return clone().T(i10, i11);
        }
        this.f52066k = i10;
        this.f52065j = i11;
        this.f52056a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        return Y();
    }

    public AbstractC5449a U(com.bumptech.glide.g gVar) {
        if (this.f52077v) {
            return clone().U(gVar);
        }
        this.f52059d = (com.bumptech.glide.g) k.e(gVar);
        this.f52056a |= 8;
        return Y();
    }

    protected final AbstractC5449a Y() {
        if (this.f52075t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return X();
    }

    public AbstractC5449a Z(S4.g gVar, Object obj) {
        if (this.f52077v) {
            return clone().Z(gVar, obj);
        }
        k.e(gVar);
        k.e(obj);
        this.f52072q.e(gVar, obj);
        return Y();
    }

    public AbstractC5449a a(AbstractC5449a abstractC5449a) {
        if (this.f52077v) {
            return clone().a(abstractC5449a);
        }
        if (N(abstractC5449a.f52056a, 2)) {
            this.f52057b = abstractC5449a.f52057b;
        }
        if (N(abstractC5449a.f52056a, 262144)) {
            this.f52078w = abstractC5449a.f52078w;
        }
        if (N(abstractC5449a.f52056a, 1048576)) {
            this.f52081z = abstractC5449a.f52081z;
        }
        if (N(abstractC5449a.f52056a, 4)) {
            this.f52058c = abstractC5449a.f52058c;
        }
        if (N(abstractC5449a.f52056a, 8)) {
            this.f52059d = abstractC5449a.f52059d;
        }
        if (N(abstractC5449a.f52056a, 16)) {
            this.f52060e = abstractC5449a.f52060e;
            this.f52061f = 0;
            this.f52056a &= -33;
        }
        if (N(abstractC5449a.f52056a, 32)) {
            this.f52061f = abstractC5449a.f52061f;
            this.f52060e = null;
            this.f52056a &= -17;
        }
        if (N(abstractC5449a.f52056a, 64)) {
            this.f52062g = abstractC5449a.f52062g;
            this.f52063h = 0;
            this.f52056a &= -129;
        }
        if (N(abstractC5449a.f52056a, 128)) {
            this.f52063h = abstractC5449a.f52063h;
            this.f52062g = null;
            this.f52056a &= -65;
        }
        if (N(abstractC5449a.f52056a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER)) {
            this.f52064i = abstractC5449a.f52064i;
        }
        if (N(abstractC5449a.f52056a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) {
            this.f52066k = abstractC5449a.f52066k;
            this.f52065j = abstractC5449a.f52065j;
        }
        if (N(abstractC5449a.f52056a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)) {
            this.f52067l = abstractC5449a.f52067l;
        }
        if (N(abstractC5449a.f52056a, 4096)) {
            this.f52074s = abstractC5449a.f52074s;
        }
        if (N(abstractC5449a.f52056a, 8192)) {
            this.f52070o = abstractC5449a.f52070o;
            this.f52071p = 0;
            this.f52056a &= -16385;
        }
        if (N(abstractC5449a.f52056a, 16384)) {
            this.f52071p = abstractC5449a.f52071p;
            this.f52070o = null;
            this.f52056a &= -8193;
        }
        if (N(abstractC5449a.f52056a, 32768)) {
            this.f52076u = abstractC5449a.f52076u;
        }
        if (N(abstractC5449a.f52056a, 65536)) {
            this.f52069n = abstractC5449a.f52069n;
        }
        if (N(abstractC5449a.f52056a, 131072)) {
            this.f52068m = abstractC5449a.f52068m;
        }
        if (N(abstractC5449a.f52056a, 2048)) {
            this.f52073r.putAll(abstractC5449a.f52073r);
            this.f52080y = abstractC5449a.f52080y;
        }
        if (N(abstractC5449a.f52056a, 524288)) {
            this.f52079x = abstractC5449a.f52079x;
        }
        if (!this.f52069n) {
            this.f52073r.clear();
            int i10 = this.f52056a;
            this.f52068m = false;
            this.f52056a = i10 & (-133121);
            this.f52080y = true;
        }
        this.f52056a |= abstractC5449a.f52056a;
        this.f52072q.d(abstractC5449a.f52072q);
        return Y();
    }

    public AbstractC5449a a0(S4.f fVar) {
        if (this.f52077v) {
            return clone().a0(fVar);
        }
        this.f52067l = (S4.f) k.e(fVar);
        this.f52056a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        return Y();
    }

    public AbstractC5449a b0(float f10) {
        if (this.f52077v) {
            return clone().b0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f52057b = f10;
        this.f52056a |= 2;
        return Y();
    }

    public AbstractC5449a c() {
        if (this.f52075t && !this.f52077v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f52077v = true;
        return Q();
    }

    public AbstractC5449a c0(boolean z10) {
        if (this.f52077v) {
            return clone().c0(true);
        }
        this.f52064i = !z10;
        this.f52056a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        return Y();
    }

    public AbstractC5449a d() {
        return V(AbstractC3012n.f33177d, new C3010l());
    }

    public AbstractC5449a d0(l lVar) {
        return e0(lVar, true);
    }

    @Override // 
    /* JADX INFO: renamed from: e */
    public AbstractC5449a clone() {
        try {
            AbstractC5449a abstractC5449a = (AbstractC5449a) super.clone();
            S4.h hVar = new S4.h();
            abstractC5449a.f52072q = hVar;
            hVar.d(this.f52072q);
            C5825b c5825b = new C5825b();
            abstractC5449a.f52073r = c5825b;
            c5825b.putAll(this.f52073r);
            abstractC5449a.f52075t = false;
            abstractC5449a.f52077v = false;
            return abstractC5449a;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    AbstractC5449a e0(l lVar, boolean z10) {
        if (this.f52077v) {
            return clone().e0(lVar, z10);
        }
        C3017t c3017t = new C3017t(lVar, z10);
        g0(Bitmap.class, lVar, z10);
        g0(Drawable.class, c3017t, z10);
        g0(BitmapDrawable.class, c3017t.c(), z10);
        g0(C4776c.class, new f5.f(lVar), z10);
        return Y();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC5449a) {
            return I((AbstractC5449a) obj);
        }
        return false;
    }

    public AbstractC5449a f(Class cls) {
        if (this.f52077v) {
            return clone().f(cls);
        }
        this.f52074s = (Class) k.e(cls);
        this.f52056a |= 4096;
        return Y();
    }

    final AbstractC5449a f0(AbstractC3012n abstractC3012n, l lVar) {
        if (this.f52077v) {
            return clone().f0(abstractC3012n, lVar);
        }
        h(abstractC3012n);
        return d0(lVar);
    }

    public AbstractC5449a g(j jVar) {
        if (this.f52077v) {
            return clone().g(jVar);
        }
        this.f52058c = (j) k.e(jVar);
        this.f52056a |= 4;
        return Y();
    }

    AbstractC5449a g0(Class cls, l lVar, boolean z10) {
        if (this.f52077v) {
            return clone().g0(cls, lVar, z10);
        }
        k.e(cls);
        k.e(lVar);
        this.f52073r.put(cls, lVar);
        int i10 = this.f52056a;
        this.f52069n = true;
        this.f52056a = 67584 | i10;
        this.f52080y = false;
        if (z10) {
            this.f52056a = i10 | 198656;
            this.f52068m = true;
        }
        return Y();
    }

    public AbstractC5449a h(AbstractC3012n abstractC3012n) {
        return Z(AbstractC3012n.f33181h, (AbstractC3012n) k.e(abstractC3012n));
    }

    public AbstractC5449a h0(boolean z10) {
        if (this.f52077v) {
            return clone().h0(z10);
        }
        this.f52081z = z10;
        this.f52056a |= 1048576;
        return Y();
    }

    public int hashCode() {
        return o5.l.p(this.f52076u, o5.l.p(this.f52067l, o5.l.p(this.f52074s, o5.l.p(this.f52073r, o5.l.p(this.f52072q, o5.l.p(this.f52059d, o5.l.p(this.f52058c, o5.l.q(this.f52079x, o5.l.q(this.f52078w, o5.l.q(this.f52069n, o5.l.q(this.f52068m, o5.l.o(this.f52066k, o5.l.o(this.f52065j, o5.l.q(this.f52064i, o5.l.p(this.f52070o, o5.l.o(this.f52071p, o5.l.p(this.f52062g, o5.l.o(this.f52063h, o5.l.p(this.f52060e, o5.l.o(this.f52061f, o5.l.m(this.f52057b)))))))))))))))))))));
    }

    public AbstractC5449a i(int i10) {
        return Z(C3001c.f33159b, Integer.valueOf(i10));
    }

    public AbstractC5449a j(S4.b bVar) {
        k.e(bVar);
        return Z(r.f33186f, bVar).Z(i.f46901a, bVar);
    }

    public final j k() {
        return this.f52058c;
    }

    public final int m() {
        return this.f52061f;
    }

    public final Drawable n() {
        return this.f52060e;
    }

    public final Drawable p() {
        return this.f52070o;
    }

    public final int q() {
        return this.f52071p;
    }

    public final boolean r() {
        return this.f52079x;
    }

    public final S4.h s() {
        return this.f52072q;
    }

    public final int t() {
        return this.f52065j;
    }

    public final int u() {
        return this.f52066k;
    }

    public final Drawable v() {
        return this.f52062g;
    }

    public final int x() {
        return this.f52063h;
    }

    public final com.bumptech.glide.g y() {
        return this.f52059d;
    }

    private AbstractC5449a X() {
        return this;
    }
}
