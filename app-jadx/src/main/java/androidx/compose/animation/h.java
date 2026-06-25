package androidx.compose.animation;

import Ud.S;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v.C6779B;
import v.n;
import v.u;
import v.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25705a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f25706b = new i(new C6779B(null, null, null, null, false, null, 63, null));

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f25706b;
        }

        private a() {
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C6779B b();

    public final h c(h hVar) {
        n nVarC = hVar.b().c();
        if (nVarC == null) {
            nVarC = b().c();
        }
        x xVarF = hVar.b().f();
        if (xVarF == null) {
            xVarF = b().f();
        }
        v.h hVarA = hVar.b().a();
        if (hVarA == null) {
            hVarA = b().a();
        }
        u uVarE = hVar.b().e();
        if (uVarE == null) {
            uVarE = b().e();
        }
        return new i(new C6779B(nVarC, xVarF, hVarA, uVarE, false, S.p(b().b(), hVar.b().b()), 16, null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && AbstractC5504s.c(((h) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (AbstractC5504s.c(this, f25706b)) {
            return "EnterTransition.None";
        }
        C6779B c6779bB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
        n nVarC = c6779bB.c();
        sb2.append(nVarC != null ? nVarC.toString() : null);
        sb2.append(",\nSlide - ");
        x xVarF = c6779bB.f();
        sb2.append(xVarF != null ? xVarF.toString() : null);
        sb2.append(",\nShrink - ");
        v.h hVarA = c6779bB.a();
        sb2.append(hVarA != null ? hVarA.toString() : null);
        sb2.append(",\nScale - ");
        u uVarE = c6779bB.e();
        sb2.append(uVarE != null ? uVarE.toString() : null);
        return sb2.toString();
    }

    private h() {
    }
}
