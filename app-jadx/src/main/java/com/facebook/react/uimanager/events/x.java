package com.facebook.react.uimanager.events;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f37680c = new x("START", 0, "topTouchStart");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f37681d = new x("END", 1, "topTouchEnd");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f37682e = new x("MOVE", 2, "topTouchMove");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f37683f = new x("CANCEL", 3, "topTouchCancel");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ x[] f37684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37685h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37686a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(x type) {
            AbstractC5504s.h(type, "type");
            return type.b();
        }

        private a() {
        }
    }

    static {
        x[] xVarArrA = a();
        f37684g = xVarArrA;
        f37685h = AbstractC3048a.a(xVarArrA);
        f37679b = new a(null);
    }

    private x(String str, int i10, String str2) {
        this.f37686a = str2;
    }

    private static final /* synthetic */ x[] a() {
        return new x[]{f37680c, f37681d, f37682e, f37683f};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f37684g.clone();
    }

    public final String b() {
        return this.f37686a;
    }
}
