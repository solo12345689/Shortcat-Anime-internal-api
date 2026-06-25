package androidx.compose.ui.platform;

import E0.C1291a;
import E0.InterfaceC1313x;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f27238a = new J();

    private J() {
    }

    public final void a(View view, InterfaceC1313x interfaceC1313x) {
        PointerIcon pointerIconB = b(view.getContext(), interfaceC1313x);
        if (AbstractC5504s.c(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }

    public final PointerIcon b(Context context, InterfaceC1313x interfaceC1313x) {
        return interfaceC1313x instanceof C1291a ? PointerIcon.getSystemIcon(context, ((C1291a) interfaceC1313x).a()) : PointerIcon.getSystemIcon(context, 1000);
    }
}
