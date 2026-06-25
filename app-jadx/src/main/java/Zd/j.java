package Zd;

import Zd.i;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f23275a = new j();

    private j() {
    }

    @Override // Zd.i
    public i a1(i.c key) {
        AbstractC5504s.h(key, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    @Override // Zd.i
    public i.b l(i.c key) {
        AbstractC5504s.h(key, "key");
        return null;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // Zd.i
    public i w(i context) {
        AbstractC5504s.h(context, "context");
        return context;
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 operation) {
        AbstractC5504s.h(operation, "operation");
        return obj;
    }
}
