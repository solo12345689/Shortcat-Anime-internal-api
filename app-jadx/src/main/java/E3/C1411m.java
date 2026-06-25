package E3;

import E3.r;
import P9.AbstractC2011u;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import q2.InterfaceC6084P;
import t2.AbstractC6614a;
import t2.AbstractC6622i;

/* JADX INFO: renamed from: E3.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C1411m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f5409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f5410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U6 f5411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC6084P.b f5412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC6084P.b f5413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f5414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f5415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M6 f5416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC2011u f5417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC2011u f5418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaSession.Token f5419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AbstractC2011u f5420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f5395o = t2.a0.H0(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f5396p = t2.a0.H0(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f5397q = t2.a0.H0(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f5398r = t2.a0.H0(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f5399s = t2.a0.H0(14);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f5400t = t2.a0.H0(13);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f5401u = t2.a0.H0(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f5402v = t2.a0.H0(4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f5403w = t2.a0.H0(5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f5404x = t2.a0.H0(6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f5405y = t2.a0.H0(11);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f5406z = t2.a0.H0(7);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f5392A = t2.a0.H0(8);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f5393B = t2.a0.H0(10);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f5394C = t2.a0.H0(12);

    /* JADX INFO: renamed from: E3.m$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends Binder {
        private b() {
        }

        public C1411m a() {
            return C1411m.this;
        }
    }

    public C1411m(int i10, int i11, r rVar, PendingIntent pendingIntent, AbstractC2011u abstractC2011u, AbstractC2011u abstractC2011u2, AbstractC2011u abstractC2011u3, U6 u62, InterfaceC6084P.b bVar, InterfaceC6084P.b bVar2, Bundle bundle, Bundle bundle2, M6 m62, MediaSession.Token token) {
        this.f5407a = i10;
        this.f5408b = i11;
        this.f5409c = rVar;
        this.f5410d = pendingIntent;
        this.f5417k = abstractC2011u;
        this.f5418l = abstractC2011u2;
        this.f5420n = abstractC2011u3;
        this.f5411e = u62;
        this.f5412f = bVar;
        this.f5413g = bVar2;
        this.f5414h = bundle;
        this.f5415i = bundle2;
        this.f5416j = m62;
        this.f5419m = token;
    }

    public static C1411m d(Bundle bundle) {
        IBinder binder = bundle.getBinder(f5393B);
        if (binder instanceof b) {
            return ((b) binder).a();
        }
        int i10 = bundle.getInt(f5395o, 0);
        final int i11 = bundle.getInt(f5392A, 0);
        IBinder iBinder = (IBinder) AbstractC6614a.e(androidx.core.app.h.a(bundle, f5396p));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f5397q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f5398r);
        AbstractC2011u abstractC2011uD = parcelableArrayList != null ? AbstractC6622i.d(new O9.f() { // from class: E3.j
            @Override // O9.f
            public final Object apply(Object obj) {
                return C1323b.e((Bundle) obj, i11);
            }
        }, parcelableArrayList) : AbstractC2011u.A();
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f5399s);
        AbstractC2011u abstractC2011uD2 = parcelableArrayList2 != null ? AbstractC6622i.d(new O9.f() { // from class: E3.k
            @Override // O9.f
            public final Object apply(Object obj) {
                return C1323b.e((Bundle) obj, i11);
            }
        }, parcelableArrayList2) : AbstractC2011u.A();
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(f5400t);
        AbstractC2011u abstractC2011uD3 = parcelableArrayList3 != null ? AbstractC6622i.d(new O9.f() { // from class: E3.l
            @Override // O9.f
            public final Object apply(Object obj) {
                return C1323b.e((Bundle) obj, i11);
            }
        }, parcelableArrayList3) : AbstractC2011u.A();
        Bundle bundle2 = bundle.getBundle(f5401u);
        U6 u6E = bundle2 == null ? U6.f4986b : U6.e(bundle2);
        Bundle bundle3 = bundle.getBundle(f5403w);
        InterfaceC6084P.b bVarE = bundle3 == null ? InterfaceC6084P.b.f56604b : InterfaceC6084P.b.e(bundle3);
        Bundle bundle4 = bundle.getBundle(f5402v);
        InterfaceC6084P.b bVarE2 = bundle4 == null ? InterfaceC6084P.b.f56604b : InterfaceC6084P.b.e(bundle4);
        Bundle bundle5 = bundle.getBundle(f5404x);
        Bundle bundle6 = bundle.getBundle(f5405y);
        Bundle bundle7 = bundle.getBundle(f5406z);
        M6 m6B = bundle7 == null ? M6.f4628F : M6.B(bundle7, i11);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(f5394C);
        Bundle bundle8 = bundle6;
        r rVarC = r.a.c(iBinder);
        if (bundle5 == null) {
            bundle5 = Bundle.EMPTY;
        }
        Bundle bundle9 = bundle5;
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        return new C1411m(i10, i11, rVarC, pendingIntent, abstractC2011uD, abstractC2011uD2, abstractC2011uD3, u6E, bVarE2, bVarE, bundle9, bundle8, m6B, token);
    }

    public Bundle e(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f5395o, this.f5407a);
        androidx.core.app.h.b(bundle, f5396p, this.f5409c.asBinder());
        bundle.putParcelable(f5397q, this.f5410d);
        if (!this.f5417k.isEmpty()) {
            bundle.putParcelableArrayList(f5398r, AbstractC6622i.h(this.f5417k, new O9.f() { // from class: E3.i
                @Override // O9.f
                public final Object apply(Object obj) {
                    return ((C1323b) obj).k();
                }
            }));
        }
        if (!this.f5418l.isEmpty()) {
            if (i10 >= 7) {
                bundle.putParcelableArrayList(f5399s, AbstractC6622i.h(this.f5418l, new O9.f() { // from class: E3.i
                    @Override // O9.f
                    public final Object apply(Object obj) {
                        return ((C1323b) obj).k();
                    }
                }));
            } else {
                bundle.putParcelableArrayList(f5398r, AbstractC6622i.h(C1323b.f(this.f5418l, true, true), new O9.f() { // from class: E3.i
                    @Override // O9.f
                    public final Object apply(Object obj) {
                        return ((C1323b) obj).k();
                    }
                }));
            }
        }
        if (!this.f5420n.isEmpty()) {
            bundle.putParcelableArrayList(f5400t, AbstractC6622i.h(this.f5420n, new O9.f() { // from class: E3.i
                @Override // O9.f
                public final Object apply(Object obj) {
                    return ((C1323b) obj).k();
                }
            }));
        }
        bundle.putBundle(f5401u, this.f5411e.f());
        bundle.putBundle(f5402v, this.f5412f.h());
        bundle.putBundle(f5403w, this.f5413g.h());
        bundle.putBundle(f5404x, this.f5414h);
        bundle.putBundle(f5405y, this.f5415i);
        bundle.putBundle(f5406z, this.f5416j.A(L6.f(this.f5412f, this.f5413g), false, false).E(i10));
        bundle.putInt(f5392A, this.f5408b);
        MediaSession.Token token = this.f5419m;
        if (token != null) {
            bundle.putParcelable(f5394C, token);
        }
        return bundle;
    }

    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBinder(f5393B, new b());
        return bundle;
    }
}
