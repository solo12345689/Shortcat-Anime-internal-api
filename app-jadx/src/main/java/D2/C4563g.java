package d2;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: d2.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4563g implements TextWatcher {

    /* JADX INFO: renamed from: a */
    private final EditText f45003a;

    /* JADX INFO: renamed from: b */
    private final boolean f45004b;

    /* JADX INFO: renamed from: c */
    private e.f f45005c;

    /* JADX INFO: renamed from: d */
    private int f45006d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    private int f45007e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f45008f = true;

    /* JADX INFO: renamed from: d2.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends e.f implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Reference f45009a;

        a(EditText editText) {
            this.f45009a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            Handler handler;
            super.b();
            EditText editText = (EditText) this.f45009a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C4563g.b((EditText) this.f45009a.get(), 1);
        }
    }

    C4563g(EditText editText, boolean z10) {
        this.f45003a = editText;
        this.f45004b = z10;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.c().r(editableText);
            C4560d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f45008f) {
            return (this.f45004b || androidx.emoji2.text.e.k()) ? false : true;
        }
        return true;
    }

    e.f a() {
        if (this.f45005c == null) {
            this.f45005c = new a(this.f45003a);
        }
        return this.f45005c;
    }

    public void c(boolean z10) {
        if (this.f45008f != z10) {
            if (this.f45005c != null) {
                androidx.emoji2.text.e.c().w(this.f45005c);
            }
            this.f45008f = z10;
            if (z10) {
                b(this.f45003a, androidx.emoji2.text.e.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f45003a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iG = androidx.emoji2.text.e.c().g();
        if (iG != 0) {
            if (iG == 1) {
                androidx.emoji2.text.e.c().u((Spannable) charSequence, i10, i10 + i12, this.f45006d, this.f45007e);
                return;
            } else if (iG != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.c().v(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
