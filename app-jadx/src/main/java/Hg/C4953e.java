package hg;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6692q;
import tg.C6683h;
import tg.X;

/* JADX INFO: renamed from: hg.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C4953e extends AbstractC6692q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f47935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4953e(X delegate, Function1 onException) {
        super(delegate);
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(onException, "onException");
        this.f47935b = onException;
    }

    @Override // tg.AbstractC6692q, tg.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f47936c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f47936c = true;
            this.f47935b.invoke(e10);
        }
    }

    @Override // tg.AbstractC6692q, tg.X, java.io.Flushable
    public void flush() {
        if (this.f47936c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f47936c = true;
            this.f47935b.invoke(e10);
        }
    }

    @Override // tg.AbstractC6692q, tg.X
    public void t0(C6683h source, long j10) throws EOFException {
        AbstractC5504s.h(source, "source");
        if (this.f47936c) {
            source.skip(j10);
            return;
        }
        try {
            super.t0(source, j10);
        } catch (IOException e10) {
            this.f47936c = true;
            this.f47935b.invoke(e10);
        }
    }
}
