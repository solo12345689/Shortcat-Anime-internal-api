package r8;

import android.content.Context;
import javax.inject.Provider;
import r8.AbstractC6295u;
import t8.AbstractC6653d;
import t8.C6650a;
import t8.C6652c;
import t8.InterfaceC6651b;
import x8.C7064d;
import y8.w;
import z8.C7330g;
import z8.C7331h;
import z8.C7332i;
import z8.C7333j;
import z8.InterfaceC7327d;
import z8.N;
import z8.V;

/* JADX INFO: renamed from: r8.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6279e extends AbstractC6295u {

    /* JADX INFO: renamed from: a */
    private Provider f58685a;

    /* JADX INFO: renamed from: b */
    private Provider f58686b;

    /* JADX INFO: renamed from: c */
    private Provider f58687c;

    /* JADX INFO: renamed from: d */
    private Provider f58688d;

    /* JADX INFO: renamed from: e */
    private Provider f58689e;

    /* JADX INFO: renamed from: f */
    private Provider f58690f;

    /* JADX INFO: renamed from: g */
    private Provider f58691g;

    /* JADX INFO: renamed from: h */
    private Provider f58692h;

    /* JADX INFO: renamed from: i */
    private Provider f58693i;

    /* JADX INFO: renamed from: j */
    private Provider f58694j;

    /* JADX INFO: renamed from: k */
    private Provider f58695k;

    /* JADX INFO: renamed from: l */
    private Provider f58696l;

    /* JADX INFO: renamed from: m */
    private Provider f58697m;

    /* JADX INFO: renamed from: r8.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements AbstractC6295u.a {

        /* JADX INFO: renamed from: a */
        private Context f58698a;

        private b() {
        }

        @Override // r8.AbstractC6295u.a
        /* JADX INFO: renamed from: b */
        public b a(Context context) {
            this.f58698a = (Context) AbstractC6653d.b(context);
            return this;
        }

        @Override // r8.AbstractC6295u.a
        public AbstractC6295u build() {
            AbstractC6653d.a(this.f58698a, Context.class);
            return new C6279e(this.f58698a);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* synthetic */ C6279e(Context context, a aVar) {
        this(context);
    }

    public static AbstractC6295u.a g() {
        return new b();
    }

    private void h(Context context) {
        this.f58685a = C6650a.a(C6285k.a());
        InterfaceC6651b interfaceC6651bA = C6652c.a(context);
        this.f58686b = interfaceC6651bA;
        s8.j jVarA = s8.j.a(interfaceC6651bA, B8.c.a(), B8.d.a());
        this.f58687c = jVarA;
        this.f58688d = C6650a.a(s8.l.a(this.f58686b, jVarA));
        this.f58689e = V.a(this.f58686b, C7330g.a(), C7332i.a());
        this.f58690f = C6650a.a(C7331h.a(this.f58686b));
        this.f58691g = C6650a.a(N.a(B8.c.a(), B8.d.a(), C7333j.a(), this.f58689e, this.f58690f));
        x8.g gVarB = x8.g.b(B8.c.a());
        this.f58692h = gVarB;
        x8.i iVarA = x8.i.a(this.f58686b, this.f58691g, gVarB, B8.d.a());
        this.f58693i = iVarA;
        Provider provider = this.f58685a;
        Provider provider2 = this.f58688d;
        Provider provider3 = this.f58691g;
        this.f58694j = C7064d.a(provider, provider2, iVarA, provider3, provider3);
        Provider provider4 = this.f58686b;
        Provider provider5 = this.f58688d;
        Provider provider6 = this.f58691g;
        this.f58695k = y8.s.a(provider4, provider5, provider6, this.f58693i, this.f58685a, provider6, B8.c.a(), B8.d.a(), this.f58691g);
        Provider provider7 = this.f58685a;
        Provider provider8 = this.f58691g;
        this.f58696l = w.a(provider7, provider8, this.f58693i, provider8);
        this.f58697m = C6650a.a(C6296v.a(B8.c.a(), B8.d.a(), this.f58694j, this.f58695k, this.f58696l));
    }

    @Override // r8.AbstractC6295u
    InterfaceC7327d a() {
        return (InterfaceC7327d) this.f58691g.get();
    }

    @Override // r8.AbstractC6295u
    C6294t b() {
        return (C6294t) this.f58697m.get();
    }

    private C6279e(Context context) {
        h(context);
    }
}
