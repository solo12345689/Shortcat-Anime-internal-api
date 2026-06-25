.class public final Lzd/h$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ltd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/h;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lzd/h;


# direct methods
.method constructor <init>(Lzd/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/h$b;->a:Lzd/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 2
    .line 3
    invoke-static {v0}, Lzd/h;->h(Lzd/h;)Lwd/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lwd/o;->j()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 15
    .line 16
    sget-object v1, Ltd/d$a;->b:Ltd/d$a;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lzd/h;->t(Lzd/h;Ltd/d$a;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lwd/s;

    .line 22
    .line 23
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 24
    .line 25
    invoke-static {v0}, Lzd/h;->d(Lzd/h;)Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 30
    .line 31
    invoke-static {v0}, Lzd/h;->n(Lzd/h;)Lexpo/modules/updates/d;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 36
    .line 37
    invoke-static {v0}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 42
    .line 43
    invoke-static {v0}, Lzd/h;->e(Lzd/h;)Lpd/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 52
    .line 53
    invoke-static {v0}, Lzd/h;->g(Lzd/h;)Lwd/g;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 58
    .line 59
    invoke-static {v0}, Lzd/h;->o(Lzd/h;)Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 64
    .line 65
    invoke-virtual {v0}, Lzd/h;->x()Lrd/d;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-direct/range {v2 .. v9}, Lwd/s;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Lwd/g;Ljava/io/File;Lrd/d;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 73
    .line 74
    invoke-static {v0}, Lzd/h;->k(Lzd/h;)LGf/O;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v6, Lzd/h$b$a;

    .line 79
    .line 80
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-direct {v6, v2, v0, v1}, Lzd/h$b$a;-><init>(Lwd/s;Lzd/h;LZd/e;)V

    .line 84
    .line 85
    .line 86
    const/4 v7, 0x3

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public b()V
    .locals 7

    .line 1
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd/h;->v()Ljava/lang/Exception;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 11
    .line 12
    invoke-static {v0}, Lzd/h;->k(Lzd/h;)LGf/O;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v4, Lzd/h$b$c;

    .line 17
    .line 18
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v4, v0, v2}, Lzd/h$b$c;-><init>(Lzd/h;LZd/e;)V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public c(Lvd/b$a;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 7
    .line 8
    invoke-static {v0}, Lzd/h;->c(Lzd/h;)Lzd/h$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-interface {v0, v1, p1}, Lzd/h$a;->b(ZLvd/b$a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd/h;->x()Lrd/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lrd/d;->n()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public f()V
    .locals 7

    .line 1
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd/h;->v()Ljava/lang/Exception;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 11
    .line 12
    invoke-static {v0}, Lzd/h;->k(Lzd/h;)LGf/O;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v4, Lzd/h$b$b;

    .line 17
    .line 18
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v4, v0, v2}, Lzd/h$b$b;-><init>(Lzd/h;LZd/e;)V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public g()Ltd/d$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 2
    .line 3
    invoke-static {v0}, Lzd/h;->l(Lzd/h;)Ltd/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()Lexpo/modules/updates/d$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/h$b;->a:Lzd/h;

    .line 2
    .line 3
    invoke-static {v0}, Lzd/h;->n(Lzd/h;)Lexpo/modules/updates/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lexpo/modules/updates/d;->e()Lexpo/modules/updates/d$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
