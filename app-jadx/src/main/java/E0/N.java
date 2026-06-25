package E0;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.viewinterop.b f4084a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.viewinterop.b bVar) {
            super(1);
            this.f4084a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f4084a.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f4084a.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, androidx.compose.ui.viewinterop.b bVar) {
        M m10 = new M();
        m10.i(new a(bVar));
        U u10 = new U();
        m10.j(u10);
        bVar.setOnRequestDisallowInterceptTouchEvent$ui_release(u10);
        return eVar.then(m10);
    }
}
