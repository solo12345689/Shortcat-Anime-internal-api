package pe;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pe.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6029s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f56013c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C6029s f56014d = new C6029s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC6030t f56015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6027q f56016b;

    /* JADX INFO: renamed from: pe.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6029s a(InterfaceC6027q type) {
            AbstractC5504s.h(type, "type");
            return new C6029s(EnumC6030t.f56019b, type);
        }

        public final C6029s b(InterfaceC6027q type) {
            AbstractC5504s.h(type, "type");
            return new C6029s(EnumC6030t.f56020c, type);
        }

        public final C6029s c() {
            return C6029s.f56014d;
        }

        public final C6029s d(InterfaceC6027q type) {
            AbstractC5504s.h(type, "type");
            return new C6029s(EnumC6030t.f56018a, type);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: pe.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56017a;

        static {
            int[] iArr = new int[EnumC6030t.values().length];
            try {
                iArr[EnumC6030t.f56018a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6030t.f56019b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6030t.f56020c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56017a = iArr;
        }
    }

    public C6029s(EnumC6030t enumC6030t, InterfaceC6027q interfaceC6027q) {
        String str;
        this.f56015a = enumC6030t;
        this.f56016b = interfaceC6027q;
        if ((enumC6030t == null) == (interfaceC6027q == null)) {
            return;
        }
        if (enumC6030t == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC6030t + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final EnumC6030t a() {
        return this.f56015a;
    }

    public final InterfaceC6027q b() {
        return this.f56016b;
    }

    public final InterfaceC6027q c() {
        return this.f56016b;
    }

    public final EnumC6030t d() {
        return this.f56015a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6029s)) {
            return false;
        }
        C6029s c6029s = (C6029s) obj;
        return this.f56015a == c6029s.f56015a && AbstractC5504s.c(this.f56016b, c6029s.f56016b);
    }

    public int hashCode() {
        EnumC6030t enumC6030t = this.f56015a;
        int iHashCode = (enumC6030t == null ? 0 : enumC6030t.hashCode()) * 31;
        InterfaceC6027q interfaceC6027q = this.f56016b;
        return iHashCode + (interfaceC6027q != null ? interfaceC6027q.hashCode() : 0);
    }

    public String toString() {
        EnumC6030t enumC6030t = this.f56015a;
        int i10 = enumC6030t == null ? -1 : b.f56017a[enumC6030t.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f56016b);
        }
        if (i10 == 2) {
            return "in " + this.f56016b;
        }
        if (i10 != 3) {
            throw new Td.r();
        }
        return "out " + this.f56016b;
    }
}
