.class public final LY/p0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/v1;
.implements LGf/L;


# instance fields
.field private final a:LZd/i;

.field private final b:Lkotlin/jvm/functions/Function2;

.field private final c:LGf/O;

.field private d:LGf/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LZd/i;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/p0;->a:LZd/i;

    .line 5
    .line 6
    iput-object p2, p0, LY/p0;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    sget-object p2, Lk0/h;->b:Lk0/h$a;

    .line 9
    .line 10
    invoke-interface {p1, p2}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    move-object p2, p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p2, LZd/j;->a:LZd/j;

    .line 19
    .line 20
    :goto_0
    invoke-interface {p1, p2}, LZd/i;->w(LZd/i;)LZd/i;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, LGf/P;->a(LZd/i;)LGf/O;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, LY/p0;->c:LGf/O;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public a1(LZd/i$c;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LGf/L$a;->c(LGf/L;LZd/i$c;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c()V
    .locals 10

    .line 1
    iget-object v0, p0, LY/p0;->d:LGf/C0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "Old job was still running!"

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {v0, v1, v3, v2, v3}, LGf/F0;->e(LGf/C0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v4, p0, LY/p0;->c:LGf/O;

    .line 13
    .line 14
    iget-object v7, p0, LY/p0;->b:Lkotlin/jvm/functions/Function2;

    .line 15
    .line 16
    const/4 v8, 0x3

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    invoke-static/range {v4 .. v9}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LY/p0;->d:LGf/C0;

    .line 25
    .line 26
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/p0;->d:LGf/C0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LY/r0;

    .line 6
    .line 7
    invoke-direct {v1}, LY/r0;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, LGf/C0;->k(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, LY/p0;->d:LGf/C0;

    .line 15
    .line 16
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/p0;->d:LGf/C0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LY/r0;

    .line 6
    .line 7
    invoke-direct {v1}, LY/r0;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, LGf/C0;->k(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, LY/p0;->d:LGf/C0;

    .line 15
    .line 16
    return-void
.end method

.method public getKey()LZd/i$c;
    .locals 1

    .line 1
    sget-object v0, LGf/L;->J:LGf/L$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(LZd/i$c;)LZd/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LGf/L$a;->b(LGf/L;LZd/i$c;)LZd/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public w(LZd/i;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LGf/L$a;->d(LGf/L;LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LGf/L$a;->a(LGf/L;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public z(LZd/i;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    sget-object v0, Lk0/h;->b:Lk0/h$a;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lk0/h;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p2, p0}, Lk0/h;->a(Ljava/lang/Throwable;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LY/p0;->a:LZd/i;

    .line 15
    .line 16
    sget-object v1, LGf/L;->J:LGf/L$b;

    .line 17
    .line 18
    invoke-interface {v0, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LGf/L;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, LGf/L;->z(LZd/i;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    throw p2
.end method
