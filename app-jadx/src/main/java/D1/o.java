package d1;

import Y.C0;
import Y.b2;
import Y.h2;
import androidx.emoji2.text.e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h2 f44967a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0 f44968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f44969b;

        a(C0 c02, o oVar) {
            this.f44968a = c02;
            this.f44969b = oVar;
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th2) {
            this.f44969b.f44967a = s.f44974a;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            this.f44968a.setValue(Boolean.TRUE);
            this.f44969b.f44967a = new t(true);
        }
    }

    public o() {
        this.f44967a = androidx.emoji2.text.e.k() ? c() : null;
    }

    private final h2 c() {
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        if (eVarC.g() == 1) {
            return new t(true);
        }
        C0 c0E = b2.e(Boolean.FALSE, null, 2, null);
        eVarC.v(new a(c0E, this));
        return c0E;
    }

    @Override // d1.r
    public h2 a() {
        h2 h2Var = this.f44967a;
        if (h2Var != null) {
            AbstractC5504s.e(h2Var);
            return h2Var;
        }
        if (!androidx.emoji2.text.e.k()) {
            return s.f44974a;
        }
        h2 h2VarC = c();
        this.f44967a = h2VarC;
        AbstractC5504s.e(h2VarC);
        return h2VarC;
    }
}
