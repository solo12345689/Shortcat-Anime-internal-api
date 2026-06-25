package M3;

import S3.h;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.c f12113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f12114b;

    public e(h.c delegate, c autoCloser) {
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(autoCloser, "autoCloser");
        this.f12113a = delegate;
        this.f12114b = autoCloser;
    }

    @Override // S3.h.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(h.b configuration) {
        AbstractC5504s.h(configuration, "configuration");
        return new d(this.f12113a.a(configuration), this.f12114b);
    }
}
