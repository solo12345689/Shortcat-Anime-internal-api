.class public abstract LD2/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(LE2/j;Ljava/lang/String;LE2/i;ILjava/util/Map;)Lw2/o;
    .locals 2

    .line 1
    new-instance v0, Lw2/o$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lw2/o$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, p1}, LE2/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lw2/o$b;->i(Landroid/net/Uri;)Lw2/o$b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-wide v0, p2, LE2/i;->a:J

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Lw2/o$b;->h(J)Lw2/o$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-wide v0, p2, LE2/i;->b:J

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Lw2/o$b;->g(J)Lw2/o$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p0, p2}, LD2/g;->b(LE2/j;LE2/i;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1, p0}, Lw2/o$b;->f(Ljava/lang/String;)Lw2/o$b;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0, p3}, Lw2/o$b;->b(I)Lw2/o$b;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0, p4}, Lw2/o$b;->e(Ljava/util/Map;)Lw2/o$b;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Lw2/o$b;->a()Lw2/o;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static b(LE2/j;LE2/i;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE2/j;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object p0, p0, LE2/j;->c:LP9/u;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, LE2/b;

    .line 16
    .line 17
    iget-object p0, p0, LE2/b;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, LE2/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
