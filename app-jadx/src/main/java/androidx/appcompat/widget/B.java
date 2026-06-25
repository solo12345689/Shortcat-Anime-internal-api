package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f24944b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    B(TextView textView) {
        this.f24943a = (TextView) K1.f.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f24944b;
        return textClassifier == null ? a.a(this.f24943a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f24944b = textClassifier;
    }
}
