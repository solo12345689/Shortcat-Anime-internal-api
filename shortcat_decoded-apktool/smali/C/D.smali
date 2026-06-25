.class public interface abstract LC/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic e(LC/D;IIIIZILjava/lang/Object;)J
    .locals 6

    .line 1
    if-nez p7, :cond_1

    .line 2
    .line 3
    and-int/lit8 p6, p6, 0x10

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    .line 7
    const/4 p5, 0x0

    .line 8
    :cond_0
    move-object v0, p0

    .line 9
    move v1, p1

    .line 10
    move v2, p2

    .line 11
    move v3, p3

    .line 12
    move v4, p4

    .line 13
    move v5, p5

    .line 14
    invoke-interface/range {v0 .. v5}, LC/D;->a(IIIIZ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    return-wide p0

    .line 19
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method


# virtual methods
.method public abstract a(IIIIZ)J
.end method

.method public abstract b(I[I[ILandroidx/compose/ui/layout/l;)V
.end method

.method public abstract c([Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;I[III[IIII)LI0/C;
.end method

.method public abstract d(Landroidx/compose/ui/layout/s;)I
.end method

.method public abstract f(Landroidx/compose/ui/layout/s;)I
.end method
