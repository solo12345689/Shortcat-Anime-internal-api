package com.facebook.react.common.mapbuffer;

import be.AbstractC3048a;
import je.InterfaceC5371a;
import kotlin.enums.EnumEntries;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface a extends Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final C0611a f36576V = C0611a.f36577a;

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0611a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0611a f36577a = new C0611a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C5870f f36578b = new C5870f(0, 65535);

        private C0611a() {
        }

        public final C5870f a() {
            return f36578b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f36579a = new b("BOOL", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f36580b = new b("INT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f36581c = new b("DOUBLE", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f36582d = new b("STRING", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f36583e = new b("MAP", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f36584f = new b("LONG", 5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ b[] f36585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f36586h;

        static {
            b[] bVarArrA = a();
            f36585g = bVarArrA;
            f36586h = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f36579a, f36580b, f36581c, f36582d, f36583e, f36584f};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f36585g.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        long a();

        int b();

        double c();

        String d();

        a e();

        boolean f();

        int getKey();

        b getType();
    }

    a F0(int i10);

    boolean H(int i10);

    boolean getBoolean(int i10);

    int getCount();

    double getDouble(int i10);

    int getInt(int i10);

    String getString(int i10);
}
