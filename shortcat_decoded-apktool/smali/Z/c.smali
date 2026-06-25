.class public final LZ/c;
.super LZ/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LZ/i;

.field private final b:LZ/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/j;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LZ/i;

    .line 5
    .line 6
    invoke-direct {v0}, LZ/i;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LZ/c;->a:LZ/i;

    .line 10
    .line 11
    new-instance v0, LZ/i;

    .line 12
    .line 13
    invoke-direct {v0}, LZ/i;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LZ/c;->b:LZ/i;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/c;->b:LZ/i;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/i;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ/c;->a:LZ/i;

    .line 7
    .line 8
    invoke-virtual {v0}, LZ/i;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Lie/a;ILY/b;)V
    .locals 8

    .line 1
    iget-object v0, p0, LZ/c;->a:LZ/i;

    .line 2
    .line 3
    sget-object v1, LZ/d$o;->c:LZ/d$o;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LZ/i;->j(LZ/d;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, LZ/i$b;->a(LZ/i;)LZ/i;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v3}, LZ/d$t;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-static {v2, v4, p1}, LZ/i$b;->b(LZ/i;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v2, LZ/i;->c:[I

    .line 21
    .line 22
    iget v4, v2, LZ/i;->d:I

    .line 23
    .line 24
    iget-object v5, v2, LZ/i;->a:[LZ/d;

    .line 25
    .line 26
    iget v6, v2, LZ/i;->b:I

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    sub-int/2addr v6, v7

    .line 30
    aget-object v5, v5, v6

    .line 31
    .line 32
    invoke-virtual {v5}, LZ/d;->d()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    sub-int/2addr v4, v5

    .line 37
    aput p2, p1, v4

    .line 38
    .line 39
    invoke-static {v7}, LZ/d$t;->a(I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {v2, p1, p3}, LZ/i$b;->b(LZ/i;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, LZ/i;->c(LZ/d;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, LZ/c;->b:LZ/i;

    .line 50
    .line 51
    sget-object v0, LZ/d$u;->c:LZ/d$u;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, LZ/i;->j(LZ/d;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, LZ/i$b;->a(LZ/i;)LZ/i;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v2, v1, LZ/i;->c:[I

    .line 61
    .line 62
    iget v4, v1, LZ/i;->d:I

    .line 63
    .line 64
    iget-object v5, v1, LZ/i;->a:[LZ/d;

    .line 65
    .line 66
    iget v6, v1, LZ/i;->b:I

    .line 67
    .line 68
    sub-int/2addr v6, v7

    .line 69
    aget-object v5, v5, v6

    .line 70
    .line 71
    invoke-virtual {v5}, LZ/d;->d()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    sub-int/2addr v4, v5

    .line 76
    aput p2, v2, v4

    .line 77
    .line 78
    invoke-static {v3}, LZ/d$t;->a(I)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-static {v1, p2, p3}, LZ/i$b;->b(LZ/i;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, LZ/i;->c(LZ/d;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/c;->b:LZ/i;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/i;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Cannot end node insertion, there are no pending operations that can be realized."

    .line 10
    .line 11
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LZ/c;->b:LZ/i;

    .line 15
    .line 16
    iget-object v1, p0, LZ/c;->a:LZ/i;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LZ/i;->h(LZ/i;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final d(LY/d;LY/H1;LY/u1;LZ/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/c;->b:LZ/i;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/i;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"

    .line 10
    .line 11
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LZ/c;->a:LZ/i;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, p3, p4}, LZ/i;->d(LY/d;LY/H1;LY/u1;LZ/f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ/c;->a:LZ/i;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/i;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ/c;->a:LZ/i;

    .line 2
    .line 3
    sget-object v1, LZ/d$G;->c:LZ/d$G;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LZ/i;->j(LZ/d;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, LZ/i$b;->a(LZ/i;)LZ/i;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v3}, LZ/d$t;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v2, v3, p1}, LZ/i$b;->b(LZ/i;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    invoke-static {p1}, LZ/d$t;->a(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const-string v3, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    .line 26
    .line 27
    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    invoke-static {p2, v3}, Lkotlin/jvm/internal/V;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 36
    .line 37
    invoke-static {v2, p1, p2}, LZ/i$b;->b(LZ/i;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, LZ/i;->c(LZ/d;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
