package E0;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static final void a(long j10, Function1 function1) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        function1.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(C1307q c1307q, long j10, Function1 function1) {
        d(c1307q, j10, function1, true);
    }

    public static final void c(C1307q c1307q, long j10, Function1 function1) {
        d(c1307q, j10, function1, false);
    }

    private static final void d(C1307q c1307q, long j10, Function1 function1, boolean z10) {
        MotionEvent motionEventE = c1307q.e();
        if (motionEventE == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventE.getAction();
        if (z10) {
            motionEventE.setAction(3);
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        motionEventE.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        function1.invoke(motionEventE);
        motionEventE.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEventE.setAction(action);
    }
}
