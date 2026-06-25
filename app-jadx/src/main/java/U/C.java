package U;

import Y.AbstractC2394b1;
import androidx.compose.material3.MinimumInteractiveModifier;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f17593a = Y.H.j(a.f17595a);

    /* JADX INFO: renamed from: b */
    private static final AbstractC2394b1 f17594b = Y.H.j(b.f17596a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f17595a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final b f17596a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C5015h.h(m41invokeD9Ej5fM());
        }

        /* JADX INFO: renamed from: invoke-D9Ej5fM */
        public final float m41invokeD9Ej5fM() {
            return C5015h.n(48);
        }
    }

    public static final AbstractC2394b1 a() {
        return f17594b;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar) {
        return eVar.then(MinimumInteractiveModifier.f26557b);
    }
}
