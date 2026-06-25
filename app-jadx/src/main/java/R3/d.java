package r3;

import P9.AbstractC2011u;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2011u f58494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f58497d;

    public d(List list, long j10, long j11) {
        this.f58494a = AbstractC2011u.w(list);
        this.f58495b = j10;
        this.f58496c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f58497d = j12;
    }
}
