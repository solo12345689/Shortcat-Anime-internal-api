package I;

import R0.A;
import R0.C;
import R0.r;
import Td.L;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: I.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0112a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0112a f8652a = new C0112a();

        C0112a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }

        public final void invoke(C c10) {
            A.R(c10);
        }
    }

    public static final e a(e eVar) {
        return r.f(eVar, false, C0112a.f8652a, 1, null);
    }
}
