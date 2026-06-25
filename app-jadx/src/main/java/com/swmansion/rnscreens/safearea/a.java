package com.swmansion.rnscreens.safearea;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0702a f44707e = new C0702a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f44708f = new a(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f44709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f44710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f44711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f44712d;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.safearea.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0702a {
        public /* synthetic */ C0702a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(A1.b insets) {
            AbstractC5504s.h(insets, "insets");
            return new a(insets.f104a, insets.f105b, insets.f106c, insets.f107d);
        }

        public final a b() {
            return a.f44708f;
        }

        public final a c(a i12, a i22) {
            AbstractC5504s.h(i12, "i1");
            AbstractC5504s.h(i22, "i2");
            return new a(Math.max(i12.c(), i22.c()), Math.max(i12.e(), i22.e()), Math.max(i12.d(), i22.d()), Math.max(i12.b(), i22.b()));
        }

        private C0702a() {
        }
    }

    public a(float f10, float f11, float f12, float f13) {
        this.f44709a = f10;
        this.f44710b = f11;
        this.f44711c = f12;
        this.f44712d = f13;
    }

    public final float b() {
        return this.f44712d;
    }

    public final float c() {
        return this.f44709a;
    }

    public final float d() {
        return this.f44711c;
    }

    public final float e() {
        return this.f44710b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f44709a, aVar.f44709a) == 0 && Float.compare(this.f44710b, aVar.f44710b) == 0 && Float.compare(this.f44711c, aVar.f44711c) == 0 && Float.compare(this.f44712d, aVar.f44712d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f44709a) * 31) + Float.hashCode(this.f44710b)) * 31) + Float.hashCode(this.f44711c)) * 31) + Float.hashCode(this.f44712d);
    }

    public String toString() {
        return "EdgeInsets(left=" + this.f44709a + ", top=" + this.f44710b + ", right=" + this.f44711c + ", bottom=" + this.f44712d + ")";
    }
}
