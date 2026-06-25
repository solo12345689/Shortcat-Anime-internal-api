package we;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we.AbstractC6971f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: we.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC6968c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC6968c f63174b = new EnumC6968c("Function", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6968c f63175c = new EnumC6968c("SuspendFunction", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC6968c f63176d = new EnumC6968c("KFunction", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC6968c f63177e = new EnumC6968c("KSuspendFunction", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC6968c f63178f = new EnumC6968c("UNKNOWN", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC6968c[] f63179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f63180h;

    /* JADX INFO: renamed from: we.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC6968c a(AbstractC6971f functionTypeKind) {
            AbstractC5504s.h(functionTypeKind, "functionTypeKind");
            return AbstractC5504s.c(functionTypeKind, AbstractC6971f.a.f63187f) ? EnumC6968c.f63174b : AbstractC5504s.c(functionTypeKind, AbstractC6971f.d.f63190f) ? EnumC6968c.f63175c : AbstractC5504s.c(functionTypeKind, AbstractC6971f.b.f63188f) ? EnumC6968c.f63176d : AbstractC5504s.c(functionTypeKind, AbstractC6971f.c.f63189f) ? EnumC6968c.f63177e : EnumC6968c.f63178f;
        }

        private a() {
        }
    }

    static {
        EnumC6968c[] enumC6968cArrA = a();
        f63179g = enumC6968cArrA;
        f63180h = AbstractC3048a.a(enumC6968cArrA);
        f63173a = new a(null);
    }

    private EnumC6968c(String str, int i10) {
    }

    private static final /* synthetic */ EnumC6968c[] a() {
        return new EnumC6968c[]{f63174b, f63175c, f63176d, f63177e, f63178f};
    }

    public static EnumC6968c valueOf(String str) {
        return (EnumC6968c) Enum.valueOf(EnumC6968c.class, str);
    }

    public static EnumC6968c[] values() {
        return (EnumC6968c[]) f63179g.clone();
    }
}
