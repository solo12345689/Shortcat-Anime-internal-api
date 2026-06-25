.class public final LE/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE/I$c;
    }
.end annotation


# static fields
.field public static final v:LE/I$c;

.field private static final w:Lh0/v;


# instance fields
.field private final a:LE/A;

.field private final b:LE/D;

.field private final c:LY/C0;

.field private final d:LB/m;

.field private e:F

.field private final f:Lz/x;

.field private g:I

.field private h:Z

.field private i:LI0/K;

.field private final j:LI0/L;

.field private final k:LF/b;

.field private final l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

.field private final m:LF/h;

.field private final n:Landroidx/compose/foundation/lazy/layout/d;

.field private final o:LE/z;

.field private final p:LE/e;

.field private final q:LF/B;

.field private final r:LY/C0;

.field private final s:LY/C0;

.field private final t:LY/C0;

.field private final u:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE/I$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LE/I$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LE/I;->v:LE/I$c;

    .line 8
    .line 9
    sget-object v0, LE/I$a;->a:LE/I$a;

    .line 10
    .line 11
    sget-object v1, LE/I$b;->a:LE/I$b;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lh0/b;->b(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lh0/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LE/I;->w:Lh0/v;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 23
    invoke-static {v2, v0, v1}, LE/B;->b(IILjava/lang/Object;)LE/A;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, LE/I;-><init>(IILE/A;)V

    return-void
.end method

.method public constructor <init>(IILE/A;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, LE/I;->a:LE/A;

    .line 3
    new-instance v0, LE/D;

    invoke-direct {v0, p1, p2}, LE/D;-><init>(II)V

    iput-object v0, p0, LE/I;->b:LE/D;

    .line 4
    invoke-static {}, LE/J;->a()LE/u;

    move-result-object p2

    .line 5
    invoke-static {}, LY/U1;->j()LY/T1;

    move-result-object v1

    .line 6
    invoke-static {p2, v1}, LY/U1;->h(Ljava/lang/Object;LY/T1;)LY/C0;

    move-result-object p2

    iput-object p2, p0, LE/I;->c:LY/C0;

    .line 7
    invoke-static {}, LB/l;->a()LB/m;

    move-result-object p2

    iput-object p2, p0, LE/I;->d:LB/m;

    .line 8
    new-instance p2, LE/I$i;

    invoke-direct {p2, p0}, LE/I$i;-><init>(LE/I;)V

    invoke-static {p2}, Lz/y;->a(Lkotlin/jvm/functions/Function1;)Lz/x;

    move-result-object p2

    iput-object p2, p0, LE/I;->f:Lz/x;

    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p0, LE/I;->h:Z

    .line 10
    new-instance v1, LE/I$f;

    invoke-direct {v1, p0}, LE/I$f;-><init>(LE/I;)V

    iput-object v1, p0, LE/I;->j:LI0/L;

    .line 11
    new-instance v1, LF/b;

    invoke-direct {v1}, LF/b;-><init>()V

    iput-object v1, p0, LE/I;->k:LF/b;

    .line 12
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;-><init>()V

    iput-object v1, p0, LE/I;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 13
    new-instance v1, LF/h;

    invoke-direct {v1}, LF/h;-><init>()V

    iput-object v1, p0, LE/I;->m:LF/h;

    .line 14
    new-instance v1, Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p3}, LE/A;->b()LF/N;

    move-result-object p3

    new-instance v2, LE/I$e;

    invoke-direct {v2, p0, p1}, LE/I$e;-><init>(LE/I;I)V

    invoke-direct {v1, p3, v2}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LF/N;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, LE/I;->n:Landroidx/compose/foundation/lazy/layout/d;

    .line 15
    new-instance p1, LE/I$d;

    invoke-direct {p1, p0}, LE/I$d;-><init>(LE/I;)V

    iput-object p1, p0, LE/I;->o:LE/z;

    .line 16
    new-instance p1, LE/e;

    invoke-direct {p1, p0}, LE/e;-><init>(LE/I;)V

    iput-object p1, p0, LE/I;->p:LE/e;

    .line 17
    new-instance p1, LF/B;

    invoke-direct {p1}, LF/B;-><init>()V

    iput-object p1, p0, LE/I;->q:LF/B;

    .line 18
    invoke-virtual {v0}, LE/D;->b()LF/y;

    const/4 p1, 0x0

    .line 19
    invoke-static {p1, p2, p1}, LF/J;->c(LY/C0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LY/C0;

    move-result-object p3

    iput-object p3, p0, LE/I;->r:LY/C0;

    .line 20
    invoke-static {p1, p2, p1}, LF/J;->c(LY/C0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LY/C0;

    move-result-object p2

    iput-object p2, p0, LE/I;->s:LY/C0;

    .line 21
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p3, 0x2

    invoke-static {p2, p1, p3, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v0

    iput-object v0, p0, LE/I;->t:LY/C0;

    .line 22
    invoke-static {p2, p1, p3, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LE/I;->u:LY/C0;

    return-void
.end method

.method private final C(FLE/s;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LE/I;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LE/I;->a:LE/A;

    .line 6
    .line 7
    iget-object v1, p0, LE/I;->o:LE/z;

    .line 8
    .line 9
    invoke-interface {v0, v1, p1, p2}, LE/A;->c(LE/z;FLE/s;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static synthetic F(LE/I;IILZd/e;ILjava/lang/Object;)Ljava/lang/Object;
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
    invoke-virtual {p0, p1, p2, p3}, LE/I;->E(IILZd/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private G(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->u:LY/C0;

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

.method private H(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->t:LY/C0;

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

.method public static final synthetic g(LE/I;)LY/C0;
    .locals 0

    .line 1
    iget-object p0, p0, LE/I;->c:LY/C0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(LE/I;)LE/A;
    .locals 0

    .line 1
    iget-object p0, p0, LE/I;->a:LE/A;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i()Lh0/v;
    .locals 1

    .line 1
    sget-object v0, LE/I;->w:Lh0/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j(LE/I;LI0/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/I;->i:LI0/K;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic l(LE/I;LE/u;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, LE/I;->k(LE/u;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final A()F
    .locals 1

    .line 1
    iget v0, p0, LE/I;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final B()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->c:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE/u;

    .line 8
    .line 9
    invoke-virtual {v0}, LE/u;->p()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final D(F)F
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LE/I;->e()Z

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
    invoke-virtual {p0}, LE/I;->c()Z

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
    iget v1, p0, LE/I;->e:F

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
    if-gtz v1, :cond_7

    .line 34
    .line 35
    iget v1, p0, LE/I;->e:F

    .line 36
    .line 37
    add-float/2addr v1, p1

    .line 38
    iput v1, p0, LE/I;->e:F

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
    if-lez v1, :cond_5

    .line 47
    .line 48
    iget-object v1, p0, LE/I;->c:LY/C0;

    .line 49
    .line 50
    invoke-interface {v1}, LY/C0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, LE/u;

    .line 55
    .line 56
    iget v3, p0, LE/I;->e:F

    .line 57
    .line 58
    invoke-static {v3}, Lke/a;->d(F)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-virtual {v1, v4}, LE/u;->q(I)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    invoke-virtual {p0, v1, v4}, LE/I;->k(LE/u;Z)V

    .line 70
    .line 71
    .line 72
    iget-object v4, p0, LE/I;->r:LY/C0;

    .line 73
    .line 74
    invoke-static {v4}, LF/J;->d(LY/C0;)V

    .line 75
    .line 76
    .line 77
    iget v4, p0, LE/I;->e:F

    .line 78
    .line 79
    sub-float/2addr v3, v4

    .line 80
    invoke-direct {p0, v3, v1}, LE/I;->C(FLE/s;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    iget-object v1, p0, LE/I;->i:LI0/K;

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    invoke-interface {v1}, LI0/K;->i()V

    .line 89
    .line 90
    .line 91
    :cond_4
    iget v1, p0, LE/I;->e:F

    .line 92
    .line 93
    sub-float/2addr v3, v1

    .line 94
    invoke-virtual {p0}, LE/I;->s()LE/s;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {p0, v3, v1}, LE/I;->C(FLE/s;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    :goto_0
    iget v1, p0, LE/I;->e:F

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    cmpg-float v1, v1, v2

    .line 108
    .line 109
    if-gtz v1, :cond_6

    .line 110
    .line 111
    return p1

    .line 112
    :cond_6
    iget v1, p0, LE/I;->e:F

    .line 113
    .line 114
    sub-float/2addr p1, v1

    .line 115
    iput v0, p0, LE/I;->e:F

    .line 116
    .line 117
    return p1

    .line 118
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v0, "entered drag with non-zero pending scroll: "

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget v0, p0, LE/I;->e:F

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0
.end method

.method public final E(IILZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v2, LE/I$h;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, p0, p1, p2, v0}, LE/I$h;-><init>(LE/I;IILZd/e;)V

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

.method public final I(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->b:LE/D;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/D;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LE/I;->b:LE/D;

    .line 10
    .line 11
    invoke-virtual {v0}, LE/D;->c()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, p2, :cond_1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LE/I;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, LE/I;->b:LE/D;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, LE/D;->d(II)V

    .line 25
    .line 26
    .line 27
    if-eqz p3, :cond_3

    .line 28
    .line 29
    iget-object p1, p0, LE/I;->i:LI0/K;

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
    iget-object p1, p0, LE/I;->s:LY/C0;

    .line 38
    .line 39
    invoke-static {p1}, LF/J;->d(LY/C0;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final J(LE/l;I)I
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->b:LE/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LE/D;->j(LE/l;I)I

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
    iget-object v0, p0, LE/I;->f:Lz/x;

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
    instance-of v0, p3, LE/I$g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LE/I$g;

    .line 7
    .line 8
    iget v1, v0, LE/I$g;->f:I

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
    iput v1, v0, LE/I$g;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LE/I$g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LE/I$g;-><init>(LE/I;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LE/I$g;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LE/I$g;->f:I

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
    iget-object p1, v0, LE/I$g;->c:Ljava/lang/Object;

    .line 54
    .line 55
    move-object p2, p1

    .line 56
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 57
    .line 58
    iget-object p1, v0, LE/I$g;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lx/L;

    .line 61
    .line 62
    iget-object v2, v0, LE/I$g;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, LE/I;

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
    iget-object p3, p0, LE/I;->k:LF/b;

    .line 74
    .line 75
    iput-object p0, v0, LE/I$g;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, v0, LE/I$g;->b:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p2, v0, LE/I$g;->c:Ljava/lang/Object;

    .line 80
    .line 81
    iput v4, v0, LE/I$g;->f:I

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
    iget-object p3, v2, LE/I;->f:Lz/x;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    iput-object v2, v0, LE/I$g;->a:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, v0, LE/I$g;->b:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v2, v0, LE/I$g;->c:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, v0, LE/I$g;->f:I

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
    iget-object v0, p0, LE/I;->u:LY/C0;

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
    iget-object v0, p0, LE/I;->t:LY/C0;

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
    iget-object v0, p0, LE/I;->f:Lz/x;

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

.method public final k(LE/u;Z)V
    .locals 2

    .line 1
    iget v0, p0, LE/I;->e:F

    .line 2
    .line 3
    invoke-virtual {p1}, LE/u;->l()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sub-float/2addr v0, v1

    .line 8
    iput v0, p0, LE/I;->e:F

    .line 9
    .line 10
    iget-object v0, p0, LE/I;->c:LY/C0;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, LE/u;->j()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-direct {p0, v0}, LE/I;->G(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, LE/u;->k()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-direct {p0, v0}, LE/I;->H(Z)V

    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    iget-object p2, p0, LE/I;->b:LE/D;

    .line 32
    .line 33
    invoke-virtual {p1}, LE/u;->n()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p2, p1}, LE/D;->i(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p2, p0, LE/I;->b:LE/D;

    .line 42
    .line 43
    invoke-virtual {p2, p1}, LE/D;->h(LE/u;)V

    .line 44
    .line 45
    .line 46
    iget-boolean p2, p0, LE/I;->h:Z

    .line 47
    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    iget-object p2, p0, LE/I;->a:LE/A;

    .line 51
    .line 52
    iget-object v0, p0, LE/I;->o:LE/z;

    .line 53
    .line 54
    invoke-interface {p2, v0, p1}, LE/A;->d(LE/z;LE/s;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_0
    iget p1, p0, LE/I;->g:I

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    iput p1, p0, LE/I;->g:I

    .line 62
    .line 63
    return-void
.end method

.method public final m()LF/b;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->k:LF/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()LF/h;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->m:LF/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->b:LE/D;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/D;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->b:LE/D;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/D;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final q()LB/m;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->d:LB/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()LE/s;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->c:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE/s;

    .line 8
    .line 9
    return-object v0
.end method

.method public final t()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->s:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Loe/f;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->b:LE/D;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/D;->b()LF/y;

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

.method public final v()LF/B;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->q:LF/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->r:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->n:Landroidx/compose/foundation/lazy/layout/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()LI0/K;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->i:LI0/K;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()LI0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LE/I;->j:LI0/L;

    .line 2
    .line 3
    return-object v0
.end method
