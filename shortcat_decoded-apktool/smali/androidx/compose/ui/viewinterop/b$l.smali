.class final Landroidx/compose/ui/viewinterop/b$l;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/b;->onNestedFling(Landroid/view/View;FFZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/viewinterop/b;

.field final synthetic d:J


# direct methods
.method constructor <init>(ZLandroidx/compose/ui/viewinterop/b;JLZd/e;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/b$l;->b:Z

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b$l;->c:Landroidx/compose/ui/viewinterop/b;

    .line 4
    .line 5
    iput-wide p3, p0, Landroidx/compose/ui/viewinterop/b$l;->d:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Landroidx/compose/ui/viewinterop/b$l;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/compose/ui/viewinterop/b$l;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/b$l;->c:Landroidx/compose/ui/viewinterop/b;

    .line 6
    .line 7
    iget-wide v3, p0, Landroidx/compose/ui/viewinterop/b$l;->d:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/b$l;-><init>(ZLandroidx/compose/ui/viewinterop/b;JLZd/e;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/b$l;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/viewinterop/b$l;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/viewinterop/b$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/b$l;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/ui/viewinterop/b$l;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v6, p0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-boolean p1, p0, Landroidx/compose/ui/viewinterop/b$l;->b:Z

    .line 36
    .line 37
    if-nez p1, :cond_4

    .line 38
    .line 39
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b$l;->c:Landroidx/compose/ui/viewinterop/b;

    .line 40
    .line 41
    invoke-static {p1}, Landroidx/compose/ui/viewinterop/b;->c(Landroidx/compose/ui/viewinterop/b;)LD0/b;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget-object p1, Li1/y;->b:Li1/y$a;

    .line 46
    .line 47
    invoke-virtual {p1}, Li1/y$a;->a()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    iget-wide v7, p0, Landroidx/compose/ui/viewinterop/b$l;->d:J

    .line 52
    .line 53
    iput v3, p0, Landroidx/compose/ui/viewinterop/b$l;->a:I

    .line 54
    .line 55
    move-object v9, p0

    .line 56
    invoke-virtual/range {v4 .. v9}, LD0/b;->a(JJLZd/e;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object v6, v9

    .line 61
    if-ne p1, v0, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_0
    check-cast p1, Li1/y;

    .line 65
    .line 66
    invoke-virtual {p1}, Li1/y;->o()J

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move-object v6, p0

    .line 71
    iget-object p1, v6, Landroidx/compose/ui/viewinterop/b$l;->c:Landroidx/compose/ui/viewinterop/b;

    .line 72
    .line 73
    invoke-static {p1}, Landroidx/compose/ui/viewinterop/b;->c(Landroidx/compose/ui/viewinterop/b;)LD0/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    move p1, v2

    .line 78
    iget-wide v2, v6, Landroidx/compose/ui/viewinterop/b$l;->d:J

    .line 79
    .line 80
    sget-object v4, Li1/y;->b:Li1/y$a;

    .line 81
    .line 82
    invoke-virtual {v4}, Li1/y$a;->a()J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    iput p1, v6, Landroidx/compose/ui/viewinterop/b$l;->a:I

    .line 87
    .line 88
    invoke-virtual/range {v1 .. v6}, LD0/b;->a(JJLZd/e;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v0, :cond_5

    .line 93
    .line 94
    :goto_1
    return-object v0

    .line 95
    :cond_5
    :goto_2
    check-cast p1, Li1/y;

    .line 96
    .line 97
    invoke-virtual {p1}, Li1/y;->o()J

    .line 98
    .line 99
    .line 100
    :goto_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 101
    .line 102
    return-object p1
.end method
