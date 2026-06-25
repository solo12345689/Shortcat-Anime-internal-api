package U4;

import W4.a;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class e implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S4.d f19142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S4.h f19144c;

    e(S4.d dVar, Object obj, S4.h hVar) {
        this.f19142a = dVar;
        this.f19143b = obj;
        this.f19144c = hVar;
    }

    @Override // W4.a.b
    public boolean a(File file) {
        return this.f19142a.b(this.f19143b, file, this.f19144c);
    }
}
