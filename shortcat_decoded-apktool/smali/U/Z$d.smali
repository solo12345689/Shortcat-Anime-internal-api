.class final LU/Z$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/Z;->b(LU/a0;Landroidx/compose/ui/e;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LU/W;

.field final synthetic c:Landroidx/compose/ui/platform/i;


# direct methods
.method constructor <init>(LU/W;Landroidx/compose/ui/platform/i;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/Z$d;->b:LU/W;

    .line 2
    .line 3
    iput-object p2, p0, LU/Z$d;->c:Landroidx/compose/ui/platform/i;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, LU/Z$d;

    .line 2
    .line 3
    iget-object v0, p0, LU/Z$d;->b:LU/W;

    .line 4
    .line 5
    iget-object v1, p0, LU/Z$d;->c:Landroidx/compose/ui/platform/i;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LU/Z$d;-><init>(LU/W;Landroidx/compose/ui/platform/i;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LU/Z$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LU/Z$d;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LU/Z$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LU/Z$d;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LU/Z$d;->a:I

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
    goto :goto_1

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
    iget-object p1, p0, LU/Z$d;->b:LU/W;

    .line 28
    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    invoke-interface {p1}, LU/W;->a()LU/d0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, LU/d0;->getDuration()LU/Y;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v1, p0, LU/Z$d;->b:LU/W;

    .line 40
    .line 41
    invoke-interface {v1}, LU/W;->a()LU/d0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, LU/d0;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    move v1, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v1, 0x0

    .line 54
    :goto_0
    iget-object v3, p0, LU/Z$d;->c:Landroidx/compose/ui/platform/i;

    .line 55
    .line 56
    invoke-static {p1, v1, v3}, LU/Z;->h(LU/Y;ZLandroidx/compose/ui/platform/i;)J

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    iput v2, p0, LU/Z$d;->a:I

    .line 61
    .line 62
    invoke-static {v3, v4, p0}, LGf/Z;->a(JLZd/e;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v0, :cond_3

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    :goto_1
    iget-object p1, p0, LU/Z$d;->b:LU/W;

    .line 70
    .line 71
    invoke-interface {p1}, LU/W;->dismiss()V

    .line 72
    .line 73
    .line 74
    :cond_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 75
    .line 76
    return-object p1
.end method
