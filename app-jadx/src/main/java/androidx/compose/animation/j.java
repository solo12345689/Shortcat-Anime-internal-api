package androidx.compose.animation;

import Ud.S;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v.C6779B;
import v.n;
import v.u;
import v.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25708a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f25709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f25710c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f25709b;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        n nVar = null;
        x xVar = null;
        v.h hVar = null;
        u uVar = null;
        Map map = null;
        f25709b = new k(new C6779B(nVar, xVar, hVar, uVar, false, map, 63, defaultConstructorMarker));
        f25710c = new k(new C6779B(nVar, xVar, hVar, uVar, true, map, 47, defaultConstructorMarker));
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C6779B b();

    public final j c(j jVar) {
        n nVarC = jVar.b().c();
        if (nVarC == null) {
            nVarC = b().c();
        }
        x xVarF = jVar.b().f();
        if (xVarF == null) {
            xVarF = b().f();
        }
        v.h hVarA = jVar.b().a();
        if (hVarA == null) {
            hVarA = b().a();
        }
        u uVarE = jVar.b().e();
        if (uVarE == null) {
            uVarE = b().e();
        }
        return new k(new C6779B(nVarC, xVarF, hVarA, uVarE, jVar.b().d() || b().d(), S.p(b().b(), jVar.b().b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && AbstractC5504s.c(((j) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (AbstractC5504s.c(this, f25709b)) {
            return "ExitTransition.None";
        }
        if (AbstractC5504s.c(this, f25710c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C6779B c6779bB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(c6779bB.d());
        return sb2.toString();
    }

    private j() {
    }
}
