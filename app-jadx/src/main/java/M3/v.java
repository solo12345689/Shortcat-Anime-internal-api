package M3;

import S3.h;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f12217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f12218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h.c f12219d;

    public v(String str, File file, Callable callable, h.c mDelegate) {
        AbstractC5504s.h(mDelegate, "mDelegate");
        this.f12216a = str;
        this.f12217b = file;
        this.f12218c = callable;
        this.f12219d = mDelegate;
    }

    @Override // S3.h.c
    public S3.h a(h.b configuration) {
        AbstractC5504s.h(configuration, "configuration");
        return new u(configuration.f15917a, this.f12216a, this.f12217b, this.f12218c, configuration.f15919c.f15915a, this.f12219d.a(configuration));
    }
}
