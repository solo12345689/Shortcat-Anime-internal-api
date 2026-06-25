.class public final Lw/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lw/s0;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/String;

.field private final d:Lw/k;

.field private final e:LY/C0;

.field private final f:LY/C0;

.field private final g:Lw/Z;

.field private final h:Lw/h0;

.field private final i:Lw/q;

.field private final j:Lw/q;

.field private k:Lw/q;

.field private l:Lw/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lw/s0;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lw/a;->a:Lw/s0;

    .line 3
    iput-object p3, p0, Lw/a;->b:Ljava/lang/Object;

    .line 4
    iput-object p4, p0, Lw/a;->c:Ljava/lang/String;

    .line 5
    new-instance v0, Lw/k;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v10}, Lw/k;-><init>(Lw/s0;Ljava/lang/Object;Lw/q;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lw/a;->d:Lw/k;

    .line 6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 p4, 0x2

    invoke-static {p1, p2, p4, p2}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, Lw/a;->e:LY/C0;

    .line 7
    invoke-static {v2, p2, p4, p2}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, Lw/a;->f:LY/C0;

    .line 8
    new-instance p1, Lw/Z;

    invoke-direct {p1}, Lw/Z;-><init>()V

    iput-object p1, p0, Lw/a;->g:Lw/Z;

    .line 9
    new-instance v0, Lw/h0;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lw/h0;-><init>(FFLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lw/a;->h:Lw/h0;

    .line 10
    invoke-virtual {p0}, Lw/a;->o()Lw/q;

    move-result-object p1

    .line 11
    instance-of p2, p1, Lw/m;

    if-eqz p2, :cond_0

    invoke-static {}, Lw/b;->c()Lw/m;

    move-result-object p1

    goto :goto_0

    .line 12
    :cond_0
    instance-of p2, p1, Lw/n;

    if-eqz p2, :cond_1

    invoke-static {}, Lw/b;->d()Lw/n;

    move-result-object p1

    goto :goto_0

    .line 13
    :cond_1
    instance-of p1, p1, Lw/o;

    if-eqz p1, :cond_2

    invoke-static {}, Lw/b;->e()Lw/o;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_2
    invoke-static {}, Lw/b;->f()Lw/p;

    move-result-object p1

    .line 15
    :goto_0
    const-string p2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lw/a;->i:Lw/q;

    .line 17
    invoke-virtual {p0}, Lw/a;->o()Lw/q;

    move-result-object p3

    .line 18
    instance-of p4, p3, Lw/m;

    if-eqz p4, :cond_3

    invoke-static {}, Lw/b;->g()Lw/m;

    move-result-object p3

    goto :goto_1

    .line 19
    :cond_3
    instance-of p4, p3, Lw/n;

    if-eqz p4, :cond_4

    invoke-static {}, Lw/b;->h()Lw/n;

    move-result-object p3

    goto :goto_1

    .line 20
    :cond_4
    instance-of p3, p3, Lw/o;

    if-eqz p3, :cond_5

    invoke-static {}, Lw/b;->i()Lw/o;

    move-result-object p3

    goto :goto_1

    .line 21
    :cond_5
    invoke-static {}, Lw/b;->j()Lw/p;

    move-result-object p3

    .line 22
    :goto_1
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iput-object p3, p0, Lw/a;->j:Lw/q;

    .line 24
    iput-object p1, p0, Lw/a;->k:Lw/q;

    .line 25
    iput-object p3, p0, Lw/a;->l:Lw/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lw/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 26
    const-string p4, "Animatable"

    .line 27
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lw/a;-><init>(Ljava/lang/Object;Lw/s0;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a(Lw/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lw/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw/a;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(Lw/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw/a;->q(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d(Lw/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw/a;->r(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lw/a;Ljava/lang/Object;Lw/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lw/a;->h:Lw/h0;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p6, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lw/a;->n()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    :cond_1
    move-object v3, p3

    .line 17
    and-int/lit8 p2, p6, 0x8

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    const/4 p4, 0x0

    .line 22
    :cond_2
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    move-object v4, p4

    .line 25
    move-object v5, p5

    .line 26
    invoke-virtual/range {v0 .. v5}, Lw/a;->e(Ljava/lang/Object;Lw/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lw/a;->k:Lw/q;

    .line 2
    .line 3
    iget-object v1, p0, Lw/a;->i:Lw/q;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lw/a;->l:Lw/q;

    .line 12
    .line 13
    iget-object v1, p0, Lw/a;->j:Lw/q;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v0, p0, Lw/a;->a:Lw/s0;

    .line 23
    .line 24
    invoke-interface {v0}, Lw/s0;->a()Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lw/q;

    .line 33
    .line 34
    invoke-virtual {v0}, Lw/q;->b()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x0

    .line 39
    move v3, v2

    .line 40
    :goto_0
    if-ge v2, v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lw/q;->a(I)F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    iget-object v5, p0, Lw/a;->k:Lw/q;

    .line 47
    .line 48
    invoke-virtual {v5, v2}, Lw/q;->a(I)F

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    cmpg-float v4, v4, v5

    .line 53
    .line 54
    if-ltz v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lw/q;->a(I)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v5, p0, Lw/a;->l:Lw/q;

    .line 61
    .line 62
    invoke-virtual {v5, v2}, Lw/q;->a(I)F

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    cmpl-float v4, v4, v5

    .line 67
    .line 68
    if-lez v4, :cond_2

    .line 69
    .line 70
    :cond_1
    invoke-virtual {v0, v2}, Lw/q;->a(I)F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    iget-object v4, p0, Lw/a;->k:Lw/q;

    .line 75
    .line 76
    invoke-virtual {v4, v2}, Lw/q;->a(I)F

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    iget-object v5, p0, Lw/a;->l:Lw/q;

    .line 81
    .line 82
    invoke-virtual {v5, v2}, Lw/q;->a(I)F

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {v3, v4, v5}, Loe/j;->l(FFF)F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-virtual {v0, v2, v3}, Lw/q;->e(IF)V

    .line 91
    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    if-eqz v3, :cond_4

    .line 98
    .line 99
    iget-object p1, p0, Lw/a;->a:Lw/s0;

    .line 100
    .line 101
    invoke-interface {p1}, Lw/s0;->b()Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :cond_4
    :goto_1
    return-object p1
.end method

.method private final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw/a;->d:Lw/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/k;->q()Lw/q;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lw/q;->d()V

    .line 8
    .line 9
    .line 10
    const-wide/high16 v1, -0x8000000000000000L

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lw/k;->t(J)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lw/a;->q(Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final p(Lw/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lw/a;->d:Lw/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/k;->l()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    iget-object v8, p0, Lw/a;->g:Lw/Z;

    .line 8
    .line 9
    new-instance v0, Lw/a$a;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    move-object v1, p0

    .line 13
    move-object v3, p1

    .line 14
    move-object v2, p2

    .line 15
    move-object v6, p3

    .line 16
    invoke-direct/range {v0 .. v7}, Lw/a$a;-><init>(Lw/a;Ljava/lang/Object;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;)V

    .line 17
    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    const/4 v11, 0x0

    .line 21
    move-object/from16 v9, p4

    .line 22
    .line 23
    move-object v6, v8

    .line 24
    move-object v8, v0

    .line 25
    invoke-static/range {v6 .. v11}, Lw/Z;->e(Lw/Z;Lw/W;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method private final q(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->e:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final r(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->f:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lw/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lw/a;->m()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lw/a;->a:Lw/s0;

    .line 6
    .line 7
    invoke-static {p2, v1, v0, p1, p3}, Lw/f;->a(Lw/i;Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lw/n0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1, p3, p4, p5}, Lw/a;->p(Lw/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final g()LY/h2;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->d:Lw/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lw/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->d:Lw/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->f:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l()Lw/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->a:Lw/s0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->d:Lw/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/k;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final n()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw/a;->a:Lw/s0;

    .line 2
    .line 3
    invoke-interface {v0}, Lw/s0;->b()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lw/a;->o()Lw/q;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final o()Lw/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/a;->d:Lw/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/k;->q()Lw/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final s(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lw/a;->g:Lw/Z;

    .line 2
    .line 3
    new-instance v2, Lw/a$b;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v2, p0, p1, v1}, Lw/a$b;-><init>(Lw/a;Ljava/lang/Object;LZd/e;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v3, p2

    .line 12
    invoke-static/range {v0 .. v5}, Lw/Z;->e(Lw/Z;Lw/W;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    return-object p1
.end method

.method public final t(LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lw/a;->g:Lw/Z;

    .line 2
    .line 3
    new-instance v2, Lw/a$c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v2, p0, v1}, Lw/a$c;-><init>(Lw/a;LZd/e;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v3, p1

    .line 12
    invoke-static/range {v0 .. v5}, Lw/Z;->e(Lw/Z;Lw/W;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    return-object p1
.end method
