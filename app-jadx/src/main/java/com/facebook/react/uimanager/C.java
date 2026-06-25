package com.facebook.react.uimanager;

import be.AbstractC3048a;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f37388b = new C("NONE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f37389c = new C("BOX_NONE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f37390d = new C("BOX_ONLY", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f37391e = new C("AUTO", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ C[] f37392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37393g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(C pointerEvents) {
            AbstractC5504s.h(pointerEvents, "pointerEvents");
            return pointerEvents == C.f37391e || pointerEvents == C.f37390d;
        }

        public final boolean b(C pointerEvents) {
            AbstractC5504s.h(pointerEvents, "pointerEvents");
            return pointerEvents == C.f37391e || pointerEvents == C.f37389c;
        }

        public final C c(String str) {
            if (str == null) {
                return C.f37391e;
            }
            Locale US = Locale.US;
            AbstractC5504s.g(US, "US");
            String upperCase = str.toUpperCase(US);
            AbstractC5504s.g(upperCase, "toUpperCase(...)");
            return C.valueOf(Df.r.K(upperCase, "-", "_", false, 4, null));
        }

        private a() {
        }
    }

    static {
        C[] cArrA = a();
        f37392f = cArrA;
        f37393g = AbstractC3048a.a(cArrA);
        f37387a = new a(null);
    }

    private C(String str, int i10) {
    }

    private static final /* synthetic */ C[] a() {
        return new C[]{f37388b, f37389c, f37390d, f37391e};
    }

    public static final boolean b(C c10) {
        return f37387a.a(c10);
    }

    public static final boolean c(C c10) {
        return f37387a.b(c10);
    }

    public static final C h(String str) {
        return f37387a.c(str);
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f37392f.clone();
    }
}
