package s0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6229k;
import r0.C6226h;
import r0.C6228j;

/* JADX INFO: renamed from: s0.i1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6362i1 {

    /* JADX INFO: renamed from: s0.i1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC6362i1 {

        /* JADX INFO: renamed from: a */
        private final InterfaceC6374m1 f58954a;

        public a(InterfaceC6374m1 interfaceC6374m1) {
            super(null);
            this.f58954a = interfaceC6374m1;
        }

        @Override // s0.AbstractC6362i1
        public C6226h a() {
            return this.f58954a.getBounds();
        }

        public final InterfaceC6374m1 b() {
            return this.f58954a;
        }
    }

    /* JADX INFO: renamed from: s0.i1$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC6362i1 {

        /* JADX INFO: renamed from: a */
        private final C6226h f58955a;

        public b(C6226h c6226h) {
            super(null);
            this.f58955a = c6226h;
        }

        @Override // s0.AbstractC6362i1
        public C6226h a() {
            return this.f58955a;
        }

        public final C6226h b() {
            return this.f58955a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC5504s.c(this.f58955a, ((b) obj).f58955a);
        }

        public int hashCode() {
            return this.f58955a.hashCode();
        }
    }

    /* JADX INFO: renamed from: s0.i1$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC6362i1 {

        /* JADX INFO: renamed from: a */
        private final C6228j f58956a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC6374m1 f58957b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6228j c6228j) {
            super(null);
            InterfaceC6374m1 interfaceC6374m1 = null;
            this.f58956a = c6228j;
            if (!AbstractC6229k.e(c6228j)) {
                InterfaceC6374m1 interfaceC6374m1A = V.a();
                InterfaceC6374m1.s(interfaceC6374m1A, c6228j, null, 2, null);
                interfaceC6374m1 = interfaceC6374m1A;
            }
            this.f58957b = interfaceC6374m1;
        }

        @Override // s0.AbstractC6362i1
        public C6226h a() {
            return AbstractC6229k.d(this.f58956a);
        }

        public final C6228j b() {
            return this.f58956a;
        }

        public final InterfaceC6374m1 c() {
            return this.f58957b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC5504s.c(this.f58956a, ((c) obj).f58956a);
        }

        public int hashCode() {
            return this.f58956a.hashCode();
        }
    }

    public /* synthetic */ AbstractC6362i1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C6226h a();

    private AbstractC6362i1() {
    }
}
