package x;

import R0.C2098g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f63299a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((R0.C) obj);
            return Td.L.f17438a;
        }

        public final void invoke(R0.C c10) {
            R0.A.b0(c10, C2098g.f14955d.a());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return R0.r.e(eVar, true, a.f63299a);
    }
}
