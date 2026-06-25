package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends g implements p {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f43166a;

        protected a(p pVar) {
            this.f43166a = (p) O9.n.j(pVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.g
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final p b() {
            return this.f43166a;
        }
    }

    protected h() {
    }

    /* JADX INFO: renamed from: h */
    protected abstract p a();

    @Override // com.google.common.util.concurrent.p
    public void k(Runnable runnable, Executor executor) {
        a().k(runnable, executor);
    }
}
