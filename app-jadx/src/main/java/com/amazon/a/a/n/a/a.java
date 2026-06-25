package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.d.a.c;
import com.amazon.d.a.j;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.amazon.a.a.n.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34470b = new com.amazon.a.a.o.c("AbstractCommandTask");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.l.b f34471a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f34472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private d f34473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f34474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f34475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private b f34476g;

    private void b(j jVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("Command executed successfully");
        }
        a(jVar);
    }

    private com.amazon.d.a.c i() {
        return new c.a() { // from class: com.amazon.a.a.n.a.a.1
            @Override // com.amazon.d.a.c
            public String a() {
                return a.this.c();
            }

            @Override // com.amazon.d.a.c
            public String b() {
                return a.this.a_();
            }

            @Override // com.amazon.d.a.c
            public Map c() {
                return a.this.b();
            }

            @Override // com.amazon.d.a.c
            public String d() {
                return a.this.f34472c.getPackageName();
            }
        };
    }

    private void j() {
        if (m()) {
            return;
        }
        this.f34473d.b();
    }

    protected abstract void a(com.amazon.d.a.h hVar);

    protected abstract void a(j jVar);

    protected abstract String a_();

    protected abstract Map<String, Object> b();

    protected abstract String c();

    protected abstract boolean d();

    protected boolean f() {
        return true;
    }

    protected String g() {
        return a_() + "_failure";
    }

    protected String h() {
        return a_() + "_success";
    }

    @Override // com.amazon.a.a.n.a
    public final void a() {
        try {
            if (com.amazon.a.a.o.c.f34699a) {
                com.amazon.a.a.o.c cVar = f34470b;
                cVar.a("----------------------------------------------");
                cVar.a("Executing: " + a_());
                cVar.a("----------------------------------------------");
            }
            e();
            if (!d()) {
                if (com.amazon.a.a.o.c.f34699a) {
                    f34470b.a("Execution not needed, quitting");
                }
                return;
            }
            if (com.amazon.a.a.o.c.f34699a) {
                f34470b.a("Executing Command: " + a_());
            }
            a(this.f34473d.a(i()));
            if (com.amazon.a.a.o.c.f34699a) {
                f34470b.a("Task finished");
            }
            j();
        } catch (Throwable th2) {
            try {
                a(th2);
                if (com.amazon.a.a.o.c.f34699a) {
                    f34470b.a("Task finished");
                }
                j();
            } finally {
                if (com.amazon.a.a.o.c.f34699a) {
                    f34470b.a("Task finished");
                }
                j();
            }
        }
    }

    private void b(com.amazon.d.a.h hVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("Command failed execution: " + hVar.b());
        }
        a(hVar);
    }

    private com.amazon.a.a.d.b b(Throwable th2) {
        if (th2 instanceof com.amazon.a.a.d.b) {
            return (com.amazon.a.a.d.b) th2;
        }
        if (th2 instanceof RemoteException) {
            return new com.amazon.a.a.n.a.a.d((RemoteException) th2);
        }
        return new com.amazon.a.a.n.a.a.h(th2);
    }

    protected void b(com.amazon.a.a.d.b bVar) {
        f34470b.b("On Exception!!!!: " + bVar);
    }

    protected void e() {
    }

    private void a(c cVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("Received result from CommandService: " + cVar);
        }
        if (cVar == null) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34470b.a("Received null result from command service, exiting task");
            }
        } else {
            if (cVar.e() != null) {
                a(cVar.e());
                return;
            }
            this.f34476g.a(cVar.a(), this.f34473d.a());
            if (cVar.b() != null) {
                b(cVar.b());
            } else if (cVar.c() != null) {
                b(cVar.c());
            } else if (f()) {
                a(cVar.d());
            }
        }
    }

    private void a(com.amazon.d.a.g gVar) throws com.amazon.a.a.n.a.a.f {
        throw new com.amazon.a.a.n.a.a.f(gVar);
    }

    private void a(com.amazon.d.a.f fVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("Handling Decision");
        }
        try {
            f fVar2 = new f(fVar);
            this.f34474e.a((com.amazon.a.a.i.b) fVar2);
            com.amazon.d.a.a aVarI = fVar2.i();
            if (aVarI == null) {
                if (com.amazon.a.a.o.c.f34699a) {
                    f34470b.a("DecisionChooser returned null!!, expiring");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
                return;
            }
            a(fVar, aVarI);
        } catch (com.amazon.a.a.n.a.a.e e10) {
            a(fVar, e10.a());
        }
    }

    private void a(com.amazon.d.a.f fVar, com.amazon.d.a.a aVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("Handling customer choice: " + aVar);
        }
        Intent intentB = aVar.b();
        if (intentB != null) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34470b.a("Choice has intent, scheduling it to be fired!!");
            }
            com.amazon.a.a.l.a aVarA = this.f34471a.a(intentB);
            if (aVarA == null) {
                if (com.amazon.a.a.o.c.f34699a) {
                    f34470b.a("No result recived, expiring decision");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
                return;
            } else if (aVarA.d() == 0) {
                if (com.amazon.a.a.o.c.f34699a) {
                    f34470b.a("Result canceled, expiring decision");
                }
                a(fVar, e.ACTION_CANCELED);
                return;
            } else {
                if (com.amazon.a.a.o.c.f34699a) {
                    f34470b.a("Result received!!!, notifying service");
                }
                a(this.f34473d.a(aVar));
                return;
            }
        }
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("No intent given, choosing now");
        }
        a(this.f34473d.a(aVar));
    }

    private void a(com.amazon.d.a.f fVar, e eVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("Expiring Decision: " + fVar + ", reason: " + eVar);
        }
        a(this.f34473d.a(fVar, eVar));
    }

    private void a(Throwable th2) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34470b.a("Exception occurred while processing task: " + th2, th2);
        }
        com.amazon.a.a.d.b bVarB = b(th2);
        b(bVarB);
        this.f34475f.a(a(bVarB));
    }

    protected com.amazon.a.a.h.a a(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.h.a aVar = new com.amazon.a.a.h.a(g());
        aVar.a("subType", bVar.a()).a("reason", bVar.b()).a("context", bVar.c());
        return aVar;
    }
}
