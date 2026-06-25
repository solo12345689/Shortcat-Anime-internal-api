package Vh;

import Yh.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private StringBuilder f20464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f20466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuilder f20467h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f20460a = b.START_DEFINITION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f20461b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f20462c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f20463d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20468i = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20469a;

        static {
            int[] iArr = new int[b.values().length];
            f20469a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20469a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20469a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20469a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20469a[b.TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private boolean b(Wh.m mVar) {
        mVar.r();
        Wh.l lVarO = mVar.o();
        if (!Xh.e.a(mVar)) {
            return false;
        }
        String strC = mVar.d(lVarO, mVar.o()).c();
        if (strC.startsWith("<")) {
            strC = strC.substring(1, strC.length() - 1);
        }
        this.f20465f = strC;
        int iR = mVar.r();
        if (!mVar.e()) {
            this.f20468i = true;
            this.f20461b.clear();
        } else if (iR == 0) {
            return false;
        }
        this.f20460a = b.START_TITLE;
        return true;
    }

    private void c() {
        if (this.f20468i) {
            String strD = Xh.c.d(this.f20465f);
            StringBuilder sb2 = this.f20467h;
            Yh.p pVar = new Yh.p(this.f20464e.toString(), strD, sb2 != null ? Xh.c.d(sb2.toString()) : null);
            pVar.k(this.f20463d);
            this.f20463d.clear();
            this.f20462c.add(pVar);
            this.f20464e = null;
            this.f20468i = false;
            this.f20465f = null;
            this.f20467h = null;
        }
    }

    private boolean g(Wh.m mVar) {
        Wh.l lVarO = mVar.o();
        if (!Xh.e.c(mVar)) {
            return false;
        }
        this.f20464e.append(mVar.d(lVarO, mVar.o()).c());
        if (!mVar.e()) {
            this.f20464e.append('\n');
            return true;
        }
        if (!mVar.i(']') || !mVar.i(':') || this.f20464e.length() > 999 || Xh.c.b(this.f20464e.toString()).isEmpty()) {
            return false;
        }
        this.f20460a = b.DESTINATION;
        mVar.r();
        return true;
    }

    private boolean i(Wh.m mVar) {
        mVar.r();
        if (!mVar.i('[')) {
            return false;
        }
        this.f20460a = b.LABEL;
        this.f20464e = new StringBuilder();
        if (mVar.e()) {
            return true;
        }
        this.f20464e.append('\n');
        return true;
    }

    private boolean j(Wh.m mVar) {
        mVar.r();
        if (!mVar.e()) {
            this.f20460a = b.START_DEFINITION;
            return true;
        }
        this.f20466g = (char) 0;
        char cL = mVar.l();
        if (cL == '\"' || cL == '\'') {
            this.f20466g = cL;
        } else if (cL == '(') {
            this.f20466g = ')';
        }
        if (this.f20466g != 0) {
            this.f20460a = b.TITLE;
            this.f20467h = new StringBuilder();
            mVar.h();
            if (!mVar.e()) {
                this.f20467h.append('\n');
            }
        } else {
            c();
            this.f20460a = b.START_DEFINITION;
        }
        return true;
    }

    private boolean k(Wh.m mVar) {
        Wh.l lVarO = mVar.o();
        if (!Xh.e.e(mVar, this.f20466g)) {
            return false;
        }
        this.f20467h.append(mVar.d(lVarO, mVar.o()).c());
        if (!mVar.e()) {
            this.f20467h.append('\n');
            return true;
        }
        mVar.h();
        mVar.r();
        if (mVar.e()) {
            return false;
        }
        this.f20468i = true;
        c();
        this.f20461b.clear();
        this.f20460a = b.START_DEFINITION;
        return true;
    }

    public void a(x xVar) {
        this.f20463d.add(xVar);
    }

    List d() {
        c();
        return this.f20462c;
    }

    Zh.g e() {
        return Zh.g.h(this.f20461b);
    }

    List f() {
        return this.f20463d;
    }

    public void h(Zh.f fVar) {
        boolean zI;
        this.f20461b.add(fVar);
        if (this.f20460a == b.PARAGRAPH) {
            return;
        }
        Wh.m mVarK = Wh.m.k(Zh.g.g(fVar));
        while (mVarK.e()) {
            int i10 = a.f20469a[this.f20460a.ordinal()];
            if (i10 == 1) {
                zI = i(mVarK);
            } else if (i10 == 2) {
                zI = g(mVarK);
            } else if (i10 == 3) {
                zI = b(mVarK);
            } else if (i10 == 4) {
                zI = j(mVarK);
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("Unknown parsing state: " + this.f20460a);
                }
                zI = k(mVarK);
            }
            if (!zI) {
                this.f20460a = b.PARAGRAPH;
                return;
            }
        }
    }
}
