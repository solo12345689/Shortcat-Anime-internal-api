package aa;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23897a;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f23897a = list;
    }
}
