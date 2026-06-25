package Sa;

import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f16039a;

    public i(h hVar) {
        this.f16039a = hVar;
    }

    public final void a(h hVar) {
        this.f16039a = hVar;
    }

    @Override // com.facebook.react.uimanager.L
    public C getPointerEvents() {
        C pointerEvents;
        h hVar = this.f16039a;
        return (hVar == null || (pointerEvents = hVar.getPointerEvents()) == null) ? C.f37388b : pointerEvents;
    }
}
