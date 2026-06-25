package androidx.compose.ui.layout;

import I0.InterfaceC1690p;
import androidx.compose.ui.layout.s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E extends y {

    /* JADX INFO: renamed from: b */
    public static final a f26881b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.E$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0465a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ E[] f26882a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0465a(E[] eArr) {
                super(2);
                this.f26882a = eArr;
            }

            public final Float a(s.a aVar, float f10) {
                return Float.valueOf(z.b(aVar, true, this.f26882a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((s.a) obj, ((Number) obj2).floatValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ E[] f26883a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(E[] eArr) {
                super(2);
                this.f26883a = eArr;
            }

            public final Float a(s.a aVar, float f10) {
                return Float.valueOf(z.b(aVar, false, this.f26883a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((s.a) obj, ((Number) obj2).floatValue());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Function2 function2) {
            return new E(function2, null);
        }

        public final E b(E... eArr) {
            return a(new C0465a(eArr));
        }

        public final E c(E... eArr) {
            return a(new b(eArr));
        }

        private a() {
        }
    }

    public /* synthetic */ E(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @Override // androidx.compose.ui.layout.y
    public float a(float f10, InterfaceC1690p interfaceC1690p, InterfaceC1690p interfaceC1690p2) {
        return Float.intBitsToFloat((int) (interfaceC1690p2.y0(interfaceC1690p, C6224f.e((((long) Float.floatToRawIntBits(((int) (interfaceC1690p.a() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32))) >> 32));
    }

    private E(Function2 function2) {
        super(function2, null);
    }

    public E() {
        this(null);
    }
}
