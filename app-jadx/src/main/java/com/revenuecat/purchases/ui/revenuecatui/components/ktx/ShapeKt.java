package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import J.e;
import J.i;
import Td.L;
import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import i1.C5015h;
import i1.EnumC5027t;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6230l;
import s0.E1;
import s0.InterfaceC6374m1;
import s0.t1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Ls0/E1;", "toShape", "(Lcom/revenuecat/purchases/paywalls/components/properties/Shape;)Ls0/E1;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "(Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;)Ls0/E1;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "convertCornerRadiusesToShape", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)Ls0/E1;", "", "SCALE_Y_OFFSET_CONCAVE_CONVEX", "F", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ShapeKt {
    private static final float SCALE_Y_OFFSET_CONCAVE_CONVEX = 0.1f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt$toShape$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls0/m1;", "Lr0/l;", "size", "Li1/t;", "<anonymous parameter 1>", "LTd/L;", "invoke-12SF9DM", "(Ls0/m1;JLi1/t;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m431invoke12SF9DM((InterfaceC6374m1) obj, ((C6230l) obj2).m(), (EnumC5027t) obj3);
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
        public final void m431invoke12SF9DM(InterfaceC6374m1 $receiver, long j10, EnumC5027t enumC5027t) {
            AbstractC5504s.h($receiver, "$this$$receiver");
            AbstractC5504s.h(enumC5027t, "<anonymous parameter 1>");
            float fG = C6230l.g(j10) * ShapeKt.SCALE_Y_OFFSET_CONCAVE_CONVEX * 2.0f;
            $receiver.a(0.0f, 0.0f);
            $receiver.c(C6230l.i(j10), 0.0f);
            $receiver.c(C6230l.i(j10), C6230l.g(j10));
            $receiver.j(C6230l.i(j10) / 2, C6230l.g(j10) - fG, 0.0f, C6230l.g(j10));
            $receiver.c(0.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt$toShape$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls0/m1;", "Lr0/l;", "size", "Li1/t;", "<anonymous parameter 1>", "LTd/L;", "invoke-12SF9DM", "(Ls0/m1;JLi1/t;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5096o {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m432invoke12SF9DM((InterfaceC6374m1) obj, ((C6230l) obj2).m(), (EnumC5027t) obj3);
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
        public final void m432invoke12SF9DM(InterfaceC6374m1 $receiver, long j10, EnumC5027t enumC5027t) {
            AbstractC5504s.h($receiver, "$this$$receiver");
            AbstractC5504s.h(enumC5027t, "<anonymous parameter 1>");
            float fG = C6230l.g(j10) * ShapeKt.SCALE_Y_OFFSET_CONCAVE_CONVEX;
            $receiver.a(0.0f, 0.0f);
            $receiver.c(C6230l.i(j10), 0.0f);
            $receiver.c(C6230l.i(j10), C6230l.g(j10) - fG);
            $receiver.j(C6230l.i(j10) / 2, C6230l.g(j10) + fG, 0.0f, C6230l.g(j10) - fG);
            $receiver.c(0.0f, 0.0f);
        }
    }

    private static final E1 convertCornerRadiusesToShape(CornerRadiuses cornerRadiuses) {
        if (cornerRadiuses instanceof CornerRadiuses.Percentage) {
            CornerRadiuses.Percentage percentage = (CornerRadiuses.Percentage) cornerRadiuses;
            return i.b(percentage.getTopLeading(), percentage.getTopTrailing(), percentage.getBottomTrailing(), percentage.getBottomLeading());
        }
        if (!(cornerRadiuses instanceof CornerRadiuses.Dp)) {
            throw new r();
        }
        CornerRadiuses.Dp dp = (CornerRadiuses.Dp) cornerRadiuses;
        return i.e(C5015h.n((float) dp.getTopLeading()), C5015h.n((float) dp.getTopTrailing()), C5015h.n((float) dp.getBottomTrailing()), C5015h.n((float) dp.getBottomLeading()));
    }

    public static final /* synthetic */ E1 toShape(Shape shape) {
        AbstractC5504s.h(shape, "<this>");
        return convertCornerRadiusesToShape(shape.getCornerRadiuses());
    }

    public static final /* synthetic */ E1 toShape(MaskShape maskShape) {
        E1 e1ConvertCornerRadiusesToShape;
        AbstractC5504s.h(maskShape, "<this>");
        if (maskShape instanceof MaskShape.Rectangle) {
            CornerRadiuses corners = ((MaskShape.Rectangle) maskShape).getCorners();
            return (corners == null || (e1ConvertCornerRadiusesToShape = convertCornerRadiusesToShape(corners)) == null) ? t1.a() : e1ConvertCornerRadiusesToShape;
        }
        if (maskShape instanceof MaskShape.Concave) {
            return new e(AnonymousClass1.INSTANCE);
        }
        if (maskShape instanceof MaskShape.Convex) {
            return new e(AnonymousClass2.INSTANCE);
        }
        if (maskShape instanceof MaskShape.Circle) {
            return i.g();
        }
        throw new r();
    }
}
