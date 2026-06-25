package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class q implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29627a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spannable f29628b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof J1.m;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.q.b
        boolean a(CharSequence charSequence) {
            return r.a(charSequence) || (charSequence instanceof J1.m);
        }
    }

    q(Spannable spannable) {
        this.f29628b = spannable;
    }

    private void a() {
        Spannable spannable = this.f29628b;
        if (!this.f29627a && c().a(spannable)) {
            this.f29628b = new SpannableString(spannable);
        }
        this.f29627a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f29628b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f29628b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f29628b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f29628b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f29628b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f29628b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f29628b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f29628b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f29628b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f29628b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f29628b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f29628b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f29628b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f29628b.toString();
    }

    q(CharSequence charSequence) {
        this.f29628b = new SpannableString(charSequence);
    }
}
