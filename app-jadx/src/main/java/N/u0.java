package N;

import K.C1774y;
import U0.W0;
import Ud.AbstractC2279u;
import a1.AbstractC2528V;
import a1.C2522O;
import a1.C2523P;
import a1.C2524Q;
import a1.C2527U;
import a1.C2533a;
import a1.C2539g;
import a1.C2540h;
import a1.C2547o;
import a1.C2551s;
import a1.InterfaceC2541i;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.A1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1774y f12558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q.F f12559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A1 f12560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2527U f12562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f12565j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12566k = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        public final void a(InterfaceC2541i interfaceC2541i) {
            u0.this.c(interfaceC2541i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2541i) obj);
            return Td.L.f17438a;
        }
    }

    public u0(C2527U c2527u, k0 k0Var, boolean z10, C1774y c1774y, Q.F f10, A1 a12) {
        this.f12556a = k0Var;
        this.f12557b = z10;
        this.f12558c = c1774y;
        this.f12559d = f10;
        this.f12560e = a12;
        this.f12562g = c2527u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC2541i interfaceC2541i) {
        d();
        try {
            this.f12565j.add(interfaceC2541i);
        } finally {
            e();
        }
    }

    private final boolean d() {
        this.f12561f++;
        return true;
    }

    private final boolean e() {
        int i10 = this.f12561f - 1;
        this.f12561f = i10;
        if (i10 == 0 && !this.f12565j.isEmpty()) {
            this.f12556a.d(AbstractC2279u.d1(this.f12565j));
            this.f12565j.clear();
        }
        return this.f12561f > 0;
    }

    private final void f(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f12566k;
        return z10 ? d() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f12566k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f12565j.clear();
        this.f12561f = 0;
        this.f12566k = false;
        this.f12556a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f12566k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f12566k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f12566k;
        return z10 ? this.f12557b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f12566k;
        if (z10) {
            c(new C2533a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f12566k;
        if (!z10) {
            return z10;
        }
        c(new C2539g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f12566k;
        if (!z10) {
            return z10;
        }
        c(new C2540h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return e();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f12566k;
        if (!z10) {
            return z10;
        }
        c(new C2547o());
        return true;
    }

    public final void g(C2527U c2527u) {
        this.f12562g = c2527u;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f12562g.l(), W0.l(this.f12562g.k()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f12564i = z10;
        if (z10) {
            this.f12563h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return v0.b(this.f12562g);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (W0.h(this.f12562g.k())) {
            return null;
        }
        return AbstractC2528V.a(this.f12562g).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC2528V.b(this.f12562g, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC2528V.c(this.f12562g, i10).toString();
    }

    public final void h(C2527U c2527u, l0 l0Var) {
        if (this.f12566k) {
            g(c2527u);
            if (this.f12564i) {
                l0Var.updateExtractedText(this.f12563h, v0.b(c2527u));
            }
            W0 w0J = c2527u.j();
            int iL = w0J != null ? W0.l(w0J.r()) : -1;
            W0 w0J2 = c2527u.j();
            l0Var.a(W0.l(c2527u.k()), W0.k(c2527u.k()), iL, w0J2 != null ? W0.k(w0J2.r()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f12566k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    c(new C2524Q(0, this.f12562g.l().length()));
                    break;
                case R.id.cut:
                    f(277);
                    break;
                case R.id.copy:
                    f(278);
                    break;
                case R.id.paste:
                    f(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f12566k;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = C2551s.f23628b.c();
                    break;
                case 3:
                    iA = C2551s.f23628b.g();
                    break;
                case 4:
                    iA = C2551s.f23628b.h();
                    break;
                case 5:
                    iA = C2551s.f23628b.d();
                    break;
                case 6:
                    iA = C2551s.f23628b.b();
                    break;
                case 7:
                    iA = C2551s.f23628b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iA = C2551s.f23628b.a();
                    break;
            }
        } else {
            iA = C2551s.f23628b.a();
        }
        this.f12556a.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C1938c.f12490a.b(this.f12558c, this.f12559d, handwritingGesture, this.f12560e, executor, intConsumer, new a());
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f12566k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1938c.f12490a.d(this.f12558c, this.f12559d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f12566k;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.f12556a.b(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f12566k;
        if (!z10) {
            return z10;
        }
        this.f12556a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f12566k;
        if (z10) {
            c(new C2522O(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f12566k;
        if (z10) {
            c(new C2523P(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f12566k;
        if (!z10) {
            return z10;
        }
        c(new C2524Q(i10, i11));
        return true;
    }
}
