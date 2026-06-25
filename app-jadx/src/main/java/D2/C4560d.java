package d2;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: d2.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4560d implements InputFilter {

    /* JADX INFO: renamed from: a */
    private final TextView f44992a;

    /* JADX INFO: renamed from: b */
    private e.f f44993b;

    /* JADX INFO: renamed from: d2.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends e.f implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Reference f44994a;

        /* JADX INFO: renamed from: b */
        private final Reference f44995b;

        a(TextView textView, C4560d c4560d) {
            this.f44994a = new WeakReference(textView);
            this.f44995b = new WeakReference(c4560d);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            Handler handler;
            super.b();
            TextView textView = (TextView) this.f44994a.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence charSequenceR;
            TextView textView = (TextView) this.f44994a.get();
            if (c(textView, (InputFilter) this.f44995b.get()) && textView.isAttachedToWindow() && text != (charSequenceR = androidx.emoji2.text.e.c().r((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceR);
                int selectionEnd = Selection.getSelectionEnd(charSequenceR);
                textView.setText(charSequenceR);
                if (charSequenceR instanceof Spannable) {
                    C4560d.b((Spannable) charSequenceR, selectionStart, selectionEnd);
                }
            }
        }
    }

    C4560d(TextView textView) {
        this.f44992a = textView;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    e.f a() {
        if (this.f44993b == null) {
            this.f44993b = new a(this.f44992a, this);
        }
        return this.f44993b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f44992a.isInEditMode()) {
            return charSequence;
        }
        int iG = androidx.emoji2.text.e.c().g();
        if (iG != 0) {
            if (iG == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f44992a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.e.c().s(charSequence, 0, charSequence.length());
            }
            if (iG != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.c().v(a());
        return charSequence;
    }
}
