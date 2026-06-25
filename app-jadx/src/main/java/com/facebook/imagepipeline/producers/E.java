package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class E implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f36036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f36037b;

    public E(h0 h0Var, g0 g0Var) {
        this.f36036a = h0Var;
        this.f36037b = g0Var;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void b(e0 context, String str, boolean z10) {
        AbstractC5504s.h(context, "context");
        h0 h0Var = this.f36036a;
        if (h0Var != null) {
            h0Var.h(context.getId(), str, z10);
        }
        g0 g0Var = this.f36037b;
        if (g0Var != null) {
            g0Var.b(context, str, z10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 context, String str, Map map) {
        AbstractC5504s.h(context, "context");
        h0 h0Var = this.f36036a;
        if (h0Var != null) {
            h0Var.g(context.getId(), str, map);
        }
        g0 g0Var = this.f36037b;
        if (g0Var != null) {
            g0Var.c(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 context, String str) {
        AbstractC5504s.h(context, "context");
        h0 h0Var = this.f36036a;
        if (h0Var != null) {
            h0Var.a(context.getId(), str);
        }
        g0 g0Var = this.f36037b;
        if (g0Var != null) {
            g0Var.d(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean f(e0 context, String str) {
        AbstractC5504s.h(context, "context");
        h0 h0Var = this.f36036a;
        Boolean boolValueOf = h0Var != null ? Boolean.valueOf(h0Var.c(context.getId())) : null;
        if (!AbstractC5504s.c(boolValueOf, Boolean.TRUE)) {
            g0 g0Var = this.f36037b;
            boolValueOf = g0Var != null ? Boolean.valueOf(g0Var.f(context, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void h(e0 context, String str, String str2) {
        AbstractC5504s.h(context, "context");
        h0 h0Var = this.f36036a;
        if (h0Var != null) {
            h0Var.j(context.getId(), str, str2);
        }
        g0 g0Var = this.f36037b;
        if (g0Var != null) {
            g0Var.h(context, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 context, String str, Map map) {
        AbstractC5504s.h(context, "context");
        h0 h0Var = this.f36036a;
        if (h0Var != null) {
            h0Var.d(context.getId(), str, map);
        }
        g0 g0Var = this.f36037b;
        if (g0Var != null) {
            g0Var.j(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 context, String str, Throwable th2, Map map) {
        AbstractC5504s.h(context, "context");
        h0 h0Var = this.f36036a;
        if (h0Var != null) {
            h0Var.f(context.getId(), str, th2, map);
        }
        g0 g0Var = this.f36037b;
        if (g0Var != null) {
            g0Var.k(context, str, th2, map);
        }
    }
}
