package com.swmansion.rnscreens.utils;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0703a f44743c = new C0703a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f44744d = new a(new b(Integer.MIN_VALUE, false), 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f44745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f44746b;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0703a {
        public /* synthetic */ C0703a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f44744d;
        }

        private C0703a() {
        }
    }

    public a(b cacheKey, float f10) {
        AbstractC5504s.h(cacheKey, "cacheKey");
        this.f44745a = cacheKey;
        this.f44746b = f10;
    }

    public final float b() {
        return this.f44746b;
    }

    public final boolean c(b key) {
        AbstractC5504s.h(key, "key");
        return this.f44745a.a() != Integer.MIN_VALUE && AbstractC5504s.c(this.f44745a, key);
    }
}
