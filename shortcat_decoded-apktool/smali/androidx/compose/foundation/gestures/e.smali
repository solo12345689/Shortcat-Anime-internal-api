.class final Landroidx/compose/foundation/gestures/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD0/a;


# instance fields
.field private final a:Lz/z;

.field private b:Z


# direct methods
.method public constructor <init>(Lz/z;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/e;->a:Lz/z;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/e;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public L0(JJLZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of p1, p5, Landroidx/compose/foundation/gestures/e$a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p5

    .line 6
    check-cast p1, Landroidx/compose/foundation/gestures/e$a;

    .line 7
    .line 8
    iget p2, p1, Landroidx/compose/foundation/gestures/e$a;->d:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    and-int v1, p2, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p2, v0

    .line 17
    iput p2, p1, Landroidx/compose/foundation/gestures/e$a;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Landroidx/compose/foundation/gestures/e$a;

    .line 21
    .line 22
    invoke-direct {p1, p0, p5}, Landroidx/compose/foundation/gestures/e$a;-><init>(Landroidx/compose/foundation/gestures/e;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, p1, Landroidx/compose/foundation/gestures/e$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    iget v0, p1, Landroidx/compose/foundation/gestures/e$a;->d:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    iget-wide p3, p1, Landroidx/compose/foundation/gestures/e$a;->a:J

    .line 39
    .line 40
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-boolean p2, p0, Landroidx/compose/foundation/gestures/e;->b:Z

    .line 56
    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    iget-object p2, p0, Landroidx/compose/foundation/gestures/e;->a:Lz/z;

    .line 60
    .line 61
    iput-wide p3, p1, Landroidx/compose/foundation/gestures/e$a;->a:J

    .line 62
    .line 63
    iput v1, p1, Landroidx/compose/foundation/gestures/e$a;->d:I

    .line 64
    .line 65
    invoke-virtual {p2, p3, p4, p1}, Lz/z;->n(JLZd/e;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-ne p2, p5, :cond_3

    .line 70
    .line 71
    return-object p5

    .line 72
    :cond_3
    :goto_1
    check-cast p2, Li1/y;

    .line 73
    .line 74
    invoke-virtual {p2}, Li1/y;->o()J

    .line 75
    .line 76
    .line 77
    move-result-wide p1

    .line 78
    invoke-static {p3, p4, p1, p2}, Li1/y;->k(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    sget-object p1, Li1/y;->b:Li1/y$a;

    .line 84
    .line 85
    invoke-virtual {p1}, Li1/y$a;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide p1

    .line 89
    :goto_2
    invoke-static {p1, p2}, Li1/y;->b(J)Li1/y;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
.end method

.method public final a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/gestures/e;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public y0(JJI)J
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/compose/foundation/gestures/e;->b:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/foundation/gestures/e;->a:Lz/z;

    .line 6
    .line 7
    invoke-virtual {p1, p3, p4}, Lz/z;->r(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    return-wide p1

    .line 12
    :cond_0
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 13
    .line 14
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
.end method
