.class Lcom/android/billingclient/api/b;
.super Lcom/android/billingclient/api/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Lcom/android/billingclient/api/g;

.field private E:Z

.field private F:Z

.field private volatile G:LN4/d;

.field private H:Ljava/util/concurrent/ExecutorService;

.field private final I:Ljava/lang/Long;

.field private J:Lcom/google/android/gms/internal/play_billing/F;

.field private final a:Ljava/lang/Object;

.field private volatile b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Landroid/os/Handler;

.field private volatile f:Lcom/android/billingclient/api/e0;

.field private g:Landroid/content/Context;

.field private h:Lcom/android/billingclient/api/V;

.field private volatile i:Lcom/google/android/gms/internal/play_billing/f;

.field private volatile j:Lcom/android/billingclient/api/E;

.field private k:Z

.field private l:Z

.field private m:I

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/android/billingclient/api/V;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-direct {p3, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p3, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    new-instance p3, Ljava/util/Random;

    .line 2
    invoke-direct {p3}, Ljava/util/Random;-><init>()V

    invoke-virtual {p3}, Ljava/util/Random;->nextLong()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iput-object p3, p0, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s;->a()Lcom/google/android/gms/internal/play_billing/F;

    move-result-object p4

    iput-object p4, p0, Lcom/android/billingclient/api/b;->J:Lcom/google/android/gms/internal/play_billing/F;

    const-string p4, "8.0.0"

    iput-object p4, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/android/billingclient/api/b;->o0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 5
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/f3;->M()Lcom/google/android/gms/internal/play_billing/d3;

    move-result-object p2

    .line 7
    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/play_billing/d3;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/d3;->y(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    :cond_0
    iget-object p4, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 9
    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/play_billing/d3;->u(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    .line 10
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/d3;->r(J)Lcom/google/android/gms/internal/play_billing/d3;

    iget-boolean p3, p5, Lcom/android/billingclient/api/a$a;->f:Z

    .line 11
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/d3;->v(Z)Lcom/google/android/gms/internal/play_billing/d3;

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/d3;->n(I)Lcom/google/android/gms/internal/play_billing/d3;

    const-wide/32 p3, 0x2e0d0066

    .line 13
    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/d3;->t(J)Lcom/google/android/gms/internal/play_billing/d3;

    :try_start_0
    iget-object p3, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 14
    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    iget-object p4, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 15
    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    .line 16
    invoke-virtual {p3, p4, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 17
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/d3;->p(I)Lcom/google/android/gms/internal/play_billing/d3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 18
    const-string p3, "BillingClient"

    const-string p4, "Error getting app version code."

    .line 19
    invoke-static {p3, p4, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    :goto_0
    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 21
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/f3;

    new-instance p3, Lcom/android/billingclient/api/X;

    .line 22
    invoke-direct {p3, p1, p2}, Lcom/android/billingclient/api/X;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/f3;)V

    iput-object p3, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    iget-boolean p1, p5, Lcom/android/billingclient/api/a$a;->f:Z

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->E:Z

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/g;Landroid/content/Context;LN4/B;Lcom/android/billingclient/api/V;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V
    .locals 7

    .line 24
    const-string p1, "BillingClient"

    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p4, Ljava/lang/Object;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p4, 0x0

    iput p4, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p6

    invoke-direct {p5, p6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p5, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    iput p4, p0, Lcom/android/billingclient/api/b;->m:I

    new-instance p5, Ljava/util/Random;

    .line 25
    invoke-direct {p5}, Ljava/util/Random;-><init>()V

    invoke-virtual {p5}, Ljava/util/Random;->nextLong()J

    move-result-wide p5

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p5

    iput-object p5, p0, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 26
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s;->a()Lcom/google/android/gms/internal/play_billing/F;

    move-result-object p6

    iput-object p6, p0, Lcom/android/billingclient/api/b;->J:Lcom/google/android/gms/internal/play_billing/F;

    const-string p6, "8.0.0"

    iput-object p6, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 27
    invoke-static {}, Lcom/android/billingclient/api/b;->o0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 28
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    iput-object p3, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 29
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/f3;->M()Lcom/google/android/gms/internal/play_billing/d3;

    move-result-object p3

    .line 30
    invoke-virtual {p3, p6}, Lcom/google/android/gms/internal/play_billing/d3;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    if-eqz v0, :cond_0

    .line 31
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/play_billing/d3;->y(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    :cond_0
    iget-object p6, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 32
    invoke-virtual {p6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p3, p6}, Lcom/google/android/gms/internal/play_billing/d3;->u(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    .line 33
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide p5

    invoke-virtual {p3, p5, p6}, Lcom/google/android/gms/internal/play_billing/d3;->r(J)Lcom/google/android/gms/internal/play_billing/d3;

    iget-boolean p5, p7, Lcom/android/billingclient/api/a$a;->f:Z

    .line 34
    invoke-virtual {p3, p5}, Lcom/google/android/gms/internal/play_billing/d3;->v(Z)Lcom/google/android/gms/internal/play_billing/d3;

    sget p5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    invoke-virtual {p3, p5}, Lcom/google/android/gms/internal/play_billing/d3;->n(I)Lcom/google/android/gms/internal/play_billing/d3;

    const-wide/32 p5, 0x2e0d0066

    .line 36
    invoke-virtual {p3, p5, p6}, Lcom/google/android/gms/internal/play_billing/d3;->t(J)Lcom/google/android/gms/internal/play_billing/d3;

    :try_start_0
    iget-object p5, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 37
    invoke-virtual {p5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p5

    iget-object p6, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 38
    invoke-virtual {p6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p6

    .line 39
    invoke-virtual {p5, p6, p4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p4

    iget p4, p4, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 40
    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/play_billing/d3;->p(I)Lcom/google/android/gms/internal/play_billing/d3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p4, v0

    .line 41
    const-string p5, "Error getting app version code."

    .line 42
    invoke-static {p1, p5, p4}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    :goto_0
    iget-object p4, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 44
    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/play_billing/f3;

    new-instance p5, Lcom/android/billingclient/api/X;

    .line 45
    invoke-direct {p5, p4, p3}, Lcom/android/billingclient/api/X;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/f3;)V

    iput-object p5, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    const-string p3, "Billing client should have a valid listener but the provided is null."

    .line 46
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/e0;

    iget-object v1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 47
    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/e0;-><init>(Landroid/content/Context;LN4/m;LN4/B;LN4/s;LN4/p;Lcom/android/billingclient/api/V;)V

    iput-object v0, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    iput-object p2, p0, Lcom/android/billingclient/api/b;->D:Lcom/android/billingclient/api/g;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    iget-boolean p1, p7, Lcom/android/billingclient/api/a$a;->f:Z

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->E:Z

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/g;Landroid/content/Context;LN4/m;LN4/s;Lcom/android/billingclient/api/V;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V
    .locals 8

    .line 49
    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p6

    invoke-direct {p5, p6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p5, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    new-instance p1, Ljava/util/Random;

    .line 50
    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide p5

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 51
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s;->a()Lcom/google/android/gms/internal/play_billing/F;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->J:Lcom/google/android/gms/internal/play_billing/F;

    const-string v5, "8.0.0"

    iput-object v5, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 52
    invoke-static {}, Lcom/android/billingclient/api/b;->o0()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v3, p2

    move-object v1, p3

    move-object v2, p4

    move-object/from16 v7, p8

    .line 53
    invoke-direct/range {v0 .. v7}, Lcom/android/billingclient/api/b;->m(Landroid/content/Context;LN4/m;Lcom/android/billingclient/api/g;LN4/s;Ljava/lang/String;Lcom/android/billingclient/api/V;Lcom/android/billingclient/api/a$a;)V

    return-void
.end method

.method static bridge synthetic A(Lcom/android/billingclient/api/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/billingclient/api/b;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic A0(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/b;->e0(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final B(LN4/f;LN4/g;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, LN4/f;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    :try_start_0
    const-string p1, "BillingClient"

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "Consuming purchase with token: "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter p1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 30
    :try_start_1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 31
    .line 32
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    :try_start_2
    sget-object v4, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 36
    .line 37
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 38
    .line 39
    const-string v6, "Service has been reset to null."
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    move-object v1, p0

    .line 43
    move-object v2, p2

    .line 44
    :try_start_3
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->D(LN4/g;Ljava/lang/String;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    :goto_0
    move-object p1, v0

    .line 50
    move-object v7, p1

    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :catch_1
    move-exception v0

    .line 54
    :goto_1
    move-object p1, v0

    .line 55
    move-object v7, p1

    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :catch_2
    move-exception v0

    .line 59
    move-object v1, p0

    .line 60
    :goto_2
    move-object v2, p2

    .line 61
    goto :goto_0

    .line 62
    :catch_3
    move-exception v0

    .line 63
    move-object v1, p0

    .line 64
    :goto_3
    move-object v2, p2

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    move-object v1, p0

    .line 67
    move-object v2, p2

    .line 68
    iget-boolean p1, v1, Lcom/android/billingclient/api/b;->p:Z

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p1, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-boolean p2, v1, Lcom/android/billingclient/api/b;->p:Z

    .line 79
    .line 80
    iget-object v4, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v5, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v6, v1, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    new-instance v8, Landroid/os/Bundle;

    .line 91
    .line 92
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 93
    .line 94
    .line 95
    if-eqz p2, :cond_1

    .line 96
    .line 97
    invoke-static {v8, v4, v5, v6, v7}, Lcom/google/android/gms/internal/play_billing/V;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 98
    .line 99
    .line 100
    :cond_1
    const/16 p2, 0x9

    .line 101
    .line 102
    invoke-interface {v0, p2, p1, v3, v8}, Lcom/google/android/gms/internal/play_billing/f;->Q1(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string p2, "RESPONSE_CODE"

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    const-string v0, "BillingClient"

    .line 113
    .line 114
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/V;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    goto :goto_4

    .line 119
    :cond_2
    iget-object p1, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    const/4 p2, 0x3

    .line 126
    invoke-interface {v0, p2, p1, v3}, Lcom/google/android/gms/internal/play_billing/f;->R(ILjava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    const-string p1, ""

    .line 131
    .line 132
    :goto_4
    invoke-static {p2, p1}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-nez p2, :cond_3

    .line 137
    .line 138
    const-string p1, "BillingClient"

    .line 139
    .line 140
    const-string p2, "Successfully consumed purchase."

    .line 141
    .line 142
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v2, v4, v3}, LN4/g;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_3
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->x:Lcom/google/android/gms/internal/play_billing/R2;

    .line 150
    .line 151
    new-instance p1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v0, "Error consuming purchase with token. Response code: "

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    const/4 v7, 0x0

    .line 169
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->D(LN4/g;Ljava/lang/String;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catch Landroid/os/DeadObjectException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :catchall_0
    move-exception v0

    .line 174
    move-object v2, p2

    .line 175
    :goto_5
    move-object p2, v0

    .line 176
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 177
    :try_start_5
    throw p2
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 178
    :catchall_1
    move-exception v0

    .line 179
    goto :goto_5

    .line 180
    :catch_4
    move-exception v0

    .line 181
    goto :goto_2

    .line 182
    :catch_5
    move-exception v0

    .line 183
    goto :goto_3

    .line 184
    :goto_6
    sget-object v4, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 185
    .line 186
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->D:Lcom/google/android/gms/internal/play_billing/R2;

    .line 187
    .line 188
    const-string v6, "Error consuming purchase!"

    .line 189
    .line 190
    move-object v1, p0

    .line 191
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->D(LN4/g;Ljava/lang/String;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :goto_7
    sget-object v4, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 196
    .line 197
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->D:Lcom/google/android/gms/internal/play_billing/R2;

    .line 198
    .line 199
    const-string v6, "Error consuming purchase!"

    .line 200
    .line 201
    move-object v1, p0

    .line 202
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->D(LN4/g;Ljava/lang/String;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public static synthetic B0(Lcom/android/billingclient/api/b;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/android/billingclient/api/b;->d0(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final C(LN4/b;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "Error in acknowledge purchase!"

    .line 4
    .line 5
    invoke-static {v0, v1, p4}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-static {p4}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-direct {p0, p3, v0, p2, p4}, Lcom/android/billingclient/api/b;->v0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p2}, LN4/b;->a(Lcom/android/billingclient/api/e;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method static bridge synthetic C0(Lcom/android/billingclient/api/b;)Landroid/os/Handler;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->f0()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final D(LN4/g;Ljava/lang/String;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p5, p6}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p5, 0x4

    .line 7
    invoke-static {p6}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p6

    .line 11
    invoke-direct {p0, p4, p5, p3, p6}, Lcom/android/billingclient/api/b;->v0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, p3, p2}, LN4/g;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final E(LN4/e;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "getBillingConfig got an exception."

    .line 4
    .line 5
    invoke-static {v0, v1, p4}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    invoke-static {p4}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    invoke-direct {p0, p3, v0, p2, p4}, Lcom/android/billingclient/api/b;->v0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-interface {p1, p2, p3}, LN4/e;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static bridge synthetic E0(Lcom/android/billingclient/api/b;)LN4/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->G:LN4/d;

    .line 2
    .line 3
    return-object p0
.end method

.method private final F(ILcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "showInAppMessages error."

    .line 4
    .line 5
    invoke-static {v0, v1, p3}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 9
    .line 10
    invoke-static {p3}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/T2;->H()Lcom/google/android/gms/internal/play_billing/P2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/P2;->s(I)Lcom/google/android/gms/internal/play_billing/P2;

    .line 19
    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/play_billing/P2;->r(Lcom/google/android/gms/internal/play_billing/R2;)Lcom/google/android/gms/internal/play_billing/P2;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    if-eqz p3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/play_billing/P2;->n(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/P2;

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/J2;->K()Lcom/google/android/gms/internal/play_billing/H2;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/play_billing/H2;->p(Lcom/google/android/gms/internal/play_billing/P2;)Lcom/google/android/gms/internal/play_billing/H2;

    .line 39
    .line 40
    .line 41
    const/16 p2, 0x1e

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/H2;->t(I)Lcom/google/android/gms/internal/play_billing/H2;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/google/android/gms/internal/play_billing/J2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :goto_1
    const-string p2, "BillingLogger"

    .line 54
    .line 55
    const-string p3, "Unable to create logging payload"

    .line 56
    .line 57
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    :goto_2
    invoke-interface {v0, p1}, Lcom/android/billingclient/api/V;->b(Lcom/google/android/gms/internal/play_billing/J2;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method static bridge synthetic F0(Lcom/android/billingclient/api/b;)Lcom/android/billingclient/api/V;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 2
    .line 3
    return-object p0
.end method

.method private final G(Lcom/google/android/gms/internal/play_billing/J2;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/billingclient/api/b;->m:I

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/V;->k(Lcom/google/android/gms/internal/play_billing/J2;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    const-string v0, "BillingClient"

    .line 11
    .line 12
    const-string v1, "Unable to log."

    .line 13
    .line 14
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final H(Lcom/google/android/gms/internal/play_billing/J2;JZ)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 2
    .line 3
    iget v2, p0, Lcom/android/billingclient/api/b;->m:I

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    move-wide v3, p2

    .line 7
    move v5, p4

    .line 8
    invoke-interface/range {v0 .. v5}, Lcom/android/billingclient/api/V;->a(Lcom/google/android/gms/internal/play_billing/J2;IJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    move-object p1, v0

    .line 14
    const-string p2, "BillingClient"

    .line 15
    .line 16
    const-string p3, "Unable to log."

    .line 17
    .line 18
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static bridge synthetic H0(Lcom/android/billingclient/api/b;)Lcom/android/billingclient/api/e;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->i0()Lcom/android/billingclient/api/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final I(Lcom/google/android/gms/internal/play_billing/O2;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/billingclient/api/b;->m:I

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/V;->f(Lcom/google/android/gms/internal/play_billing/O2;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    const-string v0, "BillingClient"

    .line 11
    .line 12
    const-string v1, "Unable to log."

    .line 13
    .line 14
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method static bridge synthetic I0(Ljava/lang/Exception;)Lcom/android/billingclient/api/e;
    .locals 0

    .line 1
    instance-of p0, p0, Landroid/os/DeadObjectException;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object p0, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 9
    .line 10
    return-object p0
.end method

.method private final J(Lcom/google/android/gms/internal/play_billing/R2;Lcom/android/billingclient/api/e;I)V
    .locals 3

    .line 1
    :try_start_0
    sget v0, Lcom/android/billingclient/api/U;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p1, v1, p2, v2, v0}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/J1;->p()Lcom/google/android/gms/internal/play_billing/H1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/google/android/gms/internal/play_billing/H2;

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/J3;->G()Lcom/google/android/gms/internal/play_billing/H3;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-lez p3, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/H3;->n(Z)Lcom/google/android/gms/internal/play_billing/H3;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/H3;->p(I)Lcom/google/android/gms/internal/play_billing/H3;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/H2;->s(Lcom/google/android/gms/internal/play_billing/H3;)Lcom/google/android/gms/internal/play_billing/H2;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/google/android/gms/internal/play_billing/J2;

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->G(Lcom/google/android/gms/internal/play_billing/J2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    const-string p2, "BillingClient"

    .line 47
    .line 48
    const-string p3, "Unable to log."

    .line 49
    .line 50
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private final K(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v1, "BillingClient"

    .line 14
    .line 15
    iget v2, p0, Lcom/android/billingclient/api/b;->b:I

    .line 16
    .line 17
    invoke-static {v2}, Lcom/android/billingclient/api/b;->R(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {p1}, Lcom/android/billingclient/api/b;->R(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v5, "Setting clientState from "

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v2, " to "

    .line 39
    .line 40
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p1
.end method

.method static bridge synthetic K0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 2
    .line 3
    return-object p0
.end method

.method private final declared-synchronized L()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->H:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/android/billingclient/api/b;->H:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
.end method

.method static bridge synthetic L0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->J:Lcom/google/android/gms/internal/play_billing/F;

    .line 2
    .line 3
    return-object p0
.end method

.method private final M(LN4/d;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->Q()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p2}, Lcom/android/billingclient/api/b;->h0(I)Lcom/android/billingclient/api/e;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    monitor-exit v0

    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    const-string v1, "BillingClient"

    .line 26
    .line 27
    const-string v2, "Client is already in the process of connecting to billing service."

    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->Z:Lcom/google/android/gms/internal/play_billing/R2;

    .line 33
    .line 34
    sget-object v2, Lcom/android/billingclient/api/W;->d:Lcom/android/billingclient/api/e;

    .line 35
    .line 36
    invoke-direct {p0, v1, v2, p2}, Lcom/android/billingclient/api/b;->J(Lcom/google/android/gms/internal/play_billing/R2;Lcom/android/billingclient/api/e;I)V

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    :goto_0
    move-object p2, v2

    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_1
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    if-ne v1, v3, :cond_2

    .line 47
    .line 48
    const-string v1, "BillingClient"

    .line 49
    .line 50
    const-string v2, "Client was already closed and can\'t be reused. Please create another instance."

    .line 51
    .line 52
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->l0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 56
    .line 57
    sget-object v2, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 58
    .line 59
    invoke-direct {p0, v1, v2, p2}, Lcom/android/billingclient/api/b;->J(Lcom/google/android/gms/internal/play_billing/R2;Lcom/android/billingclient/api/e;I)V

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-direct {p0, v2}, Lcom/android/billingclient/api/b;->K(I)V

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    if-nez p2, :cond_3

    .line 69
    .line 70
    iput-object p1, p0, Lcom/android/billingclient/api/b;->G:LN4/d;

    .line 71
    .line 72
    move p2, v1

    .line 73
    :cond_3
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->N()V

    .line 74
    .line 75
    .line 76
    const-string v3, "BillingClient"

    .line 77
    .line 78
    const-string v4, "Starting in-app billing setup."

    .line 79
    .line 80
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lcom/android/billingclient/api/E;

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-direct {v3, p0, p1, p2, v4}, Lcom/android/billingclient/api/E;-><init>(Lcom/android/billingclient/api/b;LN4/d;ILN4/t;)V

    .line 87
    .line 88
    .line 89
    iput-object v3, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 90
    .line 91
    iget-object v3, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 92
    .line 93
    invoke-virtual {v3}, Lcom/android/billingclient/api/E;->c()V

    .line 94
    .line 95
    .line 96
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    new-instance v0, Landroid/content/Intent;

    .line 98
    .line 99
    const-string v3, "com.android.vending.billing.InAppBillingService.BIND"

    .line 100
    .line 101
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string v3, "com.android.vending"

    .line 105
    .line 106
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    if-eqz v3, :cond_a

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-nez v5, :cond_a

    .line 126
    .line 127
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 132
    .line 133
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 134
    .line 135
    if-eqz v3, :cond_9

    .line 136
    .line 137
    iget-object v5, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 140
    .line 141
    const-string v6, "com.android.vending"

    .line 142
    .line 143
    invoke-static {v5, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_8

    .line 148
    .line 149
    if-eqz v3, :cond_8

    .line 150
    .line 151
    new-instance v6, Landroid/content/ComponentName;

    .line 152
    .line 153
    invoke-direct {v6, v5, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    new-instance v3, Landroid/content/Intent;

    .line 157
    .line 158
    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 165
    .line 166
    const-string v5, "playBillingLibraryVersion"

    .line 167
    .line 168
    invoke-virtual {v3, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 172
    .line 173
    monitor-enter v0

    .line 174
    :try_start_1
    iget v5, p0, Lcom/android/billingclient/api/b;->b:I

    .line 175
    .line 176
    const/4 v6, 0x2

    .line 177
    if-ne v5, v6, :cond_4

    .line 178
    .line 179
    invoke-direct {p0, p2}, Lcom/android/billingclient/api/b;->h0(I)Lcom/android/billingclient/api/e;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    monitor-exit v0

    .line 184
    goto/16 :goto_4

    .line 185
    .line 186
    :catchall_1
    move-exception p1

    .line 187
    goto :goto_2

    .line 188
    :cond_4
    iget v5, p0, Lcom/android/billingclient/api/b;->b:I

    .line 189
    .line 190
    if-eq v5, v2, :cond_5

    .line 191
    .line 192
    const-string v1, "BillingClient"

    .line 193
    .line 194
    const-string v2, "Client state no longer CONNECTING, returning service disconnected."

    .line 195
    .line 196
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->A1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 200
    .line 201
    sget-object v2, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 202
    .line 203
    invoke-direct {p0, v1, v2, p2}, Lcom/android/billingclient/api/b;->J(Lcom/google/android/gms/internal/play_billing/R2;Lcom/android/billingclient/api/e;I)V

    .line 204
    .line 205
    .line 206
    monitor-exit v0

    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_5
    iget-object v5, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 210
    .line 211
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 212
    if-lez p2, :cond_6

    .line 213
    .line 214
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 215
    .line 216
    const/16 v6, 0x1d

    .line 217
    .line 218
    if-lt v0, v6, :cond_6

    .line 219
    .line 220
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-static {v0, v3, v2, v6, v5}, LN4/c;->a(Landroid/content/Context;Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    goto :goto_1

    .line 231
    :cond_6
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 232
    .line 233
    invoke-virtual {v0, v3, v5, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    :goto_1
    if-eqz v0, :cond_7

    .line 238
    .line 239
    const-string p2, "BillingClient"

    .line 240
    .line 241
    const-string v0, "Service was bonded successfully."

    .line 242
    .line 243
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    move-object p2, v4

    .line 247
    goto :goto_4

    .line 248
    :cond_7
    const-string v0, "BillingClient"

    .line 249
    .line 250
    const-string v2, "Connection to Billing service is blocked."

    .line 251
    .line 252
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->m0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 253
    .line 254
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 259
    throw p1

    .line 260
    :cond_8
    const-string v0, "BillingClient"

    .line 261
    .line 262
    const-string v2, "The device doesn\'t have valid Play Store."

    .line 263
    .line 264
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->n0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 265
    .line 266
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_9
    const-string v0, "BillingClient"

    .line 271
    .line 272
    const-string v2, "The device doesn\'t have valid Play Store."

    .line 273
    .line 274
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->n0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 275
    .line 276
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_a
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->o0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 281
    .line 282
    :goto_3
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/b;->K(I)V

    .line 283
    .line 284
    .line 285
    const-string v0, "BillingClient"

    .line 286
    .line 287
    const-string v1, "Billing service unavailable on device."

    .line 288
    .line 289
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lcom/android/billingclient/api/W;->b:Lcom/android/billingclient/api/e;

    .line 293
    .line 294
    invoke-direct {p0, v3, v0, p2}, Lcom/android/billingclient/api/b;->J(Lcom/google/android/gms/internal/play_billing/R2;Lcom/android/billingclient/api/e;I)V

    .line 295
    .line 296
    .line 297
    move-object p2, v0

    .line 298
    :goto_4
    if-eqz p2, :cond_b

    .line 299
    .line 300
    invoke-interface {p1, p2}, LN4/d;->onBillingSetupFinished(Lcom/android/billingclient/api/e;)V

    .line 301
    .line 302
    .line 303
    :cond_b
    return-void

    .line 304
    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 305
    throw p1
.end method

.method static bridge synthetic M0(Lcom/android/billingclient/api/b;)Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method private final N()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_1
    iget-object v2, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    .line 15
    .line 16
    :try_start_2
    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :catchall_1
    move-exception v2

    .line 24
    :try_start_3
    const-string v3, "BillingClient"

    .line 25
    .line 26
    const-string v4, "There was an exception while unbinding service!"

    .line 27
    .line 28
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 29
    .line 30
    .line 31
    :try_start_4
    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 32
    .line 33
    iput-object v1, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_2
    move-exception v2

    .line 37
    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 38
    .line 39
    iput-object v1, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 40
    .line 41
    throw v2

    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 45
    throw v1
.end method

.method public static synthetic N0(Lcom/android/billingclient/api/b;ILcom/google/android/gms/internal/play_billing/O3;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/billingclient/api/B;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Lcom/android/billingclient/api/B;-><init>(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/O3;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lcom/android/billingclient/api/b;->M(LN4/d;I)V

    .line 7
    .line 8
    .line 9
    const-string p0, "reconnectIfNeeded"

    .line 10
    .line 11
    return-object p0
.end method

.method private final O(J)Z
    .locals 3

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    :try_start_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v0, 0x1d

    .line 6
    .line 7
    if-ge p2, v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-wide/16 v0, 0xbb8

    .line 13
    .line 14
    :goto_0
    const/4 p2, 0x1

    .line 15
    invoke-direct {p0, p2}, Lcom/android/billingclient/api/b;->j0(I)Lcom/google/android/gms/internal/play_billing/G0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-interface {p2, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Lcom/android/billingclient/api/e;

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->c()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->c()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "Reconnection succeeded with result: "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catch_0
    move-exception p2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->c()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v1, "Reconnection failed with result: "

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :goto_1
    instance-of v0, p2, Ljava/lang/InterruptedException;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 94
    .line 95
    .line 96
    :cond_2
    const-string v0, "Error during reconnection attempt: "

    .line 97
    .line 98
    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->Q()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    return p1
.end method

.method public static synthetic O0(Lcom/android/billingclient/api/b;LN4/g;LN4/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x7530

    .line 2
    .line 3
    invoke-direct {p0, v0, v1}, Lcom/android/billingclient/api/b;->P(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->c:Lcom/google/android/gms/internal/play_billing/R2;

    .line 10
    .line 11
    sget-object v1, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    invoke-direct {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, LN4/f;->a()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p1, v1, p0}, LN4/g;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/android/billingclient/api/b;->B(LN4/f;LN4/g;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method private final P(J)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/android/billingclient/api/b;->J:Lcom/google/android/gms/internal/play_billing/F;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/C;->b(Lcom/google/android/gms/internal/play_billing/F;)Lcom/google/android/gms/internal/play_billing/C;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v0, 0x1

    .line 10
    const-wide/16 v3, 0x7530

    .line 11
    .line 12
    move v5, v0

    .line 13
    move-wide v6, v3

    .line 14
    :goto_0
    const/4 v8, 0x3

    .line 15
    const-string v9, "BillingClient"

    .line 16
    .line 17
    if-gt v5, v8, :cond_5

    .line 18
    .line 19
    const-wide/16 v10, 0x0

    .line 20
    .line 21
    :try_start_0
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    cmp-long v0, v6, v10

    .line 26
    .line 27
    if-gtz v0, :cond_0

    .line 28
    .line 29
    const-string v0, "No time remaining for reconnection attempt."

    .line 30
    .line 31
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1}, Lcom/android/billingclient/api/b;->Q()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    return v0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-direct {v1, v5}, Lcom/android/billingclient/api/b;->j0(I)Lcom/google/android/gms/internal/play_billing/G0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 46
    .line 47
    invoke-interface {v0, v6, v7, v12}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/android/billingclient/api/e;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->c()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->c()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v7, "Reconnection succeeded with result: "

    .line 69
    .line 70
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v1}, Lcom/android/billingclient/api/b;->Q()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    return v0

    .line 88
    :cond_1
    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->c()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    new-instance v6, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v7, "Reconnection failed with result: "

    .line 98
    .line 99
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :goto_1
    instance-of v6, v0, Ljava/lang/InterruptedException;

    .line 114
    .line 115
    if-eqz v6, :cond_2

    .line 116
    .line 117
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    .line 122
    .line 123
    .line 124
    :cond_2
    const-string v6, "Error during reconnection attempt: "

    .line 125
    .line 126
    invoke-static {v9, v6, v0}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 130
    .line 131
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/play_billing/C;->a(Ljava/util/concurrent/TimeUnit;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v6

    .line 135
    sub-long v6, v3, v6

    .line 136
    .line 137
    add-int/lit8 v12, v5, -0x1

    .line 138
    .line 139
    int-to-double v12, v12

    .line 140
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 141
    .line 142
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 143
    .line 144
    .line 145
    move-result-wide v12

    .line 146
    double-to-long v12, v12

    .line 147
    const-wide/16 v14, 0x3e8

    .line 148
    .line 149
    mul-long/2addr v12, v14

    .line 150
    cmp-long v14, v6, v12

    .line 151
    .line 152
    if-gez v14, :cond_3

    .line 153
    .line 154
    const-string v0, "Reconnection failed due to timeout limit reached."

    .line 155
    .line 156
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v1}, Lcom/android/billingclient/api/b;->Q()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    return v0

    .line 164
    :cond_3
    if-ge v5, v8, :cond_4

    .line 165
    .line 166
    cmp-long v8, v12, v10

    .line 167
    .line 168
    if-lez v8, :cond_4

    .line 169
    .line 170
    :try_start_1
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/play_billing/C;->a(Ljava/util/concurrent/TimeUnit;)J

    .line 174
    .line 175
    .line 176
    move-result-wide v6
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 177
    sub-long v6, v3, v6

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :catch_1
    move-exception v0

    .line 181
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 186
    .line 187
    .line 188
    const-string v2, "Error sleeping during reconnection attempt: "

    .line 189
    .line 190
    invoke-static {v9, v2, v0}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_4
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_5
    :goto_4
    const-string v0, "Max retries reached."

    .line 199
    .line 200
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-direct {v1}, Lcom/android/billingclient/api/b;->Q()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    return v0
.end method

.method public static synthetic P0(Lcom/android/billingclient/api/b;LN4/k;Lcom/android/billingclient/api/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x7530

    .line 2
    .line 3
    invoke-direct {p0, v0, v1}, Lcom/android/billingclient/api/b;->P(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x7

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->c:Lcom/google/android/gms/internal/play_billing/R2;

    .line 11
    .line 12
    sget-object v0, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 13
    .line 14
    invoke-direct {p0, p2, v1, v0}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 15
    .line 16
    .line 17
    new-instance p0, Lcom/android/billingclient/api/j;

    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {p0, p2, v1}, Lcom/android/billingclient/api/j;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0, p0}, LN4/k;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/j;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->u:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string p2, "BillingClient"

    .line 39
    .line 40
    const-string v0, "Querying product details is not supported."

    .line 41
    .line 42
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->u:Lcom/google/android/gms/internal/play_billing/R2;

    .line 46
    .line 47
    sget-object v0, Lcom/android/billingclient/api/W;->r:Lcom/android/billingclient/api/e;

    .line 48
    .line 49
    invoke-direct {p0, p2, v1, v0}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Lcom/android/billingclient/api/j;

    .line 53
    .line 54
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-direct {p0, p2, v1}, Lcom/android/billingclient/api/j;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0, p0}, LN4/k;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/j;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {p0, p2}, Lcom/android/billingclient/api/b;->D0(Lcom/android/billingclient/api/i;)Lcom/android/billingclient/api/H;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Lcom/android/billingclient/api/H;->a()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p0}, Lcom/android/billingclient/api/H;->b()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {p2, v0}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    new-instance v0, Lcom/android/billingclient/api/j;

    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/android/billingclient/api/H;->c()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p0}, Lcom/android/billingclient/api/H;->d()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-direct {v0, v1, p0}, Lcom/android/billingclient/api/j;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, p2, v0}, LN4/k;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/j;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    const/4 p0, 0x0

    .line 102
    return-object p0
.end method

.method private final Q()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return v3

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
.end method

.method public static synthetic Q0(Lcom/android/billingclient/api/b;LN4/b;LN4/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/b;->k0(LN4/b;LN4/a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method private static final R(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const-string p0, "CLOSED"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "CONNECTED"

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const-string p0, "CONNECTING"

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const-string p0, "DISCONNECTED"

    .line 19
    .line 20
    return-object p0
.end method

.method public static synthetic R0(Lcom/android/billingclient/api/b;Landroid/os/Bundle;Landroid/app/Activity;Landroid/os/ResultReceiver;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->m0(Landroid/os/Bundle;Landroid/app/Activity;Landroid/os/ResultReceiver;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static bridge synthetic S(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/O2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->I(Lcom/google/android/gms/internal/play_billing/O2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic S0(Lcom/android/billingclient/api/b;LN4/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->l0(LN4/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static bridge synthetic T(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/R2;Lcom/android/billingclient/api/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->J(Lcom/google/android/gms/internal/play_billing/R2;Lcom/android/billingclient/api/e;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic T0(Lcom/android/billingclient/api/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic U(Lcom/android/billingclient/api/b;I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->C:Z

    .line 13
    .line 14
    const/16 v0, 0x18

    .line 15
    .line 16
    if-lt p1, v0, :cond_1

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v0, v1

    .line 21
    :goto_1
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->B:Z

    .line 22
    .line 23
    const/16 v0, 0x17

    .line 24
    .line 25
    if-lt p1, v0, :cond_2

    .line 26
    .line 27
    move v0, v2

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move v0, v1

    .line 30
    :goto_2
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->A:Z

    .line 31
    .line 32
    const/16 v0, 0x16

    .line 33
    .line 34
    if-lt p1, v0, :cond_3

    .line 35
    .line 36
    move v0, v2

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move v0, v1

    .line 39
    :goto_3
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->z:Z

    .line 40
    .line 41
    const/16 v0, 0x15

    .line 42
    .line 43
    if-lt p1, v0, :cond_4

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_4

    .line 47
    :cond_4
    move v0, v1

    .line 48
    :goto_4
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->y:Z

    .line 49
    .line 50
    const/16 v0, 0x14

    .line 51
    .line 52
    if-lt p1, v0, :cond_5

    .line 53
    .line 54
    move v0, v2

    .line 55
    goto :goto_5

    .line 56
    :cond_5
    move v0, v1

    .line 57
    :goto_5
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->x:Z

    .line 58
    .line 59
    const/16 v0, 0x13

    .line 60
    .line 61
    if-lt p1, v0, :cond_6

    .line 62
    .line 63
    move v0, v2

    .line 64
    goto :goto_6

    .line 65
    :cond_6
    move v0, v1

    .line 66
    :goto_6
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->w:Z

    .line 67
    .line 68
    const/16 v0, 0x12

    .line 69
    .line 70
    if-lt p1, v0, :cond_7

    .line 71
    .line 72
    move v0, v2

    .line 73
    goto :goto_7

    .line 74
    :cond_7
    move v0, v1

    .line 75
    :goto_7
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->v:Z

    .line 76
    .line 77
    const/16 v0, 0x11

    .line 78
    .line 79
    if-lt p1, v0, :cond_8

    .line 80
    .line 81
    move v0, v2

    .line 82
    goto :goto_8

    .line 83
    :cond_8
    move v0, v1

    .line 84
    :goto_8
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->u:Z

    .line 85
    .line 86
    const/16 v0, 0x10

    .line 87
    .line 88
    if-lt p1, v0, :cond_9

    .line 89
    .line 90
    move v0, v2

    .line 91
    goto :goto_9

    .line 92
    :cond_9
    move v0, v1

    .line 93
    :goto_9
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->t:Z

    .line 94
    .line 95
    const/16 v0, 0xf

    .line 96
    .line 97
    if-lt p1, v0, :cond_a

    .line 98
    .line 99
    move v0, v2

    .line 100
    goto :goto_a

    .line 101
    :cond_a
    move v0, v1

    .line 102
    :goto_a
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->s:Z

    .line 103
    .line 104
    const/16 v0, 0xe

    .line 105
    .line 106
    if-lt p1, v0, :cond_b

    .line 107
    .line 108
    move v0, v2

    .line 109
    goto :goto_b

    .line 110
    :cond_b
    move v0, v1

    .line 111
    :goto_b
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->r:Z

    .line 112
    .line 113
    const/16 v0, 0xc

    .line 114
    .line 115
    if-lt p1, v0, :cond_c

    .line 116
    .line 117
    move v0, v2

    .line 118
    goto :goto_c

    .line 119
    :cond_c
    move v0, v1

    .line 120
    :goto_c
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->q:Z

    .line 121
    .line 122
    const/16 v0, 0x9

    .line 123
    .line 124
    if-lt p1, v0, :cond_d

    .line 125
    .line 126
    move v0, v2

    .line 127
    goto :goto_d

    .line 128
    :cond_d
    move v0, v1

    .line 129
    :goto_d
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->p:Z

    .line 130
    .line 131
    const/16 v0, 0x8

    .line 132
    .line 133
    if-lt p1, v0, :cond_e

    .line 134
    .line 135
    move v0, v2

    .line 136
    goto :goto_e

    .line 137
    :cond_e
    move v0, v1

    .line 138
    :goto_e
    iput-boolean v0, p0, Lcom/android/billingclient/api/b;->o:Z

    .line 139
    .line 140
    const/4 v0, 0x6

    .line 141
    if-lt p1, v0, :cond_f

    .line 142
    .line 143
    move v1, v2

    .line 144
    :cond_f
    iput-boolean v1, p0, Lcom/android/billingclient/api/b;->n:Z

    .line 145
    .line 146
    return-void
.end method

.method static bridge synthetic U0(Lcom/android/billingclient/api/b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic V(Lcom/android/billingclient/api/b;I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->K(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method static bridge synthetic V0(Lcom/android/billingclient/api/b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic W(Lcom/android/billingclient/api/b;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget v0, p0, Lcom/android/billingclient/api/b;->b:I

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    monitor-exit p1

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/b;->K(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-boolean p0, p0, Lcom/android/billingclient/api/b;->y:Z

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lcom/android/billingclient/api/e0;->g(Z)V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void

    .line 36
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p0

    .line 38
    :cond_3
    const/4 p1, 0x0

    .line 39
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->K(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method static bridge synthetic X(Lcom/android/billingclient/api/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic Z(Lcom/android/billingclient/api/b;J)Z
    .locals 0

    .line 1
    const-wide/16 p1, 0x7530

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/b;->P(J)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method static bridge synthetic a0(Lcom/android/billingclient/api/b;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Lcom/android/billingclient/api/b;->b:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
.end method

.method static bridge synthetic b0(Lcom/android/billingclient/api/b;Ljava/lang/String;ZI)LN4/F;
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    const/16 p3, 0x9

    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->r0(Ljava/lang/String;ZI)LN4/F;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method static bridge synthetic c0(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V
    .locals 0

    .line 1
    const/16 p2, 0x9

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final synthetic d0(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7

    .line 1
    :try_start_0
    iget-object p4, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p4
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 5
    .line 6
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    :try_start_2
    sget-object p1, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 10
    .line 11
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 12
    .line 13
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/V;->d(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;)Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :catch_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto :goto_0

    .line 21
    :catch_1
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object p4, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v5, 0x0

    .line 31
    move v1, p1

    .line 32
    move-object v3, p2

    .line 33
    move-object v4, p3

    .line 34
    move-object v6, p5

    .line 35
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/f;->R0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    :try_start_3
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 44
    :goto_0
    sget-object p2, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 45
    .line 46
    sget-object p3, Lcom/google/android/gms/internal/play_billing/R2;->f:Lcom/google/android/gms/internal/play_billing/R2;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->e(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;)Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :goto_1
    sget-object p2, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 58
    .line 59
    sget-object p3, Lcom/google/android/gms/internal/play_billing/R2;->f:Lcom/google/android/gms/internal/play_billing/R2;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->e(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;)Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method private final synthetic e0(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 8

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    iget-object v2, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 5
    .line 6
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    :try_start_2
    sget-object p1, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 10
    .line 11
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 12
    .line 13
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/V;->d(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;)Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :catch_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto :goto_0

    .line 21
    :catch_1
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v3, 0x3

    .line 32
    move-object v5, p1

    .line 33
    move-object v6, p2

    .line 34
    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/play_billing/f;->p2(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 38
    return-object p1

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object p1, v0

    .line 41
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 42
    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 43
    :goto_0
    sget-object p2, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 44
    .line 45
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->f:Lcom/google/android/gms/internal/play_billing/R2;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/V;->e(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :goto_1
    sget-object p2, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 57
    .line 58
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->f:Lcom/google/android/gms/internal/play_billing/R2;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/V;->e(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;)Landroid/os/Bundle;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method private final f0()Landroid/os/Handler;
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method private final g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x7

    .line 7
    invoke-static {p4}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-direct {p0, p2, p3, p1, p4}, Lcom/android/billingclient/api/b;->v0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lcom/android/billingclient/api/H;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->c()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p4, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, p3, p1, p4, v0}, Lcom/android/billingclient/api/H;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method

.method private final h0(I)Lcom/android/billingclient/api/e;
    .locals 3

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "Service connection is valid. No need to re-initialize."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/O2;->I()Lcom/google/android/gms/internal/play_billing/L2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/L2;->s(I)Lcom/google/android/gms/internal/play_billing/L2;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/J3;->G()Lcom/google/android/gms/internal/play_billing/H3;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/H3;->r(Z)Lcom/google/android/gms/internal/play_billing/H3;

    .line 22
    .line 23
    .line 24
    if-lez p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 28
    :goto_0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/H3;->n(Z)Lcom/google/android/gms/internal/play_billing/H3;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/H3;->p(I)Lcom/google/android/gms/internal/play_billing/H3;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/L2;->r(Lcom/google/android/gms/internal/play_billing/H3;)Lcom/google/android/gms/internal/play_billing/L2;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lcom/google/android/gms/internal/play_billing/O2;

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->I(Lcom/google/android/gms/internal/play_billing/O2;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 47
    .line 48
    return-object p1
.end method

.method private final i0()Lcom/android/billingclient/api/e;
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    filled-new-array {v1, v0}, [I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :goto_0
    const/4 v3, 0x2

    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    :try_start_0
    aget v3, v0, v1

    .line 14
    .line 15
    iget v4, p0, Lcom/android/billingclient/api/b;->b:I

    .line 16
    .line 17
    if-ne v4, v3, :cond_0

    .line 18
    .line 19
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    sget-object v0, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 21
    .line 22
    return-object v0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    sget-object v0, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 30
    .line 31
    return-object v0

    .line 32
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw v0
.end method

.method private final j0(I)Lcom/google/android/gms/internal/play_billing/G0;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->Q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Lcom/android/billingclient/api/f0;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lcom/android/billingclient/api/f0;-><init>(Lcom/android/billingclient/api/b;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/T3;->a(Lcom/google/android/gms/internal/play_billing/Q3;)Lcom/google/android/gms/internal/play_billing/G0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_1
    :goto_0
    const-string p1, "BillingClient"

    .line 23
    .line 24
    const-string v0, "Already connected or not opted into auto reconnection."

    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/B0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/G0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method private final synthetic k0(LN4/b;LN4/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-wide/16 v0, 0x7530

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-direct {p0, v0, v1}, Lcom/android/billingclient/api/b;->P(J)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x3

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->c:Lcom/google/android/gms/internal/play_billing/R2;

    .line 12
    .line 13
    sget-object v0, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 14
    .line 15
    invoke-direct {p0, p2, v1, v0}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, LN4/b;->a(Lcom/android/billingclient/api/e;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p2

    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :catch_1
    move-exception p2

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    invoke-virtual {p2}, LN4/a;->a()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const-string p2, "BillingClient"

    .line 39
    .line 40
    const-string v0, "Please provide a valid purchase token."

    .line 41
    .line 42
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->A:Lcom/google/android/gms/internal/play_billing/R2;

    .line 46
    .line 47
    sget-object v0, Lcom/android/billingclient/api/W;->g:Lcom/android/billingclient/api/e;

    .line 48
    .line 49
    invoke-direct {p0, p2, v1, v0}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v0}, LN4/b;->a(Lcom/android/billingclient/api/e;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->p:Z

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->B:Lcom/google/android/gms/internal/play_billing/R2;

    .line 61
    .line 62
    sget-object v0, Lcom/android/billingclient/api/W;->a:Lcom/android/billingclient/api/e;

    .line 63
    .line 64
    invoke-direct {p0, p2, v1, v0}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v0}, LN4/b;->a(Lcom/android/billingclient/api/e;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 72
    .line 73
    monitor-enter v0
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :try_start_1
    iget-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 75
    .line 76
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    :try_start_2
    sget-object p2, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 80
    .line 81
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 82
    .line 83
    invoke-direct {p0, p1, p2, v0, v2}, Lcom/android/billingclient/api/b;->C(LN4/b;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    return-object v2

    .line 87
    :cond_3
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p2}, LN4/a;->a()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iget-object v3, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v4, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v5, p0, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v5

    .line 107
    sget v7, Lcom/google/android/gms/internal/play_billing/V;->a:I

    .line 108
    .line 109
    new-instance v7, Landroid/os/Bundle;

    .line 110
    .line 111
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-static {v7, v3, v4, v5, v6}, Lcom/google/android/gms/internal/play_billing/V;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 115
    .line 116
    .line 117
    const/16 v3, 0x9

    .line 118
    .line 119
    invoke-interface {v1, v3, v0, p2, v7}, Lcom/google/android/gms/internal/play_billing/f;->A3(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 120
    .line 121
    .line 122
    move-result-object p2
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 123
    const-string v0, "BillingClient"

    .line 124
    .line 125
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/V;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const-string v1, "BillingClient"

    .line 130
    .line 131
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/play_billing/V;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-static {v0, p2}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-interface {p1, p2}, LN4/b;->a(Lcom/android/billingclient/api/e;)V

    .line 140
    .line 141
    .line 142
    return-object v2

    .line 143
    :catchall_0
    move-exception p2

    .line 144
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    :try_start_4
    throw p2
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 146
    :goto_1
    sget-object v0, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 147
    .line 148
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->C:Lcom/google/android/gms/internal/play_billing/R2;

    .line 149
    .line 150
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/android/billingclient/api/b;->C(LN4/b;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 151
    .line 152
    .line 153
    return-object v2

    .line 154
    :goto_2
    sget-object v0, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 155
    .line 156
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->C:Lcom/google/android/gms/internal/play_billing/R2;

    .line 157
    .line 158
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/android/billingclient/api/b;->C(LN4/b;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 159
    .line 160
    .line 161
    return-object v2
.end method

.method private final synthetic l0(LN4/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-wide/16 v0, 0x7530

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-direct {p0, v0, v1}, Lcom/android/billingclient/api/b;->P(J)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0xd

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "BillingClient"

    .line 13
    .line 14
    const-string v3, "Service disconnected."

    .line 15
    .line 16
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->c:Lcom/google/android/gms/internal/play_billing/R2;

    .line 20
    .line 21
    sget-object v3, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 22
    .line 23
    invoke-direct {p0, v0, v1, v3}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v3, v2}, LN4/e;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/c;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto :goto_0

    .line 32
    :catch_1
    move-exception v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->v:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string v0, "BillingClient"

    .line 39
    .line 40
    const-string v3, "Current client doesn\'t support get billing config."

    .line 41
    .line 42
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->G:Lcom/google/android/gms/internal/play_billing/R2;

    .line 46
    .line 47
    sget-object v3, Lcom/android/billingclient/api/W;->y:Lcom/android/billingclient/api/e;

    .line 48
    .line 49
    invoke-direct {p0, v0, v1, v3}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v3, v2}, LN4/e;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/c;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 57
    .line 58
    monitor-enter v0
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :try_start_1
    iget-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 60
    .line 61
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    :try_start_2
    sget-object v0, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 65
    .line 66
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 67
    .line 68
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/android/billingclient/api/b;->E(LN4/e;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v3, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v4, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v5, p0, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    sget v7, Lcom/google/android/gms/internal/play_billing/V;->a:I

    .line 89
    .line 90
    new-instance v7, Landroid/os/Bundle;

    .line 91
    .line 92
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-static {v7, v3, v4, v5, v6}, Lcom/google/android/gms/internal/play_billing/V;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 96
    .line 97
    .line 98
    new-instance v3, Lcom/android/billingclient/api/F;

    .line 99
    .line 100
    iget-object v4, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 101
    .line 102
    iget v5, p0, Lcom/android/billingclient/api/b;->m:I

    .line 103
    .line 104
    invoke-direct {v3, p1, v4, v5, v2}, Lcom/android/billingclient/api/F;-><init>(LN4/e;Lcom/android/billingclient/api/V;ILN4/t;)V

    .line 105
    .line 106
    .line 107
    const/16 v4, 0x12

    .line 108
    .line 109
    invoke-interface {v1, v4, v0, v7, v3}, Lcom/google/android/gms/internal/play_billing/f;->V0(ILjava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/play_billing/c;)V
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_0
    move-exception v1

    .line 114
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    :try_start_4
    throw v1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 116
    :goto_0
    sget-object v1, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 117
    .line 118
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->J0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 119
    .line 120
    invoke-direct {p0, p1, v1, v3, v0}, Lcom/android/billingclient/api/b;->E(LN4/e;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :goto_1
    sget-object v1, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 125
    .line 126
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->J0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 127
    .line 128
    invoke-direct {p0, p1, v1, v3, v0}, Lcom/android/billingclient/api/b;->E(LN4/e;Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    return-object v2
.end method

.method private m(Landroid/content/Context;LN4/m;Lcom/android/billingclient/api/g;LN4/s;Ljava/lang/String;Lcom/android/billingclient/api/V;Lcom/android/billingclient/api/a$a;)V
    .locals 12

    .line 1
    move-object/from16 v1, p6

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    const-string v3, "BillingClient"

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/f3;->M()Lcom/google/android/gms/internal/play_billing/d3;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    move-object/from16 v0, p5

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/d3;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/d3;->y(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/d3;->u(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/d3;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    invoke-virtual {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/d3;->r(J)Lcom/google/android/gms/internal/play_billing/d3;

    .line 45
    .line 46
    .line 47
    iget-boolean v0, v2, Lcom/android/billingclient/api/a$a;->f:Z

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/d3;->v(Z)Lcom/google/android/gms/internal/play_billing/d3;

    .line 50
    .line 51
    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/d3;->n(I)Lcom/google/android/gms/internal/play_billing/d3;

    .line 55
    .line 56
    .line 57
    const-wide/32 v4, 0x2e0d0066

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/d3;->t(J)Lcom/google/android/gms/internal/play_billing/d3;

    .line 61
    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v5, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v0, v5, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/d3;->p(I)Lcom/google/android/gms/internal/play_billing/d3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    const-string v5, "Error getting app version code."

    .line 88
    .line 89
    invoke-static {v3, v5, v0}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    if-eqz v1, :cond_1

    .line 93
    .line 94
    iput-object v1, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Lcom/google/android/gms/internal/play_billing/f3;

    .line 104
    .line 105
    new-instance v1, Lcom/android/billingclient/api/X;

    .line 106
    .line 107
    invoke-direct {v1, v0, p1}, Lcom/android/billingclient/api/X;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/f3;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 111
    .line 112
    :goto_1
    if-nez p2, :cond_2

    .line 113
    .line 114
    const-string p1, "Billing client should have a valid listener but the provided is null."

    .line 115
    .line 116
    invoke-static {v3, p1}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    new-instance v5, Lcom/android/billingclient/api/e0;

    .line 120
    .line 121
    iget-object v6, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    iget-object v11, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 125
    .line 126
    const/4 v8, 0x0

    .line 127
    move-object v7, p2

    .line 128
    move-object/from16 v9, p4

    .line 129
    .line 130
    invoke-direct/range {v5 .. v11}, Lcom/android/billingclient/api/e0;-><init>(Landroid/content/Context;LN4/m;LN4/B;LN4/s;LN4/p;Lcom/android/billingclient/api/V;)V

    .line 131
    .line 132
    .line 133
    iput-object v5, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 134
    .line 135
    iput-object p3, p0, Lcom/android/billingclient/api/b;->D:Lcom/android/billingclient/api/g;

    .line 136
    .line 137
    if-eqz p4, :cond_3

    .line 138
    .line 139
    const/4 v4, 0x1

    .line 140
    :cond_3
    iput-boolean v4, p0, Lcom/android/billingclient/api/b;->F:Z

    .line 141
    .line 142
    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    iget-boolean p1, v2, Lcom/android/billingclient/api/a$a;->f:Z

    .line 148
    .line 149
    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->E:Z

    .line 150
    .line 151
    return-void
.end method

.method private final synthetic m0(Landroid/os/Bundle;Landroid/app/Activity;Landroid/os/ResultReceiver;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    :try_start_1
    iget-object v3, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 7
    .line 8
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    :try_start_2
    sget-object p1, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 12
    .line 13
    invoke-direct {p0, v0, p1, v1}, Lcom/android/billingclient/api/b;->F(ILcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v2, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v4, Lcom/android/billingclient/api/G;

    .line 28
    .line 29
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-direct {v5, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v4, v5, p3, v1}, Lcom/android/billingclient/api/G;-><init>(Ljava/lang/ref/WeakReference;Landroid/os/ResultReceiver;LN4/t;)V

    .line 35
    .line 36
    .line 37
    const/16 p2, 0xc

    .line 38
    .line 39
    invoke-interface {v3, p2, v2, p1, v4}, Lcom/google/android/gms/internal/play_billing/f;->q2(ILjava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/play_billing/h;)V
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 46
    :goto_0
    const/4 p2, 0x6

    .line 47
    sget-object p3, Lcom/google/android/gms/internal/play_billing/R2;->B1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 48
    .line 49
    invoke-direct {p0, p2, p3, p1}, Lcom/android/billingclient/api/b;->F(ILcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :goto_1
    sget-object p2, Lcom/google/android/gms/internal/play_billing/R2;->B1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 54
    .line 55
    invoke-direct {p0, v0, p2, p1}, Lcom/android/billingclient/api/b;->F(ILcom/google/android/gms/internal/play_billing/R2;Ljava/lang/Exception;)V

    .line 56
    .line 57
    .line 58
    :goto_2
    return-object v1
.end method

.method private final n0(Lcom/android/billingclient/api/i;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method static o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p5, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    long-to-double p1, p1

    .line 6
    new-instance p5, LN4/r;

    .line 7
    .line 8
    invoke-direct {p5, p0, p3}, LN4/r;-><init>(Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    const-wide v0, 0x3fee666666666666L    # 0.95

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    mul-double/2addr p1, v0

    .line 17
    double-to-long p1, p1

    .line 18
    invoke-virtual {p4, p5, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string p1, "BillingClient"

    .line 24
    .line 25
    const-string p2, "Async task throws exception!"

    .line 26
    .line 27
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method private static o0()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "com.android.billingclient.ktx.BuildConfig"

    .line 3
    .line 4
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "VERSION_NAME"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object v1

    .line 21
    :catch_0
    return-object v0
.end method

.method public static synthetic p(Lcom/android/billingclient/api/b;LN4/g;LN4/f;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->y:Lcom/google/android/gms/internal/play_billing/R2;

    .line 2
    .line 3
    sget-object v1, Lcom/android/billingclient/api/W;->k:Lcom/android/billingclient/api/e;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, LN4/f;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p1, v1, p0}, LN4/g;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method static bridge synthetic p0(Lcom/android/billingclient/api/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/billingclient/api/b;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic q(Lcom/android/billingclient/api/b;LN4/l;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->y:Lcom/google/android/gms/internal/play_billing/R2;

    .line 2
    .line 3
    sget-object v1, Lcom/android/billingclient/api/W;->k:Lcom/android/billingclient/api/e;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    invoke-direct {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p1, v1, p0}, LN4/l;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final q0(ILcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)LN4/F;
    .locals 1

    .line 1
    const/16 p1, 0x9

    .line 2
    .line 3
    invoke-static {p5}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, p3, p1, p2, v0}, Lcom/android/billingclient/api/b;->v0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "BillingClient"

    .line 11
    .line 12
    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, LN4/F;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p1, p2, p3}, LN4/F;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method

.method public static synthetic r(Lcom/android/billingclient/api/b;LN4/e;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->y:Lcom/google/android/gms/internal/play_billing/R2;

    .line 2
    .line 3
    sget-object v1, Lcom/android/billingclient/api/W;->k:Lcom/android/billingclient/api/e;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    invoke-direct {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    invoke-interface {p1, v1, p0}, LN4/e;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final r0(Ljava/lang/String;ZI)LN4/F;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "Querying owned items, item type: "

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "BillingClient"

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->p:Z

    .line 24
    .line 25
    iget-boolean v3, v1, Lcom/android/billingclient/api/b;->w:Z

    .line 26
    .line 27
    iget-object v4, v1, Lcom/android/billingclient/api/b;->D:Lcom/android/billingclient/api/g;

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/android/billingclient/api/g;->a()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget-object v5, v1, Lcom/android/billingclient/api/b;->D:Lcom/android/billingclient/api/g;

    .line 34
    .line 35
    invoke-virtual {v5}, Lcom/android/billingclient/api/g;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget-object v6, v1, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    new-instance v13, Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v8, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v9, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v13, v8, v9, v6, v7}, Lcom/google/android/gms/internal/play_billing/V;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    const-string v2, "enablePendingPurchases"

    .line 63
    .line 64
    invoke-virtual {v13, v2, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    :cond_0
    const/4 v2, 0x0

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    const-string v3, "enablePendingPurchaseForSubscriptions"

    .line 73
    .line 74
    invoke-virtual {v13, v3, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    :cond_1
    move-object v12, v2

    .line 78
    :cond_2
    :try_start_0
    iget-object v2, v1, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :try_start_1
    iget-object v8, v1, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 82
    .line 83
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    if-nez v8, :cond_3

    .line 85
    .line 86
    :try_start_2
    sget-object v3, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 87
    .line 88
    sget-object v4, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 89
    .line 90
    const-string v5, "Service has been reset to null"

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    const/16 v2, 0x9

    .line 94
    .line 95
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->q0(ILcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)LN4/F;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    move-object v6, v0

    .line 102
    goto/16 :goto_7

    .line 103
    .line 104
    :catch_1
    move-exception v0

    .line 105
    move-object v6, v0

    .line 106
    goto/16 :goto_8

    .line 107
    .line 108
    :cond_3
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->p:Z

    .line 109
    .line 110
    const/16 v3, 0x9

    .line 111
    .line 112
    if-nez v2, :cond_4

    .line 113
    .line 114
    iget-object v2, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const/4 v4, 0x3

    .line 121
    move-object/from16 v11, p1

    .line 122
    .line 123
    invoke-interface {v8, v4, v2, v11, v12}, Lcom/google/android/gms/internal/play_billing/f;->z0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    move-object/from16 v11, p1

    .line 129
    .line 130
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->C:Z

    .line 131
    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    const/16 v2, 0x1a

    .line 135
    .line 136
    :goto_0
    move v9, v2

    .line 137
    goto :goto_1

    .line 138
    :cond_5
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->B:Z

    .line 139
    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    const/16 v2, 0x18

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_6
    iget-boolean v2, v1, Lcom/android/billingclient/api/b;->w:Z

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    const/16 v2, 0x13

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_7
    move v9, v3

    .line 153
    :goto_1
    iget-object v2, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 154
    .line 155
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-interface/range {v8 .. v13}, Lcom/google/android/gms/internal/play_billing/f;->l1(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 160
    .line 161
    .line 162
    move-result-object v2
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 163
    :goto_2
    sget-object v4, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 164
    .line 165
    const-string v5, "getPurchase()"

    .line 166
    .line 167
    const-string v7, "BillingClient"

    .line 168
    .line 169
    if-nez v2, :cond_8

    .line 170
    .line 171
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    const-string v8, "%s got null owned items list"

    .line 176
    .line 177
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->B0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 185
    .line 186
    :goto_3
    move-object v9, v4

    .line 187
    goto/16 :goto_5

    .line 188
    .line 189
    :cond_8
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/V;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/V;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-static {}, Lcom/android/billingclient/api/e;->d()Lcom/android/billingclient/api/e$a;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v10, v8}, Lcom/android/billingclient/api/e$a;->d(I)Lcom/android/billingclient/api/e$a;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10, v9}, Lcom/android/billingclient/api/e$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/e$a;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v10}, Lcom/android/billingclient/api/e$a;->a()Lcom/android/billingclient/api/e;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    if-eqz v8, :cond_9

    .line 212
    .line 213
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    filled-new-array {v5, v8}, [Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    const-string v8, "%s failed. Response code: %s"

    .line 222
    .line 223
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->x:Lcom/google/android/gms/internal/play_billing/R2;

    .line 231
    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :cond_9
    const-string v8, "INAPP_PURCHASE_ITEM_LIST"

    .line 235
    .line 236
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-eqz v8, :cond_e

    .line 241
    .line 242
    const-string v8, "INAPP_PURCHASE_DATA_LIST"

    .line 243
    .line 244
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-eqz v8, :cond_e

    .line 249
    .line 250
    const-string v8, "INAPP_DATA_SIGNATURE_LIST"

    .line 251
    .line 252
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    if-nez v8, :cond_a

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_a
    const-string v8, "INAPP_PURCHASE_ITEM_LIST"

    .line 260
    .line 261
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    const-string v9, "INAPP_PURCHASE_DATA_LIST"

    .line 266
    .line 267
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    const-string v10, "INAPP_DATA_SIGNATURE_LIST"

    .line 272
    .line 273
    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    if-nez v8, :cond_b

    .line 278
    .line 279
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    const-string v8, "Bundle returned from %s contains null SKUs list."

    .line 284
    .line 285
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->D0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_b
    if-nez v9, :cond_c

    .line 296
    .line 297
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    const-string v8, "Bundle returned from %s contains null purchases list."

    .line 302
    .line 303
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->E0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_c
    if-nez v10, :cond_d

    .line 314
    .line 315
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    const-string v8, "Bundle returned from %s contains null signatures list."

    .line 320
    .line 321
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->F0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 329
    .line 330
    goto/16 :goto_3

    .line 331
    .line 332
    :cond_d
    sget-object v9, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 333
    .line 334
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->b:Lcom/google/android/gms/internal/play_billing/R2;

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_e
    :goto_4
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    const-string v8, "Bundle returned from %s doesn\'t contain required fields."

    .line 342
    .line 343
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    sget-object v5, Lcom/google/android/gms/internal/play_billing/R2;->C0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 351
    .line 352
    goto/16 :goto_3

    .line 353
    .line 354
    :goto_5
    sget-object v7, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 355
    .line 356
    if-eq v9, v7, :cond_f

    .line 357
    .line 358
    move-object v4, v5

    .line 359
    const-string v5, "Purchase bundle invalid"

    .line 360
    .line 361
    const/4 v6, 0x0

    .line 362
    const/16 v2, 0x9

    .line 363
    .line 364
    move-object v3, v9

    .line 365
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->q0(ILcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)LN4/F;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0

    .line 370
    :cond_f
    move-object v5, v4

    .line 371
    const-string v1, "INAPP_PURCHASE_ITEM_LIST"

    .line 372
    .line 373
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    const-string v4, "INAPP_PURCHASE_DATA_LIST"

    .line 378
    .line 379
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    const-string v7, "INAPP_DATA_SIGNATURE_LIST"

    .line 384
    .line 385
    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    const/4 v8, 0x0

    .line 390
    move v9, v8

    .line 391
    :goto_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    if-ge v8, v10, :cond_11

    .line 396
    .line 397
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    check-cast v10, Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v11

    .line 407
    check-cast v11, Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v12

    .line 413
    check-cast v12, Ljava/lang/String;

    .line 414
    .line 415
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v12

    .line 419
    const-string v14, "Sku is owned: "

    .line 420
    .line 421
    const-string v15, "BillingClient"

    .line 422
    .line 423
    invoke-virtual {v14, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v12

    .line 427
    invoke-static {v15, v12}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    :try_start_3
    new-instance v12, Lcom/android/billingclient/api/Purchase;

    .line 431
    .line 432
    invoke-direct {v12, v10, v11}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Lcom/android/billingclient/api/Purchase;->f()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v10

    .line 439
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    if-eqz v10, :cond_10

    .line 444
    .line 445
    const-string v9, "BillingClient"

    .line 446
    .line 447
    const-string v10, "BUG: empty/null token!"

    .line 448
    .line 449
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    move v9, v6

    .line 453
    :cond_10
    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    add-int/lit8 v8, v8, 0x1

    .line 457
    .line 458
    goto :goto_6

    .line 459
    :catch_2
    move-exception v0

    .line 460
    move-object v6, v0

    .line 461
    sget-object v3, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 462
    .line 463
    sget-object v4, Lcom/google/android/gms/internal/play_billing/R2;->y0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 464
    .line 465
    const-string v5, "Got an exception trying to decode the purchase!"

    .line 466
    .line 467
    const/16 v2, 0x9

    .line 468
    .line 469
    move-object/from16 v1, p0

    .line 470
    .line 471
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->q0(ILcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)LN4/F;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    return-object v0

    .line 476
    :cond_11
    move-object/from16 v1, p0

    .line 477
    .line 478
    if-eqz v9, :cond_12

    .line 479
    .line 480
    sget-object v4, Lcom/google/android/gms/internal/play_billing/R2;->A:Lcom/google/android/gms/internal/play_billing/R2;

    .line 481
    .line 482
    invoke-direct {v1, v4, v3, v5}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 483
    .line 484
    .line 485
    :cond_12
    const-string v3, "INAPP_CONTINUATION_TOKEN"

    .line 486
    .line 487
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v12

    .line 491
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    const-string v3, "Continuation token: "

    .line 496
    .line 497
    const-string v4, "BillingClient"

    .line 498
    .line 499
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-eqz v2, :cond_2

    .line 511
    .line 512
    new-instance v2, LN4/F;

    .line 513
    .line 514
    sget-object v3, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 515
    .line 516
    invoke-direct {v2, v3, v0}, LN4/F;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 517
    .line 518
    .line 519
    return-object v2

    .line 520
    :catchall_0
    move-exception v0

    .line 521
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 522
    :try_start_5
    throw v0
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 523
    :goto_7
    sget-object v3, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 524
    .line 525
    sget-object v4, Lcom/google/android/gms/internal/play_billing/R2;->z0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 526
    .line 527
    const-string v5, "Got exception trying to get purchases try to reconnect"

    .line 528
    .line 529
    const/16 v2, 0x9

    .line 530
    .line 531
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->q0(ILcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)LN4/F;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    return-object v0

    .line 536
    :goto_8
    sget-object v3, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 537
    .line 538
    sget-object v4, Lcom/google/android/gms/internal/play_billing/R2;->z0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 539
    .line 540
    const-string v5, "Got exception trying to get purchases try to reconnect"

    .line 541
    .line 542
    const/16 v2, 0x9

    .line 543
    .line 544
    move-object/from16 v1, p0

    .line 545
    .line 546
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->q0(ILcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)LN4/F;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    return-object v0
.end method

.method public static synthetic s(Lcom/android/billingclient/api/b;LN4/b;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->y:Lcom/google/android/gms/internal/play_billing/R2;

    .line 2
    .line 3
    sget-object v1, Lcom/android/billingclient/api/W;->k:Lcom/android/billingclient/api/e;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v1}, LN4/b;->a(Lcom/android/billingclient/api/e;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "Unable to create logging payload"

    .line 7
    .line 8
    const-string v3, "BillingLogger"

    .line 9
    .line 10
    const/4 v4, 0x5

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget v0, Lcom/android/billingclient/api/U;->a:I

    .line 14
    .line 15
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/J2;->K()Lcom/google/android/gms/internal/play_billing/H2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/T2;->H()Lcom/google/android/gms/internal/play_billing/P2;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->c()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/play_billing/P2;->s(I)Lcom/google/android/gms/internal/play_billing/P2;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v5, p1}, Lcom/google/android/gms/internal/play_billing/P2;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/P2;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, p2}, Lcom/google/android/gms/internal/play_billing/P2;->r(Lcom/google/android/gms/internal/play_billing/R2;)Lcom/google/android/gms/internal/play_billing/P2;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/play_billing/H2;->p(Lcom/google/android/gms/internal/play_billing/P2;)Lcom/google/android/gms/internal/play_billing/H2;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/play_billing/H2;->t(I)Lcom/google/android/gms/internal/play_billing/H2;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/m3;->D()Lcom/google/android/gms/internal/play_billing/j3;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/j3;->n(I)Lcom/google/android/gms/internal/play_billing/j3;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/google/android/gms/internal/play_billing/m3;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/H2;->q(Lcom/google/android/gms/internal/play_billing/m3;)Lcom/google/android/gms/internal/play_billing/H2;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lcom/google/android/gms/internal/play_billing/J2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    invoke-static {v3, v2, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/b;->G(Lcom/google/android/gms/internal/play_billing/J2;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    sget p1, Lcom/android/billingclient/api/U;->a:I

    .line 79
    .line 80
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/O2;->I()Lcom/google/android/gms/internal/play_billing/L2;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/play_billing/L2;->s(I)Lcom/google/android/gms/internal/play_billing/L2;

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/m3;->D()Lcom/google/android/gms/internal/play_billing/j3;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/j3;->n(I)Lcom/google/android/gms/internal/play_billing/j3;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Lcom/google/android/gms/internal/play_billing/m3;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/L2;->p(Lcom/google/android/gms/internal/play_billing/m3;)Lcom/google/android/gms/internal/play_billing/L2;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Lcom/google/android/gms/internal/play_billing/O2;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    .line 109
    move-object v1, p1

    .line 110
    goto :goto_1

    .line 111
    :catch_1
    move-exception p1

    .line 112
    invoke-static {v3, v2, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/b;->I(Lcom/google/android/gms/internal/play_billing/O2;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public static synthetic t(Lcom/android/billingclient/api/b;LN4/k;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->y:Lcom/google/android/gms/internal/play_billing/R2;

    .line 2
    .line 3
    sget-object v1, Lcom/android/billingclient/api/W;->k:Lcom/android/billingclient/api/e;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    invoke-direct {p0, v0, v2, v1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 7
    .line 8
    .line 9
    new-instance p0, Lcom/android/billingclient/api/j;

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {p0, v0, v2}, Lcom/android/billingclient/api/j;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v1, p0}, LN4/k;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/j;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V
    .locals 2

    .line 1
    :try_start_0
    sget v0, Lcom/android/billingclient/api/U;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, p2, p3, v1, v0}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->G(Lcom/google/android/gms/internal/play_billing/J2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    const-string p2, "BillingClient"

    .line 16
    .line 17
    const-string p3, "Unable to log."

    .line 18
    .line 19
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic u(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/billingclient/api/e0;->d()LN4/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/billingclient/api/e0;->d()LN4/m;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-interface {p0, p1, v0}, LN4/m;->onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "BillingClient"

    .line 21
    .line 22
    const-string p1, "No valid listener is set in BroadcastManager"

    .line 23
    .line 24
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final u0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;J)V
    .locals 4

    .line 1
    const-string p2, "Unable to log."

    .line 2
    .line 3
    const-string v0, "BillingClient"

    .line 4
    .line 5
    :try_start_0
    sget v1, Lcom/android/billingclient/api/U;->a:I

    .line 6
    .line 7
    sget-object v1, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, p3, v3, v1}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    iget-object p3, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 16
    .line 17
    iget v1, p0, Lcom/android/billingclient/api/b;->m:I

    .line 18
    .line 19
    invoke-interface {p3, p1, v1, p4, p5}, Lcom/android/billingclient/api/V;->d(Lcom/google/android/gms/internal/play_billing/J2;IJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_2
    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method static bridge synthetic v(Lcom/android/billingclient/api/b;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/billingclient/api/b;->m:I

    .line 2
    .line 3
    return-void
.end method

.method private final v0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    sget v0, Lcom/android/billingclient/api/U;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 4
    .line 5
    invoke-static {p1, p2, p3, p4, v0}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->G(Lcom/google/android/gms/internal/play_billing/J2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    const-string p2, "BillingClient"

    .line 15
    .line 16
    const-string p3, "Unable to log."

    .line 17
    .line 18
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static bridge synthetic w(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 2
    .line 3
    return-void
.end method

.method private final w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V
    .locals 2

    .line 1
    :try_start_0
    sget p2, Lcom/android/billingclient/api/U;->a:I

    .line 2
    .line 3
    sget-object p2, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p1, v0, p3, v1, p2}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/billingclient/api/b;->H(Lcom/google/android/gms/internal/play_billing/J2;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    const-string p2, "BillingClient"

    .line 17
    .line 18
    const-string p3, "Unable to log."

    .line 19
    .line 20
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method static bridge synthetic x(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method private final x0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;JZ)V
    .locals 1

    .line 1
    :try_start_0
    sget p2, Lcom/android/billingclient/api/U;->a:I

    .line 2
    .line 3
    sget-object p2, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-static {p1, v0, p3, p4, p2}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1, p5, p6, p7}, Lcom/android/billingclient/api/b;->H(Lcom/google/android/gms/internal/play_billing/J2;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    const-string p2, "BillingClient"

    .line 16
    .line 17
    const-string p3, "Unable to log."

    .line 18
    .line 19
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method static bridge synthetic y(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method private y0(I)V
    .locals 2

    .line 1
    :try_start_0
    sget v0, Lcom/android/billingclient/api/U;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/android/billingclient/api/U;->c(ILcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/O2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->I(Lcom/google/android/gms/internal/play_billing/O2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    const-string v0, "BillingClient"

    .line 15
    .line 16
    const-string v1, "Unable to log."

    .line 17
    .line 18
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static bridge synthetic z(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/J2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->G(Lcom/google/android/gms/internal/play_billing/J2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic z0(Lcom/android/billingclient/api/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method final D0(Lcom/android/billingclient/api/i;)Lcom/android/billingclient/api/H;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/i;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/i;->b()Lcom/google/android/gms/internal/play_billing/N;

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    if-ge v3, v10, :cond_e

    .line 27
    .line 28
    add-int/lit8 v12, v3, 0x14

    .line 29
    .line 30
    if-le v12, v10, :cond_0

    .line 31
    .line 32
    move v4, v10

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v4, v12

    .line 35
    :goto_1
    new-instance v15, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-interface {v9, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/4 v5, 0x0

    .line 54
    :goto_2
    if-ge v5, v4, :cond_1

    .line 55
    .line 56
    invoke-interface {v15, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Lcom/android/billingclient/api/i$b;

    .line 61
    .line 62
    invoke-virtual {v7}, Lcom/android/billingclient/api/i$b;->b()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    new-instance v7, Landroid/os/Bundle;

    .line 73
    .line 74
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v4, "ITEM_ID_LIST"

    .line 78
    .line 79
    invoke-virtual {v7, v4, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 80
    .line 81
    .line 82
    iget-object v13, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 83
    .line 84
    const-string v3, "playBillingLibraryVersion"

    .line 85
    .line 86
    invoke-virtual {v7, v3, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :try_start_0
    iget-object v3, v1, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v3
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    move-object v4, v3

    .line 93
    :try_start_1
    iget-object v3, v1, Lcom/android/billingclient/api/b;->i:Lcom/google/android/gms/internal/play_billing/f;

    .line 94
    .line 95
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    const/4 v4, 0x0

    .line 97
    if-nez v3, :cond_2

    .line 98
    .line 99
    :try_start_2
    sget-object v0, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 100
    .line 101
    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->C1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 102
    .line 103
    const-string v3, "Service has been reset to null."

    .line 104
    .line 105
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :catch_0
    move-exception v0

    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :catch_1
    move-exception v0

    .line 114
    goto/16 :goto_a

    .line 115
    .line 116
    :cond_2
    iget-boolean v5, v1, Lcom/android/billingclient/api/b;->w:Z

    .line 117
    .line 118
    const/4 v8, 0x1

    .line 119
    if-eqz v5, :cond_3

    .line 120
    .line 121
    iget-object v5, v1, Lcom/android/billingclient/api/b;->D:Lcom/android/billingclient/api/g;

    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/android/billingclient/api/g;->b()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_3

    .line 128
    .line 129
    move/from16 v16, v8

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    const/16 v16, 0x0

    .line 133
    .line 134
    :goto_3
    invoke-direct/range {p0 .. p1}, Lcom/android/billingclient/api/b;->n0(Lcom/android/billingclient/api/i;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    invoke-direct/range {p0 .. p1}, Lcom/android/billingclient/api/b;->n0(Lcom/android/billingclient/api/i;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    invoke-direct/range {p0 .. p1}, Lcom/android/billingclient/api/b;->n0(Lcom/android/billingclient/api/i;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    invoke-direct/range {p0 .. p1}, Lcom/android/billingclient/api/b;->n0(Lcom/android/billingclient/api/i;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    const/16 v20, 0x0

    .line 147
    .line 148
    const/16 v21, 0x1

    .line 149
    .line 150
    const/16 v17, 0x1

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const/16 v19, 0x1

    .line 155
    .line 156
    invoke-static/range {v16 .. v21}, Lcom/google/android/gms/internal/play_billing/a;->a(ZZZZZZ)Lcom/google/android/gms/internal/play_billing/a;

    .line 157
    .line 158
    .line 159
    move-result-object v18

    .line 160
    iget-boolean v5, v1, Lcom/android/billingclient/api/b;->x:Z

    .line 161
    .line 162
    if-eq v8, v5, :cond_4

    .line 163
    .line 164
    const/16 v5, 0x11

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_4
    const/16 v5, 0x14

    .line 168
    .line 169
    :goto_4
    iget-object v8, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 170
    .line 171
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    iget-object v14, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v4, v1, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 180
    .line 181
    .line 182
    move-result-wide v19

    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/16 v17, 0x0

    .line 186
    .line 187
    invoke-static/range {v13 .. v20}, Lcom/google/android/gms/internal/play_billing/V;->f(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/a;J)Landroid/os/Bundle;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    move-object v13, v8

    .line 192
    move-object v8, v4

    .line 193
    move v4, v5

    .line 194
    move-object v5, v13

    .line 195
    const/4 v13, 0x0

    .line 196
    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/play_billing/f;->l3(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 197
    .line 198
    .line 199
    move-result-object v3
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 200
    if-nez v3, :cond_5

    .line 201
    .line 202
    sget-object v0, Lcom/android/billingclient/api/W;->B:Lcom/android/billingclient/api/e;

    .line 203
    .line 204
    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->r0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 205
    .line 206
    const-string v3, "queryProductDetailsAsync got empty product details response."

    .line 207
    .line 208
    invoke-direct {v1, v0, v2, v3, v13}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :cond_5
    const-string v4, "DETAILS_LIST"

    .line 214
    .line 215
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    const/4 v5, 0x6

    .line 220
    if-nez v4, :cond_7

    .line 221
    .line 222
    const-string v0, "BillingClient"

    .line 223
    .line 224
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/V;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    const-string v2, "BillingClient"

    .line 229
    .line 230
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/V;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    if-eqz v0, :cond_6

    .line 235
    .line 236
    invoke-static {v0, v2}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->x:Lcom/google/android/gms/internal/play_billing/R2;

    .line 241
    .line 242
    new-instance v4, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string v5, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    .line 248
    .line 249
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-direct {v1, v2, v3, v0, v13}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    return-object v0

    .line 264
    :cond_6
    invoke-static {v5, v2}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->s0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 269
    .line 270
    const-string v3, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    .line 271
    .line 272
    invoke-direct {v1, v0, v2, v3, v13}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    return-object v0

    .line 277
    :cond_7
    const-string v4, "DETAILS_LIST"

    .line 278
    .line 279
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    if-nez v4, :cond_8

    .line 284
    .line 285
    sget-object v0, Lcom/android/billingclient/api/W;->B:Lcom/android/billingclient/api/e;

    .line 286
    .line 287
    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->t0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 288
    .line 289
    const-string v3, "queryProductDetailsAsync got null response list"

    .line 290
    .line 291
    invoke-direct {v1, v0, v2, v3, v13}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0

    .line 296
    :cond_8
    new-instance v7, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    const/4 v13, 0x0

    .line 306
    :goto_5
    if-ge v13, v8, :cond_9

    .line 307
    .line 308
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v14

    .line 312
    check-cast v14, Ljava/lang/String;

    .line 313
    .line 314
    :try_start_3
    new-instance v11, Lcom/android/billingclient/api/h;

    .line 315
    .line 316
    invoke-direct {v11, v14}, Lcom/android/billingclient/api/h;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 317
    .line 318
    .line 319
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    const-string v5, "Got product details: "

    .line 324
    .line 325
    invoke-virtual {v5, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    const-string v14, "BillingClient"

    .line 330
    .line 331
    invoke-static {v14, v5}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    add-int/lit8 v13, v13, 0x1

    .line 338
    .line 339
    const/4 v5, 0x6

    .line 340
    goto :goto_5

    .line 341
    :catch_2
    move-exception v0

    .line 342
    const-string v2, "Error trying to decode SkuDetails."

    .line 343
    .line 344
    const/4 v3, 0x6

    .line 345
    invoke-static {v3, v2}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->u0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 350
    .line 351
    const-string v4, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    .line 352
    .line 353
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    return-object v0

    .line 358
    :cond_9
    const-string v4, "UNFETCHED_PRODUCT_LIST"

    .line 359
    .line 360
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    new-instance v4, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 367
    .line 368
    .line 369
    :try_start_4
    new-instance v4, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 372
    .line 373
    .line 374
    if-eqz v3, :cond_a

    .line 375
    .line 376
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-eqz v5, :cond_d

    .line 385
    .line 386
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    check-cast v5, Ljava/lang/String;

    .line 391
    .line 392
    new-instance v8, Lcom/android/billingclient/api/k;

    .line 393
    .line 394
    invoke-direct {v8, v5}, Lcom/android/billingclient/api/k;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const-string v5, "BillingClient"

    .line 398
    .line 399
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v11

    .line 403
    const-string v13, "Got unfetchedProduct: "

    .line 404
    .line 405
    invoke-virtual {v13, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    invoke-static {v5, v11}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    goto :goto_6

    .line 416
    :catch_3
    move-exception v0

    .line 417
    goto/16 :goto_8

    .line 418
    .line 419
    :cond_a
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    if-eqz v5, :cond_d

    .line 428
    .line 429
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    check-cast v5, Lcom/android/billingclient/api/i$b;

    .line 434
    .line 435
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    :cond_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    if-eqz v11, :cond_c

    .line 444
    .line 445
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v11

    .line 449
    check-cast v11, Lcom/android/billingclient/api/h;

    .line 450
    .line 451
    invoke-virtual {v5}, Lcom/android/billingclient/api/i$b;->b()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v13

    .line 455
    invoke-virtual {v11}, Lcom/android/billingclient/api/h;->e()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v14

    .line 459
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v13

    .line 463
    if-eqz v13, :cond_b

    .line 464
    .line 465
    invoke-virtual {v5}, Lcom/android/billingclient/api/i$b;->c()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v13

    .line 469
    invoke-virtual {v11}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v11

    .line 473
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v11

    .line 477
    if-eqz v11, :cond_b

    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_c
    new-instance v8, Lorg/json/JSONObject;

    .line 481
    .line 482
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 483
    .line 484
    .line 485
    const-string v11, "productId"

    .line 486
    .line 487
    invoke-virtual {v5}, Lcom/android/billingclient/api/i$b;->b()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v13

    .line 491
    invoke-virtual {v8, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    const-string v11, "type"

    .line 496
    .line 497
    invoke-virtual {v5}, Lcom/android/billingclient/api/i$b;->c()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    invoke-virtual {v8, v11, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    const-string v8, "statusCode"

    .line 506
    .line 507
    const/4 v11, 0x0

    .line 508
    invoke-virtual {v5, v8, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    new-instance v8, Lcom/android/billingclient/api/k;

    .line 513
    .line 514
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    invoke-direct {v8, v5}, Lcom/android/billingclient/api/k;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    .line 522
    .line 523
    .line 524
    goto :goto_7

    .line 525
    :cond_d
    invoke-interface {v0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 526
    .line 527
    .line 528
    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 529
    .line 530
    .line 531
    move v3, v12

    .line 532
    goto/16 :goto_0

    .line 533
    .line 534
    :goto_8
    const-string v2, "Error trying to decode SkuDetails."

    .line 535
    .line 536
    const/4 v3, 0x6

    .line 537
    invoke-static {v3, v2}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->u0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 542
    .line 543
    const-string v4, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: "

    .line 544
    .line 545
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    return-object v0

    .line 550
    :catchall_0
    move-exception v0

    .line 551
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 552
    :try_start_6
    throw v0
    :try_end_6
    .catch Landroid/os/DeadObjectException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 553
    :goto_9
    sget-object v2, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 554
    .line 555
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->q0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 556
    .line 557
    const-string v4, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 558
    .line 559
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    return-object v0

    .line 564
    :goto_a
    sget-object v2, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 565
    .line 566
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->q0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 567
    .line 568
    const-string v4, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 569
    .line 570
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->g0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;Ljava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/H;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    return-object v0

    .line 575
    :cond_e
    const-string v3, ""

    .line 576
    .line 577
    new-instance v4, Lcom/android/billingclient/api/H;

    .line 578
    .line 579
    const/4 v11, 0x0

    .line 580
    invoke-direct {v4, v11, v3, v0, v2}, Lcom/android/billingclient/api/H;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 581
    .line 582
    .line 583
    return-object v4
.end method

.method final G0()Lcom/android/billingclient/api/V;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/b;->h:Lcom/android/billingclient/api/V;

    .line 2
    .line 3
    return-object v0
.end method

.method final J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v1, Lcom/android/billingclient/api/n;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lcom/android/billingclient/api/n;-><init>(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/e;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public final Y(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public a(LN4/a;LN4/b;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/android/billingclient/api/l;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, Lcom/android/billingclient/api/l;-><init>(Lcom/android/billingclient/api/b;LN4/b;LN4/a;)V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lcom/android/billingclient/api/m;

    .line 7
    .line 8
    invoke-direct {v3, p0, p2}, Lcom/android/billingclient/api/m;-><init>(Lcom/android/billingclient/api/b;LN4/b;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->f0()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const-wide/16 v1, 0x7530

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->i0()Lcom/android/billingclient/api/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->z:Lcom/google/android/gms/internal/play_billing/R2;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, p1}, LN4/b;->a(Lcom/android/billingclient/api/e;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public b(LN4/f;LN4/g;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/android/billingclient/api/q;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, Lcom/android/billingclient/api/q;-><init>(Lcom/android/billingclient/api/b;LN4/g;LN4/f;)V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lcom/android/billingclient/api/s;

    .line 7
    .line 8
    invoke-direct {v3, p0, p2, p1}, Lcom/android/billingclient/api/s;-><init>(Lcom/android/billingclient/api/b;LN4/g;LN4/f;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->f0()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const-wide/16 v1, 0x7530

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->i0()Lcom/android/billingclient/api/e;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->z:Lcom/google/android/gms/internal/play_billing/R2;

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    invoke-direct {p0, v1, v2, v0}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, LN4/f;->a()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p2, v0, p1}, LN4/g;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public c()V
    .locals 6

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/b;->y0(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/android/billingclient/api/e0;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    :try_start_1
    const-string v2, "BillingClient"

    .line 21
    .line 22
    const-string v3, "There was an exception while shutting down broadcast manager while ending connection!"

    .line 23
    .line 24
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    :try_start_2
    const-string v1, "BillingClient"

    .line 28
    .line 29
    const-string v2, "Unbinding from service."

    .line 30
    .line 31
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->N()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    const-string v2, "BillingClient"

    .line 40
    .line 41
    const-string v3, "There was an exception while unbinding from the service while ending connection!"

    .line 42
    .line 43
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 44
    .line 45
    .line 46
    :goto_1
    const/4 v1, 0x0

    .line 47
    const/4 v2, 0x3

    .line 48
    :try_start_4
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->L()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 49
    .line 50
    .line 51
    :goto_2
    :try_start_5
    invoke-direct {p0, v2}, Lcom/android/billingclient/api/b;->K(I)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lcom/android/billingclient/api/b;->G:LN4/d;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :catchall_2
    move-exception v1

    .line 58
    goto :goto_4

    .line 59
    :catchall_3
    move-exception v3

    .line 60
    :try_start_6
    const-string v4, "BillingClient"

    .line 61
    .line 62
    const-string v5, "There was an exception while shutting down the executor service while ending connection!"

    .line 63
    .line 64
    invoke-static {v4, v5, v3}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_3
    :try_start_7
    monitor-exit v0

    .line 69
    return-void

    .line 70
    :catchall_4
    move-exception v3

    .line 71
    invoke-direct {p0, v2}, Lcom/android/billingclient/api/b;->K(I)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lcom/android/billingclient/api/b;->G:LN4/d;

    .line 75
    .line 76
    throw v3

    .line 77
    :goto_4
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 78
    throw v1
.end method

.method public d(LN4/h;LN4/e;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/android/billingclient/api/o;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Lcom/android/billingclient/api/o;-><init>(Lcom/android/billingclient/api/b;LN4/e;)V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lcom/android/billingclient/api/p;

    .line 7
    .line 8
    invoke-direct {v3, p0, p2}, Lcom/android/billingclient/api/p;-><init>(Lcom/android/billingclient/api/b;LN4/e;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->f0()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const-wide/16 v1, 0x7530

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->i0()Lcom/android/billingclient/api/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->z:Lcom/google/android/gms/internal/play_billing/R2;

    .line 32
    .line 33
    const/16 v1, 0xd

    .line 34
    .line 35
    invoke-direct {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-interface {p2, p1, v0}, LN4/e;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/c;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/String;)Lcom/android/billingclient/api/e;
    .locals 3

    .line 1
    const-wide/16 v0, 0xbb8

    .line 2
    .line 3
    invoke-direct {p0, v0, v1}, Lcom/android/billingclient/api/b;->O(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x5

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object p1, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 11
    .line 12
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->c:Lcom/google/android/gms/internal/play_billing/R2;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->c()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-direct {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/b;->y0(I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    sget-object v0, Lcom/android/billingclient/api/W;->a:Lcom/android/billingclient/api/e;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sparse-switch v0, :sswitch_data_0

    .line 35
    .line 36
    .line 37
    goto/16 :goto_11

    .line 38
    .line 39
    :sswitch_0
    const-string v0, "subscriptions"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_13

    .line 46
    .line 47
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->k:Z

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object p1, Lcom/android/billingclient/api/W;->l:Lcom/android/billingclient/api/e;

    .line 55
    .line 56
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->j:Lcom/google/android/gms/internal/play_billing/R2;

    .line 57
    .line 58
    const/4 v1, 0x2

    .line 59
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :sswitch_1
    const-string v0, "priceChangeConfirmation"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_13

    .line 70
    .line 71
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->o:Z

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    sget-object p1, Lcom/android/billingclient/api/W;->n:Lcom/android/billingclient/api/e;

    .line 79
    .line 80
    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->X:Lcom/google/android/gms/internal/play_billing/R2;

    .line 81
    .line 82
    const/4 v1, 0x4

    .line 83
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :sswitch_2
    const-string v0, "nnn"

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_13

    .line 94
    .line 95
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->C:Z

    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    sget-object p1, Lcom/android/billingclient/api/W;->w:Lcom/android/billingclient/api/e;

    .line 103
    .line 104
    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->h2:Lcom/google/android/gms/internal/play_billing/R2;

    .line 105
    .line 106
    const/16 v1, 0x15

    .line 107
    .line 108
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :sswitch_3
    const-string v0, "mmm"

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_13

    .line 119
    .line 120
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->B:Z

    .line 121
    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    sget-object p1, Lcom/android/billingclient/api/W;->v:Lcom/android/billingclient/api/e;

    .line 128
    .line 129
    :goto_3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->O1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 130
    .line 131
    const/16 v1, 0x14

    .line 132
    .line 133
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 134
    .line 135
    .line 136
    return-object p1

    .line 137
    :sswitch_4
    const-string v0, "lll"

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_13

    .line 144
    .line 145
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->A:Z

    .line 146
    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_6
    sget-object p1, Lcom/android/billingclient/api/W;->u:Lcom/android/billingclient/api/e;

    .line 153
    .line 154
    :goto_4
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->z1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 155
    .line 156
    const/16 v1, 0x13

    .line 157
    .line 158
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :sswitch_5
    const-string v0, "kkk"

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_13

    .line 169
    .line 170
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->B:Z

    .line 171
    .line 172
    if-eqz p1, :cond_7

    .line 173
    .line 174
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_7
    sget-object p1, Lcom/android/billingclient/api/W;->A:Lcom/android/billingclient/api/e;

    .line 178
    .line 179
    :goto_5
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->Q1:Lcom/google/android/gms/internal/play_billing/R2;

    .line 180
    .line 181
    const/16 v1, 0x12

    .line 182
    .line 183
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 184
    .line 185
    .line 186
    return-object p1

    .line 187
    :sswitch_6
    const-string v0, "jjj"

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_13

    .line 194
    .line 195
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->y:Z

    .line 196
    .line 197
    if-eqz p1, :cond_8

    .line 198
    .line 199
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_8
    sget-object p1, Lcom/android/billingclient/api/W;->D:Lcom/android/billingclient/api/e;

    .line 203
    .line 204
    :goto_6
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->N0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 205
    .line 206
    const/16 v1, 0xe

    .line 207
    .line 208
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 209
    .line 210
    .line 211
    return-object p1

    .line 212
    :sswitch_7
    const-string v0, "iii"

    .line 213
    .line 214
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_13

    .line 219
    .line 220
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->x:Z

    .line 221
    .line 222
    if-eqz p1, :cond_9

    .line 223
    .line 224
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_9
    sget-object p1, Lcom/android/billingclient/api/W;->C:Lcom/android/billingclient/api/e;

    .line 228
    .line 229
    :goto_7
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->H0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 230
    .line 231
    const/16 v1, 0xd

    .line 232
    .line 233
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 234
    .line 235
    .line 236
    return-object p1

    .line 237
    :sswitch_8
    const-string v0, "hhh"

    .line 238
    .line 239
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_13

    .line 244
    .line 245
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->v:Z

    .line 246
    .line 247
    if-eqz p1, :cond_a

    .line 248
    .line 249
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_a
    sget-object p1, Lcom/android/billingclient/api/W;->z:Lcom/android/billingclient/api/e;

    .line 253
    .line 254
    :goto_8
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->H:Lcom/google/android/gms/internal/play_billing/R2;

    .line 255
    .line 256
    const/16 v1, 0xc

    .line 257
    .line 258
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 259
    .line 260
    .line 261
    return-object p1

    .line 262
    :sswitch_9
    const-string v0, "ggg"

    .line 263
    .line 264
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_13

    .line 269
    .line 270
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->v:Z

    .line 271
    .line 272
    if-eqz p1, :cond_b

    .line 273
    .line 274
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_b
    sget-object p1, Lcom/android/billingclient/api/W;->y:Lcom/android/billingclient/api/e;

    .line 278
    .line 279
    :goto_9
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->G:Lcom/google/android/gms/internal/play_billing/R2;

    .line 280
    .line 281
    const/16 v1, 0xb

    .line 282
    .line 283
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 284
    .line 285
    .line 286
    return-object p1

    .line 287
    :sswitch_a
    const-string v0, "fff"

    .line 288
    .line 289
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_13

    .line 294
    .line 295
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->u:Z

    .line 296
    .line 297
    if-eqz p1, :cond_c

    .line 298
    .line 299
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_c
    sget-object p1, Lcom/android/billingclient/api/W;->r:Lcom/android/billingclient/api/e;

    .line 303
    .line 304
    :goto_a
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->u:Lcom/google/android/gms/internal/play_billing/R2;

    .line 305
    .line 306
    const/16 v1, 0xa

    .line 307
    .line 308
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 309
    .line 310
    .line 311
    return-object p1

    .line 312
    :sswitch_b
    const-string v0, "eee"

    .line 313
    .line 314
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_13

    .line 319
    .line 320
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->t:Z

    .line 321
    .line 322
    if-eqz p1, :cond_d

    .line 323
    .line 324
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_d
    sget-object p1, Lcom/android/billingclient/api/W;->p:Lcom/android/billingclient/api/e;

    .line 328
    .line 329
    :goto_b
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->I0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 330
    .line 331
    const/16 v1, 0x9

    .line 332
    .line 333
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 334
    .line 335
    .line 336
    return-object p1

    .line 337
    :sswitch_c
    const-string v0, "ddd"

    .line 338
    .line 339
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_13

    .line 344
    .line 345
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->r:Z

    .line 346
    .line 347
    if-eqz p1, :cond_e

    .line 348
    .line 349
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 350
    .line 351
    goto :goto_c

    .line 352
    :cond_e
    sget-object p1, Lcom/android/billingclient/api/W;->q:Lcom/android/billingclient/api/e;

    .line 353
    .line 354
    :goto_c
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->v:Lcom/google/android/gms/internal/play_billing/R2;

    .line 355
    .line 356
    const/4 v1, 0x7

    .line 357
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 358
    .line 359
    .line 360
    return-object p1

    .line 361
    :sswitch_d
    const-string v0, "ccc"

    .line 362
    .line 363
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_13

    .line 368
    .line 369
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->t:Z

    .line 370
    .line 371
    if-eqz p1, :cond_f

    .line 372
    .line 373
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :cond_f
    sget-object p1, Lcom/android/billingclient/api/W;->p:Lcom/android/billingclient/api/e;

    .line 377
    .line 378
    :goto_d
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->t:Lcom/google/android/gms/internal/play_billing/R2;

    .line 379
    .line 380
    const/16 v1, 0x8

    .line 381
    .line 382
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 383
    .line 384
    .line 385
    return-object p1

    .line 386
    :sswitch_e
    const-string v0, "bbb"

    .line 387
    .line 388
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_13

    .line 393
    .line 394
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->q:Z

    .line 395
    .line 396
    if-eqz p1, :cond_10

    .line 397
    .line 398
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 399
    .line 400
    goto :goto_e

    .line 401
    :cond_10
    sget-object p1, Lcom/android/billingclient/api/W;->s:Lcom/android/billingclient/api/e;

    .line 402
    .line 403
    :goto_e
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->E:Lcom/google/android/gms/internal/play_billing/R2;

    .line 404
    .line 405
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 406
    .line 407
    .line 408
    return-object p1

    .line 409
    :sswitch_f
    const-string v0, "aaa"

    .line 410
    .line 411
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_13

    .line 416
    .line 417
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->s:Z

    .line 418
    .line 419
    if-eqz p1, :cond_11

    .line 420
    .line 421
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 422
    .line 423
    goto :goto_f

    .line 424
    :cond_11
    sget-object p1, Lcom/android/billingclient/api/W;->o:Lcom/android/billingclient/api/e;

    .line 425
    .line 426
    :goto_f
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->F:Lcom/google/android/gms/internal/play_billing/R2;

    .line 427
    .line 428
    const/4 v1, 0x6

    .line 429
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 430
    .line 431
    .line 432
    return-object p1

    .line 433
    :sswitch_10
    const-string v0, "subscriptionsUpdate"

    .line 434
    .line 435
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_13

    .line 440
    .line 441
    iget-boolean p1, p0, Lcom/android/billingclient/api/b;->l:Z

    .line 442
    .line 443
    if-eqz p1, :cond_12

    .line 444
    .line 445
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 446
    .line 447
    goto :goto_10

    .line 448
    :cond_12
    sget-object p1, Lcom/android/billingclient/api/W;->m:Lcom/android/billingclient/api/e;

    .line 449
    .line 450
    :goto_10
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->k:Lcom/google/android/gms/internal/play_billing/R2;

    .line 451
    .line 452
    const/4 v1, 0x3

    .line 453
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 454
    .line 455
    .line 456
    return-object p1

    .line 457
    :cond_13
    :goto_11
    const-string v0, "BillingClient"

    .line 458
    .line 459
    const-string v1, "Unsupported feature: "

    .line 460
    .line 461
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    sget-object p1, Lcom/android/billingclient/api/W;->x:Lcom/android/billingclient/api/e;

    .line 469
    .line 470
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->I:Lcom/google/android/gms/internal/play_billing/R2;

    .line 471
    .line 472
    const/4 v1, 0x1

    .line 473
    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/b;->s0(Lcom/android/billingclient/api/e;Lcom/google/android/gms/internal/play_billing/R2;I)V

    .line 474
    .line 475
    .line 476
    return-object p1

    .line 477
    :sswitch_data_0
    .sparse-switch
        -0x1928a0a1 -> :sswitch_10
        0x17841 -> :sswitch_f
        0x17c22 -> :sswitch_e
        0x18003 -> :sswitch_d
        0x183e4 -> :sswitch_c
        0x187c5 -> :sswitch_b
        0x18ba6 -> :sswitch_a
        0x18f87 -> :sswitch_9
        0x19368 -> :sswitch_8
        0x19749 -> :sswitch_7
        0x19b2a -> :sswitch_6
        0x19f0b -> :sswitch_5
        0x1a2ec -> :sswitch_4
        0x1a6cd -> :sswitch_3
        0x1aaae -> :sswitch_2
        0xc5ff92e -> :sswitch_1
        0x7674caf6 -> :sswitch_0
    .end sparse-switch
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->Q()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public g(Landroid/app/Activity;Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/e;
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    .line 1
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v5

    iget-object v0, v1, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    if-eqz v0, :cond_39

    iget-object v0, v1, Lcom/android/billingclient/api/b;->f:Lcom/android/billingclient/api/e0;

    .line 2
    invoke-virtual {v0}, Lcom/android/billingclient/api/e0;->d()LN4/m;

    move-result-object v0

    if-eqz v0, :cond_39

    const-wide/16 v2, 0xbb8

    .line 3
    invoke-direct {v1, v2, v3}, Lcom/android/billingclient/api/b;->O(J)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->c:Lcom/google/android/gms/internal/play_billing/R2;

    .line 4
    sget-object v4, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->u0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;J)V

    .line 5
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    :cond_0
    iget-object v2, v1, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, v1, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/android/billingclient/api/b;->j:Lcom/android/billingclient/api/E;

    .line 6
    invoke-virtual {v0}, Lcom/android/billingclient/api/E;->d()Z

    move-result v0

    move v8, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1b

    :cond_1
    const/4 v8, 0x0

    .line 7
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->k()Ljava/util/ArrayList;

    move-result-object v0

    .line 9
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->l()Ljava/util/List;

    move-result-object v2

    const/4 v9, 0x0

    .line 10
    invoke-static {v0, v9}, Lcom/google/android/gms/internal/play_billing/T;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 11
    invoke-static {v2, v9}, Lcom/google/android/gms/internal/play_billing/T;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/billingclient/api/d$b;

    .line 12
    invoke-virtual {v4}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/h;->e()Ljava/lang/String;

    move-result-object v10

    .line 13
    invoke-virtual {v4}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    move-result-object v11

    invoke-virtual {v11}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    move-result-object v11

    .line 14
    const-string v12, "subs"

    .line 15
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    iget-boolean v12, v1, Lcom/android/billingclient/api/b;->k:Z

    if-eqz v12, :cond_2

    goto :goto_1

    .line 16
    :cond_2
    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support subscriptions."

    .line 17
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->j:Lcom/google/android/gms/internal/play_billing/R2;

    .line 18
    sget-object v4, Lcom/android/billingclient/api/W;->l:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    move v7, v8

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V

    .line 19
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    .line 20
    :cond_3
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->u()Z

    move-result v12

    if-eqz v12, :cond_5

    iget-boolean v12, v1, Lcom/android/billingclient/api/b;->n:Z

    if-eqz v12, :cond_4

    goto :goto_2

    .line 21
    :cond_4
    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support extra params for buy intent."

    .line 22
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->s:Lcom/google/android/gms/internal/play_billing/R2;

    .line 23
    sget-object v4, Lcom/android/billingclient/api/W;->f:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    move v7, v8

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V

    .line 24
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    .line 25
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x1

    if-le v12, v13, :cond_7

    iget-boolean v12, v1, Lcom/android/billingclient/api/b;->t:Z

    if-eqz v12, :cond_6

    goto :goto_3

    .line 26
    :cond_6
    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support multi-item purchases."

    .line 27
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->t:Lcom/google/android/gms/internal/play_billing/R2;

    .line 28
    sget-object v4, Lcom/android/billingclient/api/W;->p:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    move v7, v8

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V

    .line 29
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    .line 30
    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_8

    iget-boolean v12, v1, Lcom/android/billingclient/api/b;->u:Z

    if-eqz v12, :cond_9

    :cond_8
    move-object v12, v4

    goto :goto_4

    .line 31
    :cond_9
    const-string v0, "BillingClient"

    const-string v2, "Current client doesn\'t support purchases with ProductDetails."

    .line 32
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->u:Lcom/google/android/gms/internal/play_billing/R2;

    .line 33
    sget-object v4, Lcom/android/billingclient/api/W;->r:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    move v7, v8

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V

    .line 34
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    .line 35
    :goto_4
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->e()Lcom/android/billingclient/api/e;

    move-result-object v4

    .line 36
    sget-object v14, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    if-eq v4, v14, :cond_a

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->D1:Lcom/google/android/gms/internal/play_billing/R2;

    const/4 v3, 0x2

    move v7, v8

    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V

    .line 38
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    :cond_a
    iget-boolean v4, v1, Lcom/android/billingclient/api/b;->n:Z

    if-eqz v4, :cond_31

    iget-boolean v4, v1, Lcom/android/billingclient/api/b;->p:Z

    iget-boolean v14, v1, Lcom/android/billingclient/api/b;->w:Z

    iget-object v15, v1, Lcom/android/billingclient/api/b;->D:Lcom/android/billingclient/api/g;

    .line 39
    invoke-virtual {v15}, Lcom/android/billingclient/api/g;->a()Z

    move-result v15

    iget-object v3, v1, Lcom/android/billingclient/api/b;->D:Lcom/android/billingclient/api/g;

    .line 40
    invoke-virtual {v3}, Lcom/android/billingclient/api/g;->b()Z

    move-result v3

    move-object/from16 v17, v9

    iget-boolean v9, v1, Lcom/android/billingclient/api/b;->F:Z

    iget-object v13, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    move/from16 v18, v3

    iget-object v3, v1, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    move/from16 v19, v4

    iget-object v4, v1, Lcom/android/billingclient/api/b;->I:Ljava/lang/Long;

    move/from16 v20, v8

    move/from16 v21, v9

    .line 41
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iget-object v4, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 42
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    sget v4, Lcom/google/android/gms/internal/play_billing/V;->a:I

    new-instance v4, Landroid/os/Bundle;

    .line 44
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 45
    invoke-static {v4, v13, v3, v8, v9}, Lcom/google/android/gms/internal/play_billing/V;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    const-string v3, "billingClientTransactionId"

    .line 46
    invoke-virtual {v4, v3, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 47
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->c()I

    move-result v3

    if-eqz v3, :cond_b

    .line 48
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->c()I

    move-result v3

    const-string v8, "prorationMode"

    .line 49
    invoke-virtual {v4, v8, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 50
    :cond_b
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_c

    .line 51
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->f()Ljava/lang/String;

    move-result-object v3

    const-string v8, "accountId"

    .line 52
    invoke-virtual {v4, v8, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :cond_c
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 54
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->g()Ljava/lang/String;

    move-result-object v3

    const-string v8, "obfuscatedProfileId"

    .line 55
    invoke-virtual {v4, v8, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->t()Z

    move-result v3

    if-eqz v3, :cond_e

    const-string v3, "isOfferPersonalizedByDeveloper"

    const/4 v8, 0x1

    .line 57
    invoke-virtual {v4, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 58
    :cond_e
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_f

    new-instance v3, Ljava/util/ArrayList;

    filled-new-array/range {v17 .. v17}, [Ljava/lang/String;

    move-result-object v8

    .line 59
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v8, "skusToReplace"

    .line 60
    invoke-virtual {v4, v8, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 61
    :cond_f
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->i()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_10

    .line 62
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->i()Ljava/lang/String;

    move-result-object v3

    const-string v8, "oldSkuPurchaseToken"

    .line 63
    invoke-virtual {v4, v8, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :cond_10
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->h()Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_11

    .line 65
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->h()Ljava/lang/String;

    const-string v3, "oldSkuPurchaseId"

    move-object/from16 v8, v17

    .line 66
    invoke-virtual {v4, v3, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_11
    move-object/from16 v8, v17

    .line 67
    :goto_5
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->j()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_12

    .line 68
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->j()Ljava/lang/String;

    move-result-object v3

    const-string v9, "originalExternalTransactionId"

    .line 69
    invoke-virtual {v4, v9, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    :cond_12
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    const-string v3, "paymentsPurchaseParams"

    .line 71
    invoke-virtual {v4, v3, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    if-eqz v19, :cond_14

    if-eqz v15, :cond_14

    const-string v3, "enablePendingPurchases"

    const/4 v8, 0x1

    .line 72
    invoke-virtual {v4, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_6

    :cond_14
    const/4 v8, 0x1

    :goto_6
    if-eqz v14, :cond_15

    if-eqz v18, :cond_15

    const-string v3, "enablePendingPurchaseForSubscriptions"

    .line 73
    invoke-virtual {v4, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_15
    if-eqz v21, :cond_16

    const-string v3, "enableAlternativeBilling"

    .line 74
    invoke-virtual {v4, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 75
    :cond_16
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->d()J

    .line 76
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->b()I

    new-instance v3, Ljava/util/ArrayList;

    .line 77
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 78
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->l()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/android/billingclient/api/d$b;

    goto :goto_7

    .line 79
    :cond_17
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_18

    .line 80
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/S0;->C()Lcom/google/android/gms/internal/play_billing/R0;

    move-result-object v8

    .line 81
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/play_billing/R0;->n(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/play_billing/R0;

    .line 82
    invoke-virtual {v8}, Lcom/google/android/gms/internal/play_billing/H1;->i()Lcom/google/android/gms/internal/play_billing/J1;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/play_billing/S0;

    .line 83
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/a1;->b()[B

    move-result-object v3

    const-string v8, "subscriptionProductReplacementParamsList"

    .line 84
    invoke-virtual {v4, v8, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 85
    :cond_18
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1d

    new-instance v3, Ljava/util/ArrayList;

    .line 86
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    .line 87
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    .line 88
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    .line 89
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    .line 90
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 91
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_1c

    .line 92
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_19

    const-string v8, "skuDetailsTokens"

    .line 93
    invoke-virtual {v4, v8, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 94
    :cond_19
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v9, 0x1

    if-le v3, v9, :cond_1b

    new-instance v3, Ljava/util/ArrayList;

    .line 95
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v8, Ljava/util/ArrayList;

    .line 96
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v13

    add-int/lit8 v13, v13, -0x1

    invoke-direct {v8, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v13

    if-lt v9, v13, :cond_1a

    .line 98
    const-string v0, "additionalSkus"

    .line 99
    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "additionalSkuTypes"

    .line 100
    invoke-virtual {v4, v0, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :goto_8
    move-wide/from16 v18, v5

    goto/16 :goto_b

    .line 101
    :cond_1a
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    const/16 v17, 0x0

    throw v17

    :cond_1b
    const/16 v17, 0x0

    goto :goto_8

    :cond_1c
    const/16 v17, 0x0

    .line 102
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 103
    throw v17

    :cond_1d
    const/4 v9, 0x1

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Ljava/util/ArrayList;

    .line 106
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v8, Ljava/util/ArrayList;

    .line 107
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    .line 108
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    .line 109
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    .line 110
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    move-wide/from16 v18, v5

    const/4 v9, 0x0

    .line 111
    :goto_9
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v9, v5, :cond_23

    .line 112
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/d$b;

    .line 113
    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    move-result-object v6

    .line 114
    invoke-virtual {v6}, Lcom/android/billingclient/api/h;->j()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->isEmpty()Z

    move-result v21

    if-nez v21, :cond_1e

    move-object/from16 v21, v5

    .line 115
    invoke-virtual {v6}, Lcom/android/billingclient/api/h;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_1e
    move-object/from16 v21, v5

    .line 116
    :goto_a
    invoke-virtual/range {v21 .. v21}, Lcom/android/billingclient/api/d$b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    invoke-virtual {v6}, Lcom/android/billingclient/api/h;->k()Ljava/lang/String;

    move-result-object v5

    .line 118
    invoke-virtual {v6}, Lcom/android/billingclient/api/h;->l()Ljava/util/List;

    move-result-object v21

    if-eqz v21, :cond_20

    .line 119
    invoke-virtual {v6}, Lcom/android/billingclient/api/h;->l()Ljava/util/List;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/List;->isEmpty()Z

    move-result v21

    if-nez v21, :cond_20

    .line 120
    invoke-virtual {v6}, Lcom/android/billingclient/api/h;->l()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_20

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/android/billingclient/api/h$b;

    .line 121
    invoke-virtual/range {v21 .. v21}, Lcom/android/billingclient/api/h$b;->f()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v22

    if-nez v22, :cond_1f

    .line 122
    invoke-virtual/range {v21 .. v21}, Lcom/android/billingclient/api/h$b;->f()Ljava/lang/String;

    move-result-object v5

    .line 123
    :cond_20
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_21

    .line 124
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    if-lez v9, :cond_22

    .line 125
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    move-result-object v5

    invoke-virtual {v5}, Lcom/android/billingclient/api/h;->e()Ljava/lang/String;

    move-result-object v5

    .line 126
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    move-result-object v5

    invoke-virtual {v5}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    move-result-object v5

    .line 128
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_9

    :cond_23
    const-string v5, "SKU_OFFER_ID_TOKEN_LIST"

    .line 129
    invoke-virtual {v4, v5, v13}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 130
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_24

    const-string v5, "autoPayBalanceThresholdList"

    .line 131
    invoke-virtual {v4, v5, v15}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 132
    :cond_24
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_25

    const-string v5, "skuDetailsTokens"

    .line 133
    invoke-virtual {v4, v5, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 134
    :cond_25
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_26

    const-string v5, "SKU_SERIALIZED_DOCID_LIST"

    .line 135
    invoke-virtual {v4, v5, v14}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 136
    :cond_26
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_27

    const-string v5, "additionalSkus"

    .line 137
    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "additionalSkuTypes"

    .line 138
    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 139
    :cond_27
    :goto_b
    const-string v0, "SKU_OFFER_ID_TOKEN_LIST"

    .line 140
    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->r:Z

    if-eqz v0, :cond_29

    :cond_28
    move/from16 v8, v20

    goto :goto_c

    .line 141
    :cond_29
    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->v:Lcom/google/android/gms/internal/play_billing/R2;

    sget-object v4, Lcom/android/billingclient/api/W;->q:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    move-wide/from16 v5, v18

    move/from16 v7, v20

    .line 142
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V

    .line 143
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    :goto_c
    if-eqz v12, :cond_2a

    .line 144
    invoke-virtual {v12}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    move-result-object v0

    .line 145
    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2a

    invoke-virtual {v12}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    move-result-object v0

    .line 146
    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->i()Ljava/lang/String;

    move-result-object v0

    const-string v3, "skuPackageName"

    .line 147
    invoke-virtual {v4, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v13, 0x1

    goto :goto_d

    :cond_2a
    const/4 v9, 0x0

    const/4 v13, 0x0

    .line 148
    :goto_d
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2b

    const-string v0, "accountName"

    .line 149
    invoke-virtual {v4, v0, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :cond_2b
    invoke-virtual {v7}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_2c

    const-string v0, "BillingClient"

    const-string v3, "Activity\'s intent is null."

    .line 151
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    .line 152
    :cond_2c
    const-string v3, "PROXY_PACKAGE"

    .line 153
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2d

    const-string v3, "PROXY_PACKAGE"

    .line 154
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "proxyPackage"

    .line 155
    invoke-virtual {v4, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    iget-object v3, v1, Lcom/android/billingclient/api/b;->g:Landroid/content/Context;

    .line 156
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v5, 0x0

    .line 157
    invoke-virtual {v3, v0, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-string v3, "proxyPackageVersion"

    .line 158
    invoke-virtual {v4, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_e

    .line 159
    :catch_0
    const-string v0, "proxyPackageVersion"

    const-string v3, "package not found"

    .line 160
    invoke-virtual {v4, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    :cond_2d
    :goto_e
    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->u:Z

    if-eqz v0, :cond_2e

    .line 162
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2e

    const/16 v0, 0x11

    :goto_f
    move v2, v0

    goto :goto_10

    .line 163
    :cond_2e
    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->s:Z

    if-eqz v0, :cond_2f

    if-eqz v13, :cond_2f

    const/16 v0, 0xf

    goto :goto_f

    :cond_2f
    iget-boolean v0, v1, Lcom/android/billingclient/api/b;->p:Z

    if-eqz v0, :cond_30

    const/16 v0, 0x9

    goto :goto_f

    :cond_30
    const/4 v0, 0x6

    goto :goto_f

    .line 164
    :goto_10
    new-instance v0, Lcom/android/billingclient/api/g0;

    move-object/from16 v5, p2

    move-object v6, v4

    move-object v3, v10

    move-object v4, v11

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/g0;-><init>(Lcom/android/billingclient/api/b;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)V

    iget-object v2, v1, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    .line 165
    invoke-virtual {v1}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v17

    const-wide/16 v13, 0x1388

    const/4 v15, 0x0

    move-object v12, v0

    move-object/from16 v16, v2

    .line 166
    invoke-static/range {v12 .. v17}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    goto :goto_11

    :cond_31
    move-wide/from16 v18, v5

    move-object v3, v10

    move-object v4, v11

    .line 167
    new-instance v10, Lcom/android/billingclient/api/h0;

    invoke-direct {v10, v1, v3, v4}, Lcom/android/billingclient/api/h0;-><init>(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v14, v1, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    .line 168
    invoke-virtual {v1}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v15

    const-wide/16 v11, 0x1388

    const/4 v13, 0x0

    .line 169
    invoke-static/range {v10 .. v15}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    :goto_11
    if-nez v0, :cond_32

    .line 170
    :try_start_2
    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->z:Lcom/google/android/gms/internal/play_billing/R2;

    sget-object v4, Lcom/android/billingclient/api/W;->c:Lcom/android/billingclient/api/e;
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    const/4 v3, 0x2

    move v7, v8

    move-wide/from16 v5, v18

    .line 171
    :try_start_3
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/b;->w0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;JZ)V
    :try_end_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 172
    :try_start_4
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    :catch_1
    move-exception v0

    goto/16 :goto_19

    :catch_2
    move-exception v0

    goto/16 :goto_1a

    :catch_3
    move-exception v0

    goto/16 :goto_1a

    :catch_4
    move-exception v0

    move v8, v7

    goto/16 :goto_19

    :catch_5
    move-exception v0

    :goto_12
    move v8, v7

    goto/16 :goto_1a

    :catch_6
    move-exception v0

    goto :goto_12

    :catch_7
    move-exception v0

    move-wide/from16 v5, v18

    goto/16 :goto_19

    :catch_8
    move-exception v0

    :goto_13
    move-wide/from16 v5, v18

    goto/16 :goto_1a

    :catch_9
    move-exception v0

    goto :goto_13

    :cond_32
    move-wide/from16 v5, v18

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1388

    .line 173
    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Bundle;

    const-string v0, "BillingClient"

    .line 174
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/V;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v0

    const-string v3, "BillingClient"

    .line 175
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/V;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_38

    const-string v4, "BillingClient"

    new-instance v7, Ljava/lang/StringBuilder;

    .line 176
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Unable to buy item, Error response code: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-static {v0, v3}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    move-result-object v4

    const-string v3, "BillingClient"
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    if-nez v2, :cond_33

    :try_start_5
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->b:Lcom/google/android/gms/internal/play_billing/R2;

    goto :goto_15

    :catchall_1
    move-exception v0

    goto :goto_14

    .line 178
    :cond_33
    const-string v0, "LOG_REASON"

    .line 179
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_34

    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->b:Lcom/google/android/gms/internal/play_billing/R2;

    goto :goto_15

    .line 180
    :cond_34
    instance-of v7, v0, Ljava/lang/Integer;

    if-eqz v7, :cond_35

    .line 181
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/R2;->a(I)Lcom/google/android/gms/internal/play_billing/R2;

    move-result-object v0

    goto :goto_15

    :cond_35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 182
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Unexpected type for bundle log reason: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->b:Lcom/google/android/gms/internal/play_billing/R2;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_15

    .line 183
    :goto_14
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v7, "Failed to get log reason from bundle: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->b:Lcom/google/android/gms/internal/play_billing/R2;

    .line 184
    :goto_15
    sget-object v3, Lcom/google/android/gms/internal/play_billing/R2;->b:Lcom/google/android/gms/internal/play_billing/R2;

    if-ne v0, v3, :cond_36

    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->x:Lcom/google/android/gms/internal/play_billing/R2;

    :cond_36
    move-object v3, v0

    const-string v7, "BillingClient"
    :try_end_6
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    if-nez v2, :cond_37

    :goto_16
    move-object v2, v3

    goto :goto_17

    .line 185
    :cond_37
    :try_start_7
    const-string v0, "ADDITIONAL_LOG_DETAILS"

    .line 186
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_16

    :catchall_2
    move-exception v0

    .line 187
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Failed to get additional log details from bundle: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_16

    :goto_17
    const/4 v3, 0x2

    move-wide v6, v5

    move-object v5, v9

    .line 188
    :try_start_9
    invoke-direct/range {v1 .. v8}, Lcom/android/billingclient/api/b;->x0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;JZ)V
    :try_end_9
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_9 .. :try_end_9} :catch_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_b
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_a

    move-wide v5, v6

    .line 189
    :try_start_a
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    :catch_a
    move-exception v0

    move-wide v5, v6

    goto :goto_19

    :catch_b
    move-exception v0

    :goto_18
    move-wide v5, v6

    goto :goto_1a

    :catch_c
    move-exception v0

    goto :goto_18

    .line 190
    :cond_38
    new-instance v0, Landroid/content/Intent;

    const-class v3, Lcom/android/billingclient/api/ProxyBillingActivity;

    .line 191
    invoke-direct {v0, v7, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "BUY_INTENT"

    .line 192
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/PendingIntent;

    const-string v3, "BUY_INTENT"

    .line 193
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v2, "billingClientTransactionId"

    .line 194
    invoke-virtual {v0, v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string v2, "wasServiceAutoReconnected"

    .line 195
    invoke-virtual {v0, v2, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 196
    invoke-virtual {v7, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_a
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    sget-object v0, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    return-object v0

    .line 197
    :goto_19
    const-string v2, "BillingClient"

    const-string v3, "Exception while launching billing flow. Try to reconnect"

    .line 198
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->f:Lcom/google/android/gms/internal/play_billing/R2;

    sget-object v4, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    .line 199
    invoke-static {v0}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    move-wide v6, v5

    move-object v5, v0

    .line 200
    invoke-direct/range {v1 .. v8}, Lcom/android/billingclient/api/b;->x0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;JZ)V

    .line 201
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    .line 202
    :goto_1a
    const-string v2, "BillingClient"

    const-string v3, "Time out while launching billing flow. Try to reconnect"

    .line 203
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/V;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->e:Lcom/google/android/gms/internal/play_billing/R2;

    sget-object v4, Lcom/android/billingclient/api/W;->k:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    .line 204
    invoke-static {v0}, Lcom/android/billingclient/api/U;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    move-wide v6, v5

    move-object v5, v0

    .line 205
    invoke-direct/range {v1 .. v8}, Lcom/android/billingclient/api/b;->x0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;JZ)V

    .line 206
    invoke-virtual {v1, v4}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v4

    .line 207
    :goto_1b
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw v0

    .line 208
    :cond_39
    sget-object v2, Lcom/google/android/gms/internal/play_billing/R2;->m:Lcom/google/android/gms/internal/play_billing/R2;

    .line 209
    sget-object v4, Lcom/android/billingclient/api/W;->E:Lcom/android/billingclient/api/e;

    const/4 v3, 0x2

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->u0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;J)V

    return-object v4
.end method

.method public i(Lcom/android/billingclient/api/i;LN4/k;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/android/billingclient/api/r;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, Lcom/android/billingclient/api/r;-><init>(Lcom/android/billingclient/api/b;LN4/k;Lcom/android/billingclient/api/i;)V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lcom/android/billingclient/api/t;

    .line 7
    .line 8
    invoke-direct {v3, p0, p2}, Lcom/android/billingclient/api/t;-><init>(Lcom/android/billingclient/api/b;LN4/k;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->f0()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const-wide/16 v1, 0x7530

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->i0()Lcom/android/billingclient/api/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->z:Lcom/google/android/gms/internal/play_billing/R2;

    .line 32
    .line 33
    const/4 v1, 0x7

    .line 34
    invoke-direct {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lcom/android/billingclient/api/j;

    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-direct {v0, v1, v2}, Lcom/android/billingclient/api/j;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p2, p1, v0}, LN4/k;->a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/j;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public final j(LN4/o;LN4/l;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LN4/o;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/android/billingclient/api/x;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, p2, p1, v1}, Lcom/android/billingclient/api/x;-><init>(Lcom/android/billingclient/api/b;LN4/l;Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    new-instance v3, Lcom/android/billingclient/api/v;

    .line 12
    .line 13
    invoke-direct {v3, p0, p2}, Lcom/android/billingclient/api/v;-><init>(Lcom/android/billingclient/api/b;LN4/l;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->f0()Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const-wide/16 v1, 0x7530

    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->i0()Lcom/android/billingclient/api/e;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->z:Lcom/google/android/gms/internal/play_billing/R2;

    .line 37
    .line 38
    const/16 v1, 0x9

    .line 39
    .line 40
    invoke-direct {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->t0(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {p2, p1, v0}, LN4/l;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public final k(Landroid/app/Activity;Lcom/android/billingclient/api/f;LN4/i;)Lcom/android/billingclient/api/e;
    .locals 8

    .line 1
    const-wide/16 v0, 0xbb8

    .line 2
    .line 3
    invoke-direct {p0, v0, v1}, Lcom/android/billingclient/api/b;->O(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "BillingClient"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string p1, "Service disconnected."

    .line 12
    .line 13
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lcom/android/billingclient/api/W;->j:Lcom/android/billingclient/api/e;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->q:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string p1, "Current client doesn\'t support showing in-app messages."

    .line 24
    .line 25
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lcom/android/billingclient/api/W;->s:Lcom/android/billingclient/api/e;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    const v0, 0x1020002

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 48
    .line 49
    .line 50
    new-instance v0, Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v3, "KEY_WINDOW_TOKEN"

    .line 56
    .line 57
    invoke-static {v0, v3, v1}, Landroidx/core/app/h;->b(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 58
    .line 59
    .line 60
    iget v1, v2, Landroid/graphics/Rect;->left:I

    .line 61
    .line 62
    const-string v3, "KEY_DIMEN_LEFT"

    .line 63
    .line 64
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    iget v1, v2, Landroid/graphics/Rect;->top:I

    .line 68
    .line 69
    const-string v3, "KEY_DIMEN_TOP"

    .line 70
    .line 71
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    iget v1, v2, Landroid/graphics/Rect;->right:I

    .line 75
    .line 76
    const-string v3, "KEY_DIMEN_RIGHT"

    .line 77
    .line 78
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 82
    .line 83
    const-string v2, "KEY_DIMEN_BOTTOM"

    .line 84
    .line 85
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    .line 89
    .line 90
    const-string v2, "playBillingLibraryVersion"

    .line 91
    .line 92
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lcom/android/billingclient/api/b;->d:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    const-string v2, "playBillingLibraryWrapperVersion"

    .line 100
    .line 101
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    invoke-virtual {p2}, Lcom/android/billingclient/api/f;->b()Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    const-string v1, "KEY_CATEGORY_IDS"

    .line 109
    .line 110
    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 111
    .line 112
    .line 113
    iget-object v6, p0, Lcom/android/billingclient/api/b;->e:Landroid/os/Handler;

    .line 114
    .line 115
    new-instance p2, Lcom/android/billingclient/api/y;

    .line 116
    .line 117
    invoke-direct {p2, p0, v6, p3}, Lcom/android/billingclient/api/y;-><init>(Lcom/android/billingclient/api/b;Landroid/os/Handler;LN4/i;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Lcom/android/billingclient/api/u;

    .line 121
    .line 122
    invoke-direct {v2, p0, v0, p1, p2}, Lcom/android/billingclient/api/u;-><init>(Lcom/android/billingclient/api/b;Landroid/os/Bundle;Landroid/app/Activity;Landroid/os/ResultReceiver;)V

    .line 123
    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    const-wide/16 v3, 0x1388

    .line 131
    .line 132
    invoke-static/range {v2 .. v7}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 133
    .line 134
    .line 135
    sget-object p1, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 136
    .line 137
    return-object p1
.end method

.method public l(LN4/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/android/billingclient/api/b;->M(LN4/d;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method final declared-synchronized n()Ljava/util/concurrent/ExecutorService;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->H:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget v0, Lcom/google/android/gms/internal/play_billing/V;->a:I

    .line 7
    .line 8
    new-instance v1, Lcom/android/billingclient/api/w;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/android/billingclient/api/w;-><init>(Lcom/android/billingclient/api/b;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/android/billingclient/api/b;->H:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->H:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method
