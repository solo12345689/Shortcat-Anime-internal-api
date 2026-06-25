package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 extends w5.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3194n f36235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f36236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f36237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36238e;

    public m0(InterfaceC3194n consumer, g0 producerListener, e0 producerContext, String producerName) {
        AbstractC5504s.h(consumer, "consumer");
        AbstractC5504s.h(producerListener, "producerListener");
        AbstractC5504s.h(producerContext, "producerContext");
        AbstractC5504s.h(producerName, "producerName");
        this.f36235b = consumer;
        this.f36236c = producerListener;
        this.f36237d = producerContext;
        this.f36238e = producerName;
        producerListener.d(producerContext, producerName);
    }

    @Override // w5.h
    protected void d() {
        g0 g0Var = this.f36236c;
        e0 e0Var = this.f36237d;
        String str = this.f36238e;
        g0Var.c(e0Var, str, g0Var.f(e0Var, str) ? g() : null);
        this.f36235b.b();
    }

    @Override // w5.h
    protected void e(Exception e10) {
        AbstractC5504s.h(e10, "e");
        g0 g0Var = this.f36236c;
        e0 e0Var = this.f36237d;
        String str = this.f36238e;
        g0Var.k(e0Var, str, e10, g0Var.f(e0Var, str) ? h(e10) : null);
        this.f36235b.a(e10);
    }

    @Override // w5.h
    protected void f(Object obj) {
        g0 g0Var = this.f36236c;
        e0 e0Var = this.f36237d;
        String str = this.f36238e;
        g0Var.j(e0Var, str, g0Var.f(e0Var, str) ? i(obj) : null);
        this.f36235b.c(obj, 1);
    }

    protected Map g() {
        return null;
    }

    protected Map h(Exception exc) {
        return null;
    }

    protected Map i(Object obj) {
        return null;
    }
}
