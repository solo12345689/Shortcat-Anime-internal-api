package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f27561b;

    public w1(String str, Object obj) {
        this.f27560a = str;
        this.f27561b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return AbstractC5504s.c(this.f27560a, w1Var.f27560a) && AbstractC5504s.c(this.f27561b, w1Var.f27561b);
    }

    public int hashCode() {
        int iHashCode = this.f27560a.hashCode() * 31;
        Object obj = this.f27561b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f27560a + ", value=" + this.f27561b + ')';
    }
}
