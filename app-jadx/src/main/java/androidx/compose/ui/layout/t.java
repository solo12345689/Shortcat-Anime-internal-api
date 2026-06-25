package androidx.compose.ui.layout;

import K0.T;
import K0.p0;
import Td.L;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a */
    private static final Function1 f27009a = a.f27011a;

    /* JADX INFO: renamed from: b */
    private static final long f27010b = AbstractC5010c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f27011a = new a();

        a() {
            super(1);
        }

        public final void invoke(androidx.compose.ui.graphics.g gVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.compose.ui.graphics.g) obj);
            return L.f17438a;
        }
    }

    public static final s.a a(T t10) {
        return new k(t10);
    }

    public static final s.a b(p0 p0Var) {
        return new r(p0Var);
    }
}
