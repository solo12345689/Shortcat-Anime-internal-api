package q0;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;
import t.C6546L;

/* JADX INFO: renamed from: q0.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6064j extends InterfaceC6062h {

    /* JADX INFO: renamed from: q0.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f56120a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ boolean c(InterfaceC6064j interfaceC6064j, KeyEvent keyEvent, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            interfaceC5082a = a.f56120a;
        }
        return interfaceC6064j.d(keyEvent, interfaceC5082a);
    }

    void a();

    boolean b(androidx.compose.ui.focus.d dVar, C6226h c6226h);

    boolean d(KeyEvent keyEvent, InterfaceC5082a interfaceC5082a);

    Boolean e(int i10, C6226h c6226h, Function1 function1);

    boolean f(G0.b bVar, InterfaceC5082a interfaceC5082a);

    boolean g(B0.c cVar, InterfaceC5082a interfaceC5082a);

    boolean i(KeyEvent keyEvent);

    FocusTargetNode j();

    void k(FocusTargetNode focusTargetNode);

    void l();

    androidx.compose.ui.e m();

    void n(InterfaceC6058d interfaceC6058d);

    boolean o();

    boolean p(boolean z10, boolean z11, boolean z12, int i10);

    n q();

    C6226h r();

    void s(FocusTargetNode focusTargetNode);

    void t();

    C6546L u();
}
