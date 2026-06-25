package com.facebook.react.views.text;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f38365b = new t("NONE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f38366c = new t("UPPERCASE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f38367d = new t("LOWERCASE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f38368e = new t("CAPITALIZE", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f38369f = new t("UNSET", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ t[] f38370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38371h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String text, t tVar) {
            AbstractC5504s.h(text, "text");
            return u.a(text, tVar);
        }

        private a() {
        }
    }

    static {
        t[] tVarArrA = a();
        f38370g = tVarArrA;
        f38371h = AbstractC3048a.a(tVarArrA);
        f38364a = new a(null);
    }

    private t(String str, int i10) {
    }

    private static final /* synthetic */ t[] a() {
        return new t[]{f38365b, f38366c, f38367d, f38368e, f38369f};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f38370g.clone();
    }
}
