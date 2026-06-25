package com.swmansion.rnscreens.safearea;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44713a = new b("ALL", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f44714b = new b("SYSTEM", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f44715c = new b("INTERFACE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f44716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f44717e;

    static {
        b[] bVarArrA = a();
        f44716d = bVarArrA;
        f44717e = AbstractC3048a.a(bVarArrA);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f44713a, f44714b, f44715c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f44716d.clone();
    }

    public final boolean b() {
        return this == f44713a || this == f44715c;
    }

    public final boolean c() {
        return this == f44713a || this == f44714b;
    }
}
