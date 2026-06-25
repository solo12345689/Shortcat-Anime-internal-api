package ef;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ef.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4671a implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC4671a other) {
        AbstractC5504s.h(other, "other");
        int iCompareTo = b().compareTo(other.b());
        if (iCompareTo == 0 && !c() && other.c()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract EnumC4672b b();

    public abstract boolean c();
}
