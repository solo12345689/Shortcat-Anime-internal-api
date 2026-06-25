package K0;

import a0.C2507c;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K0.d0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1783d0 {

    /* JADX INFO: renamed from: K0.d0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2507c f10686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2507c c2507c) {
            super(1);
            this.f10686a = c2507c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(e.b bVar) {
            this.f10686a.c(bVar);
            return Boolean.TRUE;
        }
    }

    public static final int c(e.b bVar, e.b bVar2) {
        if (AbstractC5504s.c(bVar, bVar2)) {
            return 2;
        }
        return l0.d.a(bVar, bVar2) ? 1 : 0;
    }

    public static final C2507c d(androidx.compose.ui.e eVar, C2507c c2507c, C2507c c2507c2) {
        c2507c2.c(eVar);
        a aVar = null;
        while (c2507c2.p() != 0) {
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) c2507c2.y(c2507c2.p() - 1);
            if (eVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar2 = (androidx.compose.ui.a) eVar2;
                c2507c2.c(aVar2.a());
                c2507c2.c(aVar2.c());
            } else if (eVar2 instanceof e.b) {
                c2507c.c(eVar2);
            } else {
                if (aVar == null) {
                    aVar = new a(c2507c);
                }
                eVar2.all(aVar);
                aVar = aVar;
            }
        }
        return c2507c;
    }

    public static final void e(Y y10, e.c cVar) {
        AbstractC5504s.f(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        y10.update(cVar);
    }
}
