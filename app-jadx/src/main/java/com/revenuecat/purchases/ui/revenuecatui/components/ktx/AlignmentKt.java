package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import g1.C4830j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\u0005\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u0005\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "Lg1/j;", "toTextAlign", "(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;)I", "Ll0/e$b;", "toAlignment", "(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;)Ll0/e$b;", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "Ll0/e$c;", "(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;)Ll0/e$c;", "Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;", "Ll0/e;", "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e;", "toVerticalAlignmentOrNull", "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$c;", "toHorizontalAlignmentOrNull", "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$b;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class AlignmentKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TwoDimensionalAlignment.values().length];
            try {
                iArr3[TwoDimensionalAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TwoDimensionalAlignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_LEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_TRAILING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_LEADING.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_TRAILING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final /* synthetic */ e.b toAlignment(HorizontalAlignment horizontalAlignment) {
        AbstractC5504s.h(horizontalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i10 == 1) {
            return e.f52304a.k();
        }
        if (i10 == 2) {
            return e.f52304a.g();
        }
        if (i10 == 3) {
            return e.f52304a.j();
        }
        throw new r();
    }

    public static final /* synthetic */ e.b toHorizontalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        AbstractC5504s.h(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return e.f52304a.g();
            case 2:
                return e.f52304a.k();
            case 3:
                return e.f52304a.j();
            case 4:
            case 5:
                return null;
            case 6:
                return e.f52304a.k();
            case 7:
                return e.f52304a.j();
            case 8:
                return e.f52304a.k();
            case 9:
                return e.f52304a.j();
            default:
                throw new r();
        }
    }

    public static final /* synthetic */ int toTextAlign(HorizontalAlignment horizontalAlignment) {
        AbstractC5504s.h(horizontalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i10 == 1) {
            return C4830j.f47278b.f();
        }
        if (i10 == 2) {
            return C4830j.f47278b.a();
        }
        if (i10 == 3) {
            return C4830j.f47278b.b();
        }
        throw new r();
    }

    public static final /* synthetic */ e.c toVerticalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        AbstractC5504s.h(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return e.f52304a.i();
            case 2:
            case 3:
                return null;
            case 4:
                return e.f52304a.l();
            case 5:
                return e.f52304a.a();
            case 6:
                return e.f52304a.l();
            case 7:
                return e.f52304a.l();
            case 8:
                return e.f52304a.a();
            case 9:
                return e.f52304a.a();
            default:
                throw new r();
        }
    }

    public static final /* synthetic */ e.c toAlignment(VerticalAlignment verticalAlignment) {
        AbstractC5504s.h(verticalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[verticalAlignment.ordinal()];
        if (i10 == 1) {
            return e.f52304a.l();
        }
        if (i10 == 2) {
            return e.f52304a.i();
        }
        if (i10 == 3) {
            return e.f52304a.a();
        }
        throw new r();
    }

    public static final /* synthetic */ e toAlignment(TwoDimensionalAlignment twoDimensionalAlignment) {
        AbstractC5504s.h(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return e.f52304a.e();
            case 2:
                return e.f52304a.h();
            case 3:
                return e.f52304a.f();
            case 4:
                return e.f52304a.m();
            case 5:
                return e.f52304a.b();
            case 6:
                return e.f52304a.o();
            case 7:
                return e.f52304a.n();
            case 8:
                return e.f52304a.d();
            case 9:
                return e.f52304a.c();
            default:
                throw new r();
        }
    }
}
