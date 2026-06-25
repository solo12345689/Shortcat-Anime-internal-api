package jf;

import Ud.AbstractC2279u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: jf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5389m {
    public static final Set a(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setF = ((InterfaceC5387k) it.next()).f();
            if (setF == null) {
                return null;
            }
            AbstractC2279u.D(hashSet, setF);
        }
        return hashSet;
    }
}
