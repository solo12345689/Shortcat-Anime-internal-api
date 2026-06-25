package com.github.penfeizhou.animation.glide;

import S4.h;
import U4.v;
import V4.d;
import b5.C3005g;
import g5.InterfaceC4854e;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class a implements InterfaceC4854e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f38785a;

    a(d dVar) {
        this.f38785a = dVar;
    }

    @Override // g5.InterfaceC4854e
    public v a(v vVar, h hVar) {
        try {
            return C3005g.c(((com.github.penfeizhou.animation.decode.b) vVar.get()).v(0), this.f38785a);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
