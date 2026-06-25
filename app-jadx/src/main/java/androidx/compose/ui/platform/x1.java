package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Cf.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27564a = new ArrayList();

    public final void c(String str, Object obj) {
        this.f27564a.add(new w1(str, obj));
    }

    @Override // Cf.i
    public Iterator iterator() {
        return this.f27564a.iterator();
    }
}
