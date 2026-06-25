package Df;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class q {
    public static final InterfaceC1279l e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    public static final InterfaceC1279l f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    public static final C5870f g(MatchResult matchResult) {
        return AbstractC5874j.x(matchResult.start(), matchResult.end());
    }

    public static final C5870f h(MatchResult matchResult, int i10) {
        return AbstractC5874j.x(matchResult.start(i10), matchResult.end(i10));
    }
}
