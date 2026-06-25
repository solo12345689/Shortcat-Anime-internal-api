package io.sentry;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: io.sentry.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5319z0 implements InterfaceC5223k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.c f51563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5314y0 f51564b;

    public C5319z0(Writer writer, int i10) {
        this.f51563a = new io.sentry.vendor.gson.stream.c(writer);
        this.f51564b = new C5314y0(i10);
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C5319z0 d(boolean z10) throws IOException {
        this.f51563a.B0(z10);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    public void F(boolean z10) {
        this.f51563a.F(z10);
    }

    @Override // io.sentry.InterfaceC5223k1
    public String b() {
        return this.f51563a.m();
    }

    @Override // io.sentry.InterfaceC5223k1
    public InterfaceC5223k1 g(String str) throws IOException {
        this.f51563a.o(str);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    public void h(String str) {
        this.f51563a.J(str);
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5319z0 B() throws IOException {
        this.f51563a.g();
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5319z0 x() throws IOException {
        this.f51563a.h();
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C5319z0 y() {
        this.f51563a.k();
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5319z0 I() {
        this.f51563a.l();
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C5319z0 e(String str) {
        this.f51563a.q(str);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C5319z0 l() throws IOException {
        this.f51563a.z();
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C5319z0 c(double d10) throws IOException {
        this.f51563a.S(d10);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C5319z0 a(long j10) throws IOException {
        this.f51563a.Y(j10);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C5319z0 j(ILogger iLogger, Object obj) {
        this.f51564b.a(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C5319z0 k(Boolean bool) throws IOException {
        this.f51563a.h0(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C5319z0 i(Number number) throws IOException {
        this.f51563a.k0(number);
        return this;
    }

    @Override // io.sentry.InterfaceC5223k1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C5319z0 f(String str) throws IOException {
        this.f51563a.p0(str);
        return this;
    }
}
