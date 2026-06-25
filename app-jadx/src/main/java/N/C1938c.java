package N;

import K.C1774y;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.A1;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: N.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1938c {

    /* JADX INFO: renamed from: a */
    public static final C1938c f12490a = new C1938c();

    private C1938c() {
    }

    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public final void b(C1774y c1774y, Q.F f10, HandwritingGesture handwritingGesture, A1 a12, Executor executor, final IntConsumer intConsumer, Function1 function1) {
        final int iL = c1774y != null ? i0.f12493a.l(c1774y, handwritingGesture, f10, a12, function1) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: N.b
                @Override // java.lang.Runnable
                public final void run() {
                    C1938c.c(intConsumer, iL);
                }
            });
        } else {
            intConsumer.accept(iL);
        }
    }

    public final boolean d(C1774y c1774y, Q.F f10, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (c1774y != null) {
            return i0.f12493a.D(c1774y, previewableHandwritingGesture, f10, cancellationSignal);
        }
        return false;
    }
}
