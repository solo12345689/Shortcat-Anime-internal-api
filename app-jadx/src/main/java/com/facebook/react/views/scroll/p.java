package com.facebook.react.views.scroll;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f38150b = new p("BEGIN_DRAG", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f38151c = new p("END_DRAG", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f38152d = new p("SCROLL", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f38153e = new p("MOMENTUM_BEGIN", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f38154f = new p("MOMENTUM_END", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ p[] f38155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38156h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.views.scroll.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0630a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38157a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.f38150b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.f38151c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.f38152d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[p.f38153e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[p.f38154f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f38157a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(p type) {
            AbstractC5504s.h(type, "type");
            int i10 = C0630a.f38157a[type.ordinal()];
            if (i10 == 1) {
                return "topScrollBeginDrag";
            }
            if (i10 == 2) {
                return "topScrollEndDrag";
            }
            if (i10 == 3) {
                return "topScroll";
            }
            if (i10 == 4) {
                return "topMomentumScrollBegin";
            }
            if (i10 == 5) {
                return "topMomentumScrollEnd";
            }
            throw new Td.r();
        }

        private a() {
        }
    }

    static {
        p[] pVarArrA = a();
        f38155g = pVarArrA;
        f38156h = AbstractC3048a.a(pVarArrA);
        f38149a = new a(null);
    }

    private p(String str, int i10) {
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{f38150b, f38151c, f38152d, f38153e, f38154f};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f38155g.clone();
    }
}
