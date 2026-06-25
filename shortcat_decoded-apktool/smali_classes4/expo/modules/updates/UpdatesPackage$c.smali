.class public final Lexpo/modules/updates/UpdatesPackage$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lsb/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesPackage;->d(Landroid/content/Context;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLjava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/updates/UpdatesPackage$c;->h(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLjava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f(Lexpo/modules/updates/UpdatesPackage$c;Ljava/lang/Runnable;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/updates/UpdatesPackage$c;->i(Ljava/lang/Runnable;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/updates/UpdatesPackage$c;->j(Landroid/content/Context;ZLZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLjava/lang/Runnable;)V
    .locals 8

    .line 1
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lexpo/modules/updates/UpdatesPackage$c$a;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    move-object v3, p0

    .line 13
    move-object v4, p1

    .line 14
    move v5, p2

    .line 15
    move-object v6, p3

    .line 16
    invoke-direct/range {v2 .. v7}, Lexpo/modules/updates/UpdatesPackage$c$a;-><init>(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLjava/lang/Runnable;LZd/e;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v4, v2

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final i(Ljava/lang/Runnable;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/updates/UpdatesPackage$c$b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lexpo/modules/updates/UpdatesPackage$c$b;-><init>(Ljava/lang/Runnable;LZd/e;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 23
    .line 24
    return-object p1
.end method

.method private final j(Landroid/content/Context;ZLZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/updates/UpdatesPackage$c$c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p2, v2}, Lexpo/modules/updates/UpdatesPackage$c$c;-><init>(Landroid/content/Context;ZLZd/e;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 23
    .line 24
    return-object p1
.end method


# virtual methods
.method public c(Lcom/facebook/react/ReactActivity;Lcom/facebook/react/ReactHost;)Lsb/h$a;
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactHost"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lexpo/modules/updates/UpdatesPackage;->a:Lexpo/modules/updates/UpdatesPackage$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lexpo/modules/updates/UpdatesPackage$a;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p2}, Lcom/facebook/react/ReactHost;->getDevSupportManager()Lc7/f;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-interface {p2}, Lc7/f;->m()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p2, 0x0

    .line 37
    :goto_0
    if-eqz p2, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Lexpo/modules/updates/UpdatesPackage$a;->b()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    return-object v2

    .line 47
    :cond_3
    :goto_1
    new-instance v0, Lnd/g;

    .line 48
    .line 49
    invoke-direct {v0, p0, p1, p2}, Lnd/g;-><init>(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;Z)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method
