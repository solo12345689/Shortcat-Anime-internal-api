package Q0;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.O;
import Td.L;
import android.os.CancellationSignal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f14249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f14249a = cancellationSignal;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return L.f17438a;
        }

        public final void invoke(Throwable th2) {
            if (th2 != null) {
                this.f14249a.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 c(O o10, CancellationSignal cancellationSignal, Function2 function2) {
        final C0 c0D = AbstractC1617k.d(o10, null, null, function2, 3, null);
        c0D.H(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: Q0.d
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                e.d(c0D);
            }
        });
        return c0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0 c02) {
        C0.a.a(c02, null, 1, null);
    }
}
