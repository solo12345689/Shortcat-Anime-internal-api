.class public abstract Lx0/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ljava/util/List;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:J

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lx0/o;->a:Ljava/util/List;

    .line 6
    .line 7
    sget-object v0, Ls0/G1;->a:Ls0/G1$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls0/G1$a;->a()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput v0, Lx0/o;->b:I

    .line 14
    .line 15
    sget-object v0, Ls0/H1;->a:Ls0/H1$a;

    .line 16
    .line 17
    invoke-virtual {v0}, Ls0/H1$a;->b()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sput v0, Lx0/o;->c:I

    .line 22
    .line 23
    sget-object v0, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/c$a;->z()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sput v0, Lx0/o;->d:I

    .line 30
    .line 31
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 32
    .line 33
    invoke-virtual {v0}, Ls0/r0$a;->i()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sput-wide v0, Lx0/o;->e:J

    .line 38
    .line 39
    sget-object v0, Ls0/o1;->a:Ls0/o1$a;

    .line 40
    .line 41
    invoke-virtual {v0}, Ls0/o1$a;->b()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    sput v0, Lx0/o;->f:I

    .line 46
    .line 47
    return-void
.end method

.method public static final a()I
    .locals 1

    .line 1
    sget v0, Lx0/o;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public static final b()I
    .locals 1

    .line 1
    sget v0, Lx0/o;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public static final c()I
    .locals 1

    .line 1
    sget v0, Lx0/o;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public static final d()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lx0/o;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final e(JJ)Z
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ls0/r0;->x(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2, p3}, Ls0/r0;->x(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0, p1}, Ls0/r0;->w(J)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p2, p3}, Ls0/r0;->w(J)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    cmpg-float v0, v0, v1

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-static {p0, p1}, Ls0/r0;->u(J)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p2, p3}, Ls0/r0;->u(J)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    cmpg-float p0, p0, p1

    .line 34
    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public static final f(Landroidx/compose/ui/graphics/d;)Z
    .locals 5

    .line 1
    instance-of v0, p0, Ls0/b0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    check-cast p0, Ls0/b0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ls0/b0;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v3, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/c$a;->z()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-static {v0, v4}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Ls0/b0;->b()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/c$a;->B()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p0, v0}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return v2

    .line 41
    :cond_1
    :goto_0
    return v1

    .line 42
    :cond_2
    if-nez p0, :cond_3

    .line 43
    .line 44
    return v1

    .line 45
    :cond_3
    return v2
.end method
