package K;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import a1.C2527U;
import a1.InterfaceC2517J;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5506u;
import pe.InterfaceC6018h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f9817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q.F f9818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2527U f9819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2517J f9822f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j0 f9823g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f9824h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9825i;

        /* JADX INFO: renamed from: K.Q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        /* synthetic */ class C0139a extends AbstractC5502p implements Function1 {
            C0139a(Object obj) {
                super(1, obj, P.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return j(((C0.b) obj).f());
            }

            public final Boolean j(KeyEvent keyEvent) {
                return Boolean.valueOf(((P) this.receiver).l(keyEvent));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1774y c1774y, Q.F f10, C2527U c2527u, boolean z10, boolean z11, InterfaceC2517J interfaceC2517J, j0 j0Var, Function1 function1, int i10) {
            super(3);
            this.f9817a = c1774y;
            this.f9818b = f10;
            this.f9819c = c2527u;
            this.f9820d = z10;
            this.f9821e = z11;
            this.f9822f = interfaceC2517J;
            this.f9823g = j0Var;
            this.f9824h = function1;
            this.f9825i = i10;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(851809892);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(851809892, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            Object objD = interfaceC2425m.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = new Q.I();
                interfaceC2425m.u(objD);
            }
            Q.I i11 = (Q.I) objD;
            Object objD2 = interfaceC2425m.D();
            if (objD2 == aVar.a()) {
                objD2 = new C1760j();
                interfaceC2425m.u(objD2);
            }
            P p10 = new P(this.f9817a, this.f9818b, this.f9819c, this.f9820d, this.f9821e, i11, this.f9822f, this.f9823g, (C1760j) objD2, null, this.f9824h, this.f9825i, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            boolean zF = interfaceC2425m.F(p10);
            Object objD3 = interfaceC2425m.D();
            if (zF || objD3 == aVar.a()) {
                objD3 = new C0139a(p10);
                interfaceC2425m.u(objD3);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.input.key.a.a(aVar2, (Function1) ((InterfaceC6018h) objD3));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarA;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, C1774y c1774y, Q.F f10, C2527U c2527u, Function1 function1, boolean z10, boolean z11, InterfaceC2517J interfaceC2517J, j0 j0Var, int i10) {
        return androidx.compose.ui.c.c(eVar, null, new a(c1774y, f10, c2527u, z10, z11, interfaceC2517J, j0Var, function1, i10), 1, null);
    }
}
