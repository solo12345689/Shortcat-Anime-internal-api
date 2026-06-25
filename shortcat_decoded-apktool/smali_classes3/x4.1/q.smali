.class public abstract Lx4/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ltg/j;Landroid/content/Context;)Lx4/p;
    .locals 2

    .line 1
    new-instance v0, Lx4/s;

    .line 2
    .line 3
    new-instance v1, Lx4/q$a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lx4/q$a;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {v0, p0, v1, p1}, Lx4/s;-><init>(Ltg/j;Lie/a;Lx4/p$a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final b(Ltg/j;Landroid/content/Context;Lx4/p$a;)Lx4/p;
    .locals 2

    .line 1
    new-instance v0, Lx4/s;

    .line 2
    .line 3
    new-instance v1, Lx4/q$b;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lx4/q$b;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1, p2}, Lx4/s;-><init>(Ltg/j;Lie/a;Lx4/p$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final c(Ltg/P;Ltg/o;Ljava/lang/String;Ljava/io/Closeable;)Lx4/p;
    .locals 6

    .line 1
    new-instance v0, Lx4/o;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lx4/o;-><init>(Ltg/P;Ltg/o;Ljava/lang/String;Ljava/io/Closeable;Lx4/p$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic d(Ltg/P;Ltg/o;Ljava/lang/String;Ljava/io/Closeable;ILjava/lang/Object;)Lx4/p;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Ltg/o;->b:Ltg/o;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x4

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    move-object p2, v0

    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x8

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    move-object p3, v0

    .line 18
    :cond_2
    invoke-static {p0, p1, p2, p3}, Lx4/q;->c(Ltg/P;Ltg/o;Ljava/lang/String;Ljava/io/Closeable;)Lx4/p;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
