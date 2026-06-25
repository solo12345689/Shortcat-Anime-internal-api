.class public abstract LQ/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lw/n;

.field private static final b:Lw/s0;

.field private static final c:J

.field private static final d:Lw/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lw/n;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, Lw/n;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LQ/y;->a:Lw/n;

    .line 9
    .line 10
    sget-object v0, LQ/y$a;->a:LQ/y$a;

    .line 11
    .line 12
    sget-object v1, LQ/y$b;->a:LQ/y$b;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lw/u0;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lw/s0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, LQ/y;->b:Lw/s0;

    .line 19
    .line 20
    const v0, 0x3c23d70a    # 0.01f

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v0}, Lr0/g;->a(FF)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    sput-wide v0, LQ/y;->c:J

    .line 28
    .line 29
    new-instance v2, Lw/h0;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lr0/f;->d(J)Lr0/f;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct/range {v2 .. v7}, Lw/h0;-><init>(FFLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    sput-object v2, LQ/y;->d:Lw/h0;

    .line 43
    .line 44
    return-void
.end method

.method public static final synthetic a()Lw/n;
    .locals 1

    .line 1
    sget-object v0, LQ/y;->a:Lw/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b(Lie/a;LY/m;I)LY/h2;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LQ/y;->f(Lie/a;LY/m;I)LY/h2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(LY/h2;)J
    .locals 2

    .line 1
    invoke-static {p0}, LQ/y;->g(LY/h2;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final d(Landroidx/compose/ui/e;Lie/a;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    new-instance v0, LQ/y$c;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LQ/y$c;-><init>(Lie/a;Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p0, p2, v0, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final e()Lw/h0;
    .locals 1

    .line 1
    sget-object v0, LQ/y;->d:Lw/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final f(Lie/a;LY/m;I)LY/h2;
    .locals 9

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"

    .line 9
    .line 10
    const v2, -0x5ec259b1

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    sget-object v0, LY/m;->a:LY/m$a;

    .line 21
    .line 22
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-ne p2, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, LY/U1;->d(Lie/a;)LY/h2;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-interface {p1, p2}, LY/m;->u(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    check-cast p2, LY/h2;

    .line 36
    .line 37
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-ne p0, v1, :cond_2

    .line 46
    .line 47
    new-instance v2, Lw/a;

    .line 48
    .line 49
    invoke-static {p2}, LQ/y;->g(LY/h2;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    invoke-static {v3, v4}, Lr0/f;->d(J)Lr0/f;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    sget-object v4, LQ/y;->b:Lw/s0;

    .line 58
    .line 59
    sget-wide v5, LQ/y;->c:J

    .line 60
    .line 61
    invoke-static {v5, v6}, Lr0/f;->d(J)Lr0/f;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const/16 v7, 0x8

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-direct/range {v2 .. v8}, Lw/a;-><init>(Ljava/lang/Object;Lw/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move-object p0, v2

    .line 76
    :cond_2
    check-cast p0, Lw/a;

    .line 77
    .line 78
    sget-object v1, LTd/L;->a:LTd/L;

    .line 79
    .line 80
    invoke-interface {p1, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-nez v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v3, v0, :cond_4

    .line 95
    .line 96
    :cond_3
    new-instance v3, LQ/y$d;

    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-direct {v3, p2, p0, v0}, LQ/y$d;-><init>(LY/h2;Lw/a;LZd/e;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    const/4 p2, 0x6

    .line 108
    invoke-static {v1, v3, p1, p2}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lw/a;->g()LY/h2;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {}, LY/w;->L()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    invoke-static {}, LY/w;->T()V

    .line 122
    .line 123
    .line 124
    :cond_5
    return-object p0
.end method

.method private static final g(LY/h2;)J
    .locals 2

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lr0/f;

    .line 6
    .line 7
    invoke-virtual {p0}, Lr0/f;->u()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
