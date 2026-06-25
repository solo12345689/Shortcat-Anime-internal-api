package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3190j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36198d;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f36200d;

        a(InterfaceC3194n interfaceC3194n, int i10, int i11) {
            super(interfaceC3194n);
            this.f36199c = i10;
            this.f36200d = i11;
        }

        private void q(C5.a aVar) {
            E6.e eVar;
            Bitmap bitmapG1;
            int rowBytes;
            if (aVar == null || !aVar.E() || (eVar = (E6.e) aVar.C()) == null || eVar.isClosed() || !(eVar instanceof E6.f) || (bitmapG1 = ((E6.f) eVar).G1()) == null || (rowBytes = bitmapG1.getRowBytes() * bitmapG1.getHeight()) < this.f36199c || rowBytes > this.f36200d) {
                return;
            }
            bitmapG1.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void i(C5.a aVar, int i10) {
            q(aVar);
            p().c(aVar, i10);
        }
    }

    public C3190j(d0 d0Var, int i10, int i11, boolean z10) {
        y5.k.b(Boolean.valueOf(i10 <= i11));
        this.f36195a = (d0) y5.k.g(d0Var);
        this.f36196b = i10;
        this.f36197c = i11;
        this.f36198d = z10;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        if (!e0Var.z() || this.f36198d) {
            this.f36195a.a(new a(interfaceC3194n, this.f36196b, this.f36197c), e0Var);
        } else {
            this.f36195a.a(interfaceC3194n, e0Var);
        }
    }
}
