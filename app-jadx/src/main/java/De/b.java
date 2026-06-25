package De;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC5504s;
import ye.h0;
import ye.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotation f3696b;

    public b(Annotation annotation) {
        AbstractC5504s.h(annotation, "annotation");
        this.f3696b = annotation;
    }

    @Override // ye.h0
    public i0 b() {
        i0 NO_SOURCE_FILE = i0.f65113a;
        AbstractC5504s.g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Annotation d() {
        return this.f3696b;
    }
}
