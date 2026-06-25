package E2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f4248e;

    public g(String str, long j10, List list, List list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f4246c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) this.f4246c.get(i11)).f4199b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List list, List list2, e eVar) {
        this.f4244a = str;
        this.f4245b = j10;
        this.f4246c = Collections.unmodifiableList(list);
        this.f4247d = Collections.unmodifiableList(list2);
        this.f4248e = eVar;
    }
}
