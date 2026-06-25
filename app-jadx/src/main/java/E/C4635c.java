package e;

import Y.AbstractC2394b1;
import Y.H;
import Y.InterfaceC2425m;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.K;
import androidx.activity.O;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: e.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4635c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4635c f45762a = new C4635c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2394b1 f45763b = H.h(null, a.f45764a, 1, null);

    /* JADX INFO: renamed from: e.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45764a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            return null;
        }
    }

    private C4635c() {
    }

    public final K a(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.C(-2068013981);
        K kA = (K) interfaceC2425m.n(f45763b);
        interfaceC2425m.C(1680121597);
        if (kA == null) {
            kA = O.a((View) interfaceC2425m.n(AndroidCompositionLocals_androidKt.k()));
        }
        interfaceC2425m.T();
        if (kA == null) {
            Object baseContext = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof K) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            kA = (K) baseContext;
        }
        interfaceC2425m.T();
        return kA;
    }
}
