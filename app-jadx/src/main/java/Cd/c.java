package Cd;

import Td.z;
import Ud.S;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    private final Date f3036a;

    public c(Date commitTime) {
        AbstractC5504s.h(commitTime, "commitTime");
        this.f3036a = commitTime;
    }

    public final String a() {
        String str = b.f3017r.a().format(this.f3036a);
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    public final Map b() {
        return S.f(z.a("commitTime", a()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && AbstractC5504s.c(this.f3036a, ((c) obj).f3036a);
    }

    public int hashCode() {
        return this.f3036a.hashCode();
    }

    public String toString() {
        return "UpdatesStateContextRollback(commitTime=" + this.f3036a + ")";
    }
}
