package Df;

import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final a f3785b = new a(null);

    /* JADX INFO: renamed from: a */
    private final Pattern f3786a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f3787a = new b();

        b() {
            super(1, InterfaceC1279l.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final InterfaceC1279l invoke(InterfaceC1279l p02) {
            AbstractC5504s.h(p02, "p0");
            return p02.next();
        }
    }

    public p(Pattern nativePattern) {
        AbstractC5504s.h(nativePattern, "nativePattern");
        this.f3786a = nativePattern;
    }

    public static /* synthetic */ InterfaceC1279l c(p pVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pVar.b(charSequence, i10);
    }

    public static /* synthetic */ Cf.i e(p pVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pVar.d(charSequence, i10);
    }

    public static final InterfaceC1279l f(p pVar, CharSequence charSequence, int i10) {
        return pVar.b(charSequence, i10);
    }

    public final InterfaceC1279l b(CharSequence input, int i10) {
        AbstractC5504s.h(input, "input");
        Matcher matcher = this.f3786a.matcher(input);
        AbstractC5504s.g(matcher, "matcher(...)");
        return q.e(matcher, i10, input);
    }

    public final Cf.i d(final CharSequence input, final int i10) {
        AbstractC5504s.h(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            return Cf.l.o(new InterfaceC5082a() { // from class: Df.o
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return p.f(this.f3782a, input, i10);
                }
            }, b.f3787a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + input.length());
    }

    public final InterfaceC1279l g(CharSequence input) {
        AbstractC5504s.h(input, "input");
        Matcher matcher = this.f3786a.matcher(input);
        AbstractC5504s.g(matcher, "matcher(...)");
        return q.f(matcher, input);
    }

    public final boolean h(CharSequence input) {
        AbstractC5504s.h(input, "input");
        return this.f3786a.matcher(input).matches();
    }

    public final String i(CharSequence input, String replacement) {
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(replacement, "replacement");
        String strReplaceAll = this.f3786a.matcher(input).replaceAll(replacement);
        AbstractC5504s.g(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String j(CharSequence input, Function1 transform) {
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(transform, "transform");
        int iIntValue = 0;
        InterfaceC1279l interfaceC1279lC = c(this, input, 0, 2, null);
        if (interfaceC1279lC == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, interfaceC1279lC.c().b().intValue());
            sb2.append((CharSequence) transform.invoke(interfaceC1279lC));
            iIntValue = interfaceC1279lC.c().e().intValue() + 1;
            interfaceC1279lC = interfaceC1279lC.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC1279lC != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public final String k(CharSequence input, String replacement) {
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(replacement, "replacement");
        String strReplaceFirst = this.f3786a.matcher(input).replaceFirst(replacement);
        AbstractC5504s.g(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List l(CharSequence input, int i10) {
        AbstractC5504s.h(input, "input");
        F.I0(i10);
        Matcher matcher = this.f3786a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return AbstractC2279u.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? AbstractC5874j.i(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f3786a.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(String pattern) {
        AbstractC5504s.h(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC5504s.g(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
