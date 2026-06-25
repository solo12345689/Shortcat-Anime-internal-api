.class public final LI0/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/A;


# instance fields
.field private final a:LI0/l;

.field private final b:LI0/n;

.field private final c:LI0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LI0/l;LI0/n;LI0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI0/h;->a:LI0/l;

    .line 5
    .line 6
    iput-object p2, p0, LI0/h;->b:LI0/n;

    .line 7
    .line 8
    iput-object p3, p0, LI0/h;->c:LI0/o;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public I(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LI0/l;->I(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public Z(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LI0/l;->Z(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/l;->j()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LI0/l;->l0(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public q0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LI0/l;->q0(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public v0(J)Landroidx/compose/ui/layout/s;
    .locals 3

    .line 1
    iget-object v0, p0, LI0/h;->c:LI0/o;

    .line 2
    .line 3
    sget-object v1, LI0/o;->a:LI0/o;

    .line 4
    .line 5
    const/16 v2, 0x7fff

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, LI0/h;->b:LI0/n;

    .line 10
    .line 11
    sget-object v1, LI0/n;->b:LI0/n;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 16
    .line 17
    invoke-static {p1, p2}, Li1/b;->k(J)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-interface {v0, v1}, LI0/l;->q0(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 27
    .line 28
    invoke-static {p1, p2}, Li1/b;->k(J)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-interface {v0, v1}, LI0/l;->l0(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :goto_0
    invoke-static {p1, p2}, Li1/b;->g(J)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-static {p1, p2}, Li1/b;->k(J)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    :cond_1
    new-instance p1, LI0/j;

    .line 47
    .line 48
    invoke-direct {p1, v0, v2}, LI0/j;-><init>(II)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    iget-object v0, p0, LI0/h;->b:LI0/n;

    .line 53
    .line 54
    sget-object v1, LI0/n;->b:LI0/n;

    .line 55
    .line 56
    if-ne v0, v1, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 59
    .line 60
    invoke-static {p1, p2}, Li1/b;->l(J)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-interface {v0, v1}, LI0/l;->I(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    iget-object v0, p0, LI0/h;->a:LI0/l;

    .line 70
    .line 71
    invoke-static {p1, p2}, Li1/b;->l(J)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-interface {v0, v1}, LI0/l;->Z(I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    :goto_1
    invoke-static {p1, p2}, Li1/b;->h(J)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-static {p1, p2}, Li1/b;->l(J)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :cond_4
    new-instance p1, LI0/j;

    .line 90
    .line 91
    invoke-direct {p1, v2, v0}, LI0/j;-><init>(II)V

    .line 92
    .line 93
    .line 94
    return-object p1
.end method
