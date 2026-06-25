package a1;

import U0.W0;
import a1.C2551s;
import a1.C2557y;
import a1.C2558z;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: a1.Z
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                b0.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: a1.a0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                b0.f(runnable, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void h(EditorInfo editorInfo, C2552t c2552t, C2527U c2527u) {
        int iE = c2552t.e();
        C2551s.a aVar = C2551s.f23628b;
        int i10 = 6;
        if (C2551s.m(iE, aVar.a())) {
            if (!c2552t.h()) {
                i10 = 0;
            }
        } else if (C2551s.m(iE, aVar.e())) {
            i10 = 1;
        } else if (C2551s.m(iE, aVar.c())) {
            i10 = 2;
        } else if (C2551s.m(iE, aVar.d())) {
            i10 = 5;
        } else if (C2551s.m(iE, aVar.f())) {
            i10 = 7;
        } else if (C2551s.m(iE, aVar.g())) {
            i10 = 3;
        } else if (C2551s.m(iE, aVar.h())) {
            i10 = 4;
        } else if (!C2551s.m(iE, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        c2552t.g();
        int iF = c2552t.f();
        C2558z.a aVar2 = C2558z.f23658b;
        if (C2558z.n(iF, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (C2558z.n(iF, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C2558z.n(iF, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (C2558z.n(iF, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (C2558z.n(iF, aVar2.j())) {
            editorInfo.inputType = 17;
        } else if (C2558z.n(iF, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (C2558z.n(iF, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (C2558z.n(iF, aVar2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!C2558z.n(iF, aVar2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!c2552t.h() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (C2551s.m(c2552t.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int iC = c2552t.c();
            C2557y.a aVar3 = C2557y.f23651b;
            if (C2557y.i(iC, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (C2557y.i(iC, aVar3.e())) {
                editorInfo.inputType |= 8192;
            } else if (C2557y.i(iC, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (c2552t.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = W0.n(c2527u.k());
        editorInfo.initialSelEnd = W0.i(c2527u.k());
        M1.c.f(editorInfo, c2527u.l());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e.c().x(editorInfo);
        }
    }
}
