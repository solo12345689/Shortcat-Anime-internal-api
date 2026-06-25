.class final LSc/b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSc/b;->a(Landroid/net/Uri;JJLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/net/Uri;

.field final synthetic c:J

.field final synthetic d:J


# direct methods
.method constructor <init>(Landroid/net/Uri;JJLZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LSc/b$b;->b:Landroid/net/Uri;

    .line 2
    .line 3
    iput-wide p2, p0, LSc/b$b;->c:J

    .line 4
    .line 5
    iput-wide p4, p0, LSc/b$b;->d:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 7

    .line 1
    new-instance v0, LSc/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LSc/b$b;->b:Landroid/net/Uri;

    .line 4
    .line 5
    iget-wide v2, p0, LSc/b$b;->c:J

    .line 6
    .line 7
    iget-wide v4, p0, LSc/b$b;->d:J

    .line 8
    .line 9
    move-object v6, p2

    .line 10
    invoke-direct/range {v0 .. v6}, LSc/b$b;-><init>(Landroid/net/Uri;JJLZd/e;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSc/b$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LSc/b$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LSc/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LSc/b$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LSc/b$b;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v3, LSc/b$b$a;

    .line 32
    .line 33
    iget-object v4, p0, LSc/b$b;->b:Landroid/net/Uri;

    .line 34
    .line 35
    iget-wide v5, p0, LSc/b$b;->c:J

    .line 36
    .line 37
    iget-wide v7, p0, LSc/b$b;->d:J

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    invoke-direct/range {v3 .. v9}, LSc/b$b$a;-><init>(Landroid/net/Uri;JJLZd/e;)V

    .line 41
    .line 42
    .line 43
    iput v2, p0, LSc/b$b;->a:I

    .line 44
    .line 45
    invoke-static {p1, v3, p0}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    return-object p1
.end method
