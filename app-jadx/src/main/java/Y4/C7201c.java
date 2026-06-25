package y4;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import tg.AbstractC6692q;
import tg.C6683h;
import tg.X;

/* JADX INFO: renamed from: y4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7201c extends AbstractC6692q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f64810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f64811c;

    public C7201c(X x10, Function1 function1) {
        super(x10);
        this.f64810b = function1;
    }

    @Override // tg.AbstractC6692q, tg.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f64811c = true;
            this.f64810b.invoke(e10);
        }
    }

    @Override // tg.AbstractC6692q, tg.X, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f64811c = true;
            this.f64810b.invoke(e10);
        }
    }

    @Override // tg.AbstractC6692q, tg.X
    public void t0(C6683h c6683h, long j10) throws EOFException {
        if (this.f64811c) {
            c6683h.skip(j10);
            return;
        }
        try {
            super.t0(c6683h, j10);
        } catch (IOException e10) {
            this.f64811c = true;
            this.f64810b.invoke(e10);
        }
    }
}
