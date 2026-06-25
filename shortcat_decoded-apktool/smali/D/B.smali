.class public final LD/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/B$c;
    }
.end annotation


# static fields
.field public static final y:LD/B$c;

.field private static final z:Lh0/v;


# instance fields
.field private final a:LD/w;

.field private b:Z

.field private c:LD/s;

.field private final d:LD/z;

.field private final e:LD/f;

.field private final f:LY/C0;

.field private final g:LB/m;

.field private h:F

.field private final i:Lz/x;

.field private j:I

.field private k:Z

.field private l:LI0/K;

.field private final m:LI0/L;

.field private final n:LF/b;

.field private final o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

.field private final p:LF/h;

.field private final q:Landroidx/compose/foundation/lazy/layout/d;

.field private final r:LD/v;

.field private final s:LF/B;

.field private final t:LY/C0;

.field private final u:LY/C0;

.field private final v:LY/C0;

.field private final w:LY/C0;

.field private x:Lw/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LD/B$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LD/B$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LD/B;->y:LD/B$c;

    .line 8
    .line 9
    sget-object v0, LD/B$a;->a:LD/B$a;

    .line 10
    .line 11
    sget-object v1, LD/B$b;->a:LD/B$b;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lh0/b;->b(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lh0/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LD/B;->z:Lh0/v;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 24
    invoke-static {v2, v0, v1}, LD/x;->b(IILjava/lang/Object;)LD/w;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, LD/B;-><init>(IILD/w;)V

    return-void
.end method

.method public constructor <init>(IILD/w;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, LD/B;->a:LD/w;

    .line 3
    new-instance v0, LD/z;

    invoke-direct {v0, p1, p2}, LD/z;-><init>(II)V

    iput-object v0, p0, LD/B;->d:LD/z;

    .line 4
    new-instance p2, LD/f;

    invoke-direct {p2, p0}, LD/f;-><init>(LD/B;)V

    iput-object p2, p0, LD/B;->e:LD/f;

    .line 5
    invoke-static {}, LD/C;->b()LD/s;

    move-result-object p2

    .line 6
    invoke-static {}, LY/U1;->j()LY/T1;

    move-result-object v1

    .line 7
    invoke-static {p2, v1}, LY/U1;->h(Ljava/lang/Object;LY/T1;)LY/C0;

    move-result-object p2

    iput-object p2, p0, LD/B;->f:LY/C0;

    .line 8
    invoke-static {}, LB/l;->a()LB/m;

    move-result-object p2

    iput-object p2, p0, LD/B;->g:LB/m;

    .line 9
    new-instance p2, LD/B$i;

    invoke-direct {p2, p0}, LD/B$i;-><init>(LD/B;)V

    invoke-static {p2}, Lz/y;->a(Lkotlin/jvm/functions/Function1;)Lz/x;

    move-result-object p2

    iput-object p2, p0, LD/B;->i:Lz/x;

    const/4 p2, 0x1

    .line 10
    iput-boolean p2, p0, LD/B;->k:Z

    .line 11
    new-instance v1, LD/B$f;

    invoke-direct {v1, p0}, LD/B$f;-><init>(LD/B;)V

    iput-object v1, p0, LD/B;->m:LI0/L;

    .line 12
    new-instance v1, LF/b;

    invoke-direct {v1}, LF/b;-><init>()V

    iput-object v1, p0, LD/B;->n:LF/b;

    .line 13
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;-><init>()V

    iput-object v1, p0, LD/B;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 14
    new-instance v1, LF/h;

    invoke-direct {v1}, LF/h;-><init>()V

    iput-object v1, p0, LD/B;->p:LF/h;

    .line 15
    new-instance v1, Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p3}, LD/w;->b()LF/N;

    move-result-object p3

    new-instance v2, LD/B$e;

    invoke-direct {v2, p0, p1}, LD/B$e;-><init>(LD/B;I)V

    invoke-direct {v1, p3, v2}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LF/N;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, LD/B;->q:Landroidx/compose/foundation/lazy/layout/d;

    .line 16
    new-instance p1, LD/B$d;

    invoke-direct {p1, p0}, LD/B$d;-><init>(LD/B;)V

    iput-object p1, p0, LD/B;->r:LD/v;

    .line 17
    new-instance p1, LF/B;

    invoke-direct {p1}, LF/B;-><init>()V

    iput-object p1, p0, LD/B;->s:LF/B;

    .line 18
    invoke-virtual {v0}, LD/z;->b()LF/y;

    const/4 p1, 0x0

    .line 19
    invoke-static {p1, p2, p1}, LF/J;->c(LY/C0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LY/C0;

    move-result-object p3

    iput-object p3, p0, LD/B;->t:LY/C0;

    .line 20
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    invoke-static {p3, p1, v0, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v1

    iput-object v1, p0, LD/B;->u:LY/C0;

    .line 21
    invoke-static {p3, p1, v0, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p3

    iput-object p3, p0, LD/B;->v:LY/C0;

    .line 22
    invoke-static {p1, p2, p1}, LF/J;->c(LY/C0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LD/B;->w:LY/C0;

    .line 23
    sget-object p1, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {p1}, Lw/u0;->f(Lkotlin/jvm/internal/l;)Lw/s0;

    move-result-object v0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v8, 0x38

    const/4 v9, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v2, v1

    invoke-static/range {v0 .. v9}, Lw/l;->d(Lw/s0;Ljava/lang/Object;Ljava/lang/Object;JJZILjava/lang/Object;)Lw/k;

    move-result-object p1

    iput-object p1, p0, LD/B;->x:Lw/k;

    return-void
.end method

.method private final F(FLD/q;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LD/B;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LD/B;->a:LD/w;

    .line 6
    .line 7
    iget-object v1, p0, LD/B;->r:LD/v;

    .line 8
    .line 9
    invoke-interface {v0, v1, p1, p2}, LD/w;->d(LD/v;FLD/q;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static synthetic I(LD/B;IILZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LD/B;->H(IILZd/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private J(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->v:LY/C0;

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

.method private K(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->u:LY/C0;

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

.method private final M(FLi1/d;LGf/O;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    invoke-static {}, LD/C;->a()F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    move-object/from16 v3, p2

    .line 10
    .line 11
    invoke-interface {v3, v2}, Li1/d;->l1(F)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpg-float v2, v0, v2

    .line 16
    .line 17
    if-gtz v2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget-object v2, Li0/l;->e:Li0/l$a;

    .line 21
    .line 22
    invoke-virtual {v2}, Li0/l$a;->d()Li0/l;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v5, v4

    .line 35
    :goto_0
    invoke-virtual {v2, v3}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    :try_start_0
    iget-object v7, v1, LD/B;->x:Lw/k;

    .line 40
    .line 41
    invoke-virtual {v7}, Lw/k;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    iget-object v8, v1, LD/B;->x:Lw/k;

    .line 52
    .line 53
    invoke-virtual {v8}, Lw/k;->r()Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_2

    .line 58
    .line 59
    iget-object v9, v1, LD/B;->x:Lw/k;

    .line 60
    .line 61
    sub-float v10, v7, v0

    .line 62
    .line 63
    const/16 v17, 0x1e

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const/4 v11, 0x0

    .line 68
    const-wide/16 v12, 0x0

    .line 69
    .line 70
    const-wide/16 v14, 0x0

    .line 71
    .line 72
    const/16 v16, 0x0

    .line 73
    .line 74
    invoke-static/range {v9 .. v18}, Lw/l;->g(Lw/k;FFJJZILjava/lang/Object;)Lw/k;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, v1, LD/B;->x:Lw/k;

    .line 79
    .line 80
    new-instance v10, LD/B$j;

    .line 81
    .line 82
    invoke-direct {v10, v1, v4}, LD/B$j;-><init>(LD/B;LZd/e;)V

    .line 83
    .line 84
    .line 85
    const/4 v11, 0x3

    .line 86
    const/4 v12, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    move-object/from16 v7, p3

    .line 90
    .line 91
    invoke-static/range {v7 .. v12}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    new-instance v7, Lw/k;

    .line 98
    .line 99
    sget-object v8, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    .line 100
    .line 101
    invoke-static {v8}, Lw/u0;->f(Lkotlin/jvm/internal/l;)Lw/s0;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    neg-float v0, v0

    .line 106
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    const/16 v16, 0x3c

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/4 v10, 0x0

    .line 115
    const-wide/16 v11, 0x0

    .line 116
    .line 117
    const-wide/16 v13, 0x0

    .line 118
    .line 119
    const/4 v15, 0x0

    .line 120
    invoke-direct/range {v7 .. v17}, Lw/k;-><init>(Lw/s0;Ljava/lang/Object;Lw/q;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    .line 122
    .line 123
    iput-object v7, v1, LD/B;->x:Lw/k;

    .line 124
    .line 125
    new-instance v10, LD/B$k;

    .line 126
    .line 127
    invoke-direct {v10, v1, v4}, LD/B$k;-><init>(LD/B;LZd/e;)V

    .line 128
    .line 129
    .line 130
    const/4 v11, 0x3

    .line 131
    const/4 v12, 0x0

    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v9, 0x0

    .line 134
    move-object/from16 v7, p3

    .line 135
    .line 136
    invoke-static/range {v7 .. v12}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    :goto_1
    invoke-virtual {v2, v3, v6, v5}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :goto_2
    invoke-virtual {v2, v3, v6, v5}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 144
    .line 145
    .line 146
    throw v0
.end method

.method public static final synthetic g(LD/B;)LY/C0;
    .locals 0

    .line 1
    iget-object p0, p0, LD/B;->f:LY/C0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(LD/B;)LD/w;
    .locals 0

    .line 1
    iget-object p0, p0, LD/B;->a:LD/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i()Lh0/v;
    .locals 1

    .line 1
    sget-object v0, LD/B;->z:Lh0/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j(LD/B;)Lw/k;
    .locals 0

    .line 1
    iget-object p0, p0, LD/B;->x:Lw/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(LD/B;LI0/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/B;->l:LI0/K;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic m(LD/B;LD/s;ZZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LD/B;->l(LD/s;ZZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final A()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->q:Landroidx/compose/foundation/lazy/layout/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()LI0/K;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->l:LI0/K;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()LI0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->m:LI0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()F
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->x:Lw/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/k;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final E()F
    .locals 1

    .line 1
    iget v0, p0, LD/B;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public final G(F)F
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LD/B;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    :cond_0
    cmpl-float v1, p1, v0

    .line 13
    .line 14
    if-lez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, LD/B;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    :cond_1
    return v0

    .line 23
    :cond_2
    iget v1, p0, LD/B;->h:F

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/high16 v2, 0x3f000000    # 0.5f

    .line 30
    .line 31
    cmpg-float v1, v1, v2

    .line 32
    .line 33
    if-gtz v1, :cond_8

    .line 34
    .line 35
    iget v1, p0, LD/B;->h:F

    .line 36
    .line 37
    add-float/2addr v1, p1

    .line 38
    iput v1, p0, LD/B;->h:F

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    cmpl-float v1, v1, v2

    .line 45
    .line 46
    if-lez v1, :cond_6

    .line 47
    .line 48
    iget-object v1, p0, LD/B;->f:LY/C0;

    .line 49
    .line 50
    invoke-interface {v1}, LY/C0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, LD/s;

    .line 55
    .line 56
    iget v3, p0, LD/B;->h:F

    .line 57
    .line 58
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    iget-object v5, p0, LD/B;->c:LD/s;

    .line 63
    .line 64
    iget-boolean v6, p0, LD/B;->b:Z

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    xor-int/2addr v6, v7

    .line 68
    invoke-virtual {v1, v4, v6}, LD/s;->s(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_3

    .line 73
    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    invoke-virtual {v5, v4, v7}, LD/s;->s(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    :cond_3
    if-eqz v6, :cond_4

    .line 81
    .line 82
    iget-boolean v4, p0, LD/B;->b:Z

    .line 83
    .line 84
    invoke-virtual {p0, v1, v4, v7}, LD/B;->l(LD/s;ZZ)V

    .line 85
    .line 86
    .line 87
    iget-object v4, p0, LD/B;->w:LY/C0;

    .line 88
    .line 89
    invoke-static {v4}, LF/J;->d(LY/C0;)V

    .line 90
    .line 91
    .line 92
    iget v4, p0, LD/B;->h:F

    .line 93
    .line 94
    sub-float/2addr v3, v4

    .line 95
    invoke-direct {p0, v3, v1}, LD/B;->F(FLD/q;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget-object v1, p0, LD/B;->l:LI0/K;

    .line 100
    .line 101
    if-eqz v1, :cond_5

    .line 102
    .line 103
    invoke-interface {v1}, LI0/K;->i()V

    .line 104
    .line 105
    .line 106
    :cond_5
    iget v1, p0, LD/B;->h:F

    .line 107
    .line 108
    sub-float/2addr v3, v1

    .line 109
    invoke-virtual {p0}, LD/B;->u()LD/q;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-direct {p0, v3, v1}, LD/B;->F(FLD/q;)V

    .line 114
    .line 115
    .line 116
    :cond_6
    :goto_0
    iget v1, p0, LD/B;->h:F

    .line 117
    .line 118
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    cmpg-float v1, v1, v2

    .line 123
    .line 124
    if-gtz v1, :cond_7

    .line 125
    .line 126
    return p1

    .line 127
    :cond_7
    iget v1, p0, LD/B;->h:F

    .line 128
    .line 129
    sub-float/2addr p1, v1

    .line 130
    iput v0, p0, LD/B;->h:F

    .line 131
    .line 132
    return p1

    .line 133
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v0, "entered drag with non-zero pending scroll: "

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    iget v0, p0, LD/B;->h:F

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0
.end method

.method public final H(IILZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v2, LD/B$h;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, p0, p1, p2, v0}, LD/B$h;-><init>(LD/B;IILZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v3, p3

    .line 12
    invoke-static/range {v0 .. v5}, Lz/x;->d(Lz/x;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

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

.method public final L(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->d:LD/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/z;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LD/B;->d:LD/z;

    .line 10
    .line 11
    invoke-virtual {v0}, LD/z;->c()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, p2, :cond_1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LD/B;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, LD/B;->d:LD/z;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, LD/z;->d(II)V

    .line 25
    .line 26
    .line 27
    if-eqz p3, :cond_3

    .line 28
    .line 29
    iget-object p1, p0, LD/B;->l:LI0/K;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-interface {p1}, LI0/K;->i()V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-void

    .line 37
    :cond_3
    iget-object p1, p0, LD/B;->t:LY/C0;

    .line 38
    .line 39
    invoke-static {p1}, LF/J;->d(LY/C0;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final N(LD/m;I)I
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->d:LD/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LD/z;->j(LD/m;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->i:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/x;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, LD/B$g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LD/B$g;

    .line 7
    .line 8
    iget v1, v0, LD/B$g;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LD/B$g;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LD/B$g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LD/B$g;-><init>(LD/B;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LD/B$g;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LD/B$g;->f:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object p1, v0, LD/B$g;->c:Ljava/lang/Object;

    .line 54
    .line 55
    move-object p2, p1

    .line 56
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 57
    .line 58
    iget-object p1, v0, LD/B$g;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lx/L;

    .line 61
    .line 62
    iget-object v2, v0, LD/B$g;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, LD/B;

    .line 65
    .line 66
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p3, p0, LD/B;->n:LF/b;

    .line 74
    .line 75
    iput-object p0, v0, LD/B$g;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, v0, LD/B$g;->b:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p2, v0, LD/B$g;->c:Ljava/lang/Object;

    .line 80
    .line 81
    iput v4, v0, LD/B$g;->f:I

    .line 82
    .line 83
    invoke-virtual {p3, v0}, LF/b;->a(LZd/e;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    if-ne p3, v1, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v2, p0

    .line 91
    :goto_1
    iget-object p3, v2, LD/B;->i:Lz/x;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    iput-object v2, v0, LD/B$g;->a:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, v0, LD/B$g;->b:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v2, v0, LD/B$g;->c:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, v0, LD/B$g;->f:I

    .line 101
    .line 102
    invoke-interface {p3, p1, p2, v0}, Lz/x;->b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    :goto_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 110
    .line 111
    return-object p1
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->v:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->u:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public f(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->i:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz/x;->f(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l(LD/s;ZZ)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, LD/B;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, LD/B;->c:LD/s;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iput-boolean v0, p0, LD/B;->b:Z

    .line 14
    .line 15
    :cond_1
    invoke-virtual {p1}, LD/s;->j()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-direct {p0, v1}, LD/B;->J(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, LD/s;->k()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {p0, v1}, LD/B;->K(Z)V

    .line 27
    .line 28
    .line 29
    iget v1, p0, LD/B;->h:F

    .line 30
    .line 31
    invoke-virtual {p1}, LD/s;->m()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sub-float/2addr v1, v2

    .line 36
    iput v1, p0, LD/B;->h:F

    .line 37
    .line 38
    iget-object v1, p0, LD/B;->f:LY/C0;

    .line 39
    .line 40
    invoke-interface {v1, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    if-eqz p3, :cond_2

    .line 44
    .line 45
    iget-object p3, p0, LD/B;->d:LD/z;

    .line 46
    .line 47
    invoke-virtual {p1}, LD/s;->q()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p3, v1}, LD/z;->i(I)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object p3, p0, LD/B;->d:LD/z;

    .line 56
    .line 57
    invoke-virtual {p3, p1}, LD/z;->h(LD/s;)V

    .line 58
    .line 59
    .line 60
    iget-boolean p3, p0, LD/B;->k:Z

    .line 61
    .line 62
    if-eqz p3, :cond_3

    .line 63
    .line 64
    iget-object p3, p0, LD/B;->a:LD/w;

    .line 65
    .line 66
    iget-object v1, p0, LD/B;->r:LD/v;

    .line 67
    .line 68
    invoke-interface {p3, v1, p1}, LD/w;->c(LD/v;LD/q;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    .line 72
    .line 73
    invoke-virtual {p1}, LD/s;->r()F

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p1}, LD/s;->o()Li1/d;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    invoke-virtual {p1}, LD/s;->n()LGf/O;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {p0, p2, p3, p1}, LD/B;->M(FLi1/d;LGf/O;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    iget p1, p0, LD/B;->j:I

    .line 89
    .line 90
    add-int/2addr p1, v0

    .line 91
    iput p1, p0, LD/B;->j:I

    .line 92
    .line 93
    return-void
.end method

.method public final n()LF/b;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->n:LF/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()LF/h;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->p:LF/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->d:LD/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/z;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final q()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->d:LD/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/z;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LD/B;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final s()LB/m;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->g:LB/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()LD/q;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->f:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LD/q;

    .line 8
    .line 9
    return-object v0
.end method

.method public final v()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->t:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Loe/f;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->d:LD/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/z;->b()LF/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Loe/f;

    .line 12
    .line 13
    return-object v0
.end method

.method public final x()LF/B;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->s:LF/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->w:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()LD/s;
    .locals 1

    .line 1
    iget-object v0, p0, LD/B;->c:LD/s;

    .line 2
    .line 3
    return-object v0
.end method
