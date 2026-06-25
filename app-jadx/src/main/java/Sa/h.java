package Sa;

import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.L;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f16038a;

    public h(d dimmingView) {
        AbstractC5504s.h(dimmingView, "dimmingView");
        this.f16038a = dimmingView;
    }

    @Override // com.facebook.react.uimanager.L
    public C getPointerEvents() {
        return this.f16038a.getBlockGestures$react_native_screens_release() ? C.f37391e : C.f37388b;
    }
}
