.class public interface abstract LE6/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE6/d;


# direct methods
.method public static E0(Landroid/graphics/Bitmap;LC5/h;LE6/p;II)LE6/f;
    .locals 8

    .line 1
    invoke-static {}, LE6/b;->S()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LE6/b;

    .line 8
    .line 9
    move-object v2, p0

    .line 10
    move-object v3, p1

    .line 11
    move-object v4, p2

    .line 12
    move v5, p3

    .line 13
    move v6, p4

    .line 14
    invoke-direct/range {v1 .. v6}, LE6/b;-><init>(Landroid/graphics/Bitmap;LC5/h;LE6/p;II)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    move-object v2, p0

    .line 19
    move-object v3, p1

    .line 20
    move-object v4, p2

    .line 21
    move v5, p3

    .line 22
    move v6, p4

    .line 23
    new-instance p0, LE6/i;

    .line 24
    .line 25
    move v7, v6

    .line 26
    move v6, v5

    .line 27
    move-object v5, v4

    .line 28
    move-object v4, v3

    .line 29
    move-object v3, v2

    .line 30
    move-object v2, p0

    .line 31
    invoke-direct/range {v2 .. v7}, LE6/i;-><init>(Landroid/graphics/Bitmap;LC5/h;LE6/p;II)V

    .line 32
    .line 33
    .line 34
    return-object v2
.end method

.method public static U1(LC5/a;LE6/p;I)LE6/f;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, v0}, LE6/f;->W0(LC5/a;LE6/p;II)LE6/f;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static W0(LC5/a;LE6/p;II)LE6/f;
    .locals 1

    .line 1
    invoke-static {}, LE6/b;->S()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LE6/b;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2, p3}, LE6/b;-><init>(LC5/a;LE6/p;II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, LE6/i;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1, p2, p3}, LE6/i;-><init>(LC5/a;LE6/p;II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static z0(Landroid/graphics/Bitmap;LC5/h;LE6/p;I)LE6/f;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, p3, v0}, LE6/f;->E0(Landroid/graphics/Bitmap;LC5/h;LE6/p;II)LE6/f;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method


# virtual methods
.method public abstract U0()I
.end method

.method public abstract X()LC5/a;
.end method

.method public abstract h1()I
.end method
