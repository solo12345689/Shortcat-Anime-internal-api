package E2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4203f;

    public a(long j10, int i10, List list, List list2, List list3, List list4) {
        this.f4198a = j10;
        this.f4199b = i10;
        this.f4200c = Collections.unmodifiableList(list);
        this.f4201d = Collections.unmodifiableList(list2);
        this.f4202e = Collections.unmodifiableList(list3);
        this.f4203f = Collections.unmodifiableList(list4);
    }
}
