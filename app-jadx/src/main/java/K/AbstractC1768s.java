package K;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: K.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1768s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f10333a = new c(a(new kotlin.jvm.internal.F() { // from class: K.s.b
        @Override // kotlin.jvm.internal.F, pe.InterfaceC6025o
        public Object get(Object obj) {
            return Boolean.valueOf(C0.d.e(((C0.b) obj).f()));
        }
    }));

    /* JADX INFO: renamed from: K.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f10334a;

        a(Function1 function1) {
            this.f10334a = function1;
        }

        @Override // K.r
        public EnumC1766p a(KeyEvent keyEvent) {
            if (((Boolean) this.f10334a.invoke(C0.b.a(keyEvent))).booleanValue() && C0.d.f(keyEvent)) {
                if (C0.a.r(C0.d.a(keyEvent), B.f9726a.x())) {
                    return EnumC1766p.REDO;
                }
                return null;
            }
            if (((Boolean) this.f10334a.invoke(C0.b.a(keyEvent))).booleanValue()) {
                long jA = C0.d.a(keyEvent);
                B b10 = B.f9726a;
                if (C0.a.r(jA, b10.d()) ? true : C0.a.r(jA, b10.n())) {
                    return EnumC1766p.COPY;
                }
                if (C0.a.r(jA, b10.u())) {
                    return EnumC1766p.PASTE;
                }
                if (C0.a.r(jA, b10.v())) {
                    return EnumC1766p.CUT;
                }
                if (C0.a.r(jA, b10.a())) {
                    return EnumC1766p.SELECT_ALL;
                }
                if (C0.a.r(jA, b10.w())) {
                    return EnumC1766p.REDO;
                }
                if (C0.a.r(jA, b10.x())) {
                    return EnumC1766p.UNDO;
                }
                return null;
            }
            if (C0.d.e(keyEvent)) {
                return null;
            }
            if (C0.d.f(keyEvent)) {
                long jA2 = C0.d.a(keyEvent);
                B b11 = B.f9726a;
                if (C0.a.r(jA2, b11.i())) {
                    return EnumC1766p.SELECT_LEFT_CHAR;
                }
                if (C0.a.r(jA2, b11.j())) {
                    return EnumC1766p.SELECT_RIGHT_CHAR;
                }
                if (C0.a.r(jA2, b11.k())) {
                    return EnumC1766p.SELECT_UP;
                }
                if (C0.a.r(jA2, b11.h())) {
                    return EnumC1766p.SELECT_DOWN;
                }
                if (C0.a.r(jA2, b11.r())) {
                    return EnumC1766p.SELECT_PAGE_UP;
                }
                if (C0.a.r(jA2, b11.q())) {
                    return EnumC1766p.SELECT_PAGE_DOWN;
                }
                if (C0.a.r(jA2, b11.p())) {
                    return EnumC1766p.SELECT_LINE_START;
                }
                if (C0.a.r(jA2, b11.o())) {
                    return EnumC1766p.SELECT_LINE_END;
                }
                if (C0.a.r(jA2, b11.n())) {
                    return EnumC1766p.PASTE;
                }
                return null;
            }
            long jA3 = C0.d.a(keyEvent);
            B b12 = B.f9726a;
            if (C0.a.r(jA3, b12.i())) {
                return EnumC1766p.LEFT_CHAR;
            }
            if (C0.a.r(jA3, b12.j())) {
                return EnumC1766p.RIGHT_CHAR;
            }
            if (C0.a.r(jA3, b12.k())) {
                return EnumC1766p.UP;
            }
            if (C0.a.r(jA3, b12.h())) {
                return EnumC1766p.DOWN;
            }
            if (C0.a.r(jA3, b12.r())) {
                return EnumC1766p.PAGE_UP;
            }
            if (C0.a.r(jA3, b12.q())) {
                return EnumC1766p.PAGE_DOWN;
            }
            if (C0.a.r(jA3, b12.p())) {
                return EnumC1766p.LINE_START;
            }
            if (C0.a.r(jA3, b12.o())) {
                return EnumC1766p.LINE_END;
            }
            if (C0.a.r(jA3, b12.l())) {
                return EnumC1766p.NEW_LINE;
            }
            if (C0.a.r(jA3, b12.c())) {
                return EnumC1766p.DELETE_PREV_CHAR;
            }
            if (C0.a.r(jA3, b12.g())) {
                return EnumC1766p.DELETE_NEXT_CHAR;
            }
            if (C0.a.r(jA3, b12.s())) {
                return EnumC1766p.PASTE;
            }
            if (C0.a.r(jA3, b12.f())) {
                return EnumC1766p.CUT;
            }
            if (C0.a.r(jA3, b12.e())) {
                return EnumC1766p.COPY;
            }
            if (C0.a.r(jA3, b12.t())) {
                return EnumC1766p.TAB;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: K.s$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f10336a;

        c(r rVar) {
            this.f10336a = rVar;
        }

        @Override // K.r
        public EnumC1766p a(KeyEvent keyEvent) {
            EnumC1766p enumC1766p = null;
            if (C0.d.f(keyEvent) && C0.d.e(keyEvent)) {
                long jA = C0.d.a(keyEvent);
                B b10 = B.f9726a;
                if (C0.a.r(jA, b10.i())) {
                    enumC1766p = EnumC1766p.SELECT_LEFT_WORD;
                } else if (C0.a.r(jA, b10.j())) {
                    enumC1766p = EnumC1766p.SELECT_RIGHT_WORD;
                } else if (C0.a.r(jA, b10.k())) {
                    enumC1766p = EnumC1766p.SELECT_PREV_PARAGRAPH;
                } else if (C0.a.r(jA, b10.h())) {
                    enumC1766p = EnumC1766p.SELECT_NEXT_PARAGRAPH;
                }
            } else if (C0.d.e(keyEvent)) {
                long jA2 = C0.d.a(keyEvent);
                B b11 = B.f9726a;
                if (C0.a.r(jA2, b11.i())) {
                    enumC1766p = EnumC1766p.LEFT_WORD;
                } else if (C0.a.r(jA2, b11.j())) {
                    enumC1766p = EnumC1766p.RIGHT_WORD;
                } else if (C0.a.r(jA2, b11.k())) {
                    enumC1766p = EnumC1766p.PREV_PARAGRAPH;
                } else if (C0.a.r(jA2, b11.h())) {
                    enumC1766p = EnumC1766p.NEXT_PARAGRAPH;
                } else if (C0.a.r(jA2, b11.m())) {
                    enumC1766p = EnumC1766p.DELETE_PREV_CHAR;
                } else if (C0.a.r(jA2, b11.g())) {
                    enumC1766p = EnumC1766p.DELETE_NEXT_WORD;
                } else if (C0.a.r(jA2, b11.c())) {
                    enumC1766p = EnumC1766p.DELETE_PREV_WORD;
                } else if (C0.a.r(jA2, b11.b())) {
                    enumC1766p = EnumC1766p.DESELECT;
                }
            } else if (C0.d.f(keyEvent)) {
                long jA3 = C0.d.a(keyEvent);
                B b12 = B.f9726a;
                if (C0.a.r(jA3, b12.p())) {
                    enumC1766p = EnumC1766p.SELECT_LINE_LEFT;
                } else if (C0.a.r(jA3, b12.o())) {
                    enumC1766p = EnumC1766p.SELECT_LINE_RIGHT;
                }
            } else if (C0.d.d(keyEvent)) {
                long jA4 = C0.d.a(keyEvent);
                B b13 = B.f9726a;
                if (C0.a.r(jA4, b13.c())) {
                    enumC1766p = EnumC1766p.DELETE_FROM_LINE_START;
                } else if (C0.a.r(jA4, b13.g())) {
                    enumC1766p = EnumC1766p.DELETE_TO_LINE_END;
                }
            }
            return enumC1766p == null ? this.f10336a.a(keyEvent) : enumC1766p;
        }
    }

    public static final r a(Function1 function1) {
        return new a(function1);
    }

    public static final r b() {
        return f10333a;
    }
}
