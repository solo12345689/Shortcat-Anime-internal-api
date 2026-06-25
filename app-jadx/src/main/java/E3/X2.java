package E3;

import E3.InterfaceC1443q;
import E3.M6;
import P9.AbstractC2011u;
import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import q2.InterfaceC6084P;
import t2.AbstractC6622i;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class X2 extends InterfaceC1443q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f5056a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        void a(S1 s12);
    }

    public X2(S1 s12) {
        this.f5056a = new WeakReference(s12);
    }

    public static /* synthetic */ void J3(String str, int i10, Y2 y22, AbstractC1498x abstractC1498x) {
        throw null;
    }

    public static /* synthetic */ void O3(S1 s12) {
        A aZ3 = s12.z3();
        A aZ32 = s12.z3();
        Objects.requireNonNull(aZ32);
        aZ3.k1(new RunnableC1372h0(aZ32));
    }

    public static /* synthetic */ void T3(String str, int i10, Y2 y22, AbstractC1498x abstractC1498x) {
        throw null;
    }

    private void W3(final a aVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final S1 s12 = (S1) this.f5056a.get();
            if (s12 == null) {
                return;
            }
            t2.a0.g1(s12.z3().f4304e, new Runnable() { // from class: E3.N2
                @Override // java.lang.Runnable
                public final void run() {
                    X2.e(s12, aVar);
                }
            });
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private int X3() {
        Y6 y6W3;
        S1 s12 = (S1) this.f5056a.get();
        if (s12 == null || (y6W3 = s12.w3()) == null) {
            return -1;
        }
        return y6W3.d();
    }

    private void Y3(int i10, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            S1 s12 = (S1) this.f5056a.get();
            if (s12 == null) {
                return;
            }
            s12.q4(i10, obj);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public static /* synthetic */ void e(S1 s12, a aVar) {
        if (s12.J3()) {
            return;
        }
        aVar.a(s12);
    }

    @Override // E3.InterfaceC1443q
    public void C0(final int i10, List list) {
        if (list == null) {
            return;
        }
        try {
            final int iX3 = X3();
            if (iX3 == -1) {
                return;
            }
            final AbstractC2011u abstractC2011uD = AbstractC6622i.d(new O9.f() { // from class: E3.F2
                @Override // O9.f
                public final Object apply(Object obj) {
                    return C1323b.e((Bundle) obj, iX3);
                }
            }, list);
            W3(new a() { // from class: E3.O2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.c4(i10, abstractC2011uD);
                }
            });
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void F0(final int i10, final PendingIntent pendingIntent) {
        W3(new a() { // from class: E3.U2
            @Override // E3.X2.a
            public final void a(S1 s12) {
                s12.d4(i10, pendingIntent);
            }
        });
    }

    @Override // E3.InterfaceC1443q
    public void G1(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            Y3(i10, X6.a(bundle));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void H0(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            Y3(i10, C1490w.b(bundle));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void J0(int i10, final String str, final int i11, Bundle bundle) {
        final Y2 y2A;
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i11 < 0) {
            AbstractC6635w.i("MediaControllerStub", "onSearchResultChanged(): Ignoring negative itemCount: " + i11);
            return;
        }
        if (bundle == null) {
            y2A = null;
        } else {
            try {
                y2A = Y2.a(bundle);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e10);
                return;
            }
        }
        W3(new a() { // from class: E3.K2
            @Override // E3.X2.a
            public final void a(S1 s12) {
                String str2 = str;
                int i12 = i11;
                Y2 y22 = y2A;
                android.support.v4.media.session.b.a(s12);
                X2.J3(str2, i12, y22, null);
            }
        });
    }

    @Override // E3.InterfaceC1443q
    public void K2(int i10, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            final U6 u6E = U6.e(bundle);
            try {
                final InterfaceC6084P.b bVarE = InterfaceC6084P.b.e(bundle2);
                W3(new a() { // from class: E3.R2
                    @Override // E3.X2.a
                    public final void a(S1 s12) {
                        s12.U3(u6E, bVarE);
                    }
                });
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for Commands", e10);
            }
        } catch (RuntimeException e11) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e11);
        }
    }

    public void V3() {
        this.f5056a.clear();
    }

    @Override // E3.InterfaceC1443q
    public void b(int i10) {
        W3(new a() { // from class: E3.S2
            @Override // E3.X2.a
            public final void a(S1 s12) {
                X2.O3(s12);
            }
        });
    }

    @Override // E3.InterfaceC1443q
    public void d(int i10) {
        W3(new a() { // from class: E3.Q2
            @Override // E3.X2.a
            public final void a(S1 s12) {
                s12.a4();
            }
        });
    }

    @Override // E3.InterfaceC1443q
    public void f2(final int i10, Bundle bundle) {
        try {
            final V6 v6A = V6.a(bundle);
            W3(new a() { // from class: E3.P2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.X3(i10, v6A);
                }
            });
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void i(final int i10, List list) {
        if (list == null) {
            return;
        }
        try {
            final int iX3 = X3();
            if (iX3 == -1) {
                return;
            }
            final AbstractC2011u abstractC2011uD = AbstractC6622i.d(new O9.f() { // from class: E3.I2
                @Override // O9.f
                public final Object apply(Object obj) {
                    return C1323b.e((Bundle) obj, iX3);
                }
            }, list);
            W3(new a() { // from class: E3.J2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.b4(i10, abstractC2011uD);
                }
            });
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void k0(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final C1411m c1411mD = C1411m.d(bundle);
            W3(new a() { // from class: E3.G2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.V3(c1411mD);
                }
            });
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e10);
            b(i10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void m3(int i10, final Bundle bundle) {
        if (bundle == null) {
            AbstractC6635w.i("MediaControllerStub", "Ignoring null Bundle for extras");
        } else {
            W3(new a() { // from class: E3.W2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.Y3(bundle);
                }
            });
        }
    }

    @Override // E3.InterfaceC1443q
    public void o2(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final InterfaceC6084P.b bVarE = InterfaceC6084P.b.e(bundle);
            W3(new a() { // from class: E3.L2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.T3(bVarE);
                }
            });
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for Commands", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void u2(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final W6 w6B = W6.b(bundle);
            W3(new a() { // from class: E3.H2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.R3(w6B);
                }
            });
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void u3(int i10, Bundle bundle, boolean z10) {
        y2(i10, bundle, new M6.c(z10, true).b());
    }

    @Override // E3.InterfaceC1443q
    public void w2(final int i10, Bundle bundle, final Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            AbstractC6635w.i("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            final T6 t6A = T6.a(bundle);
            W3(new a() { // from class: E3.V2
                @Override // E3.X2.a
                public final void a(S1 s12) {
                    s12.W3(i10, t6A, bundle2);
                }
            });
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e10);
        }
    }

    @Override // E3.InterfaceC1443q
    public void x3(int i10, final String str, final int i11, Bundle bundle) {
        final Y2 y2A;
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i11 < 0) {
            AbstractC6635w.i("MediaControllerStub", "onChildrenChanged(): Ignoring negative itemCount: " + i11);
            return;
        }
        if (bundle == null) {
            y2A = null;
        } else {
            try {
                y2A = Y2.a(bundle);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e10);
                return;
            }
        }
        W3(new a() { // from class: E3.T2
            @Override // E3.X2.a
            public final void a(S1 s12) {
                String str2 = str;
                int i12 = i11;
                Y2 y22 = y2A;
                android.support.v4.media.session.b.a(s12);
                X2.T3(str2, i12, y22, null);
            }
        });
    }

    @Override // E3.InterfaceC1443q
    public void y2(int i10, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iX3 = X3();
            if (iX3 == -1) {
                return;
            }
            final M6 m6B = M6.B(bundle, iX3);
            try {
                final M6.c cVarA = M6.c.a(bundle2);
                W3(new a() { // from class: E3.M2
                    @Override // E3.X2.a
                    public final void a(S1 s12) {
                        s12.Z3(m6B, cVarA);
                    }
                });
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e10);
            }
        } catch (RuntimeException e11) {
            AbstractC6635w.j("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e11);
        }
    }
}
