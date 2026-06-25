.class public abstract Landroidx/compose/foundation/a;
.super LK0/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/v0;
.implements LC0/e;
.implements Lq0/d;
.implements LK0/A0;
.implements LK0/I0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/a$a;
    }
.end annotation


# static fields
.field public static final u:Landroidx/compose/foundation/a$a;

.field public static final v:I


# instance fields
.field private c:LB/m;

.field private d:Lx/I;

.field private e:Ljava/lang/String;

.field private f:LR0/h;

.field private g:Z

.field private h:Lie/a;

.field private final i:Z

.field private final j:Lx/x;

.field private final k:Lx/z;

.field private l:LE0/X;

.field private m:LK0/j;

.field private n:LB/o$b;

.field private o:LB/g;

.field private final p:Ljava/util/Map;

.field private q:J

.field private r:LB/m;

.field private s:Z

.field private final t:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/a;->u:Landroidx/compose/foundation/a$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/foundation/a;->v:I

    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LK0/m;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/a;->d:Lx/I;

    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/a;->e:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Landroidx/compose/foundation/a;->f:LR0/h;

    .line 7
    iput-boolean p3, p0, Landroidx/compose/foundation/a;->g:Z

    .line 8
    iput-object p6, p0, Landroidx/compose/foundation/a;->h:Lie/a;

    .line 9
    new-instance p1, Lx/x;

    invoke-direct {p1}, Lx/x;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->j:Lx/x;

    .line 10
    new-instance p1, Lx/z;

    iget-object p2, p0, Landroidx/compose/foundation/a;->c:LB/m;

    invoke-direct {p1, p2}, Lx/z;-><init>(LB/m;)V

    iput-object p1, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->p:Ljava/util/Map;

    .line 12
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    invoke-virtual {p1}, Lr0/f$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/a;->q:J

    .line 13
    iget-object p1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    iput-object p1, p0, Landroidx/compose/foundation/a;->r:LB/m;

    .line 14
    invoke-direct {p0}, Landroidx/compose/foundation/a;->b2()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/compose/foundation/a;->s:Z

    .line 15
    sget-object p1, Landroidx/compose/foundation/a;->u:Landroidx/compose/foundation/a$a;

    iput-object p1, p0, Landroidx/compose/foundation/a;->t:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/a;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V

    return-void
.end method

