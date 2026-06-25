.class public abstract LJ/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LJ/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    invoke-static {v0}, LJ/i;->a(I)LJ/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LJ/i;->a:LJ/h;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(I)LJ/h;
    .locals 0

    .line 1
    invoke-static {p0}, LJ/c;->b(I)LJ/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LJ/i;->c(LJ/b;)LJ/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final b(IIII)LJ/h;
    .locals 1

    .line 1
    new-instance v0, LJ/h;

    .line 2
    .line 3
    invoke-static {p0}, LJ/c;->b(I)LJ/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, LJ/c;->b(I)LJ/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, LJ/c;->b(I)LJ/b;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p3}, LJ/c;->b(I)LJ/b;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-direct {v0, p0, p1, p2, p3}, LJ/h;-><init>(LJ/b;LJ/b;LJ/b;LJ/b;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static final c(LJ/b;)LJ/h;
    .locals 1

    .line 1
    new-instance v0, LJ/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p0, p0, p0}, LJ/h;-><init>(LJ/b;LJ/b;LJ/b;LJ/b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final d(F)LJ/h;
    .locals 0

    .line 1
    invoke-static {p0}, LJ/c;->c(F)LJ/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LJ/i;->c(LJ/b;)LJ/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final e(FFFF)LJ/h;
    .locals 1

    .line 1
    new-instance v0, LJ/h;

    .line 2
    .line 3
    invoke-static {p0}, LJ/c;->c(F)LJ/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, LJ/c;->c(F)LJ/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, LJ/c;->c(F)LJ/b;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p3}, LJ/c;->c(F)LJ/b;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-direct {v0, p0, p1, p2, p3}, LJ/h;-><init>(LJ/b;LJ/b;LJ/b;LJ/b;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static synthetic f(FFFFILjava/lang/Object;)LJ/h;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    int-to-float p0, v0

    .line 7
    invoke-static {p0}, Li1/h;->n(F)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 12
    .line 13
    if-eqz p5, :cond_1

    .line 14
    .line 15
    int-to-float p1, v0

    .line 16
    invoke-static {p1}, Li1/h;->n(F)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :cond_1
    and-int/lit8 p5, p4, 0x4

    .line 21
    .line 22
    if-eqz p5, :cond_2

    .line 23
    .line 24
    int-to-float p2, v0

    .line 25
    invoke-static {p2}, Li1/h;->n(F)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    :cond_2
    and-int/lit8 p4, p4, 0x8

    .line 30
    .line 31
    if-eqz p4, :cond_3

    .line 32
    .line 33
    int-to-float p3, v0

    .line 34
    invoke-static {p3}, Li1/h;->n(F)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    :cond_3
    invoke-static {p0, p1, p2, p3}, LJ/i;->e(FFFF)LJ/h;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static final g()LJ/h;
    .locals 1

    .line 1
    sget-object v0, LJ/i;->a:LJ/h;

    .line 2
    .line 3
    return-object v0
.end method
