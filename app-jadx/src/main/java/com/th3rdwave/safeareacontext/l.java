package com.th3rdwave.safeareacontext;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f44868a = new l("OFF", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f44869b = new l("ADDITIVE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f44870c = new l("MAXIMUM", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ l[] f44871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f44872e;

    static {
        l[] lVarArrA = a();
        f44871d = lVarArrA;
        f44872e = AbstractC3048a.a(lVarArrA);
    }

    private l(String str, int i10) {
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f44868a, f44869b, f44870c};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f44871d.clone();
    }
}
