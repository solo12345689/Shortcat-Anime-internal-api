package He;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f8434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f8435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f8437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8438e;

    public G(O globalLevel, O o10, Map userDefinedLevelForSpecificAnnotation) {
        AbstractC5504s.h(globalLevel, "globalLevel");
        AbstractC5504s.h(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f8434a = globalLevel;
        this.f8435b = o10;
        this.f8436c = userDefinedLevelForSpecificAnnotation;
        this.f8437d = AbstractC2163n.b(new F(this));
        O o11 = O.f8500c;
        this.f8438e = globalLevel == o11 && o10 == o11 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(G g10) {
        List listC = AbstractC2279u.c();
        listC.add(g10.f8434a.b());
        O o10 = g10.f8435b;
        if (o10 != null) {
            listC.add("under-migration:" + o10.b());
        }
        for (Map.Entry entry : g10.f8436c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + ((O) entry.getValue()).b());
        }
        return (String[]) AbstractC2279u.a(listC).toArray(new String[0]);
    }

    public final O c() {
        return this.f8434a;
    }

    public final O d() {
        return this.f8435b;
    }

    public final Map e() {
        return this.f8436c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f8434a == g10.f8434a && this.f8435b == g10.f8435b && AbstractC5504s.c(this.f8436c, g10.f8436c);
    }

    public final boolean f() {
        return this.f8438e;
    }

    public int hashCode() {
        int iHashCode = this.f8434a.hashCode() * 31;
        O o10 = this.f8435b;
        return ((iHashCode + (o10 == null ? 0 : o10.hashCode())) * 31) + this.f8436c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f8434a + ", migrationLevel=" + this.f8435b + ", userDefinedLevelForSpecificAnnotation=" + this.f8436c + ')';
    }

    public /* synthetic */ G(O o10, O o11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? null : o11, (i10 & 4) != 0 ? Ud.S.i() : map);
    }
}
