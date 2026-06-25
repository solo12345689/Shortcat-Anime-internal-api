package C;

import androidx.compose.ui.layout.s;
import i1.C5009b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class L implements I0.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f2026a = new L();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2027a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
        }
    }

    private L() {
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        return androidx.compose.ui.layout.l.u0(lVar, C5009b.j(j10) ? C5009b.l(j10) : 0, C5009b.i(j10) ? C5009b.k(j10) : 0, null, a.f2027a, 4, null);
    }
}
