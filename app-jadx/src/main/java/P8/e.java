package P8;

import P8.a;
import Q8.AbstractServiceConnectionC2063k;
import Q8.C2053a;
import Q8.C2054b;
import Q8.C2057e;
import Q8.C2074w;
import Q8.E;
import Q8.InterfaceC2068p;
import Q8.J;
import Q8.V;
import Q8.r;
import R8.AbstractC2102c;
import R8.AbstractC2115p;
import R8.C2103d;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a */
    private final Context f13554a;

    /* JADX INFO: renamed from: b */
    private final String f13555b;

    /* JADX INFO: renamed from: c */
    private final P8.a f13556c;

    /* JADX INFO: renamed from: d */
    private final a.d f13557d;

    /* JADX INFO: renamed from: e */
    private final C2054b f13558e;

    /* JADX INFO: renamed from: f */
    private final Looper f13559f;

    /* JADX INFO: renamed from: g */
    private final int f13560g;

    /* JADX INFO: renamed from: h */
    private final f f13561h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC2068p f13562i;

    /* JADX INFO: renamed from: j */
    protected final C2057e f13563j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: c */
        public static final a f13564c = new C0218a().a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC2068p f13565a;

        /* JADX INFO: renamed from: b */
        public final Looper f13566b;

        /* JADX INFO: renamed from: P8.e$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class C0218a {

            /* JADX INFO: renamed from: a */
            private InterfaceC2068p f13567a;

            /* JADX INFO: renamed from: b */
            private Looper f13568b;

            public a a() {
                if (this.f13567a == null) {
                    this.f13567a = new C2053a();
                }
                if (this.f13568b == null) {
                    this.f13568b = Looper.getMainLooper();
                }
                return new a(this.f13567a, this.f13568b);
            }

            public C0218a b(Looper looper) {
                AbstractC2115p.m(looper, "Looper must not be null.");
                this.f13568b = looper;
                return this;
            }

            public C0218a c(InterfaceC2068p interfaceC2068p) {
                AbstractC2115p.m(interfaceC2068p, "StatusExceptionMapper must not be null.");
                this.f13567a = interfaceC2068p;
                return this;
            }
        }

        private a(InterfaceC2068p interfaceC2068p, Account account, Looper looper) {
            this.f13565a = interfaceC2068p;
            this.f13566b = looper;
        }

        /* synthetic */ a(InterfaceC2068p interfaceC2068p, Account account, Looper looper, n nVar) {
            this(interfaceC2068p, null, looper);
        }
    }

    public e(Activity activity, P8.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final com.google.android.gms.common.api.internal.a w(int i10, com.google.android.gms.common.api.internal.a aVar) {
        aVar.zak();
        this.f13563j.A(this, i10, aVar);
        return aVar;
    }

    private final n9.i x(int i10, r rVar) {
        n9.j jVar = new n9.j();
        this.f13563j.B(this, i10, rVar, jVar, this.f13562i);
        return jVar.a();
    }

    public f g() {
        return this.f13561h;
    }

    protected C2103d.a h() {
        C2103d.a aVar = new C2103d.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.f13554a.getClass().getName());
        aVar.b(this.f13554a.getPackageName());
        return aVar;
    }

    public n9.i i(r rVar) {
        return x(2, rVar);
    }

    public com.google.android.gms.common.api.internal.a j(com.google.android.gms.common.api.internal.a aVar) {
        w(0, aVar);
        return aVar;
    }

    public n9.i k(r rVar) {
        return x(0, rVar);
    }

    public com.google.android.gms.common.api.internal.a l(com.google.android.gms.common.api.internal.a aVar) {
        w(1, aVar);
        return aVar;
    }

    public n9.i m(r rVar) {
        return x(1, rVar);
    }

    protected String n(Context context) {
        return null;
    }

    public final C2054b o() {
        return this.f13558e;
    }

    public a.d p() {
        return this.f13557d;
    }

    public Context q() {
        return this.f13554a;
    }

    protected String r() {
        return this.f13555b;
    }

    public Looper s() {
        return this.f13559f;
    }

    public final int t() {
        return this.f13560g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f u(Looper looper, E e10) {
        C2103d c2103dA = h().a();
        a.f fVarA = ((a.AbstractC0216a) AbstractC2115p.l(this.f13556c.a())).a(this.f13554a, looper, c2103dA, this.f13557d, e10, e10);
        String strR = r();
        if (strR != null && (fVarA instanceof AbstractC2102c)) {
            ((AbstractC2102c) fVarA).O(strR);
        }
        if (strR == null || !(fVarA instanceof AbstractServiceConnectionC2063k)) {
            return fVarA;
        }
        android.support.v4.media.session.b.a(fVarA);
        throw null;
    }

    public final V v(Context context, Handler handler) {
        return new V(context, handler, h().a());
    }

    public e(Activity activity, P8.a aVar, a.d dVar, InterfaceC2068p interfaceC2068p) {
        a.C0218a c0218a = new a.C0218a();
        c0218a.c(interfaceC2068p);
        c0218a.b(activity.getMainLooper());
        this(activity, aVar, dVar, c0218a.a());
    }

    private e(Context context, Activity activity, P8.a aVar, a.d dVar, a aVar2) {
        String strN;
        AbstractC2115p.m(context, "Null context is not permitted.");
        AbstractC2115p.m(aVar, "Api must not be null.");
        AbstractC2115p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC2115p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f13554a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            strN = context.getAttributionTag();
        } else {
            strN = n(context);
        }
        this.f13555b = strN;
        this.f13556c = aVar;
        this.f13557d = dVar;
        this.f13559f = aVar2.f13566b;
        C2054b c2054bA = C2054b.a(aVar, dVar, strN);
        this.f13558e = c2054bA;
        this.f13561h = new J(this);
        C2057e c2057eU = C2057e.u(context2);
        this.f13563j = c2057eU;
        this.f13560g = c2057eU.l();
        this.f13562i = aVar2.f13565a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C2074w.u(activity, c2057eU, c2054bA);
        }
        c2057eU.F(this);
    }

    public e(Context context, P8.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
