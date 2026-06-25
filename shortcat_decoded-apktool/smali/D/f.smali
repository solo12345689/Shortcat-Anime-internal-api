.class public final LD/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF/f;


# instance fields
.field private final a:LD/B;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LD/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD/f;->a:LD/B;

    .line 5
    .line 6
    return-void
.end method

.method private final f(LD/q;)I
    .locals 5

    .line 1
    invoke-interface {p1}, LD/q;->i()Ljava/util/List;

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
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, LD/l;

    .line 18
    .line 19
    invoke-interface {v4}, LD/l;->getSize()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    add-int/2addr v3, v4

    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    div-int/2addr v3, v0

    .line 32
    invoke-interface {p1}, LD/q;->h()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    add-int/2addr v3, p1

    .line 37
    return v3
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/f;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->u()LD/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LD/q;->i()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LD/l;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, LD/l;->getIndex()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public b(I)F
    .locals 6

    .line 1
    iget-object v0, p0, LD/f;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->u()LD/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LD/q;->i()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-interface {v0}, LD/q;->i()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    move-object v5, v4

    .line 35
    check-cast v5, LD/l;

    .line 36
    .line 37
    invoke-interface {v5}, LD/l;->getIndex()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-ne v5, p1, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 v4, 0x0

    .line 48
    :goto_1
    check-cast v4, LD/l;

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    invoke-direct {p0, v0}, LD/f;->f(LD/q;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p0}, LD/f;->d()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    sub-int/2addr p1, v1

    .line 61
    mul-int/2addr v0, p1

    .line 62
    int-to-float p1, v0

    .line 63
    invoke-virtual {p0}, LD/f;->g()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    int-to-float v0, v0

    .line 68
    sub-float/2addr p1, v0

    .line 69
    return p1

    .line 70
    :cond_3
    invoke-interface {v4}, LD/l;->getOffset()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    int-to-float p1, p1

    .line 75
    return p1
.end method

.method public c(Lz/u;II)V
    .locals 1

    .line 1
    iget-object p1, p0, LD/f;->a:LD/B;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, p2, p3, v0}, LD/B;->L(IIZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/f;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LD/f;->a:LD/B;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-static/range {v0 .. v5}, Lz/x;->d(Lz/x;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 20
    .line 21
    return-object p1
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/f;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->q()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