.method public static final synthetic K1(Landroidx/compose/foundation/a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/a;->S1()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic L1(Landroidx/compose/foundation/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/a;->U1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic M1(Landroidx/compose/foundation/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/a;->V1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic N1(Landroidx/compose/foundation/a;)LB/m;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic O1(Landroidx/compose/foundation/a;)LB/o$b;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/a;->n:LB/o$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic P1(Landroidx/compose/foundation/a;LB/o$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/a;->n:LB/o$b;

    .line 2
    .line 3
    return-void
.end method

.method private final S1()Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/d;->g(LK0/I0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lx/k;->c(LK0/j;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method private final U1()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LB/g;

    .line 6
    .line 7
    invoke-direct {v0}, LB/g;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v5, Landroidx/compose/foundation/a$c;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v5, v1, v0, v3}, Landroidx/compose/foundation/a$c;-><init>(LB/m;LB/g;LZd/e;)V

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x3

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 28
    .line 29
    .line 30
    :cond_0
    iput-object v0, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method private final V1()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v1, LB/h;

    .line 6
    .line 7
    invoke-direct {v1, v0}, LB/h;-><init>(LB/g;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v6, Landroidx/compose/foundation/a$d;

    .line 20
    .line 21
    invoke-direct {v6, v0, v1, v2}, Landroidx/compose/foundation/a$d;-><init>(LB/m;LB/h;LZd/e;)V

    .line 22
    .line 23
    .line 24
    const/4 v7, 0x3

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 29
    .line 30
    .line 31
    :cond_0
    iput-object v2, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method private final Z1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->m:LK0/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->d:Lx/I;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-static {}, LB/l;->a()LB/m;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 19
    .line 20
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lx/z;->K1(LB/m;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lx/I;->a(LB/k;)LK0/j;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/compose/foundation/a;->m:LK0/j;

    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method private final b2()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->r:LB/m;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/a;->d:Lx/I;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method


# virtual methods
.method public B()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->t:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E0(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public Q1(LR0/C;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract R1(LE0/L;LZd/e;)Ljava/lang/Object;
.end method

.method public final S(LE0/q;LE0/s;J)V
    .locals 10

    .line 1
    invoke-static {p3, p4}, Li1/s;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    int-to-float v2, v2

    .line 10
    invoke-static {v0, v1}, Li1/n;->l(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    int-to-float v0, v0

    .line 15
    invoke-static {v2, v0}, Lr0/g;->a(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Landroidx/compose/foundation/a;->q:J

    .line 20
    .line 21
    invoke-direct {p0}, Landroidx/compose/foundation/a;->Z1()V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->g:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sget-object v0, LE0/s;->b:LE0/s;

    .line 30
    .line 31
    if-ne p2, v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, LE0/q;->f()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sget-object v2, LE0/u;->a:LE0/u$a;

    .line 38
    .line 39
    invoke-virtual {v2}, LE0/u$a;->a()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-static {v0, v3}, LE0/u;->i(II)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    new-instance v7, Landroidx/compose/foundation/a$h;

    .line 54
    .line 55
    invoke-direct {v7, p0, v1}, Landroidx/compose/foundation/a$h;-><init>(Landroidx/compose/foundation/a;LZd/e;)V

    .line 56
    .line 57
    .line 58
    const/4 v8, 0x3

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    invoke-static/range {v4 .. v9}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v2}, LE0/u$a;->b()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v0, v2}, LE0/u;->i(II)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    new-instance v5, Landroidx/compose/foundation/a$i;

    .line 81
    .line 82
    invoke-direct {v5, p0, v1}, Landroidx/compose/foundation/a$i;-><init>(Landroidx/compose/foundation/a;LZd/e;)V

    .line 83
    .line 84
    .line 85
    const/4 v6, 0x3

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 90
    .line 91
    .line 92
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->l:LE0/X;

    .line 93
    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    new-instance v0, Landroidx/compose/foundation/a$j;

    .line 97
    .line 98
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/a$j;-><init>(Landroidx/compose/foundation/a;LZd/e;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, LE0/V;->a(Lkotlin/jvm/functions/Function2;)LE0/X;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, LE0/X;

    .line 110
    .line 111
    iput-object v0, p0, Landroidx/compose/foundation/a;->l:LE0/X;

    .line 112
    .line 113
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/a;->l:LE0/X;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    invoke-interface {v0, p1, p2, p3, p4}, LK0/v0;->S(LE0/q;LE0/s;J)V

    .line 118
    .line 119
    .line 120
    :cond_3
    return-void
.end method

.method public final T0(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/a;->Z1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->g:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-static {p1}, Lx/k;->f(Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/foundation/a;->p:Ljava/util/Map;

    .line 18
    .line 19
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    invoke-static {v4, v5}, LC0/a;->o(J)LC0/a;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance v0, LB/o$b;

    .line 34
    .line 35
    iget-wide v4, p0, Landroidx/compose/foundation/a;->q:J

    .line 36
    .line 37
    invoke-direct {v0, v4, v5, v3}, LB/o$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/compose/foundation/a;->p:Ljava/util/Map;

    .line 41
    .line 42
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    invoke-static {v4, v5}, LC0/a;->o(J)LC0/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 54
    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    new-instance v7, Landroidx/compose/foundation/a$f;

    .line 62
    .line 63
    invoke-direct {v7, p0, v0, v3}, Landroidx/compose/foundation/a$f;-><init>(Landroidx/compose/foundation/a;LB/o$b;LZd/e;)V

    .line 64
    .line 65
    .line 66
    const/4 v8, 0x3

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    invoke-static/range {v4 .. v9}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 71
    .line 72
    .line 73
    :cond_0
    return v2

    .line 74
    :cond_1
    return v1

    .line 75
    :cond_2
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->g:Z

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    invoke-static {p1}, Lx/k;->b(Landroid/view/KeyEvent;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Landroidx/compose/foundation/a;->p:Ljava/util/Map;

    .line 86
    .line 87
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    invoke-static {v4, v5}, LC0/a;->o(J)LC0/a;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, LB/o$b;

    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    iget-object v0, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    new-instance v7, Landroidx/compose/foundation/a$g;

    .line 112
    .line 113
    invoke-direct {v7, p0, p1, v3}, Landroidx/compose/foundation/a$g;-><init>(Landroidx/compose/foundation/a;LB/o$b;LZd/e;)V

    .line 114
    .line 115
    .line 116
    const/4 v8, 0x3

    .line 117
    const/4 v9, 0x0

    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    invoke-static/range {v4 .. v9}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 121
    .line 122
    .line 123
    :cond_3
    iget-object p1, p0, Landroidx/compose/foundation/a;->h:Lie/a;

    .line 124
    .line 125
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    return v2

    .line 129
    :cond_4
    return v1
.end method

.method protected final T1()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/a;->n:LB/o$b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, LB/o$a;

    .line 10
    .line 11
    invoke-direct {v2, v1}, LB/o$a;-><init>(LB/o$b;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v2}, LB/m;->a(LB/j;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    new-instance v2, LB/h;

    .line 22
    .line 23
    invoke-direct {v2, v1}, LB/h;-><init>(LB/g;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v2}, LB/m;->a(LB/j;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/a;->p:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, LB/o$b;

    .line 52
    .line 53
    new-instance v3, LB/o$a;

    .line 54
    .line 55
    invoke-direct {v3, v2}, LB/o$a;-><init>(LB/o$b;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, v3}, LB/m;->a(LB/j;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Landroidx/compose/foundation/a;->n:LB/o$b;

    .line 64
    .line 65
    iput-object v0, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 66
    .line 67
    iget-object v0, p0, Landroidx/compose/foundation/a;->p:Ljava/util/Map;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final W0(Lq0/n;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lq0/n;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/compose/foundation/a;->Z1()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->g:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lx/z;->W0(Lq0/n;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method protected final W1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method protected final X1()Lie/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->h:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Y(LR0/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->f:LR0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LR0/h;->p()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p1, v0}, LR0/A;->c0(LR0/C;I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->e:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Landroidx/compose/foundation/a$b;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Landroidx/compose/foundation/a$b;-><init>(Landroidx/compose/foundation/a;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0, v1}, LR0/A;->s(LR0/C;Ljava/lang/String;Lie/a;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->g:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lx/z;->Y(LR0/C;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p1}, LR0/A;->h(LR0/C;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/a;->Q1(LR0/C;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method protected final Y1(Lz/r;JLZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v4, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 2
    .line 3
    if-eqz v4, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/foundation/a$e;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v5, p0

    .line 9
    move-object v1, p1

    .line 10
    move-wide v2, p2

    .line 11
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/a$e;-><init>(Lz/r;JLB/m;Landroidx/compose/foundation/a;LZd/e;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p4}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 26
    .line 27
    return-object p1
.end method

.method public final a1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, LB/h;

    .line 10
    .line 11
    invoke-direct {v2, v1}, LB/h;-><init>(LB/g;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v2}, LB/m;->a(LB/j;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/compose/foundation/a;->o:LB/g;

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/compose/foundation/a;->l:LE0/X;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, LK0/v0;->a1()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method protected final a2()LTd/L;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->l:LE0/X;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LE0/X;->C0()V

    .line 6
    .line 7
    .line 8
    sget-object v0, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method protected final c2(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/a;->r:LB/m;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->T1()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/compose/foundation/a;->r:LB/m;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 16
    .line 17
    move p1, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->d:Lx/I;

    .line 21
    .line 22
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iput-object p2, p0, Landroidx/compose/foundation/a;->d:Lx/I;

    .line 29
    .line 30
    move p1, v1

    .line 31
    :cond_1
    iget-boolean p2, p0, Landroidx/compose/foundation/a;->g:Z

    .line 32
    .line 33
    if-eq p2, p3, :cond_3

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    iget-object p2, p0, Landroidx/compose/foundation/a;->j:Lx/x;

    .line 38
    .line 39
    invoke-virtual {p0, p2}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 43
    .line 44
    invoke-virtual {p0, p2}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object p2, p0, Landroidx/compose/foundation/a;->j:Lx/x;

    .line 49
    .line 50
    invoke-virtual {p0, p2}, LK0/m;->H1(LK0/j;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 54
    .line 55
    invoke-virtual {p0, p2}, LK0/m;->H1(LK0/j;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->T1()V

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 62
    .line 63
    .line 64
    iput-boolean p3, p0, Landroidx/compose/foundation/a;->g:Z

    .line 65
    .line 66
    :cond_3
    iget-object p2, p0, Landroidx/compose/foundation/a;->e:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_4

    .line 73
    .line 74
    iput-object p4, p0, Landroidx/compose/foundation/a;->e:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    iget-object p2, p0, Landroidx/compose/foundation/a;->f:LR0/h;

    .line 80
    .line 81
    invoke-static {p2, p5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_5

    .line 86
    .line 87
    iput-object p5, p0, Landroidx/compose/foundation/a;->f:LR0/h;

    .line 88
    .line 89
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    iput-object p6, p0, Landroidx/compose/foundation/a;->h:Lie/a;

    .line 93
    .line 94
    iget-boolean p2, p0, Landroidx/compose/foundation/a;->s:Z

    .line 95
    .line 96
    invoke-direct {p0}, Landroidx/compose/foundation/a;->b2()Z

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    if-eq p2, p3, :cond_6

    .line 101
    .line 102
    invoke-direct {p0}, Landroidx/compose/foundation/a;->b2()Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    iput-boolean p2, p0, Landroidx/compose/foundation/a;->s:Z

    .line 107
    .line 108
    if-nez p2, :cond_6

    .line 109
    .line 110
    iget-object p2, p0, Landroidx/compose/foundation/a;->m:LK0/j;

    .line 111
    .line 112
    if-nez p2, :cond_6

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    move v1, p1

    .line 116
    :goto_2
    if-eqz v1, :cond_9

    .line 117
    .line 118
    iget-object p1, p0, Landroidx/compose/foundation/a;->m:LK0/j;

    .line 119
    .line 120
    if-nez p1, :cond_7

    .line 121
    .line 122
    iget-boolean p2, p0, Landroidx/compose/foundation/a;->s:Z

    .line 123
    .line 124
    if-nez p2, :cond_9

    .line 125
    .line 126
    :cond_7
    if-eqz p1, :cond_8

    .line 127
    .line 128
    invoke-virtual {p0, p1}, LK0/m;->H1(LK0/j;)V

    .line 129
    .line 130
    .line 131
    :cond_8
    const/4 p1, 0x0

    .line 132
    iput-object p1, p0, Landroidx/compose/foundation/a;->m:LK0/j;

    .line 133
    .line 134
    invoke-direct {p0}, Landroidx/compose/foundation/a;->Z1()V

    .line 135
    .line 136
    .line 137
    :cond_9
    iget-object p1, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 138
    .line 139
    iget-object p2, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Lx/z;->K1(LB/m;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final onAttach()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/compose/foundation/a;->Z1()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->g:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/foundation/a;->j:Lx/x;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/foundation/a;->k:Lx/z;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final onDetach()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->T1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/a;->r:LB/m;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Landroidx/compose/foundation/a;->c:LB/m;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->m:LK0/j;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, LK0/m;->H1(LK0/j;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v1, p0, Landroidx/compose/foundation/a;->m:LK0/j;

    .line 19
    .line 20
    return-void
.end method

.method public final z1()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
