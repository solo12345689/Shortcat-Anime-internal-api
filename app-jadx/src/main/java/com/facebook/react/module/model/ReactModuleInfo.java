package com.facebook.react.module.model;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReactModuleInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f36934g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f36939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36940f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Class clazz) {
            AbstractC5504s.h(clazz, "clazz");
            return TurboModule.class.isAssignableFrom(clazz);
        }

        private a() {
        }
    }

    public ReactModuleInfo(String name, String className, boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(className, "className");
        this.f36935a = name;
        this.f36936b = className;
        this.f36937c = z10;
        this.f36938d = z11;
        this.f36939e = z12;
        this.f36940f = z13;
    }

    public final boolean a() {
        return this.f36937c;
    }

    public final String b() {
        return this.f36936b;
    }

    public final boolean c() {
        return this.f36939e;
    }

    public final boolean d() {
        return this.f36940f;
    }

    public final String e() {
        return this.f36935a;
    }

    public final boolean f() {
        return this.f36938d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactModuleInfo(String name, String className, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(name, className, z10, z11, z13, z14);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(className, "className");
    }
}
