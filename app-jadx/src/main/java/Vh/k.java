package Vh;

import Yh.AbstractC2491a;
import Yh.v;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class k extends ai.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern[][] f20439e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yh.k f20440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f20441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Vh.a f20443d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends ai.b {
        @Override // ai.e
        public ai.f a(ai.h hVar, ai.g gVar) {
            int iD = hVar.d();
            CharSequence charSequenceA = hVar.a().a();
            if (hVar.b() < 4 && charSequenceA.charAt(iD) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || (!(gVar.a().f() instanceof v) && !hVar.e().d())) {
                        Pattern pattern = k.f20439e[i10][0];
                        Pattern pattern2 = k.f20439e[i10][1];
                        if (pattern.matcher(charSequenceA.subSequence(iD, charSequenceA.length())).find()) {
                            return ai.f.d(new k(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return ai.f.c();
        }
    }

    @Override // ai.a, ai.d
    public void e(Zh.f fVar) {
        this.f20443d.a(fVar.a());
        Pattern pattern = this.f20441b;
        if (pattern == null || !pattern.matcher(fVar.a()).find()) {
            return;
        }
        this.f20442c = true;
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20440a;
    }

    @Override // ai.a, ai.d
    public void h() {
        this.f20440a.o(this.f20443d.b());
        this.f20443d = null;
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        return this.f20442c ? ai.c.d() : (hVar.c() && this.f20441b == null) ? ai.c.d() : ai.c.b(hVar.getIndex());
    }

    private k(Pattern pattern) {
        this.f20440a = new Yh.k();
        this.f20442c = false;
        this.f20443d = new Vh.a();
        this.f20441b = pattern;
    }
}
