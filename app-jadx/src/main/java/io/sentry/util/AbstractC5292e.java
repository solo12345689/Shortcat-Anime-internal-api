package io.sentry.util;

import io.sentry.V2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.util.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5292e {
    public static boolean a(List list, V2 v22) {
        if (v22 != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.m mVarS0 = v22.s0();
            if (mVarS0 != null) {
                String strE = mVarS0.e();
                if (strE != null) {
                    hashSet.add(strE);
                }
                String strD = mVarS0.d();
                if (strD != null) {
                    hashSet.add(strD);
                }
            }
            Throwable thO = v22.O();
            if (thO != null) {
                hashSet.add(thO.toString());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(((io.sentry.F) it.next()).a())) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                io.sentry.F f10 = (io.sentry.F) it2.next();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    if (f10.b((String) it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
