package androidx.compose.ui.layout;

import I0.InterfaceC1690p;
import androidx.compose.ui.layout.s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: renamed from: androidx.compose.ui.layout.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2674c extends y {

    /* JADX INFO: renamed from: b */
    public static final a f26917b = new a(null);

    /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0466a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C2674c[] f26918a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0466a(C2674c[] c2674cArr) {
                super(2);
                this.f26918a = c2674cArr;
            }

            public final Float a(s.a aVar, float f10) {
                return Float.valueOf(z.b(aVar, true, this.f26918a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((s.a) obj, ((Number) obj2).floatValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C2674c[] f26919a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C2674c[] c2674cArr) {
                super(2);
                this.f26919a = c2674cArr;
            }

            public final Float a(s.a aVar, float f10) {
                return Float.valueOf(z.b(aVar, false, this.f26919a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((s.a) obj, ((Number) obj2).floatValue());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2674c a(C2674c... c2674cArr) {
            return new C2674c(new C0466a(c2674cArr), null);
        }

        public final C2674c b(C2674c... c2674cArr) {
            return new C2674c(new b(c2674cArr), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C2674c(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @Override // androidx.compose.ui.layout.y
    public float a(float f10, InterfaceC1690p interfaceC1690p, InterfaceC1690p interfaceC1690p2) {
        return Float.intBitsToFloat((int) (interfaceC1690p2.y0(interfaceC1690p, C6224f.e((((long) Float.floatToRawIntBits(((int) (interfaceC1690p.a() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L))) & 4294967295L));
    }

    private C2674c(Function2 function2) {
        super(function2, null);
    }

    public C2674c() {
        this(null);
    }
}
