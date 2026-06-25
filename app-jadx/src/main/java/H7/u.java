package H7;

import be.AbstractC3048a;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f8130b = new u("SOLID", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f8131c = new u("DASHED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f8132d = new u("DOTTED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ u[] f8133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8134f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(String outlineStyle) {
            AbstractC5504s.h(outlineStyle, "outlineStyle");
            String lowerCase = outlineStyle.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1338941519) {
                if (lowerCase.equals("dashed")) {
                    return u.f8131c;
                }
                return null;
            }
            if (iHashCode == -1325970902) {
                if (lowerCase.equals("dotted")) {
                    return u.f8132d;
                }
                return null;
            }
            if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                return u.f8130b;
            }
            return null;
        }

        private a() {
        }
    }

    static {
        u[] uVarArrA = a();
        f8133e = uVarArrA;
        f8134f = AbstractC3048a.a(uVarArrA);
        f8129a = new a(null);
    }

    private u(String str, int i10) {
    }

    private static final /* synthetic */ u[] a() {
        return new u[]{f8130b, f8131c, f8132d};
    }

    public static final u b(String str) {
        return f8129a.a(str);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f8133e.clone();
    }
}
