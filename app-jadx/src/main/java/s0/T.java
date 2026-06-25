package s0;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class T implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f58914a;

    public T(PathMeasure pathMeasure) {
        this.f58914a = pathMeasure;
    }

    @Override // s0.p1
    public void a(InterfaceC6374m1 interfaceC6374m1, boolean z10) {
        Path pathV;
        PathMeasure pathMeasure = this.f58914a;
        if (interfaceC6374m1 == null) {
            pathV = null;
        } else {
            if (!(interfaceC6374m1 instanceof S)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathV = ((S) interfaceC6374m1).v();
        }
        pathMeasure.setPath(pathV, z10);
    }

    @Override // s0.p1
    public boolean b(float f10, float f11, InterfaceC6374m1 interfaceC6374m1, boolean z10) {
        PathMeasure pathMeasure = this.f58914a;
        if (interfaceC6374m1 instanceof S) {
            return pathMeasure.getSegment(f10, f11, ((S) interfaceC6374m1).v(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // s0.p1
    public float getLength() {
        return this.f58914a.getLength();
    }
}
