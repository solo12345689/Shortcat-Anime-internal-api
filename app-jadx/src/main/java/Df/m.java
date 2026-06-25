package Df;

import Df.InterfaceC1279l;
import Df.m;
import Ud.AbstractC2261b;
import Ud.AbstractC2263d;
import Ud.AbstractC2279u;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class m implements InterfaceC1279l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f3776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1278k f3777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f3778d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2263d {
        a() {
        }

        @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return f((String) obj);
            }
            return false;
        }

        @Override // Ud.AbstractC2261b
        public int d() {
            return m.this.e().groupCount() + 1;
        }

        public /* bridge */ boolean f(String str) {
            return super.contains(str);
        }

        @Override // Ud.AbstractC2263d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = m.this.e().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // Ud.AbstractC2263d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return l((String) obj);
            }
            return -1;
        }

        public /* bridge */ int l(String str) {
            return super.indexOf(str);
        }

        @Override // Ud.AbstractC2263d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return p((String) obj);
            }
            return -1;
        }

        public /* bridge */ int p(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC2261b implements InterfaceC1278k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C1277j p(b bVar, int i10) {
            return bVar.l(i10);
        }

        @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C1277j) {
                return i((C1277j) obj);
            }
            return false;
        }

        @Override // Ud.AbstractC2261b
        public int d() {
            return m.this.e().groupCount() + 1;
        }

        public /* bridge */ boolean i(C1277j c1277j) {
            return super.contains(c1277j);
        }

        @Override // Ud.AbstractC2261b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Cf.l.K(AbstractC2279u.c0(AbstractC2279u.n(this)), new Function1() { // from class: Df.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.b.p(this.f3781a, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        public C1277j l(int i10) {
            C5870f c5870fH = q.h(m.this.e(), i10);
            if (c5870fH.b().intValue() < 0) {
                return null;
            }
            String strGroup = m.this.e().group(i10);
            AbstractC5504s.g(strGroup, "group(...)");
            return new C1277j(strGroup, c5870fH);
        }
    }

    public m(Matcher matcher, CharSequence input) {
        AbstractC5504s.h(matcher, "matcher");
        AbstractC5504s.h(input, "input");
        this.f3775a = matcher;
        this.f3776b = input;
        this.f3777c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult e() {
        return this.f3775a;
    }

    @Override // Df.InterfaceC1279l
    public InterfaceC1279l.b a() {
        return InterfaceC1279l.a.a(this);
    }

    @Override // Df.InterfaceC1279l
    public List b() {
        if (this.f3778d == null) {
            this.f3778d = new a();
        }
        List list = this.f3778d;
        AbstractC5504s.e(list);
        return list;
    }

    @Override // Df.InterfaceC1279l
    public C5870f c() {
        return q.g(e());
    }

    @Override // Df.InterfaceC1279l
    public String getValue() {
        String strGroup = e().group();
        AbstractC5504s.g(strGroup, "group(...)");
        return strGroup;
    }

    @Override // Df.InterfaceC1279l
    public InterfaceC1279l next() {
        int iEnd = e().end() + (e().end() == e().start() ? 1 : 0);
        if (iEnd > this.f3776b.length()) {
            return null;
        }
        Matcher matcher = this.f3775a.pattern().matcher(this.f3776b);
        AbstractC5504s.g(matcher, "matcher(...)");
        return q.e(matcher, iEnd, this.f3776b);
    }
}
