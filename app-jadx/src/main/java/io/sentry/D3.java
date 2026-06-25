package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f49098a;

    public D3(C5322z3 c5322z3) {
        this.f49098a = c5322z3;
    }

    public List a(StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.B b10 = new io.sentry.protocol.B();
                    b10.z(b(className));
                    b10.D(className);
                    b10.y(stackTraceElement.getMethodName());
                    b10.x(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        b10.B(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    b10.E(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(b10);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f49098a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.f49098a.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
