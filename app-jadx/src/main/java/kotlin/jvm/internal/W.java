package kotlin.jvm.internal;

import pe.EnumC6030t;
import pe.InterfaceC6028r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class W implements InterfaceC6028r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f52265a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.W$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0817a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52266a;

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
                f52266a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InterfaceC6028r typeParameter) {
            AbstractC5504s.h(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0817a.f52266a[typeParameter.m().ordinal()];
            if (i10 == 1) {
                Td.L l10 = Td.L.f17438a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new Td.r();
                }
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }

        private a() {
        }
    }
}
