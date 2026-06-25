.class final Lz/A$c;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/A;->f(LE0/b;LE0/C;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LE0/C;


# direct methods
.method constructor <init>(LE0/C;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/A$c;->d:LE0/C;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, Lz/A$c;

    .line 2
    .line 3
    iget-object v1, p0, Lz/A$c;->d:LE0/C;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lz/A$c;-><init>(LE0/C;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lz/A$c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LE0/b;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz/A$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lz/A$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lz/A$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LE0/b;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lz/A$c;->invoke(LE0/b;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lz/A$c;->b:I

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
    iget-wide v3, p0, Lz/A$c;->a:J

    .line 13
    .line 14
    iget-object v1, p0, Lz/A$c;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LE0/b;

    .line 17
    .line 18
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object v5, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lz/A$c;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LE0/b;

    .line 37
    .line 38
    iget-object v1, p0, Lz/A$c;->d:LE0/C;

    .line 39
    .line 40
    invoke-virtual {v1}, LE0/C;->o()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-interface {p1}, LE0/b;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v1}, Landroidx/compose/ui/platform/A1;->b()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    add-long/2addr v3, v5

    .line 53
    move-object v5, p1

    .line 54
    :cond_2
    iput-object v5, p0, Lz/A$c;->c:Ljava/lang/Object;

    .line 55
    .line 56
    iput-wide v3, p0, Lz/A$c;->a:J

    .line 57
    .line 58
    iput v2, p0, Lz/A$c;->b:I

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v9, 0x3

    .line 63
    const/4 v10, 0x0

    .line 64
    move-object v8, p0

    .line 65
    invoke-static/range {v5 .. v10}, Lz/A;->e(LE0/b;ZLE0/s;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    :goto_0
    check-cast p1, LE0/C;

    .line 73
    .line 74
    invoke-virtual {p1}, LE0/C;->o()J

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    cmp-long v1, v6, v3

    .line 79
    .line 80
    if-ltz v1, :cond_2

    .line 81
    .line 82
    return-object p1
.end method
