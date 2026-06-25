.class final Landroidx/compose/animation/e$b$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/e$b;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/e;

.field final synthetic b:Landroidx/compose/animation/e$b;


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;Landroidx/compose/animation/e$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/e$b$b;->a:Landroidx/compose/animation/e;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/e$b$b;->b:Landroidx/compose/animation/e$b;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lw/o0$b;)Lw/G;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/e$b$b;->a:Landroidx/compose/animation/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/animation/e;->h()Lt/P;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1}, Lw/o0$b;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LY/h2;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Li1/r;

    .line 24
    .line 25
    invoke-virtual {v0}, Li1/r;->j()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Li1/r;->b:Li1/r$a;

    .line 31
    .line 32
    invoke-virtual {v0}, Li1/r$a;->a()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :goto_0
    iget-object v2, p0, Landroidx/compose/animation/e$b$b;->a:Landroidx/compose/animation/e;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroidx/compose/animation/e;->h()Lt/P;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {p1}, Lw/o0$b;->a()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v2, p1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, LY/h2;

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-interface {p1}, LY/h2;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Li1/r;

    .line 59
    .line 60
    invoke-virtual {p1}, Li1/r;->j()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    sget-object p1, Li1/r;->b:Li1/r$a;

    .line 66
    .line 67
    invoke-virtual {p1}, Li1/r$a;->a()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    :goto_1
    iget-object p1, p0, Landroidx/compose/animation/e$b$b;->b:Landroidx/compose/animation/e$b;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroidx/compose/animation/e$b;->a()LY/h2;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p1}, LY/h2;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lv/w;

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    invoke-interface {p1, v0, v1, v2, v3}, Lv/w;->a(JJ)Lw/G;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-nez p1, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    return-object p1

    .line 93
    :cond_3
    :goto_2
    const/4 p1, 0x7

    .line 94
    const/4 v0, 0x0

    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-static {v0, v0, v1, p1, v1}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/o0$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$b$b;->a(Lw/o0$b;)Lw/G;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
