package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Td.AbstractC2163n;
import Td.InterfaceC2154e;
import Td.q;
import Tf.e;
import Uf.d;
import Vf.C2321c0;
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "", "cornerRadiuses", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "getCornerRadiuses", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "Companion", "Pill", "Rectangle", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Pill;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Shape {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "serializer", "()LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "pillCornerRadiuses", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CornerRadiuses.Percentage pillCornerRadiuses = new CornerRadiuses.Percentage(50);

        private Companion() {
        }

        public final b serializer() {
            return ShapeDeserializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static CornerRadiuses getCornerRadiuses(Shape shape) {
            return Shape.super.getCornerRadiuses();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Pill;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pill implements Shape {
        public static final Pill INSTANCE = new Pill();
        private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.Shape$Pill$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final b invoke() {
                return new C2321c0("com.revenuecat.purchases.paywalls.components.properties.Shape.Pill", Pill.INSTANCE, new Annotation[0]);
            }
        }

        private Pill() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) $cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "corners", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "getCorners", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Rectangle implements Shape {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CornerRadiuses corners;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return Shape$Rectangle$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Rectangle() {
            this((CornerRadiuses) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Rectangle self, d output, e serialDesc) {
            if (!output.g(serialDesc, 0) && self.corners == null) {
                return;
            }
            output.f(serialDesc, 0, CornerRadiusesSerializer.INSTANCE, self.corners);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && AbstractC5504s.c(this.corners, ((Rectangle) obj).corners);
        }

        public final /* synthetic */ CornerRadiuses getCorners() {
            return this.corners;
        }

        public int hashCode() {
            CornerRadiuses cornerRadiuses = this.corners;
            if (cornerRadiuses == null) {
                return 0;
            }
            return cornerRadiuses.hashCode();
        }

        public String toString() {
            return "Rectangle(corners=" + this.corners + ')';
        }

        @InterfaceC2154e
        public /* synthetic */ Rectangle(int i10, CornerRadiuses cornerRadiuses, t0 t0Var) {
            if ((i10 & 1) == 0) {
                this.corners = null;
            } else {
                this.corners = cornerRadiuses;
            }
        }

        public Rectangle(CornerRadiuses cornerRadiuses) {
            this.corners = cornerRadiuses;
        }

        public /* synthetic */ Rectangle(CornerRadiuses cornerRadiuses, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cornerRadiuses);
        }
    }

    default CornerRadiuses getCornerRadiuses() {
        if (!(this instanceof Rectangle)) {
            return Companion.pillCornerRadiuses;
        }
        CornerRadiuses corners = ((Rectangle) this).getCorners();
        return corners == null ? CornerRadiuses.Dp.INSTANCE.getZero() : corners;
    }
}
