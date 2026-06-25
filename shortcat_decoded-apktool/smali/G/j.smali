.class final LG/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/d;


# instance fields
.field private final b:LG/C;

.field private final c:Lz/d;

.field private final d:Lw/i;


# direct methods
.method public constructor <init>(LG/C;Lz/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG/j;->b:LG/C;

    .line 5
    .line 6
    iput-object p2, p0, LG/j;->c:Lz/d;

    .line 7
    .line 8
    invoke-interface {p2}, Lz/d;->b()Lw/i;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, LG/j;->d:Lw/i;

    .line 13
    .line 14
    return-void
.end method

.method private final c(F)F
    .locals 3

    .line 1
    iget-object v0, p0, LG/j;->b:LG/C;

    .line 2
    .line 3
    invoke-virtual {v0}, LG/C;->z()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    const/4 v1, -0x1

    .line 9
    int-to-float v1, v1

    .line 10
    mul-float/2addr v0, v1

    .line 11
    :goto_0
    const/4 v1, 0x0

    .line 12
    cmpl-float v2, p1, v1

    .line 13
    .line 14
    if-lez v2, :cond_0

    .line 15
    .line 16
    cmpg-float v2, v0, p1

    .line 17
    .line 18
    if-gez v2, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, LG/j;->b:LG/C;

    .line 21
    .line 22
    invoke-virtual {v1}, LG/C;->H()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    add-float/2addr v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :goto_1
    cmpg-float v2, p1, v1

    .line 30
    .line 31
    if-gez v2, :cond_1

    .line 32
    .line 33
    cmpl-float v2, v0, p1

    .line 34
    .line 35
    if-lez v2, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, LG/j;->b:LG/C;

    .line 38
    .line 39
    invoke-virtual {v2}, LG/C;->H()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-float v2, v2

    .line 44
    sub-float/2addr v0, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    return v0
.end method


# virtual methods
.method public a(FFF)F
    .locals 1

    .line 1
    iget-object v0, p0, LG/j;->c:Lz/d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lz/d;->a(FFF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    cmpg-float v0, p1, p2

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    iget-object p1, p0, LG/j;->b:LG/C;

    .line 13
    .line 14
    invoke-virtual {p1}, LG/C;->z()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    return p2

    .line 21
    :cond_0
    iget-object p1, p0, LG/j;->b:LG/C;

    .line 22
    .line 23
    invoke-virtual {p1}, LG/C;->z()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    int-to-float p1, p1

    .line 28
    const/high16 p2, -0x40800000    # -1.0f

    .line 29
    .line 30
    mul-float/2addr p1, p2

    .line 31
    iget-object p2, p0, LG/j;->b:LG/C;

    .line 32
    .line 33
    invoke-virtual {p2}, LG/C;->B()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    iget-object p2, p0, LG/j;->b:LG/C;

    .line 40
    .line 41
    invoke-virtual {p2}, LG/C;->H()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    int-to-float p2, p2

    .line 46
    add-float/2addr p1, p2

    .line 47
    :cond_1
    neg-float p2, p3

    .line 48
    invoke-static {p1, p2, p3}, Loe/j;->l(FFF)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :cond_2
    invoke-direct {p0, p1}, LG/j;->c(F)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1
.end method

.method public b()Lw/i;
    .locals 1

    .line 1
    iget-object v0, p0, LG/j;->d:Lw/i;

    .line 2
    .line 3
    return-object v0
.end method
