package W0;

import V0.I;
import b1.AbstractC2968a;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20605e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f20606f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f20607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BreakIterator f20610d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private a() {
        }
    }

    public i(CharSequence charSequence, int i10, int i11, Locale locale) {
        this.f20607a = charSequence;
        if (!(i10 >= 0 && i10 <= charSequence.length())) {
            AbstractC2968a.a("input start index is outside the CharSequence");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            AbstractC2968a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f20610d = wordInstance;
        this.f20608b = Math.max(0, i10 - 50);
        this.f20609c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new I(charSequence, i10, i11));
    }

    private final void a(int i10) {
        int i11 = this.f20608b;
        boolean z10 = false;
        if (i10 <= this.f20609c && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC2968a.a("Invalid offset: " + i10 + ". Valid range is [" + this.f20608b + " , " + this.f20609c + ']');
    }

    private final int b(int i10, boolean z10) {
        a(i10);
        if (l(i10)) {
            return (!j(i10) || (h(i10) && z10)) ? q(i10) : i10;
        }
        if (h(i10)) {
            return q(i10);
        }
        return -1;
    }

    private final int c(int i10, boolean z10) {
        a(i10);
        if (h(i10)) {
            return (!j(i10) || (l(i10) && z10)) ? p(i10) : i10;
        }
        if (l(i10)) {
            return p(i10);
        }
        return -1;
    }

    private final boolean h(int i10) {
        int i11 = this.f20608b + 1;
        if (i10 > this.f20609c || i11 > i10) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.f20607a, i10))) {
            return true;
        }
        int i12 = i10 - 1;
        if (Character.isSurrogate(this.f20607a.charAt(i12))) {
            return true;
        }
        if (!androidx.emoji2.text.e.k()) {
            return false;
        }
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        return eVarC.g() == 1 && eVarC.f(this.f20607a, i12) != -1;
    }

    private final boolean j(int i10) {
        a(i10);
        if (!this.f20610d.isBoundary(i10)) {
            return false;
        }
        if (l(i10) && l(i10 - 1) && l(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= this.f20607a.length() - 1 || !(k(i10) || k(i10 + 1));
    }

    private final boolean k(int i10) {
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.f20607a.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC5504s.c(unicodeBlockOf, unicodeBlock) && AbstractC5504s.c(Character.UnicodeBlock.of(this.f20607a.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC5504s.c(Character.UnicodeBlock.of(this.f20607a.charAt(i10)), unicodeBlock) && AbstractC5504s.c(Character.UnicodeBlock.of(this.f20607a.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean l(int i10) {
        int i11 = this.f20608b;
        if (i10 >= this.f20609c || i11 > i10) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.f20607a, i10)) || Character.isSurrogate(this.f20607a.charAt(i10))) {
            return true;
        }
        if (!androidx.emoji2.text.e.k()) {
            return false;
        }
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        return eVarC.g() == 1 && eVarC.f(this.f20607a, i10) != -1;
    }

    private final boolean n(int i10) {
        return !m(i10) && i(i10);
    }

    private final boolean o(int i10) {
        return m(i10) && !i(i10);
    }

    public final int d(int i10) {
        return c(i10, true);
    }

    public final int e(int i10) {
        return b(i10, true);
    }

    public final int f(int i10) {
        a(i10);
        while (i10 != -1 && !o(i10)) {
            i10 = q(i10);
        }
        return i10;
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !n(i10)) {
            i10 = p(i10);
        }
        return i10;
    }

    public final boolean i(int i10) {
        int i11 = this.f20608b + 1;
        if (i10 > this.f20609c || i11 > i10) {
            return false;
        }
        return f20605e.a(Character.codePointBefore(this.f20607a, i10));
    }

    public final boolean m(int i10) {
        int i11 = this.f20608b;
        if (i10 >= this.f20609c || i11 > i10) {
            return false;
        }
        return f20605e.a(Character.codePointAt(this.f20607a, i10));
    }

    public final int p(int i10) {
        a(i10);
        int iFollowing = this.f20610d.following(i10);
        return (l(iFollowing + (-1)) && l(iFollowing) && !k(iFollowing)) ? p(iFollowing) : iFollowing;
    }

    public final int q(int i10) {
        a(i10);
        int iPreceding = this.f20610d.preceding(i10);
        return (l(iPreceding) && h(iPreceding) && !k(iPreceding)) ? q(iPreceding) : iPreceding;
    }
}
