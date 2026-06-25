package U0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class U0 {

    /* JADX INFO: renamed from: a */
    private final I0 f18780a;

    /* JADX INFO: renamed from: b */
    private final I0 f18781b;

    /* JADX INFO: renamed from: c */
    private final I0 f18782c;

    /* JADX INFO: renamed from: d */
    private final I0 f18783d;

    public U0(I0 i02, I0 i03, I0 i04, I0 i05) {
        this.f18780a = i02;
        this.f18781b = i03;
        this.f18782c = i04;
        this.f18783d = i05;
    }

    public final I0 a() {
        return this.f18781b;
    }

    public final I0 b() {
        return this.f18782c;
    }

    public final I0 c() {
        return this.f18783d;
    }

    public final I0 d() {
        return this.f18780a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        return AbstractC5504s.c(this.f18780a, u02.f18780a) && AbstractC5504s.c(this.f18781b, u02.f18781b) && AbstractC5504s.c(this.f18782c, u02.f18782c) && AbstractC5504s.c(this.f18783d, u02.f18783d);
    }

    public int hashCode() {
        I0 i02 = this.f18780a;
        int iHashCode = (i02 != null ? i02.hashCode() : 0) * 31;
        I0 i03 = this.f18781b;
        int iHashCode2 = (iHashCode + (i03 != null ? i03.hashCode() : 0)) * 31;
        I0 i04 = this.f18782c;
        int iHashCode3 = (iHashCode2 + (i04 != null ? i04.hashCode() : 0)) * 31;
        I0 i05 = this.f18783d;
        return iHashCode3 + (i05 != null ? i05.hashCode() : 0);
    }

    public /* synthetic */ U0(I0 i02, I0 i03, I0 i04, I0 i05, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : i02, (i10 & 2) != 0 ? null : i03, (i10 & 4) != 0 ? null : i04, (i10 & 8) != 0 ? null : i05);
    }
}
