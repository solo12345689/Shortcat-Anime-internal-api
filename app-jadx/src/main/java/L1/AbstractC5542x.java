package l1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: l1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5542x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f52522b = new LinkedHashMap();

    public AbstractC5542x(Object obj) {
        this.f52521a = obj;
    }

    public Object a() {
        return this.f52521a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC5542x) && AbstractC5504s.c(a(), ((AbstractC5542x) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
