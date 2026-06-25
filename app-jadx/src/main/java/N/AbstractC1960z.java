package N;

import U0.W0;
import a1.C2551s;
import a1.C2552t;
import a1.C2557y;
import a1.C2558z;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: N.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1960z {
    private static final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void b(EditorInfo editorInfo, CharSequence charSequence, long j10, C2552t c2552t, String[] strArr) {
        int iE = c2552t.e();
        C2551s.a aVar = C2551s.f23628b;
        int i10 = 3;
        int i11 = 6;
        if (C2551s.m(iE, aVar.a())) {
            if (!c2552t.h()) {
                i11 = 0;
            }
        } else if (C2551s.m(iE, aVar.e())) {
            i11 = 1;
        } else if (C2551s.m(iE, aVar.c())) {
            i11 = 2;
        } else if (C2551s.m(iE, aVar.d())) {
            i11 = 5;
        } else if (C2551s.m(iE, aVar.f())) {
            i11 = 7;
        } else if (C2551s.m(iE, aVar.g())) {
            i11 = 3;
        } else if (C2551s.m(iE, aVar.h())) {
            i11 = 4;
        } else if (!C2551s.m(iE, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i11;
        c2552t.g();
        t0.f12555a.a(editorInfo, c2552t.d());
        int iF = c2552t.f();
        C2558z.a aVar2 = C2558z.f23658b;
        if (C2558z.n(iF, aVar2.h())) {
            i10 = 1;
        } else if (C2558z.n(iF, aVar2.a())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (C2558z.n(iF, aVar2.d())) {
            i10 = 2;
        } else if (!C2558z.n(iF, aVar2.g())) {
            if (C2558z.n(iF, aVar2.j())) {
                i10 = 17;
            } else if (C2558z.n(iF, aVar2.c())) {
                i10 = 33;
            } else if (C2558z.n(iF, aVar2.f())) {
                i10 = 129;
            } else if (C2558z.n(iF, aVar2.e())) {
                i10 = 18;
            } else {
                if (!C2558z.n(iF, aVar2.b())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i10 = 8194;
            }
        }
        editorInfo.inputType = i10;
        if (!c2552t.h() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (C2551s.m(c2552t.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
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
        editorInfo.initialSelStart = W0.n(j10);
        editorInfo.initialSelEnd = W0.i(j10);
        M1.c.f(editorInfo, charSequence);
        if (strArr != null) {
            M1.c.d(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!L.c.a() || C2558z.n(c2552t.f(), aVar2.f()) || C2558z.n(c2552t.f(), aVar2.e())) {
            M1.c.g(editorInfo, false);
        } else {
            M1.c.g(editorInfo, true);
            C1959y.f12569a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j10, C2552t c2552t, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j10, c2552t, strArr);
    }
}
