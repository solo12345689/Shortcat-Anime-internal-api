package W4;

import W4.a;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements a.InterfaceC0363a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f20706b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f20705a = j10;
        this.f20706b = aVar;
    }

    @Override // W4.a.InterfaceC0363a
    public W4.a build() {
        File fileA = this.f20706b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f20705a);
        }
        return null;
    }
}
