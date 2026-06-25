package H2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements L2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7825c;

    protected j(String str, List list, boolean z10) {
        this.f7823a = str;
        this.f7824b = Collections.unmodifiableList(list);
        this.f7825c = z10;
    }
}
