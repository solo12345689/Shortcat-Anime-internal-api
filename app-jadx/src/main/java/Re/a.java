package Re;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import Ue.c;
import be.AbstractC3048a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0265a f15467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f15468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f15469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f15470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f15471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f15473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f15475i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Re.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class EnumC0265a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0266a f15476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Map f15477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0265a f15478d = new EnumC0265a("UNKNOWN", 0, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC0265a f15479e = new EnumC0265a("CLASS", 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final EnumC0265a f15480f = new EnumC0265a("FILE_FACADE", 2, 2);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0265a f15481g = new EnumC0265a("SYNTHETIC_CLASS", 3, 3);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumC0265a f15482h = new EnumC0265a("MULTIFILE_CLASS", 4, 4);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final EnumC0265a f15483i = new EnumC0265a("MULTIFILE_CLASS_PART", 5, 5);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumC0265a[] f15484j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f15485k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15486a;

        /* JADX INFO: renamed from: Re.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0266a {
            public /* synthetic */ C0266a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0265a a(int i10) {
                EnumC0265a enumC0265a = (EnumC0265a) EnumC0265a.f15477c.get(Integer.valueOf(i10));
                return enumC0265a == null ? EnumC0265a.f15478d : enumC0265a;
            }

            private C0266a() {
            }
        }

        static {
            EnumC0265a[] enumC0265aArrA = a();
            f15484j = enumC0265aArrA;
            f15485k = AbstractC3048a.a(enumC0265aArrA);
            f15476b = new C0266a(null);
            EnumC0265a[] enumC0265aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(enumC0265aArrValues.length), 16));
            for (EnumC0265a enumC0265a : enumC0265aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0265a.f15486a), enumC0265a);
            }
            f15477c = linkedHashMap;
        }

        private EnumC0265a(String str, int i10, int i11) {
            this.f15486a = i11;
        }

        private static final /* synthetic */ EnumC0265a[] a() {
            return new EnumC0265a[]{f15478d, f15479e, f15480f, f15481g, f15482h, f15483i};
        }

        public static final EnumC0265a c(int i10) {
            return f15476b.a(i10);
        }

        public static EnumC0265a valueOf(String str) {
            return (EnumC0265a) Enum.valueOf(EnumC0265a.class, str);
        }

        public static EnumC0265a[] values() {
            return (EnumC0265a[]) f15484j.clone();
        }
    }

    public a(EnumC0265a kind, c metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        this.f15467a = kind;
        this.f15468b = metadataVersion;
        this.f15469c = strArr;
        this.f15470d = strArr2;
        this.f15471e = strArr3;
        this.f15472f = str;
        this.f15473g = i10;
        this.f15474h = str2;
        this.f15475i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f15469c;
    }

    public final String[] b() {
        return this.f15470d;
    }

    public final EnumC0265a c() {
        return this.f15467a;
    }

    public final c d() {
        return this.f15468b;
    }

    public final String e() {
        String str = this.f15472f;
        if (this.f15467a == EnumC0265a.f15483i) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f15469c;
        if (this.f15467a != EnumC0265a.f15482h) {
            strArr = null;
        }
        List listE = strArr != null ? AbstractC2273n.e(strArr) : null;
        return listE == null ? AbstractC2279u.m() : listE;
    }

    public final String[] g() {
        return this.f15471e;
    }

    public final boolean i() {
        return h(this.f15473g, 2);
    }

    public final boolean j() {
        return h(this.f15473g, 16) && !h(this.f15473g, 32);
    }

    public String toString() {
        return this.f15467a + " version=" + this.f15468b;
    }
}
