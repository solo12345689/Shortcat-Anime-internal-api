package me;

import java.util.Random;

/* JADX INFO: renamed from: me.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5664a extends AbstractC5666c {
    @Override // me.AbstractC5666c
    public int b(int i10) {
        return AbstractC5667d.e(g().nextInt(), i10);
    }

    @Override // me.AbstractC5666c
    public int c() {
        return g().nextInt();
    }

    @Override // me.AbstractC5666c
    public int d(int i10) {
        return g().nextInt(i10);
    }

    @Override // me.AbstractC5666c
    public long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
