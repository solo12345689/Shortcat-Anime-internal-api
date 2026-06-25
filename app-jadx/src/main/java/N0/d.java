package N0;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a */
    private final Object f12571a;

    /* JADX INFO: renamed from: b */
    private final View f12572b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private d(ContentCaptureSession contentCaptureSession, View view) {
        this.f12571a = contentCaptureSession;
        this.f12572b = view;
    }

    public static d g(ContentCaptureSession contentCaptureSession, View view) {
        return new d(contentCaptureSession, view);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionA = c.a(this.f12571a);
            b bVarA = e.a(this.f12572b);
            Objects.requireNonNull(bVarA);
            a.f(contentCaptureSessionA, bVarA.a(), new long[]{Long.MIN_VALUE});
        }
    }

    public AutofillId b(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = c.a(this.f12571a);
        b bVarA = e.a(this.f12572b);
        Objects.requireNonNull(bVarA);
        return a.a(contentCaptureSessionA, bVarA.a(), j10);
    }

    public f c(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.i(a.b(c.a(this.f12571a), autofillId, j10));
        }
        return null;
    }

    public void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.c(c.a(this.f12571a), viewStructure);
        }
    }

    public void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(c.a(this.f12571a), autofillId);
        }
    }

    public void f(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.e(c.a(this.f12571a), autofillId, charSequence);
        }
    }
}
