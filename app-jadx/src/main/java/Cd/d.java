package Cd;

import Td.z;
import Ud.S;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final String f3037a;

    public d(String message) {
        AbstractC5504s.h(message, "message");
        this.f3037a = message;
    }

    public final Map a() {
        return S.f(z.a("message", this.f3037a));
    }

    public final String b() {
        return this.f3037a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC5504s.c(this.f3037a, ((d) obj).f3037a);
    }

    public int hashCode() {
        return this.f3037a.hashCode();
    }

    public String toString() {
        return "UpdatesStateError(message=" + this.f3037a + ")";
    }
}
