package Xh;

import Wh.m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static boolean a(m mVar) {
        char cL;
        if (!mVar.e()) {
            return false;
        }
        if (!mVar.i('<')) {
            return b(mVar);
        }
        while (mVar.e() && (cL = mVar.l()) != '\n' && cL != '<') {
            if (cL == '>') {
                mVar.h();
                return true;
            }
            if (cL != '\\') {
                mVar.h();
            } else {
                mVar.h();
                if (f.g(mVar.l())) {
                    mVar.h();
                }
            }
        }
        return false;
    }

    private static boolean b(m mVar) {
        int i10 = 0;
        boolean z10 = true;
        while (mVar.e()) {
            char cL = mVar.l();
            if (cL == ' ') {
                return !z10;
            }
            if (cL == '\\') {
                mVar.h();
                if (f.g(mVar.l())) {
                    mVar.h();
                }
            } else if (cL == '(') {
                i10++;
                if (i10 > 32) {
                    return false;
                }
                mVar.h();
            } else if (cL != ')') {
                if (Character.isISOControl(cL)) {
                    return !z10;
                }
                mVar.h();
            } else {
                if (i10 == 0) {
                    return true;
                }
                i10--;
                mVar.h();
            }
            z10 = false;
        }
        return true;
    }

    public static boolean c(m mVar) {
        while (mVar.e()) {
            switch (mVar.l()) {
                case '[':
                    return false;
                case '\\':
                    mVar.h();
                    if (f.g(mVar.l())) {
                        mVar.h();
                    }
                    break;
                case ']':
                    return true;
                default:
                    mVar.h();
                    break;
            }
        }
        return true;
    }

    public static boolean d(m mVar) {
        if (!mVar.e()) {
            return false;
        }
        char cL = mVar.l();
        char c10 = '\"';
        if (cL != '\"') {
            c10 = '\'';
            if (cL != '\'') {
                if (cL != '(') {
                    return false;
                }
                c10 = ')';
            }
        }
        mVar.h();
        if (!e(mVar, c10) || !mVar.e()) {
            return false;
        }
        mVar.h();
        return true;
    }

    public static boolean e(m mVar, char c10) {
        while (mVar.e()) {
            char cL = mVar.l();
            if (cL == '\\') {
                mVar.h();
                if (f.g(mVar.l())) {
                    mVar.h();
                }
            } else {
                if (cL == c10) {
                    return true;
                }
                if (c10 == ')' && cL == '(') {
                    return false;
                }
                mVar.h();
            }
        }
        return true;
    }
}
