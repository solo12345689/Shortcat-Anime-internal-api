package a0;

import java.util.NoSuchElementException;
import t.C6546L;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2505a {
    public static final Object a(C6546L c6546l) {
        if (c6546l.f()) {
            throw new NoSuchElementException("List is empty.");
        }
        int iD = c6546l.d() - 1;
        Object objC = c6546l.c(iD);
        c6546l.r(iD);
        return objC;
    }
}
