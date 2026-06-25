package af;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: af.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC2613F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2613F f23961a = new EnumC2613F("PLAIN", 0) { // from class: af.F.b
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // af.EnumC2613F
        public String b(String string) {
            AbstractC5504s.h(string, "string");
            return string;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2613F f23962b = new EnumC2613F("HTML", 1) { // from class: af.F.a
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // af.EnumC2613F
        public String b(String string) {
            AbstractC5504s.h(string, "string");
            return Df.r.K(Df.r.K(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC2613F[] f23963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f23964d;

    static {
        EnumC2613F[] enumC2613FArrA = a();
        f23963c = enumC2613FArrA;
        f23964d = AbstractC3048a.a(enumC2613FArrA);
    }

    public /* synthetic */ EnumC2613F(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    private static final /* synthetic */ EnumC2613F[] a() {
        return new EnumC2613F[]{f23961a, f23962b};
    }

    public static EnumC2613F valueOf(String str) {
        return (EnumC2613F) Enum.valueOf(EnumC2613F.class, str);
    }

    public static EnumC2613F[] values() {
        return (EnumC2613F[]) f23963c.clone();
    }

    public abstract String b(String str);

    private EnumC2613F(String str, int i10) {
    }
}
