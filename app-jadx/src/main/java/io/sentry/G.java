package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final G f49178b = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f49179a = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
    }

    private G() {
    }

    public static G a() {
        return f49178b;
    }

    public void b(a aVar) {
        this.f49179a.add(aVar);
    }
}
