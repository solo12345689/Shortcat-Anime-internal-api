package a1;

import U0.W0;
import Ud.AbstractC2279u;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a1.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC2521N implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2553u f23527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2527U f23530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f23533g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23534h = true;

    public InputConnectionC2521N(C2527U c2527u, InterfaceC2553u interfaceC2553u, boolean z10) {
        this.f23527a = interfaceC2553u;
        this.f23528b = z10;
        this.f23530d = c2527u;
    }

    private final void b(InterfaceC2541i interfaceC2541i) {
        c();
        try {
            this.f23533g.add(interfaceC2541i);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.f23529c++;
        return true;
    }

    private final boolean d() {
        int i10 = this.f23529c - 1;
        this.f23529c = i10;
        if (i10 == 0 && !this.f23533g.isEmpty()) {
            this.f23527a.d(AbstractC2279u.d1(this.f23533g));
            this.f23533g.clear();
        }
        return this.f23529c > 0;
    }

    private final void e(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f23534h;
        return z10 ? c() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f23534h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f23533g.clear();
        this.f23529c = 0;
        this.f23534h = false;
        this.f23527a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f23534h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f23534h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f23534h;
        return z10 ? this.f23528b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f23534h;
        if (z10) {
            b(new C2533a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f23534h;
        if (!z10) {
            return z10;
        }
        b(new C2539g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f23534h;
        if (!z10) {
            return z10;
        }
        b(new C2540h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    public final void f(C2527U c2527u) {
        this.f23530d = c2527u;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f23534h;
        if (!z10) {
            return z10;
        }
        b(new C2547o());
        return true;
    }

    public final void g(C2527U c2527u, InterfaceC2554v interfaceC2554v) {
        if (this.f23534h) {
            f(c2527u);
            if (this.f23532f) {
                interfaceC2554v.updateExtractedText(this.f23531e, AbstractC2556x.a(c2527u));
            }
            W0 w0J = c2527u.j();
            int iL = w0J != null ? W0.l(w0J.r()) : -1;
            W0 w0J2 = c2527u.j();
            interfaceC2554v.a(W0.l(c2527u.k()), W0.k(c2527u.k()), iL, w0J2 != null ? W0.k(w0J2.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f23530d.l(), W0.l(this.f23530d.k()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f23532f = z10;
        if (z10) {
            this.f23531e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC2556x.a(this.f23530d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (W0.h(this.f23530d.k())) {
            return null;
        }
        return AbstractC2528V.a(this.f23530d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC2528V.b(this.f23530d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC2528V.c(this.f23530d, i10).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f23534h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new C2524Q(0, this.f23530d.l().length()));
                    break;
                case R.id.cut:
                    e(277);
                    break;
                case R.id.copy:
                    e(278);
                    break;
                case R.id.paste:
                    e(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f23534h;
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
        this.f23527a.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f23534h;
        if (z10) {
            return true;
        }
        return z10;
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
        boolean z14 = this.f23534h;
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
        this.f23527a.b(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f23534h;
        if (!z10) {
            return z10;
        }
        this.f23527a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f23534h;
        if (z10) {
            b(new C2522O(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f23534h;
        if (z10) {
            b(new C2523P(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f23534h;
        if (!z10) {
            return z10;
        }
        b(new C2524Q(i10, i11));
        return true;
    }
}
