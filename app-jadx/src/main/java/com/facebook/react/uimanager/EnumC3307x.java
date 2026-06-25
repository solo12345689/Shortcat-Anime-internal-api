package com.facebook.react.uimanager;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.react.uimanager.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3307x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3307x f37848a = new EnumC3307x("PARENT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3307x f37849b = new EnumC3307x("LEAF", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3307x f37850c = new EnumC3307x("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC3307x[] f37851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37852e;

    static {
        EnumC3307x[] enumC3307xArrA = a();
        f37851d = enumC3307xArrA;
        f37852e = AbstractC3048a.a(enumC3307xArrA);
    }

    private EnumC3307x(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3307x[] a() {
        return new EnumC3307x[]{f37848a, f37849b, f37850c};
    }

    public static EnumC3307x valueOf(String str) {
        return (EnumC3307x) Enum.valueOf(EnumC3307x.class, str);
    }

    public static EnumC3307x[] values() {
        return (EnumC3307x[]) f37851d.clone();
    }
}
