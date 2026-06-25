package od;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: od.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC5859c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f55366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC5859c f55367c = new EnumC5859c("RSA_SHA256", 0, "rsa-v1_5-sha256");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC5859c[] f55368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f55369e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55370a;

    /* JADX INFO: renamed from: od.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC5859c a(String str) throws Exception {
            EnumC5859c enumC5859c = EnumC5859c.f55367c;
            if (AbstractC5504s.c(str, enumC5859c.b()) || str == null) {
                return enumC5859c;
            }
            throw new Exception("Invalid code signing algorithm name: " + str);
        }

        private a() {
        }
    }

    static {
        EnumC5859c[] enumC5859cArrA = a();
        f55368d = enumC5859cArrA;
        f55369e = AbstractC3048a.a(enumC5859cArrA);
        f55366b = new a(null);
    }

    private EnumC5859c(String str, int i10, String str2) {
        this.f55370a = str2;
    }

    private static final /* synthetic */ EnumC5859c[] a() {
        return new EnumC5859c[]{f55367c};
    }

    public static EnumC5859c valueOf(String str) {
        return (EnumC5859c) Enum.valueOf(EnumC5859c.class, str);
    }

    public static EnumC5859c[] values() {
        return (EnumC5859c[]) f55368d.clone();
    }

    public final String b() {
        return this.f55370a;
    }
}
