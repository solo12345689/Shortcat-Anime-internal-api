package com.facebook.react.uimanager;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.react.uimanager.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3304u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3304u f37832a = new EnumC3304u("POINT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3304u f37833b = new EnumC3304u("PERCENT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC3304u[] f37834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37835d;

    static {
        EnumC3304u[] enumC3304uArrA = a();
        f37834c = enumC3304uArrA;
        f37835d = AbstractC3048a.a(enumC3304uArrA);
    }

    private EnumC3304u(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3304u[] a() {
        return new EnumC3304u[]{f37832a, f37833b};
    }

    public static EnumC3304u valueOf(String str) {
        return (EnumC3304u) Enum.valueOf(EnumC3304u.class, str);
    }

    public static EnumC3304u[] values() {
        return (EnumC3304u[]) f37834c.clone();
    }
}
