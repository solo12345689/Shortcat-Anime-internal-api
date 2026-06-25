package Xd;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f21750a = new g();

    private g() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return f.f21749a;
    }
}
