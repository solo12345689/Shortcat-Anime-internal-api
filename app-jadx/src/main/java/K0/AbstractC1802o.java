package K0;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: K0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1802o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f10792a = new a();

    /* JADX INFO: renamed from: K0.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(J j10, J j11) {
            int i10 = AbstractC5504s.i(j10.S(), j11.S());
            return i10 != 0 ? i10 : AbstractC5504s.i(j10.hashCode(), j11.hashCode());
        }
    }
}
