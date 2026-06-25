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
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f8073b = new k("SOLID", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f8074c = new k("DASHED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f8075d = new k("DOTTED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ k[] f8076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8077f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String borderStyle) {
            AbstractC5504s.h(borderStyle, "borderStyle");
            String lowerCase = borderStyle.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1338941519) {
                if (lowerCase.equals("dashed")) {
                    return k.f8074c;
                }
                return null;
            }
            if (iHashCode == -1325970902) {
                if (lowerCase.equals("dotted")) {
                    return k.f8075d;
                }
                return null;
            }
            if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                return k.f8073b;
            }
            return null;
        }

        private a() {
        }
    }

    static {
        k[] kVarArrA = a();
        f8076e = kVarArrA;
        f8077f = AbstractC3048a.a(kVarArrA);
        f8072a = new a(null);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f8073b, f8074c, f8075d};
    }

    public static final k b(String str) {
        return f8072a.a(str);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f8076e.clone();
    }
}
