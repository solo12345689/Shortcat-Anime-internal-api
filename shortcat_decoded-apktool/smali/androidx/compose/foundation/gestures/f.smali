.class final Landroidx/compose/foundation/gestures/f;
.super Landroidx/compose/foundation/gestures/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/j0;
.implements LK0/h;
.implements Lq0/k;
.implements LC0/e;
.implements LK0/A0;


# instance fields
.field private l:Lx/T;

.field private m:Lz/n;

.field private final n:Z

.field private final o:LD0/b;

.field private final p:Lz/v;

.field private final q:Lz/h;

.field private final r:Lz/z;

.field private final s:Landroidx/compose/foundation/gestures/e;

.field private final t:Lz/f;

.field private u:Lz/t;

.field private v:Lkotlin/jvm/functions/Function2;

.field private w:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lz/x;Lx/T;Lz/n;Lz/q;ZZLB/m;Lz/d;)V
    .locals 7

    .line 1
    invoke-static {}, Landroidx/compose/foundation/gestures/d;->a()Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v1, p7

    .line 6
    invoke-direct {p0, v0, p5, p7, p4}, Landroidx/compose/foundation/gestures/b;-><init>(Lkotlin/jvm/functions/Function1;ZLB/m;Lz/q;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Landroidx/compose/foundation/gestures/f;->l:Lx/T;

    .line 10
    .line 11
    iput-object p3, p0, Landroidx/compose/foundation/gestures/f;->m:Lz/n;

    .line 12
    .line 13
    new-instance v6, LD0/b;

    .line 14
    .line 15
    invoke-direct {v6}, LD0/b;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v6, p0, Landroidx/compose/foundation/gestures/f;->o:LD0/b;

    .line 19
    .line 20
    new-instance v0, Lz/v;

    .line 21
    .line 22
    invoke-direct {v0, p5}, Lz/v;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lz/v;

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->p:Lz/v;

    .line 32
    .line 33
    new-instance v0, Lz/h;

    .line 34
    .line 35
    invoke-static {}, Landroidx/compose/foundation/gestures/d;->c()Landroidx/compose/foundation/gestures/d$d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lv/y;->c(Li1/d;)Lw/z;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x2

    .line 45
    invoke-direct {v0, v1, v2, v3, v2}, Lz/h;-><init>(Lw/z;Ll0/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->q:Lz/h;

    .line 49
    .line 50
    iget-object v2, p0, Landroidx/compose/foundation/gestures/f;->l:Lx/T;

    .line 51
    .line 52
    iget-object v1, p0, Landroidx/compose/foundation/gestures/f;->m:Lz/n;

    .line 53
    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    move-object v3, v0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move-object v3, v1

    .line 59
    :goto_0
    new-instance v0, Lz/z;

    .line 60
    .line 61
    move-object v1, p1

    .line 62
    move-object v4, p4

    .line 63
    move v5, p6

    .line 64
    invoke-direct/range {v0 .. v6}, Lz/z;-><init>(Lz/x;Lx/T;Lz/n;Lz/q;ZLD0/b;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->r:Lz/z;

    .line 68
    .line 69
    new-instance v1, Landroidx/compose/foundation/gestures/e;

    .line 70
    .line 71
    invoke-direct {v1, v0, p5}, Landroidx/compose/foundation/gestures/e;-><init>(Lz/z;Z)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Landroidx/compose/foundation/gestures/f;->s:Landroidx/compose/foundation/gestures/e;

    .line 75
    .line 76
    new-instance v2, Lz/f;

    .line 77
    .line 78
    move-object v3, p8

    .line 79
    invoke-direct {v2, p4, v0, p6, p8}, Lz/f;-><init>(Lz/q;Lz/z;ZLz/d;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v2}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lz/f;

    .line 87
    .line 88
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->t:Lz/f;

    .line 89
    .line 90
    invoke-static {v1, v6}, LD0/d;->c(LD0/a;LD0/b;)LK0/j;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p0, v1}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroidx/compose/ui/focus/p;->a()Landroidx/compose/ui/focus/o;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p0, v1}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 102
    .line 103
    .line 104
    new-instance v1, Landroidx/compose/foundation/relocation/f;

    .line 105
    .line 106
    invoke-direct {v1, v0}, Landroidx/compose/foundation/relocation/f;-><init>(LH/c;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 110
    .line 111
    .line 112
    new-instance v0, Lx/D;

    .line 113
    .line 114
    new-instance v1, Landroidx/compose/foundation/gestures/f$a;

    .line 115
    .line 116
    invoke-direct {v1, p0}, Landroidx/compose/foundation/gestures/f$a;-><init>(Landroidx/compose/foundation/gestures/f;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, v1}, Lx/D;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public static final synthetic f2(Landroidx/compose/foundation/gestures/f;)Lz/f;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->t:Lz/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g2(Landroidx/compose/foundation/gestures/f;)Lz/h;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->q:Lz/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h2(Landroidx/compose/foundation/gestures/f;)Lz/z;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->r:Lz/z;

    .line 2
    .line 3
    return-object p0
.end method

.method private final i2()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->v:Lkotlin/jvm/functions/Function2;

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->w:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    return-void
.end method

.method private final j2(LE0/q;J)V
    .locals 9

    .line 1
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, LE0/C;

    .line 18
    .line 19
    invoke-virtual {v4}, LE0/C;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->u:Lz/t;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, LK0/k;->j(LK0/j;)Li1/d;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v0, v1, p1, p2, p3}, Lz/t;->a(Li1/d;LE0/q;J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v6, Landroidx/compose/foundation/gestures/f$e;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-direct {v6, p0, p2, p3, v0}, Landroidx/compose/foundation/gestures/f$e;-><init>(Landroidx/compose/foundation/gestures/f;JLZd/e;)V

    .line 50
    .line 51
    .line 52
    const/4 v7, 0x3

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    :goto_1
    if-ge v2, p2, :cond_2

    .line 68
    .line 69
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    check-cast p3, LE0/C;

    .line 74
    .line 75
    invoke-virtual {p3}, LE0/C;->a()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    return-void
.end method

.method private final k2()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/f$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/gestures/f$f;-><init>(Landroidx/compose/foundation/gestures/f;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->v:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    new-instance v0, Landroidx/compose/foundation/gestures/f$g;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/gestures/f$g;-><init>(Landroidx/compose/foundation/gestures/f;LZd/e;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->w:Lkotlin/jvm/functions/Function2;

    .line 15
    .line 16
    return-void
.end method

.method private final m2()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/f$h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/gestures/f$h;-><init>(Landroidx/compose/foundation/gestures/f;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, LK0/k0;->a(Landroidx/compose/ui/e$c;Lie/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public E0(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public P0(Landroidx/compose/ui/focus/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/i;->g(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public S(LE0/q;LE0/s;J)V
    .locals 5

    .line 1
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, LE0/C;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->U1()Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/b;->S(LE0/q;LE0/s;J)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    :goto_1
    sget-object v0, LE0/s;->b:LE0/s;

    .line 42
    .line 43
    if-ne p2, v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1}, LE0/q;->f()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    sget-object v0, LE0/u;->a:LE0/u$a;

    .line 50
    .line 51
    invoke-virtual {v0}, LE0/u$a;->f()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {p2, v0}, LE0/u;->i(II)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    invoke-direct {p0, p1, p3, p4}, Landroidx/compose/foundation/gestures/f;->j2(LE0/q;J)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method

.method public T0(Landroid/view/KeyEvent;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sget-object v2, LC0/a;->b:LC0/a$a;

    .line 12
    .line 13
    invoke-virtual {v2}, LC0/a$a;->l()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-static {v0, v1, v3, v4}, LC0/a;->r(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {v2}, LC0/a$a;->m()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v0, v1, v3, v4}, LC0/a;->r(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    :cond_0
    invoke-static {p1}, LC0/d;->b(Landroid/view/KeyEvent;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sget-object v1, LC0/c;->a:LC0/c$a;

    .line 42
    .line 43
    invoke-virtual {v1}, LC0/c$a;->a()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v0, v1}, LC0/c;->e(II)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-static {p1}, LC0/d;->e(Landroid/view/KeyEvent;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->r:Lz/z;

    .line 60
    .line 61
    invoke-virtual {v0}, Lz/z;->p()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->t:Lz/f;

    .line 69
    .line 70
    invoke-virtual {v0}, Lz/f;->U1()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    invoke-static {v3, v4}, Li1/r;->f(J)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    invoke-virtual {v2}, LC0/a$a;->m()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    invoke-static {v3, v4, v5, v6}, LC0/a;->r(JJ)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    int-to-float p1, v0

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    int-to-float p1, v0

    .line 95
    neg-float p1, p1

    .line 96
    :goto_0
    invoke-static {v1, p1}, Lr0/g;->a(FF)J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->t:Lz/f;

    .line 102
    .line 103
    invoke-virtual {v0}, Lz/f;->U1()J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    invoke-static {v3, v4}, Li1/r;->g(J)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    invoke-virtual {v2}, LC0/a$a;->m()J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    invoke-static {v3, v4, v5, v6}, LC0/a;->r(JJ)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_3

    .line 124
    .line 125
    int-to-float p1, v0

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    int-to-float p1, v0

    .line 128
    neg-float p1, p1

    .line 129
    :goto_1
    invoke-static {p1, v1}, Lr0/g;->a(FF)J

    .line 130
    .line 131
    .line 132
    move-result-wide v0

    .line 133
    :goto_2
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    new-instance v5, Landroidx/compose/foundation/gestures/f$d;

    .line 138
    .line 139
    const/4 p1, 0x0

    .line 140
    invoke-direct {v5, p0, v0, v1, p1}, Landroidx/compose/foundation/gestures/f$d;-><init>(Landroidx/compose/foundation/gestures/f;JLZd/e;)V

    .line 141
    .line 142
    .line 143
    const/4 v6, 0x3

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v3, 0x0

    .line 146
    const/4 v4, 0x0

    .line 147
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 148
    .line 149
    .line 150
    const/4 p1, 0x1

    .line 151
    return p1

    .line 152
    :cond_4
    const/4 p1, 0x0

    .line 153
    return p1
.end method

.method public T1(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->r:Lz/z;

    .line 2
    .line 3
    sget-object v1, Lx/L;->b:Lx/L;

    .line 4
    .line 5
    new-instance v2, Landroidx/compose/foundation/gestures/f$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, p1, v0, v3}, Landroidx/compose/foundation/gestures/f$b;-><init>(Lkotlin/jvm/functions/Function2;Lz/z;LZd/e;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, p2}, Lz/z;->v(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 23
    .line 24
    return-object p1
.end method

.method public X1(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public Y(LR0/C;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->v:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->w:Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->k2()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->v:Lkotlin/jvm/functions/Function2;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {p1, v2, v0, v1, v2}, LR0/A;->N(LR0/C;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->w:Lkotlin/jvm/functions/Function2;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-static {p1, v0}, LR0/A;->O(LR0/C;Lkotlin/jvm/functions/Function2;)V

    .line 32
    .line 33
    .line 34
    :cond_3
    return-void
.end method

.method public Y1(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->o:LD0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LD0/b;->e()LGf/O;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v4, Landroidx/compose/foundation/gestures/f$c;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/f$c;-><init>(Landroidx/compose/foundation/gestures/f;JLZd/e;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public c2()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->r:Lz/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz/z;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/f;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l2(Lz/x;Lz/q;Lx/T;ZZLz/n;LB/m;Lz/d;)V
    .locals 14

    .line 1
    move/from16 v2, p4

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->V1()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/foundation/gestures/f;->s:Landroidx/compose/foundation/gestures/e;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/gestures/e;->a(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Landroidx/compose/foundation/gestures/f;->p:Lz/v;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lz/v;->F1(Z)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    :goto_0
    move v6, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/foundation/gestures/f;->q:Lz/h;

    .line 29
    .line 30
    move-object v12, v1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    move-object v12, v0

    .line 33
    :goto_2
    iget-object v7, p0, Landroidx/compose/foundation/gestures/f;->r:Lz/z;

    .line 34
    .line 35
    iget-object v13, p0, Landroidx/compose/foundation/gestures/f;->o:LD0/b;

    .line 36
    .line 37
    move-object v8, p1

    .line 38
    move-object/from16 v9, p2

    .line 39
    .line 40
    move-object/from16 v10, p3

    .line 41
    .line 42
    move/from16 v11, p5

    .line 43
    .line 44
    invoke-virtual/range {v7 .. v13}, Lz/z;->C(Lz/x;Lz/q;Lx/T;ZLz/n;LD0/b;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    iget-object p1, p0, Landroidx/compose/foundation/gestures/f;->t:Lz/f;

    .line 49
    .line 50
    move-object/from16 v1, p8

    .line 51
    .line 52
    invoke-virtual {p1, v9, v11, v1}, Lz/f;->b2(Lz/q;ZLz/d;)V

    .line 53
    .line 54
    .line 55
    iput-object v10, p0, Landroidx/compose/foundation/gestures/f;->l:Lx/T;

    .line 56
    .line 57
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->m:Lz/n;

    .line 58
    .line 59
    invoke-static {}, Landroidx/compose/foundation/gestures/d;->a()Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object p1, p0, Landroidx/compose/foundation/gestures/f;->r:Lz/z;

    .line 64
    .line 65
    invoke-virtual {p1}, Lz/z;->p()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    sget-object p1, Lz/q;->a:Lz/q;

    .line 72
    .line 73
    :goto_3
    move-object v0, p0

    .line 74
    move-object v4, p1

    .line 75
    move-object/from16 v3, p7

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_2
    sget-object p1, Lz/q;->b:Lz/q;

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :goto_4
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/gestures/b;->e2(Lkotlin/jvm/functions/Function1;ZLB/m;Lz/q;Z)V

    .line 82
    .line 83
    .line 84
    if-eqz v6, :cond_3

    .line 85
    .line 86
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->i2()V

    .line 87
    .line 88
    .line 89
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    return-void
.end method

.method public onAttach()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lz/b;->a(LK0/h;)Lz/t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->u:Lz/t;

    .line 9
    .line 10
    return-void
.end method

.method public q0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->m2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
