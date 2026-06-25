package M2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: M2.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1934y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f12055h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.o f12057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f12058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f12059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12062g;

    public C1934y(long j10, w2.o oVar, long j11) {
        this(j10, oVar, oVar.f62825a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f12055h.getAndIncrement();
    }

    public C1934y(long j10, w2.o oVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f12056a = j10;
        this.f12057b = oVar;
        this.f12058c = uri;
        this.f12059d = map;
        this.f12060e = j11;
        this.f12061f = j12;
        this.f12062g = j13;
    }
}
