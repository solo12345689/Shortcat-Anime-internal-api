package v0;

import android.graphics.Outline;
import s0.InterfaceC6374m1;

/* JADX INFO: renamed from: v0.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6796L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6796L f61764a = new C6796L();

    private C6796L() {
    }

    public final void a(Outline outline, InterfaceC6374m1 interfaceC6374m1) {
        if (!(interfaceC6374m1 instanceof s0.S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((s0.S) interfaceC6374m1).v());
    }
}
